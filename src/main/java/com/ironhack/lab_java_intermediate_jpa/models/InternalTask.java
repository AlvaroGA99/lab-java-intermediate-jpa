package com.ironhack.lab_java_intermediate_jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "internal_task") // indicamos la tabla de la base de datos
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class InternalTask extends Task {

    public InternalTask() {
    }

    public InternalTask(String title,String date, boolean state) {
        super(title, date,state);
    }

    @Override
    public String toString() {
        return "InternalTask{" +
                super.toString() +
                "title='" + getTitle() + '\'' +
                ", date='" + getDate() + '\'' +
                ", state=" + isState() +
                '}';
    }
}
