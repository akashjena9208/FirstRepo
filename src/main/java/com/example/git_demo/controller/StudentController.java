package com.example.git_demo.controller;
import com.example.git_demo.entity.Student;
import com.example.git_demo.serviceimpl.StudentImpl;
import com.example.git_demo.utility.ResponseStructrure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentImpl studentimpl;

/*
    //@RequestMapping(value = "/add", method = RequestMethod.POST)
//    @PostMapping
//    public Student addinfo(@RequestBody Student student) {
//        return studentimpl.addinfo(student);
//
//
//    }

    @PostMapping
    public ResponseEntity<ResponseStructrure<Student>> addinfo(@RequestBody Student student)
    {
        Student obj=studentimpl.addinfo(student);

        ResponseStructrure<Student> responseStructrure=new ResponseStructrure<>();
        responseStructrure.setStatuscode(HttpStatus.CREATED.value());
        responseStructrure.setMessage("Student Object Add SucessFully");
        responseStructrure.setData(obj);


        return new ResponseEntity<ResponseStructrure<Student>> (responseStructrure,HttpStatus.CREATED);
    }


    //@GetMapping("/find")
    @GetMapping
    public ResponseEntity<ResponseStructrure<List<Student> >> findalldetails()
    {
        List<Student> lst= studentimpl.findalldetails();
        ResponseStructrure responseStructrure=new ResponseStructrure();
        responseStructrure.setMessage("Your values is");
        responseStructrure.setStatuscode(HttpStatus.FOUND.value());

        responseStructrure.setData(lst);

        return new ResponseEntity<ResponseStructrure<List<Student> >> (responseStructrure,HttpStatus.FOUND);
    }

    //@GetMapping(value = "findbyid")

    @GetMapping("/id")
    public Student findid(int sid)
    {

        return  studentimpl.findid(sid);
    }


    //@PutMapping("update")
    @PutMapping
    public  Student updatestudent(int sid,@RequestBody Student student)
    {

        return  studentimpl.updatestudent(sid,student);
    }


    @DeleteMapping
    public Student deleteStudentbyid(int sid)
    {
        return  studentimpl.deleteStudentbyid(sid);
    }
    */

    //Trail


    @GetMapping("/search")
    public ResponseEntity<?> findStudent(@RequestParam(required = false) Integer sid)
                                        {

        if (sid != null) {
            Student student = studentimpl.findid(sid);
            return ResponseEntity.ok(student);

        } else {
            List<Student> allStudents = studentimpl.findalldetails();
            return ResponseEntity.ok(allStudents);
        }
    }



}

