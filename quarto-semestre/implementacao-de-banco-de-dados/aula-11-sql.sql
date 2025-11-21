USE BIBLIOTECA;

CREATE TRIGGER trg_BloqueiaTituloDuplicado
ON Livro
INSTEAD OF INSERT
AS
BEGIN
    IF EXISTS (
        SELECT 1 
        FROM Livro l
        INNER JOIN inserted i ON l.titulo = i.titulo
    )
    BEGIN
        RAISERROR('Já tem', 16, 1);
        ROLLBACK TRANSACTION;
        RETURN;
    END

    -- Se não houver duplicata, insere normalmente
    INSERT INTO Livro (isbn, titulo, ano, fk_editora, fk_categoria)
    SELECT isbn, titulo, ano, fk_editora, fk_categoria
    FROM inserted;
END;

CREATE TRIGGER trg_AnoPublicacaoAtual
ON Livro
AFTER INSERT
AS
BEGIN
    UPDATE Livro
    SET ano = YEAR(GETDATE())
    WHERE isbn IN (SELECT isbn FROM inserted);
END;

CREATE TRIGGER trg_DeleteLivroAutor
ON Livro
AFTER DELETE
AS
BEGIN
    DELETE FROM LivroAutor
    WHERE fk_livro IN (SELECT isbn FROM deleted);
END;