package com.freekash.springboot;

import com.freekash.springboot.database.Student;
import com.freekash.springboot.database.StudentSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    private StudentSqlRepository studentSqlRepository;


    @RequestMapping(value = "/students")
    public ResponseEntity<Object> getAllStudents(){
        Stream<Student> students = studentSqlRepository.listAllStudents().stream();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

//    @RequestMapping(value = "/comments", method = RequestMethod.POST)
//    public ResponseEntity<Object> createComment(@RequestParam(value = "name") String name, @RequestParam(value = "body") String body){
//        Comment comment = new Comment(name, body);
//        commentSqlRepository.save(comment);
//        return new ResponseEntity<>(comment, HttpStatus.OK);
//    }

}
