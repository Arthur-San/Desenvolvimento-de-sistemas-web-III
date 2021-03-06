<%-- 
    Document   : cadastro
    Created on : 30/06/2020, 18:35:29
    Author     : Tawth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt-br">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    
    <style type="text/css">
    a:link, a:visited {
      text-decoration: none; 
      color:white;
}

    a:hover, a:active {
      text-decoration: none;
      color:gray;
}
    .titulos{
      text-align: left;
}
    </style>

    <title>Cadastrar</title>
  </head>
  <body>


  	<!--CABEÇALHO-->  		
  		<div class="card text-center">
		  <div class="card-header">
		    <h1>VAGAS DE EMPREGO</h1>
		  </div>		  


    <!--NAV-->
  <div style="background-color: #01DFD7; padding: 0.5%">
    <div class="container" name="nav">
      <div class="row">
        <div class="col" >
          <a href="index.html">Menu</a>
        </div>

        <div class="col" >
          <a href="cadastrar-se.html">Cadastrar-se</a>
        </div>

        <div class="col" >
          <a href="pesquisar.html">Pesquisar vagas</a>
        </div>  

        <div class="col" >
          <a href="candidatar.html">Candidatar-se</a>
        </div>

        <div class="col" >
          <a href="renunciar.html">Renunciar vaga</a>
        </div>
      </div>
    </div>
  </div>


	<!--CONTEÚDO-->
		<div class="container" style="padding: 2%">
      <h2 class="titulos">Campo de cadastro</h2>
  	<form style="text-align: left">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">E-mail</label>
      <input type="email" name="email" class="form-control" id="inputEmail4">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Senha</label>
      <input type="password" name="senha" class="form-control" id="inputPassword4">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Endereço</label>
    <input type="text" name="endereco" class="form-control" id="inputAddress" placeholder="Ex: 'Guaju braba, 232'">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Endereço 2</label>
    <input type="text" name="endereco2" class="form-control" id="inputAddress2" placeholder="Ex: 'São leopoldo tudo donminado, 3012'">
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">Cidade</label>
      <input type="text" name="cidade" class="form-control" id="inputCity">
    </div>
    <div class="form-group col-md-4">
      <label for="inputState">Estado</label>
      <select id="inputState" class="form-control">
        <option selected>Escolha o estado...</option>
        <option>RS</option>
		<option>RJ</option>
		<option>SC</option>
		<option>RR</option>
		<option>MT</option>		
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip">CEP</label>
      <input type="text" class="form-control" id="inputZip">
    </div>
  </div>
  
  <button type="submit" class="btn btn-primary">Cadastrar</button>
</form>
</div>

	<!--RODAPÉ-->	
	  	<div class="card-body" style="background-color: #f7f7f7;bor">
		    <blockquote class="blockquote mb-0">
		      <p>DADOS DO RODAPÉ</p>
		      <footer class="blockquote-footer">OUTROS DADOS</footer>
		    </blockquote>
	  	</div>



    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
  </body>
</html>