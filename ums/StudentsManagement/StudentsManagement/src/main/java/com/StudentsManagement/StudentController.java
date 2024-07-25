package com.StudentsManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
public class StudentController {

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return Arrays.asList(
            new Student("Vaishu"),
            new Student("Kesherwani"),
            new Student("vaishu21@gmail.com")
        );
    }

    static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}





