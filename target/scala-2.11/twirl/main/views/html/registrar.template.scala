
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

    <link rel="apple-touch-icon" sizes="57x57" href="assets/favicons/apple-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="60x60" href="assets/favicons/apple-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="72x72" href="assets/favicons/apple-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="assets/favicons/apple-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="assets/favicons/apple-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="assets/favicons/apple-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="assets/favicons/apple-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="assets/favicons/apple-icon-152x152.png">
    <link rel="apple-touch-icon" sizes="180x180" href="assets/favicons/apple-icon-180x180.png">
    <link rel="icon" type="image/png" sizes="192x192"  href="assets/favicons/android-icon-192x192.png">
    <link rel="icon" type="image/png" sizes="32x32" href="assets/favicons/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="96x96" href="assets/favicons/favicon-96x96.png">
    <link rel="icon" type="image/png" sizes="16x16" href="assets/favicons/favicon-16x16.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="msapplication-TileImage" content="assets/favicons/ms-icon-144x144.png">
    <meta name="theme-color" content="#ffffff">

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
                    """),_display_(/*106.22*/if(usuario!=null)/*106.39*/{_display_(Seq[Any](format.raw/*106.40*/("""
                        """),format.raw/*107.25*/("""<li class="dropdown">
                            <a class="dropdown-toggle" href="#" data-toggle="dropdown"> Olá, """),_display_(/*108.95*/usuario/*108.102*/.getNome),format.raw/*108.110*/("""</a>
                            <div class="dropdown-menu" style="padding: 15px; padding-bottom: 10px;">
                                <a class="btn btn-block btn-primary" href="/logout">Sair</a>
                            </div>
                        </li>
                    """)))}/*113.22*/else/*113.26*/{_display_(Seq[Any](format.raw/*113.27*/("""
                        """),format.raw/*114.25*/("""<li class="dropdown">
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
                    """)))}),format.raw/*134.22*/("""
                """),format.raw/*135.17*/("""</ul>

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
                                    <select class="form-control" name="nacionalidade">
                                        """),_display_(/*166.42*/for(na <- SGDB.getAllNacionalidades) yield /*166.78*/{_display_(Seq[Any](format.raw/*166.79*/("""
                                            """),format.raw/*167.45*/("""<option value=""""),_display_(/*167.61*/na/*167.63*/.getId),format.raw/*167.69*/("""">"""),_display_(/*167.72*/na/*167.74*/.getNome),format.raw/*167.82*/("""</option>
                                        """)))}),format.raw/*168.42*/("""
                                    """),format.raw/*169.37*/("""</select>
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
        #container1 """),format.raw/*244.21*/("""{"""),format.raw/*244.22*/("""
            """),format.raw/*245.13*/("""background-color: #e2dada;
        """),format.raw/*246.9*/("""}"""),format.raw/*246.10*/("""

        """),format.raw/*248.9*/(""".centered-form """),format.raw/*248.24*/("""{"""),format.raw/*248.25*/("""
            """),format.raw/*249.13*/("""margin-top: 120px;
            margin-bottom: 120px;
        """),format.raw/*251.9*/("""}"""),format.raw/*251.10*/("""

        """),format.raw/*253.9*/(""".centered-form .panel """),format.raw/*253.31*/("""{"""),format.raw/*253.32*/("""
            """),format.raw/*254.13*/("""background: rgba(255, 255, 255, 0.8);
            box-shadow: rgba(0, 0, 0, 0.3) 20px 20px 20px;
        """),format.raw/*256.9*/("""}"""),format.raw/*256.10*/("""
    """),format.raw/*257.5*/("""</style>

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
                  DATE: Mon Jun 29 13:45:22 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/activator-1.2.10/demic/app/views/registrar.scala.html
                  HASH: 1f3f3cfe311575780c531dc22b8b149ebb39d059
                  MATRIX: 728->1|834->19|862->21|6053->5184|6080->5201|6120->5202|6175->5228|6320->5345|6338->5352|6369->5360|6679->5650|6693->5654|6733->5655|6788->5681|8497->7358|8544->7376|10088->8892|10141->8928|10181->8929|10256->8975|10300->8991|10312->8993|10340->8999|10371->9002|10383->9004|10413->9012|10497->9064|10564->9102|13858->12367|13888->12368|13931->12382|13995->12418|14025->12419|14065->12431|14109->12446|14139->12447|14182->12461|14273->12524|14303->12525|14343->12537|14394->12559|14424->12560|14467->12574|14602->12681|14632->12682|14666->12688
                  LINES: 26->1|29->1|30->2|134->106|134->106|134->106|135->107|136->108|136->108|136->108|141->113|141->113|141->113|142->114|162->134|163->135|194->166|194->166|194->166|195->167|195->167|195->167|195->167|195->167|195->167|195->167|196->168|197->169|272->244|272->244|273->245|274->246|274->246|276->248|276->248|276->248|277->249|279->251|279->251|281->253|281->253|281->253|282->254|284->256|284->256|285->257
                  -- GENERATED --
              */
          