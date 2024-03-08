package com.education.educationapis;

import com.education.educationapis.model.User;
import com.education.educationapis.repo.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class EducationApisApplication {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(EducationApisApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
//        User user = new User();
//        user.setAge(3);
//        user.setGender("Male");
//        user.setName("Puneet");
//        userRepository.save(user);
//        User user1 = new User();
//        user1.setAge(3);
//        user1.setGender("Female");
//        user1.setName("Sita");
////       User resultUser =  userRepository.save(user1);
//       List<User> userList = List.of(user1,user);
//        Iterable<User> resultUser = userRepository.saveAll(userList);
//        resultUser.forEach(user2 -> System.out.println("User" +user2.getName())
//        );
//        System.out.println(resultUser);
        Iterable<User> optionalUser = userRepository.findAll();
        optionalUser.forEach(user -> {
            userRepository.deleteById(user.getId());
            System.out.println("User id " +user.getId() +" is deleted successfully !!");
        });
    }
}

// comand promp comannd -> ssh -R 80:localhost:9030 dell@localhost.run