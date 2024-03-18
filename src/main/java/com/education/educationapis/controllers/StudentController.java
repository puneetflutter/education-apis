package com.education.educationapis.controllers;

import com.education.educationapis.entities.StudentEntity;
import com.education.educationapis.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentServices studentServices;

    // Get All Students
    @SuppressWarnings("null")
    @GetMapping(value = "/getAll_students")
    public ResponseEntity<List<StudentEntity>> getStudent() {
        if(studentServices.getAllStudents().isEmpty()){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(this.studentServices.getAllStudents()));
    }

    // Get All Students Count
    @GetMapping(value = "/getCurrentCount")
    public String getCurrentCount() {
        return this.studentServices.getCurrentCount();
    }

    // Get Single Student
    @GetMapping(value = "/student/{id}")
    public StudentEntity getStudentServices(@PathVariable("id") Integer id) {
        return this.studentServices.getStudentById(id);
    }

    // Add Single Student
    @PostMapping(value = "/add_student")
    public StudentEntity addSingleStudent(@RequestBody StudentEntity studentEntity) {
        return this.studentServices.addSingleStudent(studentEntity);
    }

    // Add Multiple Student
    @PostMapping(value = "/add_multiple_student")
    public List<StudentEntity> addMultipleStudent(@RequestBody List<StudentEntity> studentEntity) {
        return this.studentServices.addMultipleStudent(studentEntity);
    }

    // Delete Single Student
    @DeleteMapping(value = "/delete_Student/{id}")
    public void deleteSingleStudent(@PathVariable("id") Integer id) {
        this.studentServices.deleteSingleStudent(id);
    }

    // Delete Multiple Student
    @DeleteMapping(value = "/delete_multiple_students")
    public void deleteMultipleStudents(@RequestBody List<Integer> integerList) {
        this.studentServices.deleteMultipleStudents(integerList);
    }

    // Update Single Student
    @PutMapping(value = "/update_Student")
    public void updateMultipleStudents(@RequestBody StudentEntity studentEntity) {
        this.studentServices.updateMultipleStudents(studentEntity);
    }
}
