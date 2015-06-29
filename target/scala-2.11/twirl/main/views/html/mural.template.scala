
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
object mural extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

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

    <title>Projeto Xarax - Mural</title>


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
    <link href="/assets/css/sb-admin.css" rel="stylesheet">

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
        .timeline """),format.raw/*54.19*/("""{"""),format.raw/*54.20*/("""
            """),format.raw/*55.13*/("""list-style: none;
            padding: 20px 0 20px;
            position: relative;
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""

        """),format.raw/*60.9*/(""".timeline:before """),format.raw/*60.26*/("""{"""),format.raw/*60.27*/("""
            """),format.raw/*61.13*/("""top: 0;
            bottom: 0;
            position: absolute;
            content: " ";
            width: 3px;
            background-color: #eeeeee;
            left: 50%;
            margin-left: -1.5px;
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/("""

        """),format.raw/*71.9*/(""".timeline > li """),format.raw/*71.24*/("""{"""),format.raw/*71.25*/("""
            """),format.raw/*72.13*/("""margin-bottom: 20px;
            position: relative;
        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/("""

        """),format.raw/*76.9*/(""".timeline > li:before,
        .timeline > li:after """),format.raw/*77.30*/("""{"""),format.raw/*77.31*/("""
            """),format.raw/*78.13*/("""content: " ";
            display: table;
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/("""

        """),format.raw/*82.9*/(""".timeline > li:after """),format.raw/*82.30*/("""{"""),format.raw/*82.31*/("""
            """),format.raw/*83.13*/("""clear: both;
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/("""

        """),format.raw/*86.9*/(""".timeline > li:before,
        .timeline > li:after """),format.raw/*87.30*/("""{"""),format.raw/*87.31*/("""
            """),format.raw/*88.13*/("""content: " ";
            display: table;
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""

        """),format.raw/*92.9*/(""".timeline > li:after """),format.raw/*92.30*/("""{"""),format.raw/*92.31*/("""
            """),format.raw/*93.13*/("""clear: both;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""

        """),format.raw/*96.9*/(""".timeline > li > .timeline-panel """),format.raw/*96.42*/("""{"""),format.raw/*96.43*/("""
            """),format.raw/*97.13*/("""width: 46%;
            float: left;
            border: 1px solid #d4d4d4;
            border-radius: 2px;
            padding: 20px;
            position: relative;
            -webkit-box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);
            box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);
        """),format.raw/*105.9*/("""}"""),format.raw/*105.10*/("""

        """),format.raw/*107.9*/(""".timeline > li > .timeline-panel:before """),format.raw/*107.49*/("""{"""),format.raw/*107.50*/("""
            """),format.raw/*108.13*/("""position: absolute;
            top: 26px;
            right: -15px;
            display: inline-block;
            border-top: 15px solid transparent;
            border-left: 15px solid #ccc;
            border-right: 0 solid #ccc;
            border-bottom: 15px solid transparent;
            content: " ";
        """),format.raw/*117.9*/("""}"""),format.raw/*117.10*/("""

        """),format.raw/*119.9*/(""".timeline > li > .timeline-panel:after """),format.raw/*119.48*/("""{"""),format.raw/*119.49*/("""
            """),format.raw/*120.13*/("""position: absolute;
            top: 27px;
            right: -14px;
            display: inline-block;
            border-top: 14px solid transparent;
            border-left: 14px solid #fff;
            border-right: 0 solid #fff;
            border-bottom: 14px solid transparent;
            content: " ";
        """),format.raw/*129.9*/("""}"""),format.raw/*129.10*/("""

        """),format.raw/*131.9*/(""".timeline > li > .timeline-badge """),format.raw/*131.42*/("""{"""),format.raw/*131.43*/("""
            """),format.raw/*132.13*/("""color: #fff;
            width: 50px;
            height: 50px;
            line-height: 50px;
            font-size: 1.4em;
            text-align: center;
            position: absolute;
            top: 16px;
            left: 50%;
            margin-left: -25px;
            background-color: #999999;
            z-index: 100;
            border-top-right-radius: 50%;
            border-top-left-radius: 50%;
            border-bottom-right-radius: 50%;
            border-bottom-left-radius: 50%;
        """),format.raw/*148.9*/("""}"""),format.raw/*148.10*/("""

        """),format.raw/*150.9*/(""".timeline > li.timeline-inverted > .timeline-panel """),format.raw/*150.60*/("""{"""),format.raw/*150.61*/("""
            """),format.raw/*151.13*/("""float: right;
        """),format.raw/*152.9*/("""}"""),format.raw/*152.10*/("""

        """),format.raw/*154.9*/(""".timeline > li.timeline-inverted > .timeline-panel:before """),format.raw/*154.67*/("""{"""),format.raw/*154.68*/("""
            """),format.raw/*155.13*/("""border-left-width: 0;
            border-right-width: 15px;
            left: -15px;
            right: auto;
        """),format.raw/*159.9*/("""}"""),format.raw/*159.10*/("""

        """),format.raw/*161.9*/(""".timeline > li.timeline-inverted > .timeline-panel:after """),format.raw/*161.66*/("""{"""),format.raw/*161.67*/("""
            """),format.raw/*162.13*/("""border-left-width: 0;
            border-right-width: 14px;
            left: -14px;
            right: auto;
        """),format.raw/*166.9*/("""}"""),format.raw/*166.10*/("""

        """),format.raw/*168.9*/(""".timeline-badge.primary """),format.raw/*168.33*/("""{"""),format.raw/*168.34*/("""
            """),format.raw/*169.13*/("""background-color: #2e6da4 !important;
        """),format.raw/*170.9*/("""}"""),format.raw/*170.10*/("""

        """),format.raw/*172.9*/(""".timeline-badge.success """),format.raw/*172.33*/("""{"""),format.raw/*172.34*/("""
            """),format.raw/*173.13*/("""background-color: #3f903f !important;
        """),format.raw/*174.9*/("""}"""),format.raw/*174.10*/("""

        """),format.raw/*176.9*/(""".timeline-badge.warning """),format.raw/*176.33*/("""{"""),format.raw/*176.34*/("""
            """),format.raw/*177.13*/("""background-color: #f0ad4e !important;
        """),format.raw/*178.9*/("""}"""),format.raw/*178.10*/("""

        """),format.raw/*180.9*/(""".timeline-badge.danger """),format.raw/*180.32*/("""{"""),format.raw/*180.33*/("""
            """),format.raw/*181.13*/("""background-color: #d9534f !important;
        """),format.raw/*182.9*/("""}"""),format.raw/*182.10*/("""

        """),format.raw/*184.9*/(""".timeline-badge.info """),format.raw/*184.30*/("""{"""),format.raw/*184.31*/("""
            """),format.raw/*185.13*/("""background-color: #5bc0de !important;
        """),format.raw/*186.9*/("""}"""),format.raw/*186.10*/("""

        """),format.raw/*188.9*/(""".timeline-title """),format.raw/*188.25*/("""{"""),format.raw/*188.26*/("""
            """),format.raw/*189.13*/("""margin-top: 0;
            color: inherit;
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/("""

        """),format.raw/*193.9*/(""".timeline-body > p,
        .timeline-body > ul """),format.raw/*194.29*/("""{"""),format.raw/*194.30*/("""
            """),format.raw/*195.13*/("""margin-bottom: 0;
        """),format.raw/*196.9*/("""}"""),format.raw/*196.10*/("""

        """),format.raw/*198.9*/(""".timeline-body > p + p """),format.raw/*198.32*/("""{"""),format.raw/*198.33*/("""
            """),format.raw/*199.13*/("""margin-top: 5px;
        """),format.raw/*200.9*/("""}"""),format.raw/*200.10*/("""

    """),format.raw/*202.5*/("""</style>

</head>

<body>
    <div id="wrapper">
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
                        <li class="active">
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
                        """),_display_(/*257.26*/if(usuario!=null)/*257.43*/{_display_(Seq[Any](format.raw/*257.44*/("""
                        """),format.raw/*258.25*/("""<li class="dropdown">
                            <a class="dropdown-toggle" href="#" data-toggle="dropdown"> Olá, """),_display_(/*259.95*/usuario/*259.102*/.getNome),format.raw/*259.110*/("""</a>
                            <div class="dropdown-menu" style="padding: 15px; padding-bottom: 10px;">
                                <a class="btn btn-block btn-primary" href="/logout">Sair</a>
                            </div>
                        </li>
                        """)))}/*264.26*/else/*264.30*/{_display_(Seq[Any](format.raw/*264.31*/("""
                        """),format.raw/*265.25*/("""<li class="dropdown">
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
                        """)))}),format.raw/*285.26*/("""
                    """),format.raw/*286.21*/("""</ul>
                    <ul class="nav navbar-nav side-nav">
                        <center><h3>Usuários</h3></center>
                        <hr/>
                        """),_display_(/*290.26*/for(us <- SGDB.getAllUsers) yield /*290.53*/{_display_(Seq[Any](format.raw/*290.54*/("""
                            """),format.raw/*291.29*/("""<li>
                                <a href="#">
                                    """),_display_(/*293.38*/if(us.isColaborador)/*293.58*/{_display_(Seq[Any](format.raw/*293.59*/("""
                                        """),_display_(/*294.42*/if(us.getTipo==0)/*294.59*/{_display_(Seq[Any](format.raw/*294.60*/("""
                                            """),format.raw/*295.45*/("""<i class="fa fa-dollar"></i><span>&nbsp;Glauber S. Maior &nbsp;&nbsp;
                                                <img src=""""),_display_(/*296.60*/SGDB/*296.64*/.getNacionalidade(us.getNacionalidade).getPic),format.raw/*296.109*/(""""/> </span>
                                        """)))}/*297.42*/else/*297.46*/{_display_(Seq[Any](format.raw/*297.47*/("""
                                            """),format.raw/*298.45*/("""<i class="fa fa-dollar"></i><span>&nbsp;"""),_display_(/*298.86*/us/*298.88*/.getNome),format.raw/*298.96*/(""" """),_display_(/*298.98*/us/*298.100*/.getSobrenome),format.raw/*298.113*/(""" """),format.raw/*298.114*/("""&nbsp;&nbsp;
                                                <img src=""""),_display_(/*299.60*/SGDB/*299.64*/.getNacionalidade(us.getNacionalidade).getPic),format.raw/*299.109*/(""""/> </span>
                                        """)))}),format.raw/*300.42*/("""

                                    """)))}/*302.38*/else/*302.42*/{_display_(Seq[Any](format.raw/*302.43*/("""
                                        """),format.raw/*303.41*/("""<span>&nbsp;"""),_display_(/*303.54*/us/*303.56*/.getNome),format.raw/*303.64*/(""" """),_display_(/*303.66*/us/*303.68*/.getSobrenome),format.raw/*303.81*/(""" """),format.raw/*303.82*/("""&nbsp;&nbsp;
                                            <img src=""""),_display_(/*304.56*/SGDB/*304.60*/.getNacionalidade(us.getNacionalidade).getPic),format.raw/*304.105*/(""""/></span>
                                    """)))}),format.raw/*305.38*/("""
                                """),format.raw/*306.33*/("""</a>
                            </li>
                        """)))}),format.raw/*308.26*/("""
                    """),format.raw/*309.21*/("""</ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>
        <div id="page-wrapper">
            <!-- Page Content -->
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="row">
                            <hr/>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4>
                                        """),_display_(/*325.42*/if(SGDB.getUltimoPost!=null)/*325.70*/{_display_(Seq[Any](format.raw/*325.71*/("""
                                            """),_display_(/*326.46*/SGDB/*326.50*/.getUltimoPost().getTitulo),format.raw/*326.76*/("""
                                        """)))}),format.raw/*327.42*/("""
                                    """),format.raw/*328.37*/("""</h4>
                                </div>
                                <div class="panel-body">
                                    <p class="lead">
                                        """),_display_(/*332.42*/if(SGDB.getUltimoPost!=null)/*332.70*/{_display_(Seq[Any](format.raw/*332.71*/("""
                                            """),_display_(/*333.46*/SGDB/*333.50*/.getUltimoPost().getText),format.raw/*333.74*/("""
                                        """)))}),format.raw/*334.42*/("""
                                    """),format.raw/*335.37*/("""</p>
                                </div>
                            </div>
                        </div>
                        <div class="row">

                        </div>
                    </div>
                    <div class="col-lg-6">
                        <hr/>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Posts Recentes</h3>
                            </div>
                            <div class="panel-body">
                                <ul class="timeline">
                                    """),_display_(/*351.38*/for(post <- SGDB.getFivePosts) yield /*351.68*/{_display_(Seq[Any](format.raw/*351.69*/("""
                                        """),_display_(/*352.42*/if(SGDB.ehpar(post.getId))/*352.68*/{_display_(Seq[Any](format.raw/*352.69*/("""
                                            """),format.raw/*353.45*/("""<li>
                                                <div class="timeline-badge"><i class="glyphicon glyphicon-check"></i></div>
                                                <div class="timeline-panel">
                                                    <div class="timeline-heading">
                                                        <h4 class="timeline-title">"""),_display_(/*357.85*/post/*357.89*/.getTitulo),format.raw/*357.99*/("""</h4>
                                                        <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i>"""),_display_(/*358.127*/post/*358.131*/.getData),format.raw/*358.139*/("""</small></p>
                                                    </div>
                                                    <div class="timeline-body">
                                                        <p>"""),_display_(/*361.61*/SGDB/*361.65*/.resumePost(post.getText)),format.raw/*361.90*/("""</p>
                                                    </div>
                                                </div>
                                            </li>
                                        """)))}/*365.42*/else/*365.46*/{_display_(Seq[Any](format.raw/*365.47*/("""
                                            """),format.raw/*366.45*/("""<li class="timeline-inverted">
                                                <div class="timeline-badge warning"><i class="glyphicon glyphicon-check"></i></div>
                                                <div class="timeline-panel">
                                                    <div class="timeline-heading">
                                                        <h4 class="timeline-title">"""),_display_(/*370.85*/post/*370.89*/.getTitulo),format.raw/*370.99*/("""</h4>
                                                        <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i>"""),_display_(/*371.127*/post/*371.131*/.getData),format.raw/*371.139*/("""</small></p>
                                                    </div>
                                                    <div class="timeline-body">
                                                        <p>"""),_display_(/*374.61*/SGDB/*374.65*/.resumePost(post.getText)),format.raw/*374.90*/("""</p>
                                                    </div>
                                                </div>
                                            </li>
                                        """)))}),format.raw/*378.42*/("""
                                    """)))}),format.raw/*379.38*/("""
                                """),format.raw/*380.33*/("""</ul>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.container -->
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
                  SOURCE: C:/Users/Caio/Downloads/activator-1.2.10/demic/app/views/mural.scala.html
                  HASH: 74e040fbb89d698ab255d34aae4c74196e41eb15
                  MATRIX: 724->1|830->19|858->21|3685->2820|3714->2821|3756->2835|3878->2930|3907->2931|3946->2943|3991->2960|4020->2961|4062->2975|4313->3199|4342->3200|4381->3212|4424->3227|4453->3228|4495->3242|4585->3305|4614->3306|4653->3318|4734->3371|4763->3372|4805->3386|4884->3438|4913->3439|4952->3451|5001->3472|5030->3473|5072->3487|5121->3509|5150->3510|5189->3522|5270->3575|5299->3576|5341->3590|5420->3642|5449->3643|5488->3655|5537->3676|5566->3677|5608->3691|5657->3713|5686->3714|5725->3726|5786->3759|5815->3760|5857->3774|6188->4077|6218->4078|6258->4090|6327->4130|6357->4131|6400->4145|6756->4473|6786->4474|6826->4486|6894->4525|6924->4526|6967->4540|7323->4868|7353->4869|7393->4881|7455->4914|7485->4915|7528->4929|8084->5457|8114->5458|8154->5470|8234->5521|8264->5522|8307->5536|8358->5559|8388->5560|8428->5572|8515->5630|8545->5631|8588->5645|8738->5767|8768->5768|8808->5780|8894->5837|8924->5838|8967->5852|9117->5974|9147->5975|9187->5987|9240->6011|9270->6012|9313->6026|9388->6073|9418->6074|9458->6086|9511->6110|9541->6111|9584->6125|9659->6172|9689->6173|9729->6185|9782->6209|9812->6210|9855->6224|9930->6271|9960->6272|10000->6284|10052->6307|10082->6308|10125->6322|10200->6369|10230->6370|10270->6382|10320->6403|10350->6404|10393->6418|10468->6465|10498->6466|10538->6478|10583->6494|10613->6495|10656->6509|10737->6562|10767->6563|10807->6575|10885->6624|10915->6625|10958->6639|11013->6666|11043->6667|11083->6679|11135->6702|11165->6703|11208->6717|11262->6743|11292->6744|11328->6752|14047->9443|14074->9460|14114->9461|14169->9487|14314->9604|14332->9611|14363->9619|14677->9913|14691->9917|14731->9918|14786->9944|16521->11647|16572->11669|16781->11850|16825->11877|16865->11878|16924->11908|17041->11997|17071->12017|17111->12018|17182->12061|17209->12078|17249->12079|17324->12125|17482->12255|17496->12259|17564->12304|17638->12358|17652->12362|17692->12363|17767->12409|17836->12450|17848->12452|17878->12460|17908->12462|17921->12464|17957->12477|17988->12478|18089->12551|18103->12555|18171->12600|18257->12654|18318->12695|18332->12699|18372->12700|18443->12742|18484->12755|18496->12757|18526->12765|18556->12767|18568->12769|18603->12782|18633->12783|18730->12852|18744->12856|18812->12901|18893->12950|18956->12984|19054->13050|19105->13072|19753->13692|19791->13720|19831->13721|19906->13768|19920->13772|19968->13798|20043->13841|20110->13879|20338->14079|20376->14107|20416->14108|20491->14155|20505->14159|20551->14183|20626->14226|20693->14264|21390->14933|21437->14963|21477->14964|21548->15007|21584->15033|21624->15034|21699->15080|22104->15457|22118->15461|22150->15471|22312->15604|22327->15608|22358->15616|22601->15831|22615->15835|22662->15860|22896->16074|22910->16078|22950->16079|23025->16125|23464->16536|23478->16540|23510->16550|23672->16683|23687->16687|23718->16695|23961->16910|23975->16914|24022->16939|24268->17153|24339->17192|24402->17226
                  LINES: 26->1|29->1|30->2|82->54|82->54|83->55|86->58|86->58|88->60|88->60|88->60|89->61|97->69|97->69|99->71|99->71|99->71|100->72|102->74|102->74|104->76|105->77|105->77|106->78|108->80|108->80|110->82|110->82|110->82|111->83|112->84|112->84|114->86|115->87|115->87|116->88|118->90|118->90|120->92|120->92|120->92|121->93|122->94|122->94|124->96|124->96|124->96|125->97|133->105|133->105|135->107|135->107|135->107|136->108|145->117|145->117|147->119|147->119|147->119|148->120|157->129|157->129|159->131|159->131|159->131|160->132|176->148|176->148|178->150|178->150|178->150|179->151|180->152|180->152|182->154|182->154|182->154|183->155|187->159|187->159|189->161|189->161|189->161|190->162|194->166|194->166|196->168|196->168|196->168|197->169|198->170|198->170|200->172|200->172|200->172|201->173|202->174|202->174|204->176|204->176|204->176|205->177|206->178|206->178|208->180|208->180|208->180|209->181|210->182|210->182|212->184|212->184|212->184|213->185|214->186|214->186|216->188|216->188|216->188|217->189|219->191|219->191|221->193|222->194|222->194|223->195|224->196|224->196|226->198|226->198|226->198|227->199|228->200|228->200|230->202|285->257|285->257|285->257|286->258|287->259|287->259|287->259|292->264|292->264|292->264|293->265|313->285|314->286|318->290|318->290|318->290|319->291|321->293|321->293|321->293|322->294|322->294|322->294|323->295|324->296|324->296|324->296|325->297|325->297|325->297|326->298|326->298|326->298|326->298|326->298|326->298|326->298|326->298|327->299|327->299|327->299|328->300|330->302|330->302|330->302|331->303|331->303|331->303|331->303|331->303|331->303|331->303|331->303|332->304|332->304|332->304|333->305|334->306|336->308|337->309|353->325|353->325|353->325|354->326|354->326|354->326|355->327|356->328|360->332|360->332|360->332|361->333|361->333|361->333|362->334|363->335|379->351|379->351|379->351|380->352|380->352|380->352|381->353|385->357|385->357|385->357|386->358|386->358|386->358|389->361|389->361|389->361|393->365|393->365|393->365|394->366|398->370|398->370|398->370|399->371|399->371|399->371|402->374|402->374|402->374|406->378|407->379|408->380
                  -- GENERATED --
              */
          