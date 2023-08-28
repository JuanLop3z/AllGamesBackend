package com.allgames.allgamesapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "juegos")
public class Juegos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "tamaño")
    private Tamaño tamaño;

    @ManyToOne
    @JoinColumn(name = "plataforma")
    private Plataforma plataforma;

    @ManyToOne
    @JoinColumn(name = "idioma")
    private Idioma idioma;

    @ManyToOne
    @JoinColumn(name = "genero")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "formato")
    private Formato formato;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "torrent")
    private String torrent;

    @Column(name = "imagen_juego")
    private Byte[] imagenjuego;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTorrent() {
        return torrent;
    }

    public void setTorrent(String torrent) {
        this.torrent = torrent;
    }

    public Byte[] getImagenjuego() {
        return imagenjuego;
    }

    public void setImagenjuego(Byte[] imagenjuego) {
        this.imagenjuego = imagenjuego;
    }
}
