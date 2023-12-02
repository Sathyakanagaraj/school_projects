package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService sservice;
    @GetMapping("/student")
    public List<Student> studentList(){
        List<Student> slist= sservice.studentList();
        return slist;
    }
}
