package com.education.educationapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EducationApisApplication {
    public static void main(String[] args) {
        SpringApplication.run(EducationApisApplication.class, args);
        // ApplicationContext context =
        // SpringApplication.run(EducationApisApplication.class, args);
        // StudentRepository userRepository = context.getBean(StudentRepository.class);
        // StudentEntity user = new StudentEntity();
        // user.setId(103);
        // user.setName("Mukesh Sharma");
        // user.setAge(19);
        // user.setGender("Male");
        // userRepository.save(user);
        // Iterable<StudentEntity> userIterable = userRepository.getAllUserByNative();
        // userIterable.forEach(i -> System.out.println("Id:" + i.getId()+" Name:" +
        // i.getName()));
        // userIterable.forEach(i -> System.out.println("Id:" + i.getId()+" Name:" +
        // i.getName()));
        // StudentEntity user1 = new StudentEntity();
        // user1.setId(1);
        // user1.setName("Puneet Sharma");
        // user1.setAge(19);
        // user1.setGender("Male");
        // userRepository.save(user1);
        //
        // List<StudentEntity> list = List.of(user,user1);
        // Iterable<StudentEntity> resultUser = userRepository.saveAll(list);
        // resultUser.forEach(data-> System.out.println(data+" "));
        // Iterable<StudentEntity> getAllUser = userRepository.findAll();
        //
        // getAllUser.forEach(d-> System.out.println("StudentEntity Id :"+ d.getId()
        // +"StudentEntity Name :"+ d.getName()));
    }
}
// comand promp comannd -> ssh -R 80:localhost:9030 dell@localhost.run