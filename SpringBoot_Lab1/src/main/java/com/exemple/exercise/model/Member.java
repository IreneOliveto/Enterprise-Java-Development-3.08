package com.exemple.exercise.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Member {
    private String memberName;
    private Status status;
    private Date renewalDate;

    @ManyToOne
    @JoinColumn(name="chapter_name")
    Chapter chapter;

}
