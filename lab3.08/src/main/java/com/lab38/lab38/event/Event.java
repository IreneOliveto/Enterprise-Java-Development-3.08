package com.lab38.lab38.event;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="event")
public class Event {
    @Id
    private Long id;
    private Date date;
    private double duration;
    private String location;
    private String title;

    @OneToMany
    @JoinColumn(name = "guest_name")
    private List<Guest> guestList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }
}
