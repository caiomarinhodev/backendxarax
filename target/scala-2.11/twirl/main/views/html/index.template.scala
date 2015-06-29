
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: Usuario):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Projeto Xarax</title>

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
    <link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet"
          type="text/css">

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
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
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
            <ul class="nav navbar-nav navbar-right menus">
                <li class="active">
                    <a href="#home">Home</a>
                </li>
                <li>
                    <a href="#projeto">Projeto</a>
                </li>
                <li>
                    <a href="#quemsomos">Quem Somos</a>
                </li>
                <li>
                    <a href="#participar">Como Participar?</a>
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
                """),_display_(/*109.18*/if(usuario!=null)/*109.35*/{_display_(Seq[Any](format.raw/*109.36*/("""
                    """),format.raw/*110.21*/("""<li class="dropdown">
                        <a class="dropdown-toggle" href="#" data-toggle="dropdown"> Olá, """),_display_(/*111.91*/usuario/*111.98*/.getNome),format.raw/*111.106*/("""</a>
                        <div class="dropdown-menu" style="padding: 15px; padding-bottom: 10px;">
                            <a class="btn btn-block btn-primary" href="/logout">Sair</a>
                        </div>
                    </li>
                """)))}/*116.18*/else/*116.22*/{_display_(Seq[Any](format.raw/*116.23*/("""
                    """),format.raw/*117.21*/("""<li class="dropdown">
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
                """)))}),format.raw/*137.18*/("""

            """),format.raw/*139.13*/("""</ul>

        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>


<!-- Header -->
<a name="about" id="home"></a>
<div class="intro-header">
    <div class="container">

        <div class="row">
            <div class="col-lg-12">
                <div id="test" class="intro-message">
                    <h1>Projeto Xarax</h1>

                    <h3></h3>
                    <hr class="intro-divider">
                    <ul class="list-inline intro-social-buttons">
                        <li>
                            <a href="#" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i>
                                <span class="network-name">Twitter</span>
                            </a>
                        </li>
                        <li>
                            <a href="https://www.facebook.com/pages/Projeto-Xarax/990915060941437?fref=ts" target="_blank" class="btn btn-default btn-lg"><i class="fa fa-facebook fa-fw"></i>
                                <span class="network-name">Facebook</span>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="btn btn-default btn-lg"><i class="fa fa-google-plus fa-fw"></i>
                                <span class="network-name">Google</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

    </div>
    <!-- /.container -->

</div>
<!-- /.intro-header -->

<!-- Page Content -->

<a name="services" id="quemsomos"></a>
<div class="content-section-a">

    <div class="container">
        <div class="row">
            <div class="col-lg-7 col-sm-6">
                <hr class="section-heading-spacer">
                <div class="clearfix"></div>
                <h2 class="section-heading">O Projeto</h2>

                <p class="lead">O <strong>Projeto Xarax</strong> é uma iniciativa genuinamente brasileira, que pretende
                    se irradiar e manifestar-se pelo mundo, um manifesto à vida e um desagravo ao sábio dever de
                    gratidão das criaturas com
                    seu Criador.</p>

                <p class="lead">
                    Não é apenas uma resposta construtiva à nossa própria devastação e agressão à Natureza. Mas, é
                    uma concreta proposta de paz e reconciliação dos povos, em torno de si mesmos, e com a Terra,
                    mãe-natureza.
                </p>

                <div class="col-lg-4 col-lg-offset-4" id="section-a-button">
                    <a href="/about" class="btn btn-success btn-lg" style="margin-bottom: 15px;">
                        <span class="network-name">Leia mais &nbsp;</span><i class="fa fa-angle-double-right "></i>
                    </a>
                </div>
            </div>
            <div class="col-lg-5 col-sm-6">
                <img class="img-responsive" src="/assets/img/proj.png" alt="">
            </div>
        </div>

    </div>
    <!-- /.container -->

</div>
<!-- /.content-section-a -->

<div class="content-section-b" id="video">

    <div class="container">

        <div class="row">
            <div class="col-lg-2 col-lg-offset-3">
                <video width="620" height="480" controls
                       poster="http://4.bp.blogspot.com/-laTugjD4WQk/U1aOsxDPUTI/AAAAAAAAGe4/5JkoXzzoOVc/s1600/terra.jpg">
                    <source src="/assets/video.mp4" type="video/mp4">
                    Video não suportado. Baixe o video <a href="/assets/video.mp4">Aqui</a>.
                </video>
            </div>
        </div>

    </div>
    <!-- /.container -->

