package com.exemple.exercise.model;

import org.aspectj.weaver.Member;
import org.springframework.data.mapping.Association;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;


public class Chapter {
    private String chapterName;
    private String district;
    private Member president;

    @OneToMany
    @JoinColumn(name="member_name")
    List<Member> membersList;

    @ManyToOne
    @JoinColumn(name="association_name")
    Association association;

}
