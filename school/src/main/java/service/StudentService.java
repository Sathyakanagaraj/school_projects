package service;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository srepository;
    public List<Student>  studentList(){
        List<Student> slist= srepository.findAll();
        return slist;
    }
}
