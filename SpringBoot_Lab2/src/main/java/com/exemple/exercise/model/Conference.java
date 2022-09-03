package com.editorial.exercise.eventManagementCompany.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Conference extends Event {

    @OneToMany
    @JoinColumn(name="name")
    List<Speaker> speakersList;

}
