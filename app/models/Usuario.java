package models;

import javax.persistence.*;

/**
 * Created by Caio on 16/06/2015.
 */
@Entity
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String login;
    @Column
    private String senha;
    @Column
    private String nome;
    @Column
    private String sobrenome;
    @Column
    private long nacionalidade;
    @Column
    private String email;
    @Column
    private int tipo;
    @Column
    private boolean isColaborador;

    public Usuario(){

    }

    public Usuario(String login, String senha, String nome, String sobrenome, long nacionalidade, String email, int tipo,
                   boolean isColaborador) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nacionalidade = nacionalidade;
        this.email = email;
        this.tipo = tipo;
        this.isColaborador = isColaborador;
    }

    public boolean isColaborador() {
        return isColaborador;
    }

    public void setColaborador(boolean isColaborador) {
        this.isColaborador = isColaborador;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (email != null ? !email.equals(usuario.email) : usuario.email != null) return false;
        if (!login.equals(usuario.login)) return false;
        if (!nome.equals(usuario.nome)) return false;
        if (!senha.equals(usuario.senha)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = login.hashCode();
        result = 31 * result + senha.hashCode();
        result = 31 * result + nome.hashCode();
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public long getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(long nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
