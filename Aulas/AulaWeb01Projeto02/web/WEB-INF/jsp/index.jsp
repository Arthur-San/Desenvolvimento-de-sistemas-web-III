%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!-- Meta tags Obrigatórias -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Forumulários</title>
        <script  type="text/javascript" src="javascript.js"></script>
  

    </head>
    <body>
        <section class="container-fluid" style="background-color: white;">
             
            <section style="background-color: #3399cc; color:#fff; padding: 0.5%;"> 
                <div class="container-fluid">
                    <div class="row">
                      <div class="col-md-6">
                          <p><h1><b>Biblioteca Mundo das Traças</b></h1></p></div>
                      <div class="col-md-5"><p><h2><b>Área de login</b></h2></p></div>
                      </div>
                        <div class="row">
                            <div class="col-md-6"></div>
                            <div class="col-md-6">
                                
                                <!-- <form name="form" method="post" action="loginAprovado.jsp" onsubmit="return validacao();">
		  	Nome: <input type="text" name="nome"/><br /><br />
			Senha: <input type="password" name="senha" /><br /><br />
			<input type="submit" name="submit" value="Enviar" />		  	
		  
		  </form>-->                                      
                               <form class="form-inline" name="form01" method="post" action="page2.html" onsubmit="return validacao();">                          
                                        <div class="form-group mx-sm-3 mb-2">
                                            <input name="nome" type="text" class="form-control" placeholder="Usuário"></div>
                                        <div  class="form-group mx-sm-3 mb-2">
                                            <input  name="senha" type="password" class="form-control" placeholder="Senha"></div>                                     
                                            <input class="btn btn-primary mb-2" href="#" type="submit" value="Logar" onclick="alert('Logado com sucesso!')" />
                                </form>    
                                
                                
                                
                            </div>
                        </div>   
                        
                        

            </section>
            <nav>
                     <ul class="nav"; style="background-color:#efefef; padding: 10px">
                    <li class="nav-item">
                      <a class="nav-link active" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">Acervo</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">Vídeoteca</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link disabled" href="#">Entre em contato</a>
                    </li>
                  </ul>
            </nav>
            <section  style="color: blue; padding: 20px;"><h2>Visite nosso Acervo Online</h2></section>
            
            <article>
                <div class="row">	
                    <div class="col-md-6">
                        <div>
                            
                            
                            <form>
                                <div class="form-row">
                                  <div class="form-group col-md-6">
                                    <label for="inputEmail4">Livro</label>
                                    <input type="email" class="form-control" id="inputName" placeholder="Nome do livro" required>
                                  </div>
                                  <div class="form-group col-md-6">
                                    <label for="inputPassword4">Autor</label>
                                    <input type="password" class="form-control" id="inputPassword4" placeholder="Nome do autor" required>
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label for="inputAddress">Editora</label>
                                  <input type="text" class="form-control" id="inputAddress" placeholder="Nome da editora" required>
                                </div>
                                <div class="form-group">
                                  <label for="inputAddress2">Ano de Edição</label>
                                  <input type="text" class="form-control" id="inputAddress2" placeholder="O Ano da Edição" required>
                                </div>
                                
                                  
                                <div class="form-group">
                                  <div class="form-check">
                                    <input class="form-check-input" type="checkbox" id="gridCheck">
                                    <label class="form-check-label" for="gridCheck">
                                      Pesquisar na Web?
                                    </label>
                                  </div>
                                </div>
                                <button type="submit" class="btn btn-primary" onclick="alert('Sua pesquisa foi concluída!')">Pesquisar</button>
                              </form>
                            
                            
                            

                        </div>
                    </div>
                            <div class="col-md-6">
                                <p><h2><b>Seja bem Vindo!</b></h2></p><br>Use o formulário ao lado para pesquisar no nosso acero Online
                                    
                                       <p>Hoje é: <%= new Date()%> </p>
                                    
                            
                    </div>
                


                </div>	


            </article>
            <footer></footer>
        </section>


        <script>
            function check(input) {
                if (input.value != document.getElementById('ende_remail').value) {
                    input.setCustomValidity('Os endereços de email não conferem');
                } else {
                    input.setCustomValidity('');
                }
            }
        </script>
        
        <div style="padding: 20px; position:absolute; bottom:0; width:100%">
        
        <div class="row" style="background-color: #3399cc; color: #fff; text-align: center; display: flex;padding: 20px">
      
            <div style="align-self: flex-end;" class="col-md-3">
        <h6>Endereço: Rua dos Bobos, Nº 0<br>
          Porto Alegre - RS</h6>
      </div>
      <div class="col-md-6">
        <h2>Biblioteca Mundo das Traças</h2>
        <h6>Telefone/Whats: (11) 91111-1111</h6>
      </div>
      <div style="align-self: flex-end;" class="col-md-3">
        <h6>Instagram/Facebook: MundoTraças<br>
          Email: traças@traças.com
        </h6>
      </div>
    </div>
            
            </div>
        <!-- JavaScript (Opcional) -->
        <!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>