</div>
<!-- /.content-section-b -->
<a id="projeto"></a>
<div class="content-section-a">
    <div class="container">
        <div class="row">
            <div class="col-lg-7 col-sm-6">
                <hr class="section-heading-spacer">
                <div class="clearfix"></div>
                <h2 class="section-heading">Conheça os <strong>Pólos Verdes</strong></h2>

                <p class="lead">Os <strong>Pólos Verdes</strong> serão microssistemas concebidos a partir de aquisição
                    de
                    áreas rurais agricultáveis, devidamente legalizadas, com a intenção de, ao longo de suas terras,
                    serem
                    inicialmente plantados árvores frutíferas nativas e adaptáveis ao clima e solo das áreas adquiridas.
                </p>

                <div class="col-lg-4 col-lg-offset-4">
                    <a href="/projeto" class="btn btn-success btn-lg" style="margin-bottom: 15px;">
                        <span class="network-name">Leia mais &nbsp;</span><i class="fa fa-angle-double-right "></i>
                    </a>
                </div>
            </div>
            <div class="col-lg-5 col-sm-6">
                <img class="img-responsive" src="/assets/img/mao.png" alt="">
            </div>
        </div>

    </div>
    <!-- /.container -->
</div>
<!-- /.content-section-a -->

<a id="participar"></a>
<div class="content-section-b">

    <div class="container">

        <div class="row">

        </div>
        <div class="row">
            <hr class="section-heading-spacer">
            <div class="clearfix"></div>
            <h2 class="section-heading">Como participar?</h2>

            <div class="container">
                <div class="row">
                    <div class="progress" id="progress1">
                        <div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="0" aria-valuemin="0"
                             aria-valuemax="100" style="width: 0%;">
                        </div>
                        <span class="progress-type">Etapas</span>
                        <span class="progress-completed">0%</span>
                    </div>
                    <div class="row step">
                        <div id="div1" class="col-md-2 activestep"
                             onclick="javascript: resetActive(event, 0, 'step-1');">
                            <span class="fa fa-caret-right"></span>

                            <p>Inicio</p>
                        </div>
                        <div class="col-md-2" onclick="javascript: resetActive(event, 20, 'step-2');">
                            <span class="fa fa-file-text"></span>

                            <p>Registrar</p>
                        </div>
                        <div class="col-md-2" onclick="javascript: resetActive(event, 40, 'step-3');">
                            <span class="fa fa-unlock"></span>

                            <p>Autorização</p>
                        </div>
                        <div class="col-md-2" onclick="javascript: resetActive(event, 60, 'step-4');">
                            <span class="fa fa-refresh"></span>

                            <p>Autenticação</p>
                        </div>
                        <div class="col-md-2" onclick="javascript: resetActive(event, 80, 'step-5');">
                            <span class="fa fa-share-alt"></span>

                            <p>Compartilhar</p>
                        </div>
                        <div id="last" class="col-md-2" onclick="javascript: resetActive(event, 100, 'step-6');">
                            <span class="fa fa-star"></span>

                            <p>Envolver-se</p>
                        </div>
                    </div>
                </div>
                <div class="row setup-content step activeStepInfo" id="step-1">
                    <div class="col-xs-12">
                        <div class="col-md-12 well text-center">
                            <h1>Inicio</h1>

                            <h3 class=""> Para começar clique no próximo passo.</h3>
                        </div>
                    </div>
                </div>
                <div class="row setup-content step hiddenStepInfo" id="step-2">
                    <div class="col-xs-12">
                        <div class="col-md-12 well text-center">
                            <h1>Registrar</h1>
                            <h4>Você deve se registrar em nosso portal.</h4>
                            <h4>Portanto, clique em <a href="">Registrar</a> no menu suspenso acima, e preencha o
                                cadastro.</h4>
                            <h4>Se você possui conta no Facebook ou Google, pule para o passo 4.</h4>
                        </div>
                    </div>
                </div>
                <div class="row setup-content step hiddenStepInfo" id="step-3">
                    <div class="col-xs-12">
                        <div class="col-md-12 well text-center">
                            <h1>Email de Autorização</h1>
                            <h4>Você receberá um email de confirmação.</h4>
                            <h4>Portanto, verifique sua caixa de entrada em seu email.</h4>
                        </div>
                    </div>
                </div>
                <div class="row setup-content step hiddenStepInfo" id="step-4">
                    <div class="col-xs-12">
                        <div class="col-md-12 well text-center">
                            <h1>Autenticação</h1>
                            <h4>Você deve entrar no portal.</h4>
                            <h4>Portanto, clique em <a href="">Entrar</a> no menu suspenso acima, e preencha com seu
                                login e senha
                                pré-cadastrados anteriormente.</h4>
                            <h4>Se possuir conta Facebook ou Google, clique para entrar nos respectivos botões.</h4>
                        </div>
                    </div>
                </div>
                <div class="row setup-content step hiddenStepInfo" id="step-5">
                    <div class="col-xs-12">
                        <div class="col-md-12 well text-center">
                            <h1>Compartilhar</h1>
                            <h4>Compartilhe este projeto com seus amigos nas Redes Sociais, e faça parte também da nossa
                                rede de amigos
                                em nossas fan-pages.</h4>
                        </div>
                    </div>
                </div>
                <div class="row setup-content step hiddenStepInfo" id="step-6">
                    <div class="col-xs-12">
                        <div class="col-md-12 well text-center">
                            <h1>Envolver-se</h1>
                            <h4>Participe em nosso <a href="/mural">Mural</a></h4>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </div>
    <!-- /.container -->

