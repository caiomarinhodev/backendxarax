
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
object quemsomos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

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

    <title>Projeto Xarax - Quem Somos</title>

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
                    <li class="active">
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
                    <li>
                        <a href="/contato">Contato</a>
                    </li>
                    <li><a href="/registrar">Registrar</a></li>
                    <li class="divider-vertical"></li>
                    """),_display_(/*106.22*/if(usuario!=null)/*106.39*/{_display_(Seq[Any](format.raw/*106.40*/("""
                    """),format.raw/*107.21*/("""<li class="dropdown">
                        <a class="dropdown-toggle" href="#" data-toggle="dropdown"> Olá, """),_display_(/*108.91*/usuario/*108.98*/.getNome),format.raw/*108.106*/("""</a>
                        <div class="dropdown-menu" style="padding: 15px; padding-bottom: 10px;">
                            <a class="btn btn-block btn-primary" href="/logout">Sair</a>
                        </div>
                    </li>
                    """)))}/*113.22*/else/*113.26*/{_display_(Seq[Any](format.raw/*113.27*/("""
                    """),format.raw/*114.21*/("""<li class="dropdown">
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
    <div class="content-section-b">

        <div class="container">
            <hr>
            <div class="col-lg-8">
                <div class="row">

                        <div class="clearfix"></div>
                        <h2 class="section-heading">Quem Somos ?</h2>
                        <p class="lead">
                            Diferentemente da nobre intenção da retórica, o <strong>Projeto Xarax</strong> se propõe a efetuar,
                            a realizar e a promover um enorme esforço concreto de revitalização do meio-ambiente em todos os níveis possíveis,
                            começando com a flora e a fauna, através da fruticultura, principalmente, cujo impacto se dará, paulatinamente,
                            junto ao equilíbrio do ecossistema, onde for devidamente implantado. Não é uma fórmula mágica, mas um
                            conjunto de conceitos e ações que podem impactar positivamente no <strong>Clima</strong>, na
                            <strong>Economia</strong>, nas <strong>Relações Sociais</strong>, na sobrevivência dos homens e dos
                            microssistemas do planeta e, sobretudo, na esperança acalentada por um mundo melhor. Por longo prazo,
                            intencionalmente perpétuo e para sempre.
                        </p>
                        <p class="lead">
                            Porque o mundo é nosso e o futuro da humanidade está aqui. Participe deste futuro, ainda hoje.
                            Porque a vida é nossa. E é agora. Não deixemos para depois exatamente o que podemos recomeçar agora,
                            nosso próprio futuro... Porque você faz parte desse mundo, invariavelmente, nosso mundo, o planeta
                            <strong>Terra</strong>. Por tudo isso, doravante, <strong>Xarax</strong> fará parte de nossas vidas.
                            Será a maior iniciativa de reflorestamento sustentável do mundo, engedrada pela sociedade civil.
                            Uma realidade palpável, visível e extremamente duradoura, um mundo real, feito por você, sem as
                            imprevisíveis contingências do contexto virtual. Construa seu mundo, seu futuro.
                        </p>
                        <p class="lead">

                        </p>
                        <p class="lead">
                            O ativismo aqui é muito maior que o sonho ambientalista de salvar o planeta. O ativismo aqui é colocar,
                            literalmente, em solo fértil, a semente pessoal por um mundo melhor.
                        </p>



                </div>


            </div>
            <div class="col-lg-4">
                <img style="margin-top: 200px; margin-left: 40px;" class="img-responsive" src="/assets/img/teammm.png" alt="">
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.content-section-a -->

	<a  name="contact"></a>
    <div class="banner">

        <div class="container">

            <div class="row">
                <div class="col-lg-6">
                    <h2>
                        Seja um membro <strong>Xarax</strong>!
                    </h2>
                </div>
                <div class="col-lg-3">
                    <a href="/registrar" class="btn btn-default btn-lg"><i class="fa fa-plus fa-fw"></i>
                        <span class="network-name">Participar</span></a>
                </div>
            </div>

        </div>


    </div>
    <!-- /.banner -->

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
                  SOURCE: C:/Users/Caio/Downloads/activator-1.2.10/demic/app/views/quemsomos.scala.html
                  HASH: 24f03221450964f294a6718bfd12bf775fb8c391
                  MATRIX: 728->1|834->19|862->21|6060->5191|6087->5208|6127->5209|6178->5231|6319->5344|6336->5351|6367->5359|6661->5633|6675->5637|6715->5638|6766->5660|8421->7283|8468->7301
                  LINES: 26->1|29->1|30->2|134->106|134->106|134->106|135->107|136->108|136->108|136->108|141->113|141->113|141->113|142->114|162->134|163->135
                  -- GENERATED --
              */
          