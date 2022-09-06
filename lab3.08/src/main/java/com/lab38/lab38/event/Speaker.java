package com.lab38.lab38.event;

import javax.persistence.*;

@Entity
@Table(name="speaker")
public class Speaker {
    @Id
    private String name;
    private double presentationDuration;

    @ManyToOne
    @JoinColumn(name="id")
    private Conference conference;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(double presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
