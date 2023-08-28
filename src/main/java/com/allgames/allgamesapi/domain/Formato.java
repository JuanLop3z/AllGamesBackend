package com.allgames.allgamesapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "formato")
public class Formato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;
}
