package com.thiethaa.jenkinscibuildpushdockerimage.utils;

import com.thiethaa.jenkinscibuildpushdockerimage.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StudentUtil {
    public static List<Student> getStudents() {
        return Arrays.asList(
                new Student(101, "Omar"),
                new Student(102, "Faiz"),
                new Student(103, "Zafeer"),
                new Student(104, "Fatur"),
                new Student(105, "Maisoora"),
                new Student(106, "Keysha"),
                new Student(107, "Arum"),
                new Student(108, "Kiana")
        );
    }
}