</div>
<!-- /.content-section-b -->

<a name="contact"></a>
<div class="banner">

    <div class="container">

        <div class="row">
            <div class="col-lg-6">
                <h2>Compartilhe este projeto:</h2>
            </div>
            <div class="col-lg-6">
                <ul class="list-inline banner-social-buttons">
                    <li>
                        <a href="#" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i>
                            <span class="network-name">Twitter</span></a>
                    </li>
                    <li>
                        <a href="https://www.facebook.com/pages/Projeto-Xarax/990915060941437?fref=ts" target="_blank" class="btn btn-default btn-lg"><i class="fa fa-facebook fa-fw"></i>
                            <span class="network-name">Facebook</span></a>
                    </li>
                    <li>
                        <a href="#" class="btn btn-default btn-lg"><i class="fa fa-google-plus fa-fw"></i>
                            <span class="network-name">Google</span></a>
                    </li>
                </ul>
            </div>
        </div>

    </div>
    <!-- /.container -->

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

<script>
    $(document).ready(function () """),format.raw/*470.35*/("""{"""),format.raw/*470.36*/("""
        """),format.raw/*471.9*/("""var t, a = null;
        $("ul.nav a").bind("click", function (n) """),format.raw/*472.50*/("""{"""),format.raw/*472.51*/("""
            """),format.raw/*473.13*/("""var e = $(this);
            t = e, null != a && a.parent().attr("class", "none"), t.parent().attr("class", "active"), $("html, body").stop().animate("""),format.raw/*474.134*/("""{"""),format.raw/*474.135*/("""scrollTop: $(t.attr("href")).position().top"""),format.raw/*474.178*/("""}"""),format.raw/*474.179*/(""", 1e3), a = e, n.preventDefault()
        """),format.raw/*475.9*/("""}"""),format.raw/*475.10*/(""")
    """),format.raw/*476.5*/("""}"""),format.raw/*476.6*/(""");
</script>

<script type="text/javascript">
    function resetActive(event, percent, step) """),format.raw/*480.48*/("""{"""),format.raw/*480.49*/("""
        """),format.raw/*481.9*/("""$(".progress-bar").css("width", percent + "%").attr("aria-valuenow", percent);
        $(".progress-completed").text(percent + "%");

        $("div").each(function () """),format.raw/*484.35*/("""{"""),format.raw/*484.36*/("""
            """),format.raw/*485.13*/("""if ($(this).hasClass("activestep")) """),format.raw/*485.49*/("""{"""),format.raw/*485.50*/("""
                """),format.raw/*486.17*/("""$(this).removeClass("activestep");
            """),format.raw/*487.13*/("""}"""),format.raw/*487.14*/("""
        """),format.raw/*488.9*/("""}"""),format.raw/*488.10*/(""");

        if (event.target.className == "col-md-2") """),format.raw/*490.51*/("""{"""),format.raw/*490.52*/("""
            """),format.raw/*491.13*/("""$(event.target).addClass("activestep");
        """),format.raw/*492.9*/("""}"""),format.raw/*492.10*/("""
        """),format.raw/*493.9*/("""else """),format.raw/*493.14*/("""{"""),format.raw/*493.15*/("""
            """),format.raw/*494.13*/("""$(event.target.parentNode).addClass("activestep");
        """),format.raw/*495.9*/("""}"""),format.raw/*495.10*/("""

        """),format.raw/*497.9*/("""hideSteps();
        showCurrentStepInfo(step);
    """),format.raw/*499.5*/("""}"""),format.raw/*499.6*/("""

    """),format.raw/*501.5*/("""function hideSteps() """),format.raw/*501.26*/("""{"""),format.raw/*501.27*/("""
        """),format.raw/*502.9*/("""$("div").each(function () """),format.raw/*502.35*/("""{"""),format.raw/*502.36*/("""
            """),format.raw/*503.13*/("""if ($(this).hasClass("activeStepInfo")) """),format.raw/*503.53*/("""{"""),format.raw/*503.54*/("""
                """),format.raw/*504.17*/("""$(this).removeClass("activeStepInfo");
                $(this).addClass("hiddenStepInfo");
            """),format.raw/*506.13*/("""}"""),format.raw/*506.14*/("""
        """),format.raw/*507.9*/("""}"""),format.raw/*507.10*/(""");
    """),format.raw/*508.5*/("""}"""),format.raw/*508.6*/("""

    """),format.raw/*510.5*/("""function showCurrentStepInfo(step) """),format.raw/*510.40*/("""{"""),format.raw/*510.41*/("""
        """),format.raw/*511.9*/("""var id = "#" + step;
        $(id).addClass("activeStepInfo");
    """),format.raw/*513.5*/("""}"""),format.raw/*513.6*/("""
