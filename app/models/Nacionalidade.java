package models;

import javax.persistence.*;

/**
 * Created by Caio on 22/06/2015.
 */
@Entity
@Table(name = "NACIONALIDADE")
public class Nacionalidade {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nome;
    @Column
    private String pic;

    public Nacionalidade(){

    }

    public Nacionalidade(String nome, String pic) {
        this.nome = nome;
        this.pic = pic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
