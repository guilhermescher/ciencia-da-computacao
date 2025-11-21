use FACULDADE;

--7
select a.Nome, h.Nota
from ALUNO as a
join HISTORICO_ESCOLAR as h
on h.Numero_aluno = a.Numero_aluno
join TURMA as t
on t.Identificacao_turma = h.Identificacao_turma
join DISCIPLINA as d
on d.Numero_disciplina = t.Numero_disciplina
where d.Nome_disciplina = 'Banco de Dados'

--8
SELECT d.Nome_disciplina as 'Nome da disciplina', d.Numero_disciplina, p.Numero_pre_requisito as 'Disciplina requerida'
FROM DISCIPLINA AS D
JOIN PRE_REQUISITO AS P on d.Numero_disciplina = p.Numero_disciplina

--9
select d.Nome_disciplina, t.Semestre, t.Ano, h.Nota
from ALUNO as a
join HISTORICO_ESCOLAR as h on h.Numero_aluno = a.Numero_aluno
join TURMA as t on t.Identificacao_turma = h.Identificacao_turma
join DISCIPLINA as d on d.Numero_disciplina = t.Numero_disciplina
where a.Nome = 'Silva'

--10
CREATE FUNCTION VerificarNotas (@Nome varchar(50), @Disciplina varchar(50))
	returns varchar(50)
	as
	begin
		declare @nota varchar(1)
		select @nota = h.Nota
		from ALUNO as a
		join HISTORICO_ESCOLAR as h on h.Numero_aluno = a.Numero_aluno
		join TURMA as t on t.Identificacao_turma = h.Identificacao_turma
		join DISCIPLINA as d on d.Numero_disciplina = t.Numero_disciplina
		where a.Nome = @Nome and d.Nome_disciplina = @Disciplina

		if(@nota = 'A' or @nota = 'B')
			begin
			return 'Aprovado'
			end
		else if (@nota = 'C')
			begin
			return 'Em recuperação'
			end
		else if (@nota = 'F')
			begin
			return 'Reprovado'
			end
		
		return 'Nota inválida'
	end;

--11
CREATE FUNCTION ConverterNotas(@Nota varchar(1))
	returns varchar(4)
	as
	begin
		if(@Nota = 'A')
			return '10'
		else if(@Nota = 'B')
			return '9'
		else if(@Nota = 'C')
			return '8'
		else if(@Nota = 'F')
			return '0'

		return 'Erro'
	end

select a.Nome, d.Nome_disciplina, dbo.ConverterNotas(h.Nota) as 'Notas'
from ALUNO as a
join HISTORICO_ESCOLAR as h on h.Numero_aluno = a.Numero_aluno
join TURMA as t on t.Identificacao_turma = h.Identificacao_turma
join DISCIPLINA as d on d.Numero_disciplina = t.Numero_disciplina

--12
CREATE FUNCTION VerificarTurma(@Alunos int)
	returns varchar(20)
	as
	begin
		if(@Alunos >= 5)
			return 'Completamente Lotada'
		else if(@Alunos = 3 or @Alunos = 4)
			return 'Quase cheia'
		else if(@Alunos < 3)
			return 'Com Vagas'

		return 'Erro'
	end

select teste.Identificacao_turma, dbo.VerificarTurma(qtdAlunos)
from (select t.Identificacao_turma, count(a.Nome) as qtdAlunos 
	  from TURMA as t 
	  join HISTORICO_ESCOLAR as h on h.Identificacao_turma = t.Identificacao_turma 
	  join ALUNO as a on a.Numero_aluno = h.Numero_aluno 
	  group by t.Identificacao_turma) as teste;

--13
CREATE PROCEDURE usp_CalcularIdadeAluno (@Numero int)
	as
	begin
		declare @datanasc date
		declare @idade int

		select @datanasc = a.Data_Nascimento
		from ALUNO as a
		where a.Numero_aluno = @Numero

		set @idade = DATEDIFF(year, @datanasc, GETDATE())
		if(MONTH(@datanasc) < month(getdate()))
			set @idade = @idade - 1
		else if(MONTH(@datanasc) = MONTH(getdate()) and day(@datanasc) < DAY(getdate()))
			set @idade = @idade - 1

		print(cast(@idade as varchar(3)))
	end;

--14
CREATE PROCEDURE usp_AtualizarNota (@Numero int, @IdTurma int, @NovaNota varchar(1))
	as
	begin
		update HISTORICO_ESCOLAR
		set Nota = @NovaNota
		where Numero_aluno = @Numero and Identificacao_turma = @IdTurma

		if(@@ROWCOUNT = 0)
			print('Falha')
		else
			print('Sucesso')
	end;