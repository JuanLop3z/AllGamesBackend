package com.allgames.allgamesapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tamaño")
public class Tamaño {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "tamaño_juego")
    private Double tamaño;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }
}
