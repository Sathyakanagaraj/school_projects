package service;

import model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TeacherRepository;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository trepository;
    public List<Teacher> teacherList(){
        List<Teacher> tlist= trepository.findAll();
        return tlist;
    }
}
