package com.cursed.Cursed.models;

import javax.persistence.*;

public class rev {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text, name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
