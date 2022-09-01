package com.editorial.exercise.eventManagementCompany.model;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

public class Conference extends Event{

    @OneToMany
    @JoinColumn(name="name")
    List<Speaker> speakersList;

}
