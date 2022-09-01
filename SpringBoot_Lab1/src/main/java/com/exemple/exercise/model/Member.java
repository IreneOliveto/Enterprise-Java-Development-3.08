package com.exemple.exercise.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class Member {
    private String memberName;
    private Status status;
    private Date renewalDate;

    @ManyToOne
    @JoinColumn(name="chapter_name")
    Chapter chapter;

}
