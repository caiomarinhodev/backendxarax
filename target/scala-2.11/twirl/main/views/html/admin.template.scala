
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
            <ul class="nav navbar-right top-nav">

            </ul>
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
                                    """),_display_(/*102.38*/for(po <- SGDB.getAllPosts) yield /*102.65*/{_display_(Seq[Any](format.raw/*102.66*/("""
                                        """),format.raw/*103.41*/("""<tr>
                                            <td>"""),_display_(/*104.50*/po/*104.52*/.getId),format.raw/*104.58*/("""</td>
                                            <td>"""),_display_(/*105.50*/SGDB/*105.54*/.resumeMensagem(po.getText)),format.raw/*105.81*/("""</td>
                                            <td><a href="/remove/post/"""),_display_(/*106.72*/po/*106.74*/.getId),format.raw/*106.80*/(""""><span class="fa fa-trash-o"></span></a></td>
                                        </tr>
                                    """)))}),format.raw/*108.38*/("""
                                """),format.raw/*109.33*/("""</tbody>
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
                                        """),_display_(/*135.42*/for(men <- SGDB.getAllMensagens) yield /*135.74*/{_display_(Seq[Any](format.raw/*135.75*/("""
                                            """),format.raw/*136.45*/("""<tr>
                                                <td>"""),_display_(/*137.54*/men/*137.57*/.getNome),format.raw/*137.65*/(""" """),_display_(/*137.67*/men/*137.70*/.getSobrenome),format.raw/*137.83*/("""</td>
                                                <td>"""),_display_(/*138.54*/men/*138.57*/.getEmail),format.raw/*138.66*/("""</td>
                                                <td>"""),_display_(/*139.54*/SGDB/*139.58*/.resumeMensagem(men.getMensagem)),format.raw/*139.90*/("""</td>
                                                <td><a href="/remove/mensagem/"""),_display_(/*140.80*/men/*140.83*/.getId),format.raw/*140.89*/(""""><span class="fa fa-trash-o"></span></a></td>
                                            </tr>
                                        """)))}),format.raw/*142.42*/("""
                                    """),format.raw/*143.37*/("""</tbody>
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
                                    <label class="form-control">Titulo:</label>
                                    <input class="form-control" name="titulo" required>
                                </div>
                                <div class="form-group">
                                    <label class="form-control">Texto:</label>
                                    <textarea class="form-control" name="postagem"></textarea>
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
                  DATE: Sat Jun 20 13:45:20 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/activator-1.2.10/demic/app/views/admin.scala.html
                  HASH: fca962c8741a12eac12f7f6f8be88f1ff3561168
                  MATRIX: 724->1|830->19|857->20|4785->3920|4829->3947|4869->3948|4939->3989|5021->4043|5033->4045|5061->4051|5144->4106|5158->4110|5207->4137|5312->4214|5324->4216|5352->4222|5514->4352|5576->4385|6900->5681|6949->5713|6989->5714|7063->5759|7149->5817|7162->5820|7192->5828|7222->5830|7235->5833|7270->5846|7357->5905|7370->5908|7401->5917|7488->5976|7502->5980|7556->6012|7669->6097|7682->6100|7710->6106|7880->6244|7946->6281
                  LINES: 26->1|29->1|30->2|130->102|130->102|130->102|131->103|132->104|132->104|132->104|133->105|133->105|133->105|134->106|134->106|134->106|136->108|137->109|163->135|163->135|163->135|164->136|165->137|165->137|165->137|165->137|165->137|165->137|166->138|166->138|166->138|167->139|167->139|167->139|168->140|168->140|168->140|170->142|171->143
                  -- GENERATED --
              */
          