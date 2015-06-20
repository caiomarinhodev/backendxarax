
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
            <ul class="nav navbar-nav navbar-right">
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
                """),_display_(/*92.18*/if(usuario!=null)/*92.35*/{_display_(Seq[Any](format.raw/*92.36*/("""
                    """),format.raw/*93.21*/("""<li class="dropdown">
                        <a class="dropdown-toggle" href="#" data-toggle="dropdown"> Olá, """),_display_(/*94.91*/usuario/*94.98*/.getNome),format.raw/*94.106*/("""</a>
                        <div class="dropdown-menu" style="padding: 15px; padding-bottom: 0px;">
                            <a class="btn btn-block btn-primary" href="/logout">Sair</a>
                        </div>
                    </li>
                """)))}/*99.18*/else/*99.22*/{_display_(Seq[Any](format.raw/*99.23*/("""
                    """),format.raw/*100.21*/("""<li class="dropdown">
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
                """)))}),format.raw/*120.18*/("""

            """),format.raw/*122.13*/("""</ul>

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
                            <a href="#" class="btn btn-default btn-lg"><i class="fa fa-facebook fa-fw"></i>
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
                        <a href="#" class="btn btn-default btn-lg"><i class="fa fa-facebook fa-fw"></i>
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
    $(document).ready(function () """),format.raw/*453.35*/("""{"""),format.raw/*453.36*/("""
        """),format.raw/*454.9*/("""var t, a = null;
        $("ul.nav a").bind("click", function (n) """),format.raw/*455.50*/("""{"""),format.raw/*455.51*/("""
            """),format.raw/*456.13*/("""var e = $(this);
            t = e, null != a && a.parent().attr("class", "none"), t.parent().attr("class", "active"), $("html, body").stop().animate("""),format.raw/*457.134*/("""{"""),format.raw/*457.135*/("""scrollTop: $(t.attr("href")).position().top"""),format.raw/*457.178*/("""}"""),format.raw/*457.179*/(""", 1e3), a = e, n.preventDefault()
        """),format.raw/*458.9*/("""}"""),format.raw/*458.10*/(""")
    """),format.raw/*459.5*/("""}"""),format.raw/*459.6*/(""");
</script>

<script type="text/javascript">
    function resetActive(event, percent, step) """),format.raw/*463.48*/("""{"""),format.raw/*463.49*/("""
        """),format.raw/*464.9*/("""$(".progress-bar").css("width", percent + "%").attr("aria-valuenow", percent);
        $(".progress-completed").text(percent + "%");

        $("div").each(function () """),format.raw/*467.35*/("""{"""),format.raw/*467.36*/("""
            """),format.raw/*468.13*/("""if ($(this).hasClass("activestep")) """),format.raw/*468.49*/("""{"""),format.raw/*468.50*/("""
                """),format.raw/*469.17*/("""$(this).removeClass("activestep");
            """),format.raw/*470.13*/("""}"""),format.raw/*470.14*/("""
        """),format.raw/*471.9*/("""}"""),format.raw/*471.10*/(""");

        if (event.target.className == "col-md-2") """),format.raw/*473.51*/("""{"""),format.raw/*473.52*/("""
            """),format.raw/*474.13*/("""$(event.target).addClass("activestep");
        """),format.raw/*475.9*/("""}"""),format.raw/*475.10*/("""
        """),format.raw/*476.9*/("""else """),format.raw/*476.14*/("""{"""),format.raw/*476.15*/("""
            """),format.raw/*477.13*/("""$(event.target.parentNode).addClass("activestep");
        """),format.raw/*478.9*/("""}"""),format.raw/*478.10*/("""

        """),format.raw/*480.9*/("""hideSteps();
        showCurrentStepInfo(step);
    """),format.raw/*482.5*/("""}"""),format.raw/*482.6*/("""

    """),format.raw/*484.5*/("""function hideSteps() """),format.raw/*484.26*/("""{"""),format.raw/*484.27*/("""
        """),format.raw/*485.9*/("""$("div").each(function () """),format.raw/*485.35*/("""{"""),format.raw/*485.36*/("""
            """),format.raw/*486.13*/("""if ($(this).hasClass("activeStepInfo")) """),format.raw/*486.53*/("""{"""),format.raw/*486.54*/("""
                """),format.raw/*487.17*/("""$(this).removeClass("activeStepInfo");
                $(this).addClass("hiddenStepInfo");
            """),format.raw/*489.13*/("""}"""),format.raw/*489.14*/("""
        """),format.raw/*490.9*/("""}"""),format.raw/*490.10*/(""");
    """),format.raw/*491.5*/("""}"""),format.raw/*491.6*/("""

    """),format.raw/*493.5*/("""function showCurrentStepInfo(step) """),format.raw/*493.40*/("""{"""),format.raw/*493.41*/("""
        """),format.raw/*494.9*/("""var id = "#" + step;
        $(id).addClass("activeStepInfo");
    """),format.raw/*496.5*/("""}"""),format.raw/*496.6*/("""
