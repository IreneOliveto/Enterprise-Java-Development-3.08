package com.lab38.lab38.association;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlIDREF;
import java.util.List;

@Entity
@Table(name="association")
public class Association {
    @Id
    Long associationId;

    @OneToMany(mappedBy ="name")
    private List<Chapter> chapterList;

    public Long getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Long associationId) {
        this.associationId = associationId;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }
}