"""),format.raw/*514.1*/("""</script>

<script type="text/javascript">

    $(document).ready(function () """),format.raw/*518.35*/("""{"""),format.raw/*518.36*/("""
        """),format.raw/*519.9*/("""//Handles menu drop down
        $('.dropdown-menu').find('form').click(function (e) """),format.raw/*520.61*/("""{"""),format.raw/*520.62*/("""
            """),format.raw/*521.13*/("""e.stopPropagation();
        """),format.raw/*522.9*/("""}"""),format.raw/*522.10*/(""");
    """),format.raw/*523.5*/("""}"""),format.raw/*523.6*/(""");

    $(document).ready(function () """),format.raw/*525.35*/("""{"""),format.raw/*525.36*/("""

        """),format.raw/*527.9*/("""if (/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)) """),format.raw/*527.105*/("""{"""),format.raw/*527.106*/("""
            """),format.raw/*528.13*/("""console.log("This is mobile device!");
            $('#participar').css('display', 'none');
            $('#video').css('display', 'none');
            $('.banner').css('background', 'url(assets/img/troncos_c.png)');
            $(window).load(function () """),format.raw/*532.40*/("""{"""),format.raw/*532.41*/("""
                """),format.raw/*533.17*/("""var i = 0;
                var images = ['assets/img/vitoria.jpg', 'assets/img/troncos_c.png', 'assets/img/54bis_c.png',
                'assets/img/mata_c.png', 'assets/img/rio_c.png'];
                var image = $('.intro-header');
                //Initial Background image setup
                image.css('background', 'url(assets/img/rio_c.png)');
                //Change image at regular intervals
                setInterval(function () """),format.raw/*540.41*/("""{"""),format.raw/*540.42*/("""
                    """),format.raw/*541.21*/("""image.fadeOut(1000, function () """),format.raw/*541.53*/("""{"""),format.raw/*541.54*/("""
                        """),format.raw/*542.25*/("""image.css('background', 'url(' + images [i++] + ')');
                        image.fadeIn(1000);
                    """),format.raw/*544.21*/("""}"""),format.raw/*544.22*/(""");
                    if (i == images.length)
                        i = 0;
                """),format.raw/*547.17*/("""}"""),format.raw/*547.18*/(""", 10000);
            """),format.raw/*548.13*/("""}"""),format.raw/*548.14*/(""");
        """),format.raw/*549.9*/("""}"""),format.raw/*549.10*/(""" """),format.raw/*549.11*/("""else """),format.raw/*549.16*/("""{"""),format.raw/*549.17*/("""
            """),format.raw/*550.13*/("""console.log("Isn't mobile device!");
            $(window).load(function () """),format.raw/*551.40*/("""{"""),format.raw/*551.41*/("""
                """),format.raw/*552.17*/("""var i = 0;
                var images = ['assets/img/soprando.jpg','assets/img/vitoria.jpg', 'assets/img/camaleao.png',
                'assets/img/happy.jpg', 'assets/img/troncos.png', 'assets/img/camaleao.png'];
                var image = $('.intro-header');
                //Initial Background image setup

                //Change image at regular intervals
                setInterval(function () """),format.raw/*559.41*/("""{"""),format.raw/*559.42*/("""
                    """),format.raw/*560.21*/("""image.fadeOut(1000, function () """),format.raw/*560.53*/("""{"""),format.raw/*560.54*/("""
                        """),format.raw/*561.25*/("""image.css('background', 'url(' + images [i++] + ')');
                        image.fadeIn(1000);
                    """),format.raw/*563.21*/("""}"""),format.raw/*563.22*/(""");
                    if (i == images.length)
                        i = 0;
                """),format.raw/*566.17*/("""}"""),format.raw/*566.18*/(""", 6000);
            """),format.raw/*567.13*/("""}"""),format.raw/*567.14*/(""");
        """),format.raw/*568.9*/("""}"""),format.raw/*568.10*/("""


    """),format.raw/*571.5*/("""}"""),format.raw/*571.6*/(""");
