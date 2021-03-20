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
                color:black;
            }

            a:hover, a:active {
                text-decoration: none;
                color:gray;
            }
            .titulos{
                text-align: left;
            }
        </style>

        <title>Pesquisar</title>
    </head>
    <body>


        <!--CABEÇALHO-->  		
        <div class="card text-center">
            <div class="card-header">
                <h1>VAGAS DA DANI</h1>
            </div>		  


            <!--NAV-->
            <div style="background-color: #01DFD7; padding: 0.5%;font-weight: bold">
                <div class="container" name="nav">
                    <div class="row">
                        
                        <div class="col" >
                            <a href="cadastrarVaga.html">Cadastrar vaga</a>
                        </div>	

                        <div class="col" >
                            <a href="candidatar.html">Candidatar-se</a>
                        </div>

                    </div>
                </div>
            </div>


            <!--CONTEÚDO-->
            <div class="container" style="padding: 2%">
                <h2 class="titulos">Campo de cadastro de vaga</h2>
                <form style="text-align: left" method="post">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="inputEmail4">Área Profissional</label>
                            <input type="text" class="form-control" name="nomearea" id="nomearea" placeholder="TI...">
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputPassword4">Salário</label>
                            <input type="integer" class="form-control" name="salario" id="salario" placeholder="R$ 2000...">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputAddress">Requisitos</label>
                        <input type="text" class="form-control" name="requisitos" id="reqquisitos" placeholder="Experiências...">
                    </div>
                    <div class="form-group">
                        <label for="inputAddress2">E-mail para contato</label>
                        <input type="text" class="form-control" name="email" id="email" placeholder="nada@nada.com...">
                    </div>
                    <div class="form-row">
                        
                        <div class="form-group col-md-6">
                            <label for="inputCity">Cidade</label>
                            <input type="text" class="form-control" name="cidade" id="cidade" placeholder="Canoas...">
                        </div>
                        <div class="form-group col-md-2">
                            <label for="inputZip">Estado</label>
                            <input type="text" class="form-control" name="estado" id="estado" placeholder="RS...">
                        </div>
                    </div>

                    <button type="submit" class="btn btn-primary">Cadastrar</button>
                </form>
            </div>

            <!--RODAPÉ-->
            <div style="height: 32px"></div>
            <div class="card-body" style="background-color: #01DFD7;font-weight: bold">
                <blockquote class="blockquote mb-0">
                    <p>E-mail: danivagas@gmail.com</p>
                    <p>Telefone: 99999-99999</p>  
                </blockquote>
            </div>



            <!-- Optional JavaScript -->
            <!-- jQuery first, then Popper.js, then Bootstrap JS -->
            <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
</html>