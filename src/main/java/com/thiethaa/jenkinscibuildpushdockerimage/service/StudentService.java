package com.thiethaa.jenkinscibuildpushdockerimage.service;

import com.thiethaa.jenkinscibuildpushdockerimage.entity.Student;
import com.thiethaa.jenkinscibuildpushdockerimage.utils.StudentUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public Student addStudent(Student student){
        return student;
    }

    public List<Student> getStudents(){
        return StudentUtil.getStudents();
    }

}
