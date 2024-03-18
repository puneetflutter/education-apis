package com.education.educationapis.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "StudentMarks")
public class StudentMarks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  String hindi;
    private  String english;
    private  String math;
    private  String science;
    private  String sanskrit;
    private  String totalMarks;

}
