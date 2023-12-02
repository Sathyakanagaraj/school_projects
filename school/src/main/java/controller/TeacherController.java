package controller;

import model.Student;
import model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TeacherService;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService tservice;
    @GetMapping("/teacher")
    public List<Teacher> teacherList(){
        List<Teacher> tlist= tservice.teacherList();
        return tlist;
    }
}