</script>

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
                  DATE: Mon Jun 29 13:44:32 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/activator-1.2.10/demic/app/views/index.scala.html
                  HASH: fc9cff504aaa77f1cf754c378c4ccdaddc5e0471
                  MATRIX: 724->1|830->19|860->23|5897->5032|5924->5049|5964->5050|6015->5072|6156->5185|6173->5192|6204->5200|6494->5470|6508->5474|6548->5475|6599->5497|8228->7094|8273->7110|21997->20805|22027->20806|22065->20816|22161->20883|22191->20884|22234->20898|22415->21049|22446->21050|22519->21093|22550->21094|22621->21137|22651->21138|22686->21145|22715->21146|22841->21243|22871->21244|22909->21254|23109->21425|23139->21426|23182->21440|23247->21476|23277->21477|23324->21495|23401->21543|23431->21544|23469->21554|23499->21555|23584->21611|23614->21612|23657->21626|23734->21675|23764->21676|23802->21686|23836->21691|23866->21692|23909->21706|23997->21766|24027->21767|24067->21779|24149->21833|24178->21834|24214->21842|24264->21863|24294->21864|24332->21874|24387->21900|24417->21901|24460->21915|24529->21955|24559->21956|24606->21974|24740->22079|24770->22080|24808->22090|24838->22091|24874->22099|24903->22100|24939->22108|25003->22143|25033->22144|25071->22154|25168->22223|25197->22224|25227->22226|25338->22308|25368->22309|25406->22319|25521->22405|25551->22406|25594->22420|25652->22450|25682->22451|25718->22459|25747->22460|25816->22500|25846->22501|25886->22513|26012->22609|26043->22610|26086->22624|26375->22884|26405->22885|26452->22903|26934->23356|26964->23357|27015->23379|27076->23411|27106->23412|27161->23438|27310->23558|27340->23559|27466->23656|27496->23657|27548->23680|27578->23681|27618->23693|27648->23694|27678->23695|27712->23700|27742->23701|27785->23715|27891->23792|27921->23793|27968->23811|28408->24222|28438->24223|28489->24245|28550->24277|28580->24278|28635->24304|28784->24424|28814->24425|28940->24522|28970->24523|29021->24545|29051->24546|29091->24558|29121->24559|29159->24569|29188->24570
                  LINES: 26->1|29->1|31->3|137->109|137->109|137->109|138->110|139->111|139->111|139->111|144->116|144->116|144->116|145->117|165->137|167->139|498->470|498->470|499->471|500->472|500->472|501->473|502->474|502->474|502->474|502->474|503->475|503->475|504->476|504->476|508->480|508->480|509->481|512->484|512->484|513->485|513->485|513->485|514->486|515->487|515->487|516->488|516->488|518->490|518->490|519->491|520->492|520->492|521->493|521->493|521->493|522->494|523->495|523->495|525->497|527->499|527->499|529->501|529->501|529->501|530->502|530->502|530->502|531->503|531->503|531->503|532->504|534->506|534->506|535->507|535->507|536->508|536->508|538->510|538->510|538->510|539->511|541->513|541->513|542->514|546->518|546->518|547->519|548->520|548->520|549->521|550->522|550->522|551->523|551->523|553->525|553->525|555->527|555->527|555->527|556->528|560->532|560->532|561->533|568->540|568->540|569->541|569->541|569->541|570->542|572->544|572->544|575->547|575->547|576->548|576->548|577->549|577->549|577->549|577->549|577->549|578->550|579->551|579->551|580->552|587->559|587->559|588->560|588->560|588->560|589->561|591->563|591->563|594->566|594->566|595->567|595->567|596->568|596->568|599->571|599->571
                  -- GENERATED --
              */
          