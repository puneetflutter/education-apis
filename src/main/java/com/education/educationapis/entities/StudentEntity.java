package com.education.educationapis.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  String name;
    private  String gender;
    private  String dob;
    private  String city;
    private  int age;
    @OneToOne(cascade = CascadeType.ALL)
    private  StudentMarks marks;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private  TeacherEntity teacher;
}
