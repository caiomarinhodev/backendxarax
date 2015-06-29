package controllers;

import models.Usuario;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    @Transactional
    public static Result index() {
        String str = session().get("email");
        Usuario u = SGDB.getUsuario(str);
        if(u!=null){
            return ok(index.render(u));
        }
        return ok(index.render(u));
    }

    @Transactional
    public static Result login(){
        DynamicForm r = Form.form().bindFromRequest();
        String login = r.get("username");
        String senha = r.get("password");
        Usuario u = SGDB.getUsuario(login, senha);
        if(u!=null){
            session().clear();
            session().put("email", u.getEmail());
            return index();
        }
        return index();
    }

    @Transactional
    public static Result renderProjeto(){
        String str = session().get("email");
        Usuario u = SGDB.getUsuario(str);
        return ok(projeto.render(u));
    }

    @Transactional
    public static Result renderAbout(){
        String str = session().get("email");
        Usuario u = SGDB.getUsuario(str);
        return ok(quemsomos.render(u));
    }

    @Transactional
    public static Result renderContato(){
        String str = session().get("email");
        Usuario u = SGDB.getUsuario(str);
        return ok(contato.render(u, 0));
    }

    @Transactional
    public static Result enviarContato(){
        String str = session().get("email");
        Usuario u = SGDB.getUsuario(str);
        DynamicForm r = Form.form().bindFromRequest();
        String nome, sobrenome, email, telefone, mensagem;
        nome = r.get("nome");
        sobrenome = r.get("sobrenome");
        email = r.get("email");
        telefone = r.get("telefone");
        mensagem = r.get("mensagem");

        SGDB.addMensagem(nome,sobrenome,email,telefone,mensagem);
        return ok(contato.render(u,1));
    }

    @Transactional
    public static Result logout(){
        session().clear();
        return index();
    }

    @Transactional
    public static Result renderRegistro(){
        String str = session().get("email");
        Usuario u = SGDB.getUsuario(str);
        return ok(registrar.render(u));
    }

    @Transactional
    public static Result addUsuario(){
        DynamicForm r = Form.form().bindFromRequest();
        String nome = r.get("nome");
        String sobrenome = r.get("sobrenome");
        String login = r.get("login");
        String senha = r.get("senha");
        int nacionalidade = Integer.parseInt(r.get("nacionalidade"));
        String email = r.get("email");
        SGDB.addUsuario(login,senha,nome,sobrenome,nacionalidade,email,1, false);
        session().clear();
        session().put("email", email);
        return index();
    }


    @Transactional
    public static Result removeUsuario(Long id){
        SGDB.removeUsuario(id);
        return renderAdmin();
    }

    @Transactional
    public static Result renderAdmin(){
        String str = session().get("email");
        Usuario u = SGDB.getUsuario(str);
        if(u!=null){
            if(u.getTipo()==0){
                return ok(admin.render(u));
            }
        }
        return index();
    }

    @Transactional
    public static Result addPost(){
        DynamicForm r = Form.form().bindFromRequest();
        String post = r.get("postagem");
        String titulo = r.get("titulo");
        SGDB.addPost(titulo, post);
        return renderAdmin();
    }

    @Transactional
    public static Result renderMural(){
        String str = session().get("email");
        Usuario u = SGDB.getUsuario(str);
        return ok(mural.render(u));
    }

    @Transactional
    public static Result removePost(Long id){
        SGDB.removePost(id);
        return renderAdmin();
    }

    @Transactional
    public static Result removeMensagem(Long id){
        SGDB.removeMensagem(id);
        return renderAdmin();
    }

}
