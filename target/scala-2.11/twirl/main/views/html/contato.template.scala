
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object contato extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Usuario,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: Usuario, value: Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.36*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Projeto Xarax - Contato</title>

    <!-- Bootstrap Core CSS -->
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/css/bootstrap-social.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/assets/css/landing-page.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/assets/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <style>

    </style>

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top topnav" role="navigation">
        <div class="container topnav">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand topnav logo" href="#">Projeto Xarax</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <!--<form class="navbar-form navbar-right" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" name="username" placeholder="Login">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="password" placeholder="Senha">
                    </div>
                    <button type="submit" class="btn btn-default">Sign In</button>
                </form>-->
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="/">Home</a>
                    </li>
                    <li>
                        <a href="/projeto">Projeto</a>
                    </li>
                    <li>
                        <a href="/about">Quem Somos</a>
                    </li>
                    <li>
                        <a href="/">Como Participar?</a>
                    </li>
                    <li>
                        <a href="/mural">Mural</a>
                    </li>
                    <li>
                        <a href="#">Game</a>
                    </li>
                    <li class="active">
                        <a href="/contato">Contato</a>
                    </li>
                    <li><a href="/registrar">Registrar</a></li>
                    <li class="divider-vertical"></li>
                    """),_display_(/*89.22*/if(usuario!=null)/*89.39*/{_display_(Seq[Any](format.raw/*89.40*/("""
                        """),format.raw/*90.25*/("""<li class="dropdown">
                            <a class="dropdown-toggle" href="#" data-toggle="dropdown"> Olá, """),_display_(/*91.95*/usuario/*91.102*/.getNome),format.raw/*91.110*/("""</a>
                            <div class="dropdown-menu" style="padding: 15px; padding-bottom: 0px;">
                                <a class="btn btn-block btn-primary" href="/logout">Sair</a>
                            </div>
                        </li>
                    """)))}/*96.22*/else/*96.26*/{_display_(Seq[Any](format.raw/*96.27*/("""
                        """),format.raw/*97.25*/("""<li class="dropdown">
                            <a class="dropdown-toggle" href="#" data-toggle="dropdown">Entrar <strong
                            class="caret"></strong></a>
                            <div class="dropdown-menu" style="padding: 15px; padding-bottom: 0px;">
                                <form method="post" action="/entrar" accept-charset="UTF-8">
                                    <input class="form-control" style="margin-bottom: 5px;" type="text" placeholder="Login"
                                    id="username" name="username">
                                    <input class="form-control" style="margin-bottom: 15px;" type="password" placeholder="Senha"
                                    id="password" name="password">
                                    <button class="btn btn-block btn-primary" type="submit" id="sign-in">Entrar</button>
                                    <center><label style="text-align:center;margin-top:5px">ou</label></center>
                                    <a href="#" class="btn btn-block btn-social btn-facebook">
                                        <i class="fa fa-facebook fa-fw"></i> <span class="">Entrar com Facebook</span>
                                    </a>
                                    <a href="#" class="btn btn-block btn-social btn-google" style="margin-bottom: 15px;">
                                        <i class="fa fa-google-plus fa-fw"></i> <span class="">Entrar com Google</span>
                                    </a>
                                </form>
                            </div>
                        </li>
                    """)))}),format.raw/*117.22*/("""
                """),format.raw/*118.17*/("""</ul>

            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    <!-- Page Content -->
	<a  name="services"></a>
    <div class="content-section-b" style="margin-top: 30px;">

        <!-- Contact with Map - START -->
        <div class="container">


            <input type="hidden" name="variavel" id="variavel" value="""),_display_(/*133.71*/value),format.raw/*133.76*/(""">

                <!-- Modal -->
            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <center><h4 class="modal-title" id="myModalLabel">Obrigado!</h4></center>
                        </div>
                        <div class="modal-body">
                            Agradecemos seu contato, e retornaremos em até 24h!
                        </div>
                        <div class="modal-footer">
                            <center>
                                <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                            </center>
                        </div>
                    </div>
                </div>
            </div>


            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <div class="well well-sm">
                        <form class="form-horizontal" method="post" action="/enviarcontato">
                            <fieldset>
                                <legend class="text-center header">Contate-nos</legend>
                                <div class="form-group">
                                    <div class="col-md-10 col-md-offset-1">
                                        <input id="fname" name="nome" type="text" placeholder="Nome" class="form-control" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-10 col-md-offset-1">
                                        <input id="lname" name="sobrenome" type="text" placeholder="Sobrenome" class="form-control" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-md-10 col-md-offset-1">
                                        <input id="email" name="email" type="text" placeholder="Email" class="form-control" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-md-10 col-md-offset-1">
                                        <input id="phone" name="telefone" type="text" placeholder="Telefone" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-md-10 col-md-offset-1">
                                        <textarea class="form-control" id="message" name="mensagem" placeholder="Digite aqui sua mensagem..." rows="7"></textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-md-12 text-center">
                                        <button type="submit" class="btn btn-primary btn-lg">Enviar</button>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>

            </div>
        </div>



    </div>
    <!-- /.content-section-a -->


    <!-- Footer -->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <!-- <ul class="list-inline">
                         <li>
                             <a href="#">Home</a>
                         </li>
                         <li class="footer-menu-divider">&sdot;</li>
                         <li>
                             <a href="#about">About</a>
                         </li>
                         <li class="footer-menu-divider">&sdot;</li>
                         <li>
                             <a href="#services">Services</a>
                         </li>
                         <li class="footer-menu-divider">&sdot;</li>
                         <li>
                             <a href="#contact">Contact</a>
                         </li>
                     </ul>-->
                    <p class="copyright text-muted small text-center">Copyright &copy; Projeto Xarax by GSME. Campina Grande, Brasil</p>
                    <p class="copyright small text-muted text-center">Todos os direitos reservados.</p>
                    <p class="text-muted small text-center">2015</p>
                </div>
            </div>
        </div>
    </footer>

    <!-- jQuery -->
    <script src="/assets/js/jquery.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="/assets/js/bootstrap.min.js"></script>

    <script>
        $(document ).ready(function()"""),format.raw/*246.38*/("""{"""),format.raw/*246.39*/("""
            """),format.raw/*247.13*/("""var v = $('#variavel' ).val();
            if(v==1)"""),format.raw/*248.21*/("""{"""),format.raw/*248.22*/("""
                """),format.raw/*249.17*/("""$("#myModal").modal('show');
            """),format.raw/*250.13*/("""}"""),format.raw/*250.14*/("""
        """),format.raw/*251.9*/("""}"""),format.raw/*251.10*/(""");
    </script>


</body>

</html>
"""))}
  }

  def render(usuario:Usuario,value:Integer): play.twirl.api.HtmlFormat.Appendable = apply(usuario,value)

  def f:((Usuario,Integer) => play.twirl.api.HtmlFormat.Appendable) = (usuario,value) => apply(usuario,value)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 18 09:19:51 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/activator-1.2.10/demic/app/views/contato.scala.html
                  HASH: 45849ed29049fea949cb2c1b83ac0e995ea43991
                  MATRIX: 734->1|856->35|884->37|4630->3756|4656->3773|4695->3774|4749->3800|4893->3917|4910->3924|4940->3932|5248->4221|5261->4225|5300->4226|5354->4252|7063->5929|7110->5947|7534->6343|7561->6348|12943->11701|12973->11702|13016->11716|13097->11768|13127->11769|13174->11787|13245->11829|13275->11830|13313->11840|13343->11841
                  LINES: 26->1|29->1|30->2|117->89|117->89|117->89|118->90|119->91|119->91|119->91|124->96|124->96|124->96|125->97|145->117|146->118|161->133|161->133|274->246|274->246|275->247|276->248|276->248|277->249|278->250|278->250|279->251|279->251
                  -- GENERATED --
              */
          