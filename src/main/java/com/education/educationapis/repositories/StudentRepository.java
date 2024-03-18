package com.education.educationapis.repositories;

import com.education.educationapis.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>/*, MainRepository<StudentEntity> */{

  /*  //JPQL Query
    @Query("select u FROM Student u")
    List<StudentEntity> getAllUser();

    @Query("SELECT u FROM Student u WHERE u.id = :n")
    StudentEntity getOne(@Param("n") Integer id);

    // Native Query
    @Query(value = "select * from Student", nativeQuery = true)
    List<StudentEntity> getAllUserByNative();*/

}
