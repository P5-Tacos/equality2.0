package com.freekash.springboot.database;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
Player is a POJO, Plain Old Java Object.
First set of annotations add functionality to POJO
--- @Setter @Getter @ToString @NoArgsConstructor @RequiredArgsConstructor
The last annotation connect to database
--- @Entity
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*
    @NonNull: Places this in @RequiredArgsConstructor
    @Size(min=2, max=30): Allows names between 2 and 30 characters long.
     */
    @NonNull
    @Size(min = 2, max = 100, message = "Name")
    private String name;

    @NonNull
    @Size(min = 9, max = 12, message = "Grade")
    private int grade;

    public String getName() {
        return name;
    }

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

}