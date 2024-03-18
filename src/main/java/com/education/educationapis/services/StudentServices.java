package com.education.educationapis.services;

import com.education.educationapis.entities.StudentEntity;
import com.education.educationapis.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class StudentServices {
//    static List<StudentEntity> studentEntityList = new ArrayList<>();

//    static {
//        studentEntityList.add(new StudentEntity(10, "Puneet Sharma", "male", "16-09-2004", "jaipur", 19));
//        studentEntityList.add(new StudentEntity(11, "John Doe", "male", "01-01-2003", "New York", 18));
//        studentEntityList.add(new StudentEntity(12, "Alice Johnson", "female", "05-12-2003", "Los Angeles", 18));
//        studentEntityList.add(new StudentEntity(13, "Bob Smith", "male", "20-03-2002", "Chicago", 19));
//        studentEntityList.add(new StudentEntity(14, "Emily Davis", "female", "10-08-2004", "San Francisco", 17));
//        studentEntityList.add(new StudentEntity(15, "Daniel White", "male", "03-04-2003", "Houston", 18));
//        studentEntityList.add(new StudentEntity(16, "Grace Taylor", "female", "15-11-2002", "Miami", 19));
//        studentEntityList.add(new StudentEntity(17, "Michael Brown", "male", "28-07-2004", "Dallas", 17));
//        studentEntityList.add(new StudentEntity(18, "Sophia Martinez", "female", "22-02-2003", "Seattle", 18));
//        studentEntityList.add(new StudentEntity(19, "Ryan Lee", "male", "14-09-2002", "Boston", 19));
//        studentEntityList.add(new StudentEntity(20, "Olivia Kim", "female", "09-06-2004", "Denver", 17));
//    }
    @Autowired
    StudentRepository studentRepository;
    // Get All Students
    public List<StudentEntity> getAllStudents() {
        return this.studentRepository.findAll();
    }
    // Get All Students Count
    public String getCurrentCount() {
      int size = this.studentRepository.findAll().size();
        return "Student Count is : " +size;
    }
    // Get Single Student
    public StudentEntity getStudentById(Integer studentId) {
        StudentEntity studentEntity;
        studentEntity = studentRepository.findAll().stream().filter(e -> e.getId() == studentId).findFirst().get();
        return studentEntity;
//        for (StudentEntity student : studentEntityList) {
//            if (student.getId() == studentId) {
//                return student;
//            }
//        }
//        return null;
    }

    // Add Single Student
    public StudentEntity addSingleStudent(StudentEntity studentEntity) {
        studentRepository.save(studentEntity);
        return studentEntity;
    }
    // Add Multiple Student
    public List<StudentEntity> addMultipleStudent(List<StudentEntity> studentEntities) {
        studentRepository.saveAll(studentEntities);
        return studentEntities;
    }
    // Delete Single Student
    public void deleteSingleStudent(int id) {
        studentRepository.deleteById(id);

    }
    // Delete Multiple Student Base of id
    public void deleteMultipleStudents(List<Integer> integerList) {
        studentRepository.findAll().removeIf(studentEntity -> integerList.contains(studentEntity.getId()));
    }
    // Update Student
    public void updateMultipleStudents(StudentEntity studentEntity) {
        studentRepository.findAll().stream()
                .filter(e -> e.getId() == studentEntity.getId())
                .forEach(e -> {
                    e.setId(studentEntity.getId());
                    e.setName(studentEntity.getName());
                    e.setGender(studentEntity.getGender());
                    e.setDob(studentEntity.getDob());
                    e.setAge(studentEntity.getAge());
                });
    }


}
