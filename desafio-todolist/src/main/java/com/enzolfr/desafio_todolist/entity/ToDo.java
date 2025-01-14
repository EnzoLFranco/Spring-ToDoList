package com.enzolfr.desafio_todolist.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean itsRealized;
    private int priority;

    public Todo(String name, String description, boolean itsRealized, int priority) {
        this.name = name;
        this.description = description;
        this.itsRealized = itsRealized;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getItsRealized() {
        return itsRealized;
    }

    public int getPriority() {
        return priority;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItsRealized(boolean itsRealized) {
        this.itsRealized = itsRealized;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
