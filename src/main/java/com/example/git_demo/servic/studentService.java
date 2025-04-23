package com.example.git_demo.servic;

import com.example.git_demo.entity.Student;

import java.util.List;

public interface studentService {

    public Student addinfo(Student student);

    public List<Student> findalldetails();

    public Student findid(int sid);


    Student updatestudent(int sid, Student student);

    Student deleteStudentbyid(int sid);
}
