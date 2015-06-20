package models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Caio on 20/06/2015.
 */
@Entity
@Table(name = "POST")
public class Post {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String titulo;
    @Lob
    private String text;
    @Column
    private String data;

    public Post(){

    }

    public Post(String titulo, String text) {
        this.titulo = titulo;
        this.text = text;
        this.data = new Date().toLocaleString();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
