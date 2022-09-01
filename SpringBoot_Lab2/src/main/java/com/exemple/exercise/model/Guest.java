package com.editorial.exercise.eventManagementCompany.model;

import com.editorial.exercise.associationNurses.model.Status;

public class Guest {
    private String name;
    private Status status;

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
