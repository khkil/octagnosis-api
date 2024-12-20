package com.octagnosis.api.assessments.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.octagnosis.api.users.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Integer resultCount;

    private Boolean isUsed;

    @OneToMany(mappedBy = "assessment")
    @JsonIgnore
    private List<AssessmentQuestion> assessmentQuestionList;

    @OneToMany(mappedBy = "assessment")
    @JsonIgnore
    private List<AssessmentResult> assessmentResultList;
}
