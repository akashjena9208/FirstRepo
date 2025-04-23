package com.example.git_demo.utility;

import com.example.git_demo.exception.studentIdNotFoundExecption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationHandel {

    @ExceptionHandler
    public ResponseEntity<ErrorStructure<String>> handelstudentidNotFundException(studentIdNotFoundExecption st)
    {
        ErrorStructure<String> es=new ErrorStructure<>();
        es.setErrorcode(HttpStatus.NOT_FOUND.value());
        es.setErrormessage("Student Id Not Found Pls add the student id");
        es.setError(st.getMeassage());

        return  new ResponseEntity<ErrorStructure<String>> (es,HttpStatus.NOT_FOUND);
    }
}
