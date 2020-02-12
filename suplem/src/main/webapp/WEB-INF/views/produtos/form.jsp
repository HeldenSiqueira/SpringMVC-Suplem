<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Suplementos: Comprar suplemento Alimentar é na Suplem</title>
</head>
<body>
    <form action="/suplem/produtos" method="POST">
        <div>
            <label>Nome</label>
            <input type="text" name="nome" />
        </div>
        <div>
            <label>Descrição</label>
            <textarea rows="10" cols="20" name="descricao"></textarea>
        </div>
        <div>
            <label>Sabor</label>
            <input type="text" name="sabor" />
        </div>
        <button type="submit">Cadastrar</button>
    </form>
</body>
</html>