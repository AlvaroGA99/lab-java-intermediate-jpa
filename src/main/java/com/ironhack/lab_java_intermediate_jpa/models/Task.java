package com.ironhack.lab_java_intermediate_jpa.models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = jakarta.persistence.InheritanceType.TABLE_PER_CLASS)
public abstract class Task {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.TABLE, generator = "task_gen")
    @TableGenerator(name = "task_gen", table = "id_generator")
    private Long id;

    private String title;
    private String date;
    private boolean state;

    public Task(String title, String date, boolean state) {
        this.title = title;
        this.date = date;
        this.state = state;
    }

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", state=" + state +
                '}';
    }
}
