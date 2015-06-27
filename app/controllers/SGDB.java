package controllers;

import models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Caio on 31/05/2015.
 */
public class SGDB {

    private static GenericDAO dao = new GenericDAO();

    // Usuario

    public static void addUsuario(String login, String senha, String nome, String sobrenome, int nacionalidade,
                                  String email, int tipo, boolean iscolaborador){
        Usuario u = new Usuario(login,senha,nome,sobrenome,nacionalidade,email,tipo, iscolaborador);
        dao.persist(u);
        dao.flush();
    }

    public static Usuario getUsuario(long id){
        return dao.findByEntityId(Usuario.class,id);
    }

    public static Usuario getUsuario(String login,String senha){
        List<Usuario> l = dao.findByAttributeName(Usuario.class.getName(),"login", login);
        if(l.size()>0){
            if(l.get(0).getSenha().equals(senha)){
                return l.get(0);
            }
        }
        return null;
    }

    public static Usuario getUsuario(String email){
        List<Usuario> l = dao.findByAttributeName(Usuario.class.getName(),"email", email);
        if(l.size()>0){
            return l.get(0);
        }
        return null;
    }

    public static Usuario getAdmin(){
        List<Usuario> l = dao.findByAttributeName(Usuario.class.getName(), "tipo", "0");
        if(l.size()>0){
            return l.get(0);
        }
        return null;
    }

    public static void removeUsuario(Usuario u){
        if(u!=null){
            dao.remove(u);
            dao.flush();
        }
    }

    public static void removeUsuario(long id){
        Usuario a= dao.findByEntityId(Usuario.class,id);
        if(a!=null){
            dao.remove(a);
            dao.flush();
        }
    }

    public static List<Usuario> getAllUsers(){
        return dao.findAllByClassName(Usuario.class.getName());
    }

    public static void addMensagem(String nome, String sobrenome, String email, String telefone, String mensagem){
        Mensagem m = new Mensagem(nome,sobrenome,email,telefone,mensagem);
        dao.persist(m);
        dao.flush();
    }

    public static void removeMensagem(long id){
        Mensagem m = dao.findByEntityId(Mensagem.class,id);
        if(m!=null){
            dao.remove(m);
            dao.flush();
        }
    }

    public static String resumeMensagem(String m){
        if(m.length()>=40){
            String r = m.substring(0,30);
            return r;
        }
        return m;
    }
    public static String resumePost(String m){
        if(m.length()>=80){
            String r = m.substring(0,80);
            return (r+" ...");
        }
        return m;
    }

    public static List<Mensagem> getAllMensagens(){
        return dao.findAllByClassName(Mensagem.class.getName());
    }


    public static List<Post> getAllPosts(){
        return dao.findAllByClassName(Post.class.getName());
    }

    public static void addPost(String titulo, String p){
        Post po = new Post(titulo,p);
        dao.persist(po);
        dao.flush();
    }

    public static void removePost(Long id){
        Post p = dao.findByEntityId(Post.class, id);
        if(p!=null){
            dao.remove(p);
            dao.flush();
        }
    }

    public static List<Post> getFivePosts(){
        List<Post> l = getAllPosts();
        List<Post> li = new ArrayList<>();
        if(l.size()>5){
            for(int i=1;i<6;i++){
                li.add(l.get(l.size()-i));
            }
            return li;
        }else{
            return l;
        }
    }

    public static boolean ehpar(long id){
        if(id%2==0){
            return true;
        }
        return false;
    }

    public static Post getUltimoPost(){
        List<Post> l = getAllPosts();
        if(l.size()>0){
            return l.get(l.size()-1);
        }
        return null;
    }

    public static Nacionalidade getNacionalidade(long id){
        return dao.findByEntityId(Nacionalidade.class,id);
    }

    public static List<Nacionalidade> getAllNacionalidades(){
        return dao.findAllByClassName(Nacionalidade.class.getName());
    }

    public static void addNacionalidade(String nome, String pic_url){
        Nacionalidade n = new Nacionalidade(nome,pic_url);
        dao.persist(n);
        dao.flush();
    }

    public static void removeNacionalidade(long id){
        Nacionalidade n = getNacionalidade(id);
        if(n!=null){
            dao.remove(n);
            dao.flush();
        }
    }

}
