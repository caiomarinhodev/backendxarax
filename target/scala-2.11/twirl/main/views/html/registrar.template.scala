
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
object registrar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: Usuario):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Projeto Xarax - Registro</title>

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
                        <a href="#">Mural</a>
                    </li>
                    <li>
                        <a href="#">Game</a>
                    </li>
                    <li>
                        <a href="/contato">Contato</a>
                    </li>
                    <li class="active"><a href="/registrar">Registrar</a></li>
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

        <!-- Registration Form - START -->
        <div class="container" id="container1">
            <div class="row centered-form">
                <div class="col-xs-12 col-sm-8 col-md-4 col-lg-4 col-lg-offset-4 col-sm-offset-2 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title text-center">Registro</h3>
                        </div>
                        <div class="panel-body">
                            <form role="form" method="post" action="/addusuario">
                                <div class="form-group">
                                    <input type="text" name="nome" id="first_name" class="form-control" placeholder="Nome" required>
                                </div>

                                <div class="form-group">
                                    <input type="text" name="sobrenome" id="last_name" class="form-control" placeholder="Sobrenome" required>
                                </div>

                                <div class="form-group">
                                    <input type="text" name="nacionalidade" id="nacionalidade" class="form-control" placeholder="Nacionalidade" required>
                                </div>

                                <div class="form-group">
                                    <input type="email" name="email" id="email" class="form-control" placeholder="Email" required>
                                </div>

                                <div class="form-group">
                                    <input type="text" name="login" id="login" class="form-control" placeholder="Login" required>
                                </div>

                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="password" name="senha" id="senha" class="form-control" placeholder="Senha" required>
                                        </div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="password" name="senha_confirmacao" id="senha_confirmacao" class="form-control
                                            " placeholder="Confirme a Senha">
                                        </div>
                                    </div>
                                </div>

                                <input type="submit" value="Registrar" class="btn btn-info btn-block">
                            </form>
                        </div>
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


    <style>
        #container1 """),format.raw/*223.21*/("""{"""),format.raw/*223.22*/("""
            """),format.raw/*224.13*/("""background-color: #e2dada;
        """),format.raw/*225.9*/("""}"""),format.raw/*225.10*/("""

        """),format.raw/*227.9*/(""".centered-form """),format.raw/*227.24*/("""{"""),format.raw/*227.25*/("""
            """),format.raw/*228.13*/("""margin-top: 120px;
            margin-bottom: 120px;
        """),format.raw/*230.9*/("""}"""),format.raw/*230.10*/("""

        """),format.raw/*232.9*/(""".centered-form .panel """),format.raw/*232.31*/("""{"""),format.raw/*232.32*/("""
            """),format.raw/*233.13*/("""background: rgba(255, 255, 255, 0.8);
            box-shadow: rgba(0, 0, 0, 0.3) 20px 20px 20px;
        """),format.raw/*235.9*/("""}"""),format.raw/*235.10*/("""
    """),format.raw/*236.5*/("""</style>

</body>

</html>
"""))}
  }

  def render(usuario:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 18 08:52:55 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/activator-1.2.10/demic/app/views/registrar.scala.html
                  HASH: 11b36d124ec5852f0c61a480185e6877c3df9be8
                  MATRIX: 728->1|834->19|862->21|4604->3736|4630->3753|4669->3754|4723->3780|4867->3897|4884->3904|4914->3912|5222->4201|5235->4205|5274->4206|5328->4232|7037->5909|7084->5927|11909->10723|11939->10724|11982->10738|12046->10774|12076->10775|12116->10787|12160->10802|12190->10803|12233->10817|12324->10880|12354->10881|12394->10893|12445->10915|12475->10916|12518->10930|12653->11037|12683->11038|12717->11044
                  LINES: 26->1|29->1|30->2|117->89|117->89|117->89|118->90|119->91|119->91|119->91|124->96|124->96|124->96|125->97|145->117|146->118|251->223|251->223|252->224|253->225|253->225|255->227|255->227|255->227|256->228|258->230|258->230|260->232|260->232|260->232|261->233|263->235|263->235|264->236
                  -- GENERATED --
              */
          