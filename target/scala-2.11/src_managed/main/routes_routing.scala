// @SOURCE:C:/Users/Caio/Downloads/activator-1.2.10/demic/conf/routes
// @HASH:e721c58bea6a54882683417ca6936a60aaa1e3c4
// @DATE:Mon Jun 29 13:11:21 BRT 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_renderRegistro1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registrar"))))
private[this] lazy val controllers_Application_renderRegistro1_invoker = createInvoker(
controllers.Application.renderRegistro(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderRegistro", Nil,"GET", """""", Routes.prefix + """registrar"""))
        

// @LINE:8
private[this] lazy val controllers_Application_logout2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout2_invoker = createInvoker(
controllers.Application.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:9
private[this] lazy val controllers_Application_renderProjeto3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projeto"))))
private[this] lazy val controllers_Application_renderProjeto3_invoker = createInvoker(
controllers.Application.renderProjeto(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderProjeto", Nil,"GET", """""", Routes.prefix + """projeto"""))
        

// @LINE:10
private[this] lazy val controllers_Application_renderAbout4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
private[this] lazy val controllers_Application_renderAbout4_invoker = createInvoker(
controllers.Application.renderAbout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderAbout", Nil,"GET", """""", Routes.prefix + """about"""))
        

// @LINE:11
private[this] lazy val controllers_Application_renderContato5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contato"))))
private[this] lazy val controllers_Application_renderContato5_invoker = createInvoker(
controllers.Application.renderContato(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderContato", Nil,"GET", """""", Routes.prefix + """contato"""))
        

// @LINE:12
private[this] lazy val controllers_Application_renderAdmin6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
private[this] lazy val controllers_Application_renderAdmin6_invoker = createInvoker(
controllers.Application.renderAdmin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderAdmin", Nil,"GET", """""", Routes.prefix + """admin"""))
        

// @LINE:13
private[this] lazy val controllers_Application_renderMural7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mural"))))
private[this] lazy val controllers_Application_renderMural7_invoker = createInvoker(
controllers.Application.renderMural(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderMural", Nil,"GET", """""", Routes.prefix + """mural"""))
        

// @LINE:14
private[this] lazy val controllers_Application_removePost8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove/post/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_removePost8_invoker = createInvoker(
controllers.Application.removePost(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removePost", Seq(classOf[Long]),"GET", """""", Routes.prefix + """remove/post/$id<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_Application_removeMensagem9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove/mensagem/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_removeMensagem9_invoker = createInvoker(
controllers.Application.removeMensagem(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeMensagem", Seq(classOf[Long]),"GET", """""", Routes.prefix + """remove/mensagem/$id<[^/]+>"""))
        

// @LINE:16
private[this] lazy val controllers_Application_removeUsuario10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove/usuario/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_removeUsuario10_invoker = createInvoker(
controllers.Application.removeUsuario(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeUsuario", Seq(classOf[Long]),"GET", """""", Routes.prefix + """remove/usuario/$id<[^/]+>"""))
        

// @LINE:19
private[this] lazy val controllers_Application_login11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("entrar"))))
private[this] lazy val controllers_Application_login11_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"POST", """""", Routes.prefix + """entrar"""))
        

// @LINE:20
private[this] lazy val controllers_Application_addUsuario12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addusuario"))))
private[this] lazy val controllers_Application_addUsuario12_invoker = createInvoker(
controllers.Application.addUsuario(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUsuario", Nil,"POST", """""", Routes.prefix + """addusuario"""))
        

// @LINE:21
private[this] lazy val controllers_Application_enviarContato13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("enviarcontato"))))
private[this] lazy val controllers_Application_enviarContato13_invoker = createInvoker(
controllers.Application.enviarContato(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "enviarContato", Nil,"POST", """""", Routes.prefix + """enviarcontato"""))
        

// @LINE:22
private[this] lazy val controllers_Application_addPost14_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addpost"))))
private[this] lazy val controllers_Application_addPost14_invoker = createInvoker(
controllers.Application.addPost(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addPost", Nil,"POST", """""", Routes.prefix + """addpost"""))
        

// @LINE:27
private[this] lazy val controllers_Assets_at15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at15_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:28
private[this] lazy val controllers_Assets_at16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at16_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """remove/assets/$file<.+>"""))
        

// @LINE:29
private[this] lazy val controllers_Assets_at17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove/post/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """remove/post/assets/$file<.+>"""))
        

// @LINE:30
private[this] lazy val controllers_Assets_at18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remove/mensagem/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at18_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """remove/mensagem/assets/$file<.+>"""))
        

// @LINE:31
private[this] lazy val controllers_Assets_at19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at19_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """add/assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registrar""","""controllers.Application.renderRegistro()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projeto""","""controllers.Application.renderProjeto()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.renderAbout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contato""","""controllers.Application.renderContato()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Application.renderAdmin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mural""","""controllers.Application.renderMural()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/post/$id<[^/]+>""","""controllers.Application.removePost(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/mensagem/$id<[^/]+>""","""controllers.Application.removeMensagem(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/usuario/$id<[^/]+>""","""controllers.Application.removeUsuario(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """entrar""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addusuario""","""controllers.Application.addUsuario()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """enviarcontato""","""controllers.Application.enviarContato()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addpost""","""controllers.Application.addPost()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/post/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remove/mensagem/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public/assets/", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_renderRegistro1_route(params) => {
   call { 
        controllers_Application_renderRegistro1_invoker.call(controllers.Application.renderRegistro())
   }
}
        

// @LINE:8
case controllers_Application_logout2_route(params) => {
   call { 
        controllers_Application_logout2_invoker.call(controllers.Application.logout())
   }
}
        

// @LINE:9
case controllers_Application_renderProjeto3_route(params) => {
   call { 
        controllers_Application_renderProjeto3_invoker.call(controllers.Application.renderProjeto())
   }
}
        

// @LINE:10
case controllers_Application_renderAbout4_route(params) => {
   call { 
        controllers_Application_renderAbout4_invoker.call(controllers.Application.renderAbout())
   }
}
        

// @LINE:11
case controllers_Application_renderContato5_route(params) => {
   call { 
        controllers_Application_renderContato5_invoker.call(controllers.Application.renderContato())
   }
}
        

// @LINE:12
case controllers_Application_renderAdmin6_route(params) => {
   call { 
        controllers_Application_renderAdmin6_invoker.call(controllers.Application.renderAdmin())
   }
}
        

// @LINE:13
case controllers_Application_renderMural7_route(params) => {
   call { 
        controllers_Application_renderMural7_invoker.call(controllers.Application.renderMural())
   }
}
        

// @LINE:14
case controllers_Application_removePost8_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_removePost8_invoker.call(controllers.Application.removePost(id))
   }
}
        

// @LINE:15
case controllers_Application_removeMensagem9_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_removeMensagem9_invoker.call(controllers.Application.removeMensagem(id))
   }
}
        

// @LINE:16
case controllers_Application_removeUsuario10_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_removeUsuario10_invoker.call(controllers.Application.removeUsuario(id))
   }
}
        

// @LINE:19
case controllers_Application_login11_route(params) => {
   call { 
        controllers_Application_login11_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:20
case controllers_Application_addUsuario12_route(params) => {
   call { 
        controllers_Application_addUsuario12_invoker.call(controllers.Application.addUsuario())
   }
}
        

// @LINE:21
case controllers_Application_enviarContato13_route(params) => {
   call { 
        controllers_Application_enviarContato13_invoker.call(controllers.Application.enviarContato())
   }
}
        

// @LINE:22
case controllers_Application_addPost14_route(params) => {
   call { 
        controllers_Application_addPost14_invoker.call(controllers.Application.addPost())
   }
}
        

// @LINE:27
case controllers_Assets_at15_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at15_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:28
case controllers_Assets_at16_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at16_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:29
case controllers_Assets_at17_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at17_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:30
case controllers_Assets_at18_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at18_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:31
case controllers_Assets_at19_route(params) => {
   call(Param[String]("path", Right("/public/assets/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at19_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     