package com.example.git_demo.serviceimpl;

import com.example.git_demo.entity.Student;
import com.example.git_demo.exception.studentIdNotFoundExecption;
import com.example.git_demo.reposotiry.StudentRepo;
import com.example.git_demo.servic.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements studentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public Student addinfo(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> findalldetails() {

        List<Student> ls=studentRepo.findAll();
        if(ls.isEmpty())
        {
            return null;
        }
        else {
            return ls;
        }


    }

    @Override
    public Student findid(int sid) {
        Optional<Student> optional=studentRepo.findById(sid);

        if(optional.isEmpty())
        {
            throw new studentIdNotFoundExecption("Employee Id Not Found");
        }
        else {
            Student student= optional.get();
            return student;
        }


    }

    @Override
    public Student updatestudent(int sid, Student student) {
        //first fetch the id
        Optional<Student> optional=studentRepo.findById(sid);

        //check id present or  not
        if(optional.isEmpty()){
            return  null;
        }
        else {
            Student extingobj=optional.get();
            student.setSid(extingobj.getSid());
        }


        return studentRepo.save(student);
    }

    @Override
    public Student deleteStudentbyid(int sid) {

        Optional<Student> optional=studentRepo.findById(sid);
        if(optional.isPresent())
        {
            Student student=optional.get();
              studentRepo.delete(student);
            return student;
        }
        else
        {
            return null;
        }

    }


}
