package com.lab38.lab38.event;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="conference")
public class Conference extends Event{

    @OneToMany
    @JoinColumn(name="name")
    List<Speaker> speakersList;

    public List<Speaker> getSpeakersList() {
        return speakersList;
    }

    public void setSpeakersList(List<Speaker> speakersList) {
        this.speakersList = speakersList;
    }
}
