use BIBLIOTECA;

CREATE PROCEDURE InserirCategoria(@Categoria varchar(50))
	as
	begin
		insert into Categoria (tipo_categoria) values (@Categoria)
	end;

CREATE PROCEDURE AtualizarLivro(@ISBN varchar(20), @Nome varchar(30), @Ano int)
	as
	begin
		update Livro
		set livro.titulo = @Nome, livro.ano = @Ano
		where livro.isbn = @ISBN
	end;

CREATE PROCEDURE InserirAutor(@Nome varchar(100), @Nacionalidade varchar(50))
	as
	begin
		insert into Autor (nome, nacionalidade) values (@Nome, @Nacionalidade)
	end;

CREATE PROCEDURE RemoverAutor (@Nome varchar(100))
	as
	begin
		declare @idautor int
		select @idautor = Autor.id from Autor where Autor.nome = @Nome
		delete from LivroAutor where LivroAutor.fk_autor = @idautor
		delete from Autor where Autor.nome = @Nome
	end;

CREATE PROCEDURE LivrosPorCategoria (@Categoria varchar(50))
	as
	begin
		select *
		from Livro
		join Categoria on Categoria.id = Livro.fk_categoria
		where Categoria.tipo_categoria = @Categoria
	end;

CREATE PROCEDURE LivrosPorAutor (@Autor varchar(50))
	as
	begin
		select *
		from Livro
		join LivroAutor on Livro.isbn = LivroAutor.fk_livro
		join Autor on Autor.id = LivroAutor.fk_autor
		where Autor.nome = @Autor
	end;
	
CREATE PROCEDURE LivrosPorAno (@Ano int)
	as
	begin
		select *
		from Livro
		where livro.ano = @Ano
	end;

CREATE PROCEDURE LivrosPorEditora (@Editora varchar(50))
	as
	begin
		select *
		from Livro
		join Editora on Editora.id = Livro.fk_editora
		where Editora.nome = @Editora
	end;

CREATE PROCEDURE LivrosPorFaixaISBN (@ISBN_Inicial VARCHAR(50), @ISBN_Final VARCHAR(50))
AS
BEGIN
    select * 
    from Livro
    where isbn between @ISBN_Inicial and @ISBN_Final
END;


CREATE PROCEDURE ContarLivrosCategoria (@Categoria varchar(50))
	as
	begin
		select count(Livro.titulo) as 'Quantidade d livros'
		from Livro
		join Categoria on Categoria.id = Livro.fk_categoria
		where Categoria.tipo_categoria = @Categoria
	end;