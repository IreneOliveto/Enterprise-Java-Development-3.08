package com.lab38.lab38.event;

import javax.persistence.*;

@Entity
@Table(name="guest")
public class Guest {
    @Id
    private String name;
    private Status status;

    @ManyToOne
    @JoinColumn(name="id")
    private Event event;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
