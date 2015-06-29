// @SOURCE:C:/Users/Caio/Downloads/activator-1.2.10/demic/conf/routes
// @HASH:e721c58bea6a54882683417ca6936a60aaa1e3c4
// @DATE:Mon Jun 29 13:11:21 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseAssets {


// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:27
case (file)  =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/assets/")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def renderProjeto(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "projeto")
}
                        

// @LINE:22
def addPost(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addpost")
}
                        

// @LINE:11
def renderContato(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "contato")
}
                        

// @LINE:21
def enviarContato(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "enviarcontato")
}
                        

// @LINE:10
def renderAbout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                        

// @LINE:7
def renderRegistro(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "registrar")
}
                        

// @LINE:16
def removeUsuario(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "remove/usuario/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:15
def removeMensagem(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "remove/mensagem/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:8
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:12
def renderAdmin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                        

// @LINE:14
def removePost(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "remove/post/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:20
def addUsuario(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addusuario")
}
                        

// @LINE:13
def renderMural(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mural")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:19
def login(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "entrar")
}
                        

}
                          
}
                  


// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseAssets {


// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remove/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remove/post/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remove/mensagem/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def renderProjeto : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.renderProjeto",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projeto"})
      }
   """
)
                        

// @LINE:22
def addPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addPost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addpost"})
      }
   """
)
                        

// @LINE:11
def renderContato : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.renderContato",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contato"})
      }
   """
)
                        

// @LINE:21
def enviarContato : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.enviarContato",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "enviarcontato"})
      }
   """
)
                        

// @LINE:10
def renderAbout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.renderAbout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:7
def renderRegistro : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.renderRegistro",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registrar"})
      }
   """
)
                        

// @LINE:16
def removeUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removeUsuario",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remove/usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:15
def removeMensagem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removeMensagem",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remove/mensagem/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:8
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:12
def renderAdmin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.renderAdmin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:14
def removePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removePost",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remove/post/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:20
def addUsuario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addUsuario",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addusuario"})
      }
   """
)
                        

// @LINE:13
def renderMural : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.renderMural",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mural"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:19
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "entrar"})
      }
   """
)
                        

}
              
}
        


// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseAssets {


// @LINE:27
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def renderProjeto(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.renderProjeto(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderProjeto", Seq(), "GET", """""", _prefix + """projeto""")
)
                      

// @LINE:22
def addPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addPost(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addPost", Seq(), "POST", """""", _prefix + """addpost""")
)
                      

// @LINE:11
def renderContato(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.renderContato(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderContato", Seq(), "GET", """""", _prefix + """contato""")
)
                      

// @LINE:21
def enviarContato(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.enviarContato(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "enviarContato", Seq(), "POST", """""", _prefix + """enviarcontato""")
)
                      

// @LINE:10
def renderAbout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.renderAbout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderAbout", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:7
def renderRegistro(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.renderRegistro(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderRegistro", Seq(), "GET", """""", _prefix + """registrar""")
)
                      

// @LINE:16
def removeUsuario(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.removeUsuario(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeUsuario", Seq(classOf[Long]), "GET", """""", _prefix + """remove/usuario/$id<[^/]+>""")
)
                      

// @LINE:15
def removeMensagem(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.removeMensagem(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeMensagem", Seq(classOf[Long]), "GET", """""", _prefix + """remove/mensagem/$id<[^/]+>""")
)
                      

// @LINE:8
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:12
def renderAdmin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.renderAdmin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderAdmin", Seq(), "GET", """""", _prefix + """admin""")
)
                      

// @LINE:14
def removePost(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.removePost(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removePost", Seq(classOf[Long]), "GET", """""", _prefix + """remove/post/$id<[^/]+>""")
)
                      

// @LINE:20
def addUsuario(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addUsuario(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addUsuario", Seq(), "POST", """""", _prefix + """addusuario""")
)
                      

// @LINE:13
def renderMural(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.renderMural(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderMural", Seq(), "GET", """""", _prefix + """mural""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:19
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "POST", """""", _prefix + """entrar""")
)
                      

}
                          
}
        
    