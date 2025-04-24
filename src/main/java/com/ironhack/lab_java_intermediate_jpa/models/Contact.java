package com.ironhack.lab_java_intermediate_jpa.models;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts") // indicamos la tabla de la base de datos
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //El atributtes override no es necesario, solo sirve para cambiar el nombre de la columna, tanto a nivel de JPA como de base de datos SQL
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "firstName", column = @Column(name = "first_name")),
            @AttributeOverride(name = "lastName", column = @Column(name = "last_name")),
            @AttributeOverride(name = "middleName", column = @Column(name = "middle_name")),
            @AttributeOverride(name = "salutation", column = @Column(name = "salutation"))
    })
    private Name name;

    private String title;


}