"""),format.raw/*497.1*/("""</script>

<script type="text/javascript">

    $(document).ready(function () """),format.raw/*501.35*/("""{"""),format.raw/*501.36*/("""
        """),format.raw/*502.9*/("""//Handles menu drop down
        $('.dropdown-menu').find('form').click(function (e) """),format.raw/*503.61*/("""{"""),format.raw/*503.62*/("""
            """),format.raw/*504.13*/("""e.stopPropagation();
        """),format.raw/*505.9*/("""}"""),format.raw/*505.10*/(""");
    """),format.raw/*506.5*/("""}"""),format.raw/*506.6*/(""");

    $(document).ready(function () """),format.raw/*508.35*/("""{"""),format.raw/*508.36*/("""

        """),format.raw/*510.9*/("""if (/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)) """),format.raw/*510.105*/("""{"""),format.raw/*510.106*/("""
            """),format.raw/*511.13*/("""console.log("This is mobile device!");
            $('#participar').css('display', 'none');
            $('#video').css('display', 'none');
            $('.banner').css('background', 'url(assets/img/troncos_c.png)');
            $(window).load(function () """),format.raw/*515.40*/("""{"""),format.raw/*515.41*/("""
                """),format.raw/*516.17*/("""var i = 0;
                var images = ['assets/img/vitoria.jpg', 'assets/img/troncos_c.png', 'assets/img/54bis_c.png',
                'assets/img/mata_c.png', 'assets/img/rio_c.png'];
                var image = $('.intro-header');
                //Initial Background image setup
                image.css('background', 'url(assets/img/rio_c.png)');
                //Change image at regular intervals
                setInterval(function () """),format.raw/*523.41*/("""{"""),format.raw/*523.42*/("""
                    """),format.raw/*524.21*/("""image.fadeOut(1000, function () """),format.raw/*524.53*/("""{"""),format.raw/*524.54*/("""
                        """),format.raw/*525.25*/("""image.css('background', 'url(' + images [i++] + ')');
                        image.fadeIn(1000);
                    """),format.raw/*527.21*/("""}"""),format.raw/*527.22*/(""");
                    if (i == images.length)
                        i = 0;
                """),format.raw/*530.17*/("""}"""),format.raw/*530.18*/(""", 10000);
            """),format.raw/*531.13*/("""}"""),format.raw/*531.14*/(""");
        """),format.raw/*532.9*/("""}"""),format.raw/*532.10*/(""" """),format.raw/*532.11*/("""else """),format.raw/*532.16*/("""{"""),format.raw/*532.17*/("""
            """),format.raw/*533.13*/("""console.log("Isn't mobile device!");
            $(window).load(function () """),format.raw/*534.40*/("""{"""),format.raw/*534.41*/("""
                """),format.raw/*535.17*/("""var i = 0;
                var images = ['assets/img/soprando.jpg','assets/img/vitoria.jpg', 'assets/img/camaleao.png',
                'assets/img/happy.jpg', 'assets/img/troncos.png', 'assets/img/camaleao.png'];
                var image = $('.intro-header');
                //Initial Background image setup

                //Change image at regular intervals
                setInterval(function () """),format.raw/*542.41*/("""{"""),format.raw/*542.42*/("""
                    """),format.raw/*543.21*/("""image.fadeOut(1000, function () """),format.raw/*543.53*/("""{"""),format.raw/*543.54*/("""
                        """),format.raw/*544.25*/("""image.css('background', 'url(' + images [i++] + ')');
                        image.fadeIn(1000);
                    """),format.raw/*546.21*/("""}"""),format.raw/*546.22*/(""");
                    if (i == images.length)
                        i = 0;
                """),format.raw/*549.17*/("""}"""),format.raw/*549.18*/(""", 6000);
            """),format.raw/*550.13*/("""}"""),format.raw/*550.14*/(""");
        """),format.raw/*551.9*/("""}"""),format.raw/*551.10*/("""


    """),format.raw/*554.5*/("""}"""),format.raw/*554.6*/(""");
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
                  DATE: Sat Jun 20 13:45:20 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/activator-1.2.10/demic/app/views/index.scala.html
                  HASH: 74d999844164bd1500574ebf296c47e3198bd86d
                  MATRIX: 724->1|830->19|860->23|4442->3578|4468->3595|4507->3596|4557->3618|4697->3731|4713->3738|4743->3746|5031->4015|5044->4019|5083->4020|5134->4042|6763->5639|6808->5655|20366->19184|20396->19185|20434->19195|20530->19262|20560->19263|20603->19277|20784->19428|20815->19429|20888->19472|20919->19473|20990->19516|21020->19517|21055->19524|21084->19525|21210->19622|21240->19623|21278->19633|21478->19804|21508->19805|21551->19819|21616->19855|21646->19856|21693->19874|21770->19922|21800->19923|21838->19933|21868->19934|21953->19990|21983->19991|22026->20005|22103->20054|22133->20055|22171->20065|22205->20070|22235->20071|22278->20085|22366->20145|22396->20146|22436->20158|22518->20212|22547->20213|22583->20221|22633->20242|22663->20243|22701->20253|22756->20279|22786->20280|22829->20294|22898->20334|22928->20335|22975->20353|23109->20458|23139->20459|23177->20469|23207->20470|23243->20478|23272->20479|23308->20487|23372->20522|23402->20523|23440->20533|23537->20602|23566->20603|23596->20605|23707->20687|23737->20688|23775->20698|23890->20784|23920->20785|23963->20799|24021->20829|24051->20830|24087->20838|24116->20839|24185->20879|24215->20880|24255->20892|24381->20988|24412->20989|24455->21003|24744->21263|24774->21264|24821->21282|25303->21735|25333->21736|25384->21758|25445->21790|25475->21791|25530->21817|25679->21937|25709->21938|25835->22035|25865->22036|25917->22059|25947->22060|25987->22072|26017->22073|26047->22074|26081->22079|26111->22080|26154->22094|26260->22171|26290->22172|26337->22190|26777->22601|26807->22602|26858->22624|26919->22656|26949->22657|27004->22683|27153->22803|27183->22804|27309->22901|27339->22902|27390->22924|27420->22925|27460->22937|27490->22938|27528->22948|27557->22949
                  LINES: 26->1|29->1|31->3|120->92|120->92|120->92|121->93|122->94|122->94|122->94|127->99|127->99|127->99|128->100|148->120|150->122|481->453|481->453|482->454|483->455|483->455|484->456|485->457|485->457|485->457|485->457|486->458|486->458|487->459|487->459|491->463|491->463|492->464|495->467|495->467|496->468|496->468|496->468|497->469|498->470|498->470|499->471|499->471|501->473|501->473|502->474|503->475|503->475|504->476|504->476|504->476|505->477|506->478|506->478|508->480|510->482|510->482|512->484|512->484|512->484|513->485|513->485|513->485|514->486|514->486|514->486|515->487|517->489|517->489|518->490|518->490|519->491|519->491|521->493|521->493|521->493|522->494|524->496|524->496|525->497|529->501|529->501|530->502|531->503|531->503|532->504|533->505|533->505|534->506|534->506|536->508|536->508|538->510|538->510|538->510|539->511|543->515|543->515|544->516|551->523|551->523|552->524|552->524|552->524|553->525|555->527|555->527|558->530|558->530|559->531|559->531|560->532|560->532|560->532|560->532|560->532|561->533|562->534|562->534|563->535|570->542|570->542|571->543|571->543|571->543|572->544|574->546|574->546|577->549|577->549|578->550|578->550|579->551|579->551|582->554|582->554
                  -- GENERATED --
              */
          