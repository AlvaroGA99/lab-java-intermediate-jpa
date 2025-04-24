package com.ironhack.lab_java_intermediate_jpa.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
    String firstName;
    String lastName;
    String middleName;
    String salutation;
}
