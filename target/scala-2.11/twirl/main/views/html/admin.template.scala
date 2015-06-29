
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
object admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

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

    <title>Painel de Controle - Xarax</title>

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

    <!-- Custom CSS -->
    <link href="/assets/css/sb-admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/assets/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.scala.html">Painel de Controle</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-nav side-nav">
                <center><h3>Usuários</h3></center>
                <hr/>
                """),_display_(/*70.18*/for(us <- SGDB.getAllUsers) yield /*70.45*/{_display_(Seq[Any](format.raw/*70.46*/("""
                    """),format.raw/*71.21*/("""<li>
                        <a href="#">
                        """),_display_(/*73.26*/if(us.isColaborador)/*73.46*/{_display_(Seq[Any](format.raw/*73.47*/("""
                            """),format.raw/*74.29*/("""<i class="fa fa-dollar"></i>
                            <span>
                                    &nbsp;"""),_display_(/*76.44*/us/*76.46*/.getNome),format.raw/*76.54*/(""" """),_display_(/*76.56*/us/*76.58*/.getSobrenome),format.raw/*76.71*/(""" """),format.raw/*76.72*/("""&nbsp;
                                <form method="get" action="/remove/usuario/"""),_display_(/*77.77*/us/*77.79*/.getId),format.raw/*77.85*/("""">
                                    <button class="fa fa-trash-o"></button>
                                </form>
                            </span>

                        """)))}/*82.26*/else/*82.30*/{_display_(Seq[Any](format.raw/*82.31*/("""
                            """),format.raw/*83.29*/("""<span>&nbsp;"""),_display_(/*83.42*/us/*83.44*/.getNome),format.raw/*83.52*/(""" """),_display_(/*83.54*/us/*83.56*/.getSobrenome),format.raw/*83.69*/(""" """),format.raw/*83.70*/("""&nbsp;
                                <img src=""""),_display_(/*84.44*/SGDB/*84.48*/.getNacionalidade(us.getNacionalidade).getPic),format.raw/*84.93*/(""""/>
                                <form method="get" action="/remove/usuario/"""),_display_(/*85.77*/us/*85.79*/.getId),format.raw/*85.85*/("""">
                                    <button class="fa fa-trash-o"></button>
                                </form>
                            </span>
                        """)))}),format.raw/*89.26*/("""
                        """),format.raw/*90.25*/("""</a>
                    </li>
                """)))}),format.raw/*92.18*/("""
                """),format.raw/*93.17*/("""</ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">

            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Dashboard <small>Visão geral</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-dashboard"></i> Dashboard
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-12">
                        <div class="alert alert-info alert-dismissable">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                            <i class="fa fa-info-circle"></i>  <strong>Informações como usar o painel aqui!</strong>
                        </div>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">
                        <h2>Tabela de post</h2>
                        <div class="table-responsive">
                            <table class="table table-hover table-striped">
                                <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Post</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                    """),_display_(/*143.38*/for(po <- SGDB.getAllPosts) yield /*143.65*/{_display_(Seq[Any](format.raw/*143.66*/("""
                                        """),format.raw/*144.41*/("""<tr>
                                            <td>"""),_display_(/*145.50*/po/*145.52*/.getId),format.raw/*145.58*/("""</td>
                                            <td>"""),_display_(/*146.50*/SGDB/*146.54*/.resumeMensagem(po.getText)),format.raw/*146.81*/("""</td>
                                            <td><a href="/remove/post/"""),_display_(/*147.72*/po/*147.74*/.getId),format.raw/*147.80*/(""""><span class="fa fa-trash-o"></span></a></td>
                                        </tr>
                                    """)))}),format.raw/*149.38*/("""
                                """),format.raw/*150.33*/("""</tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="col-lg-4 col-lg-offset-2">
                            <button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal">
                                <i class="fa fa-plus"></i> Adicionar Postagem
                            </button>
                        </div>
                        <br/>
                        <br/>
                        <hr/>
                        <div>
                            <h2>Tabela de Mensagens</h2>
                            <div class="table-responsive">
                                <table class="table table-hover table-striped">
                                    <thead>
                                        <tr>
                                            <th>Nome</th>
                                            <th>Email</th>
                                            <th>Mensagem</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        """),_display_(/*176.42*/for(men <- SGDB.getAllMensagens) yield /*176.74*/{_display_(Seq[Any](format.raw/*176.75*/("""
                                            """),format.raw/*177.45*/("""<tr>
                                                <td>"""),_display_(/*178.54*/men/*178.57*/.getNome),format.raw/*178.65*/(""" """),_display_(/*178.67*/men/*178.70*/.getSobrenome),format.raw/*178.83*/("""</td>
                                                <td>"""),_display_(/*179.54*/men/*179.57*/.getEmail),format.raw/*179.66*/("""</td>
                                                <td>"""),_display_(/*180.54*/SGDB/*180.58*/.resumeMensagem(men.getMensagem)),format.raw/*180.90*/("""</td>
                                                <td><a href="/remove/mensagem/"""),_display_(/*181.80*/men/*181.83*/.getId),format.raw/*181.89*/(""""><span class="fa fa-trash-o"></span></a></td>
                                            </tr>
                                        """)))}),format.raw/*183.42*/("""
                                    """),format.raw/*184.37*/("""</tbody>
                                </table>
                            </div>
                        </div>
                    </div>


                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->

            <!-- Modal -->
            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="myModalLabel">Postagem:</h4>
                        </div>
                        <form method="post" action="/addpost">
                            <div class="modal-body">
                                <div class="form-group">
                                    <label>Titulo:</label>
                                    <input class="form-control" name="titulo" required>
                                </div>
                                <div class="form-group">
                                    <label>Texto:</label>
                                    <textarea class="form-control" name="postagem" rows="4"></textarea>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
                                <button type="submit" class="btn btn-primary">Enviar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

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
                  DATE: Mon Jun 29 13:41:32 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/activator-1.2.10/demic/app/views/admin.scala.html
                  HASH: a32ec05e43e6b34f8f43ffa1e90e4c79135bfbf8
                  MATRIX: 724->1|830->19|857->20|4244->3380|4287->3407|4326->3408|4375->3429|4469->3496|4498->3516|4537->3517|4594->3546|4728->3653|4739->3655|4768->3663|4797->3665|4808->3667|4842->3680|4871->3681|4981->3764|4992->3766|5019->3772|5219->3953|5232->3957|5271->3958|5328->3987|5368->4000|5379->4002|5408->4010|5437->4012|5448->4014|5482->4027|5511->4028|5588->4078|5601->4082|5667->4127|5774->4207|5785->4209|5812->4215|6023->4395|6076->4420|6155->4468|6200->4485|8275->6532|8319->6559|8359->6560|8429->6601|8511->6655|8523->6657|8551->6663|8634->6718|8648->6722|8697->6749|8802->6826|8814->6828|8842->6834|9004->6964|9066->6997|10390->8293|10439->8325|10479->8326|10553->8371|10639->8429|10652->8432|10682->8440|10712->8442|10725->8445|10760->8458|10847->8517|10860->8520|10891->8529|10978->8588|10992->8592|11046->8624|11159->8709|11172->8712|11200->8718|11370->8856|11436->8893
                  LINES: 26->1|29->1|30->2|98->70|98->70|98->70|99->71|101->73|101->73|101->73|102->74|104->76|104->76|104->76|104->76|104->76|104->76|104->76|105->77|105->77|105->77|110->82|110->82|110->82|111->83|111->83|111->83|111->83|111->83|111->83|111->83|111->83|112->84|112->84|112->84|113->85|113->85|113->85|117->89|118->90|120->92|121->93|171->143|171->143|171->143|172->144|173->145|173->145|173->145|174->146|174->146|174->146|175->147|175->147|175->147|177->149|178->150|204->176|204->176|204->176|205->177|206->178|206->178|206->178|206->178|206->178|206->178|207->179|207->179|207->179|208->180|208->180|208->180|209->181|209->181|209->181|211->183|212->184
                  -- GENERATED --
              */
          