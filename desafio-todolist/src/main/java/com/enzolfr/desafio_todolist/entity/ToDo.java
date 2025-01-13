package com.enzolfr.desafio_todolist.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "todos")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean itsRealized;
    private int priority;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isItsRealized() {
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
