
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
        .timeline """),format.raw/*36.19*/("""{"""),format.raw/*36.20*/("""
            """),format.raw/*37.13*/("""list-style: none;
            padding: 20px 0 20px;
            position: relative;
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""

        """),format.raw/*42.9*/(""".timeline:before """),format.raw/*42.26*/("""{"""),format.raw/*42.27*/("""
            """),format.raw/*43.13*/("""top: 0;
            bottom: 0;
            position: absolute;
            content: " ";
            width: 3px;
            background-color: #eeeeee;
            left: 50%;
            margin-left: -1.5px;
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/("""

        """),format.raw/*53.9*/(""".timeline > li """),format.raw/*53.24*/("""{"""),format.raw/*53.25*/("""
            """),format.raw/*54.13*/("""margin-bottom: 20px;
            position: relative;
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/("""

        """),format.raw/*58.9*/(""".timeline > li:before,
        .timeline > li:after """),format.raw/*59.30*/("""{"""),format.raw/*59.31*/("""
            """),format.raw/*60.13*/("""content: " ";
            display: table;
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""

        """),format.raw/*64.9*/(""".timeline > li:after """),format.raw/*64.30*/("""{"""),format.raw/*64.31*/("""
            """),format.raw/*65.13*/("""clear: both;
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/("""

        """),format.raw/*68.9*/(""".timeline > li:before,
        .timeline > li:after """),format.raw/*69.30*/("""{"""),format.raw/*69.31*/("""
            """),format.raw/*70.13*/("""content: " ";
            display: table;
        """),format.raw/*72.9*/("""}"""),format.raw/*72.10*/("""

        """),format.raw/*74.9*/(""".timeline > li:after """),format.raw/*74.30*/("""{"""),format.raw/*74.31*/("""
            """),format.raw/*75.13*/("""clear: both;
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/("""

        """),format.raw/*78.9*/(""".timeline > li > .timeline-panel """),format.raw/*78.42*/("""{"""),format.raw/*78.43*/("""
            """),format.raw/*79.13*/("""width: 46%;
            float: left;
            border: 1px solid #d4d4d4;
            border-radius: 2px;
            padding: 20px;
            position: relative;
            -webkit-box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);
            box-shadow: 0 1px 6px rgba(0, 0, 0, 0.175);
        """),format.raw/*87.9*/("""}"""),format.raw/*87.10*/("""

        """),format.raw/*89.9*/(""".timeline > li > .timeline-panel:before """),format.raw/*89.49*/("""{"""),format.raw/*89.50*/("""
            """),format.raw/*90.13*/("""position: absolute;
            top: 26px;
            right: -15px;
            display: inline-block;
            border-top: 15px solid transparent;
            border-left: 15px solid #ccc;
            border-right: 0 solid #ccc;
            border-bottom: 15px solid transparent;
            content: " ";
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/("""

        """),format.raw/*101.9*/(""".timeline > li > .timeline-panel:after """),format.raw/*101.48*/("""{"""),format.raw/*101.49*/("""
            """),format.raw/*102.13*/("""position: absolute;
            top: 27px;
            right: -14px;
            display: inline-block;
            border-top: 14px solid transparent;
            border-left: 14px solid #fff;
            border-right: 0 solid #fff;
            border-bottom: 14px solid transparent;
            content: " ";
        """),format.raw/*111.9*/("""}"""),format.raw/*111.10*/("""

        """),format.raw/*113.9*/(""".timeline > li > .timeline-badge """),format.raw/*113.42*/("""{"""),format.raw/*113.43*/("""
            """),format.raw/*114.13*/("""color: #fff;
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
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""

        """),format.raw/*132.9*/(""".timeline > li.timeline-inverted > .timeline-panel """),format.raw/*132.60*/("""{"""),format.raw/*132.61*/("""
            """),format.raw/*133.13*/("""float: right;
        """),format.raw/*134.9*/("""}"""),format.raw/*134.10*/("""

        """),format.raw/*136.9*/(""".timeline > li.timeline-inverted > .timeline-panel:before """),format.raw/*136.67*/("""{"""),format.raw/*136.68*/("""
            """),format.raw/*137.13*/("""border-left-width: 0;
            border-right-width: 15px;
            left: -15px;
            right: auto;
        """),format.raw/*141.9*/("""}"""),format.raw/*141.10*/("""

        """),format.raw/*143.9*/(""".timeline > li.timeline-inverted > .timeline-panel:after """),format.raw/*143.66*/("""{"""),format.raw/*143.67*/("""
            """),format.raw/*144.13*/("""border-left-width: 0;
            border-right-width: 14px;
            left: -14px;
            right: auto;
        """),format.raw/*148.9*/("""}"""),format.raw/*148.10*/("""

        """),format.raw/*150.9*/(""".timeline-badge.primary """),format.raw/*150.33*/("""{"""),format.raw/*150.34*/("""
            """),format.raw/*151.13*/("""background-color: #2e6da4 !important;
        """),format.raw/*152.9*/("""}"""),format.raw/*152.10*/("""

        """),format.raw/*154.9*/(""".timeline-badge.success """),format.raw/*154.33*/("""{"""),format.raw/*154.34*/("""
            """),format.raw/*155.13*/("""background-color: #3f903f !important;
        """),format.raw/*156.9*/("""}"""),format.raw/*156.10*/("""

        """),format.raw/*158.9*/(""".timeline-badge.warning """),format.raw/*158.33*/("""{"""),format.raw/*158.34*/("""
            """),format.raw/*159.13*/("""background-color: #f0ad4e !important;
        """),format.raw/*160.9*/("""}"""),format.raw/*160.10*/("""

        """),format.raw/*162.9*/(""".timeline-badge.danger """),format.raw/*162.32*/("""{"""),format.raw/*162.33*/("""
            """),format.raw/*163.13*/("""background-color: #d9534f !important;
        """),format.raw/*164.9*/("""}"""),format.raw/*164.10*/("""

        """),format.raw/*166.9*/(""".timeline-badge.info """),format.raw/*166.30*/("""{"""),format.raw/*166.31*/("""
            """),format.raw/*167.13*/("""background-color: #5bc0de !important;
        """),format.raw/*168.9*/("""}"""),format.raw/*168.10*/("""

        """),format.raw/*170.9*/(""".timeline-title """),format.raw/*170.25*/("""{"""),format.raw/*170.26*/("""
            """),format.raw/*171.13*/("""margin-top: 0;
            color: inherit;
        """),format.raw/*173.9*/("""}"""),format.raw/*173.10*/("""

        """),format.raw/*175.9*/(""".timeline-body > p,
        .timeline-body > ul """),format.raw/*176.29*/("""{"""),format.raw/*176.30*/("""
            """),format.raw/*177.13*/("""margin-bottom: 0;
        """),format.raw/*178.9*/("""}"""),format.raw/*178.10*/("""

        """),format.raw/*180.9*/(""".timeline-body > p + p """),format.raw/*180.32*/("""{"""),format.raw/*180.33*/("""
            """),format.raw/*181.13*/("""margin-top: 5px;
        """),format.raw/*182.9*/("""}"""),format.raw/*182.10*/("""

    """),format.raw/*184.5*/("""</style>

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
                        """),_display_(/*239.26*/if(usuario!=null)/*239.43*/{_display_(Seq[Any](format.raw/*239.44*/("""
                        """),format.raw/*240.25*/("""<li class="dropdown">
                            <a class="dropdown-toggle" href="#" data-toggle="dropdown"> Olá, """),_display_(/*241.95*/usuario/*241.102*/.getNome),format.raw/*241.110*/("""</a>
                            <div class="dropdown-menu" style="padding: 15px; padding-bottom: 0px;">
                                <a class="btn btn-block btn-primary" href="/logout">Sair</a>
                            </div>
                        </li>
                        """)))}/*246.26*/else/*246.30*/{_display_(Seq[Any](format.raw/*246.31*/("""
                        """),format.raw/*247.25*/("""<li class="dropdown">
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
                        """)))}),format.raw/*267.26*/("""
                    """),format.raw/*268.21*/("""</ul>
                    <ul class="nav navbar-nav side-nav">
                        <center><h3>Usuários</h3></center>
                        <hr/>
                        """),_display_(/*272.26*/for(us <- SGDB.getAllUsers) yield /*272.53*/{_display_(Seq[Any](format.raw/*272.54*/("""
                            """),format.raw/*273.29*/("""<li>
                                <a href="#">
                                    """),_display_(/*275.38*/if(us.isColaborador)/*275.58*/{_display_(Seq[Any](format.raw/*275.59*/("""
                                        """),format.raw/*276.41*/("""<i class="fa fa-dollar"></i><span>&nbsp;"""),_display_(/*276.82*/us/*276.84*/.getNome),format.raw/*276.92*/(""" """),_display_(/*276.94*/us/*276.96*/.getSobrenome),format.raw/*276.109*/(""" """),format.raw/*276.110*/("""&nbsp;&nbsp;
                                            <img src=""""),_display_(/*277.56*/SGDB/*277.60*/.getNacionalidade(us.getNacionalidade).getPic),format.raw/*277.105*/(""""/> </span>
                                    """)))}/*278.38*/else/*278.42*/{_display_(Seq[Any](format.raw/*278.43*/("""
                                        """),format.raw/*279.41*/("""<span>&nbsp;"""),_display_(/*279.54*/us/*279.56*/.getNome),format.raw/*279.64*/(""" """),_display_(/*279.66*/us/*279.68*/.getSobrenome),format.raw/*279.81*/(""" """),format.raw/*279.82*/("""&nbsp;&nbsp;
                                            <img src=""""),_display_(/*280.56*/SGDB/*280.60*/.getNacionalidade(us.getNacionalidade).getPic),format.raw/*280.105*/(""""/></span>
                                    """)))}),format.raw/*281.38*/("""
                                """),format.raw/*282.33*/("""</a>
                            </li>
                        """)))}),format.raw/*284.26*/("""
                    """),format.raw/*285.21*/("""</ul>
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
                                        """),_display_(/*301.42*/if(SGDB.getUltimoPost!=null)/*301.70*/{_display_(Seq[Any](format.raw/*301.71*/("""
                                            """),_display_(/*302.46*/SGDB/*302.50*/.getUltimoPost().getTitulo),format.raw/*302.76*/("""
                                        """)))}),format.raw/*303.42*/("""
                                    """),format.raw/*304.37*/("""</h4>
                                </div>
                                <div class="panel-body">
                                    <p class="lead">
                                        """),_display_(/*308.42*/if(SGDB.getUltimoPost!=null)/*308.70*/{_display_(Seq[Any](format.raw/*308.71*/("""
                                            """),_display_(/*309.46*/SGDB/*309.50*/.getUltimoPost().getText),format.raw/*309.74*/("""
                                        """)))}),format.raw/*310.42*/("""
                                    """),format.raw/*311.37*/("""</p>
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
                                    """),_display_(/*327.38*/for(post <- SGDB.getFivePosts) yield /*327.68*/{_display_(Seq[Any](format.raw/*327.69*/("""
                                        """),_display_(/*328.42*/if(SGDB.ehpar(post.getId))/*328.68*/{_display_(Seq[Any](format.raw/*328.69*/("""
                                            """),format.raw/*329.45*/("""<li>
                                                <div class="timeline-badge"><i class="glyphicon glyphicon-check"></i></div>
                                                <div class="timeline-panel">
                                                    <div class="timeline-heading">
                                                        <h4 class="timeline-title">"""),_display_(/*333.85*/post/*333.89*/.getTitulo),format.raw/*333.99*/("""</h4>
                                                        <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i>"""),_display_(/*334.127*/post/*334.131*/.getData),format.raw/*334.139*/("""</small></p>
                                                    </div>
                                                    <div class="timeline-body">
                                                        <p>"""),_display_(/*337.61*/SGDB/*337.65*/.resumePost(post.getText)),format.raw/*337.90*/("""</p>
                                                    </div>
                                                </div>
                                            </li>
                                        """)))}/*341.42*/else/*341.46*/{_display_(Seq[Any](format.raw/*341.47*/("""
                                            """),format.raw/*342.45*/("""<li class="timeline-inverted">
                                                <div class="timeline-badge warning"><i class="glyphicon glyphicon-check"></i></div>
                                                <div class="timeline-panel">
                                                    <div class="timeline-heading">
                                                        <h4 class="timeline-title">"""),_display_(/*346.85*/post/*346.89*/.getTitulo),format.raw/*346.99*/("""</h4>
                                                        <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i>"""),_display_(/*347.127*/post/*347.131*/.getData),format.raw/*347.139*/("""</small></p>
                                                    </div>
                                                    <div class="timeline-body">
                                                        <p>"""),_display_(/*350.61*/SGDB/*350.65*/.resumePost(post.getText)),format.raw/*350.90*/("""</p>
                                                    </div>
                                                </div>
                                            </li>
                                        """)))}),format.raw/*354.42*/("""
                                    """)))}),format.raw/*355.38*/("""
                                """),format.raw/*356.33*/("""</ul>
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
                  DATE: Sat Jun 27 10:57:52 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/activator-1.2.10/demic/app/views/mural.scala.html
                  HASH: 242042f2e1b0757318bd303173a22681f227637b
                  MATRIX: 724->1|830->19|858->21|2235->1370|2264->1371|2306->1385|2428->1480|2457->1481|2496->1493|2541->1510|2570->1511|2612->1525|2863->1749|2892->1750|2931->1762|2974->1777|3003->1778|3045->1792|3135->1855|3164->1856|3203->1868|3284->1921|3313->1922|3355->1936|3434->1988|3463->1989|3502->2001|3551->2022|3580->2023|3622->2037|3671->2059|3700->2060|3739->2072|3820->2125|3849->2126|3891->2140|3970->2192|3999->2193|4038->2205|4087->2226|4116->2227|4158->2241|4207->2263|4236->2264|4275->2276|4336->2309|4365->2310|4407->2324|4737->2627|4766->2628|4805->2640|4873->2680|4902->2681|4944->2695|5299->3023|5328->3024|5368->3036|5436->3075|5466->3076|5509->3090|5865->3418|5895->3419|5935->3431|5997->3464|6027->3465|6070->3479|6626->4007|6656->4008|6696->4020|6776->4071|6806->4072|6849->4086|6900->4109|6930->4110|6970->4122|7057->4180|7087->4181|7130->4195|7280->4317|7310->4318|7350->4330|7436->4387|7466->4388|7509->4402|7659->4524|7689->4525|7729->4537|7782->4561|7812->4562|7855->4576|7930->4623|7960->4624|8000->4636|8053->4660|8083->4661|8126->4675|8201->4722|8231->4723|8271->4735|8324->4759|8354->4760|8397->4774|8472->4821|8502->4822|8542->4834|8594->4857|8624->4858|8667->4872|8742->4919|8772->4920|8812->4932|8862->4953|8892->4954|8935->4968|9010->5015|9040->5016|9080->5028|9125->5044|9155->5045|9198->5059|9279->5112|9309->5113|9349->5125|9427->5174|9457->5175|9500->5189|9555->5216|9585->5217|9625->5229|9677->5252|9707->5253|9750->5267|9804->5293|9834->5294|9870->5302|12589->7993|12616->8010|12656->8011|12711->8037|12856->8154|12874->8161|12905->8169|13218->8462|13232->8466|13272->8467|13327->8493|15062->10196|15113->10218|15322->10399|15366->10426|15406->10427|15465->10457|15582->10546|15612->10566|15652->10567|15723->10609|15792->10650|15804->10652|15834->10660|15864->10662|15876->10664|15912->10677|15943->10678|16040->10747|16054->10751|16122->10796|16192->10846|16206->10850|16246->10851|16317->10893|16358->10906|16370->10908|16400->10916|16430->10918|16442->10920|16477->10933|16507->10934|16604->11003|16618->11007|16686->11052|16767->11101|16830->11135|16928->11201|16979->11223|17627->11843|17665->11871|17705->11872|17780->11919|17794->11923|17842->11949|17917->11992|17984->12030|18212->12230|18250->12258|18290->12259|18365->12306|18379->12310|18425->12334|18500->12377|18567->12415|19264->13084|19311->13114|19351->13115|19422->13158|19458->13184|19498->13185|19573->13231|19978->13608|19992->13612|20024->13622|20186->13755|20201->13759|20232->13767|20475->13982|20489->13986|20536->14011|20770->14225|20784->14229|20824->14230|20899->14276|21338->14687|21352->14691|21384->14701|21546->14834|21561->14838|21592->14846|21835->15061|21849->15065|21896->15090|22142->15304|22213->15343|22276->15377
                  LINES: 26->1|29->1|30->2|64->36|64->36|65->37|68->40|68->40|70->42|70->42|70->42|71->43|79->51|79->51|81->53|81->53|81->53|82->54|84->56|84->56|86->58|87->59|87->59|88->60|90->62|90->62|92->64|92->64|92->64|93->65|94->66|94->66|96->68|97->69|97->69|98->70|100->72|100->72|102->74|102->74|102->74|103->75|104->76|104->76|106->78|106->78|106->78|107->79|115->87|115->87|117->89|117->89|117->89|118->90|127->99|127->99|129->101|129->101|129->101|130->102|139->111|139->111|141->113|141->113|141->113|142->114|158->130|158->130|160->132|160->132|160->132|161->133|162->134|162->134|164->136|164->136|164->136|165->137|169->141|169->141|171->143|171->143|171->143|172->144|176->148|176->148|178->150|178->150|178->150|179->151|180->152|180->152|182->154|182->154|182->154|183->155|184->156|184->156|186->158|186->158|186->158|187->159|188->160|188->160|190->162|190->162|190->162|191->163|192->164|192->164|194->166|194->166|194->166|195->167|196->168|196->168|198->170|198->170|198->170|199->171|201->173|201->173|203->175|204->176|204->176|205->177|206->178|206->178|208->180|208->180|208->180|209->181|210->182|210->182|212->184|267->239|267->239|267->239|268->240|269->241|269->241|269->241|274->246|274->246|274->246|275->247|295->267|296->268|300->272|300->272|300->272|301->273|303->275|303->275|303->275|304->276|304->276|304->276|304->276|304->276|304->276|304->276|304->276|305->277|305->277|305->277|306->278|306->278|306->278|307->279|307->279|307->279|307->279|307->279|307->279|307->279|307->279|308->280|308->280|308->280|309->281|310->282|312->284|313->285|329->301|329->301|329->301|330->302|330->302|330->302|331->303|332->304|336->308|336->308|336->308|337->309|337->309|337->309|338->310|339->311|355->327|355->327|355->327|356->328|356->328|356->328|357->329|361->333|361->333|361->333|362->334|362->334|362->334|365->337|365->337|365->337|369->341|369->341|369->341|370->342|374->346|374->346|374->346|375->347|375->347|375->347|378->350|378->350|378->350|382->354|383->355|384->356
                  -- GENERATED --
              */
          