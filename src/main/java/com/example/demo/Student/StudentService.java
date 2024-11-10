package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class StudentService {
 public List<StudentModel> getStudents(){
        return List.of(
            new StudentModel(1,"Nez", "hello@123.com", 23, LocalDate.of(2000,Month.DECEMBER,5))
        ); 
    
}

}
