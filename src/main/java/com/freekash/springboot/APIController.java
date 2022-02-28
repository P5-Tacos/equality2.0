package com.freekash.springboot;

import com.freekash.springboot.database.Student;
import com.freekash.springboot.database.StudentSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    private StudentSqlRepository commentSqlRepository;


//    @RequestMapping(value = "/comments")
//    public ResponseEntity<Object> getAllPosts(@RequestParam(value = "name", required = false) String authorName){
//        Stream<Comment> comments = commentSqlRepository.listAllComments().stream();
//        if(authorName != null)
//             comments = comments.filter(comment -> {
//                if(comment.getName().toLowerCase().equals(authorName.toLowerCase()))
//                    return true;
//                return false;
//            });
//        return new ResponseEntity<>(comments, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/comments", method = RequestMethod.POST)
//    public ResponseEntity<Object> createComment(@RequestParam(value = "name") String name, @RequestParam(value = "body") String body){
//        Comment comment = new Comment(name, body);
//        commentSqlRepository.save(comment);
//        return new ResponseEntity<>(comment, HttpStatus.OK);
//    }

}
