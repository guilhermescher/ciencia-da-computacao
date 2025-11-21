-- Distinct
select distinct pnome, salario
from funcionario as f
order by salario desc;

--Where
select *
from funcionario as f
where f.pnome = 'João';

select *
from funcionario as f
where f.salario <= 30000;

-- And, Or and Not
select *
from funcionario as f
where f.sexo = 'M' and f.salario >= 30000;

select *
from funcionario as f
where f.Endereco like '%São Paulo%' or f.Endereco like '%Curitiba%';

select *
from funcionario as f
where f.Endereco not like '%São Paulo%';

-- Order by
select *
from funcionario as f
order by f.Salario desc;

-- Null
select *
from funcionario as f
where f.Cpf_supervisor is NULL;

select *
from funcionario as f
where f.Cpf_supervisor is not null;

-- Top
select top 3 *
from funcionario as f
order by f.Salario desc;

select min(salario) as salario
from funcionario as f;

-- Declare
declare @negaocrank_weber decimal(10,2);

select @negaocrank_weber = (select min(salario) as salario
						    from funcionario as f);

print @negaocrank_weber;

select *
from funcionario as f
where f.Salario = @negaocrank_weber;

-- Count, Avg e Sum
select count(pnome)
from funcionario;

select avg(salario) as media_salarial
from funcionario;

select(select count(*) from funcionario) as funcionarios,
	  (select count(*) from dependente) as dependentes,
	  (select count(*) from funcionario) + (select count(*) from dependente) as total;

declare @nfuncionarios int;
declare @ndependentes int;
set @nfuncionarios = (select count(*) from FUNCIONARIO);
set @ndependentes = (select count(*) from DEPENDENTE);
print @nfuncionarios + @ndependentes;
select @nfuncionarios + @ndependentes as total;

select sum(salario) as soma_salarios from funcionario;

declare @menor_salario decimal(10,2);
declare @media_salarial decimal(10,2);

set @menor_salario = (select min(salario) from funcionario);
set @media_salarial = (select avg(salario) from funcionario);

print @media_salarial - @menor_salario;

-- Like
select *
from funcionario as f
where year(f.Datanasc) like '1972';

-- In
select *
from funcionario as f
where f.Salario in (25000, 30000);

select f.Pnome, te.*
from funcionario as f
join TRABALHA_EM as te on f.Cpf = te.Fcpf
where te.Pnr in (select pnr from TRABALHA_EM as t where t.Fcpf in (select cpf from funcionario where pnome = 'Fernando'))
	  and te.Horas in (select Horas from TRABALHA_EM as t where t.Fcpf in (select cpf from funcionario where pnome = 'Fernando'))
	  and f.Pnome not like 'Fernando';