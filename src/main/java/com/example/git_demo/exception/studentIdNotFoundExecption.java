package com.example.git_demo.exception;

public class studentIdNotFoundExecption  extends  RuntimeException{

    private String meassage;


    public studentIdNotFoundExecption(String meassage)
    {
        this.meassage = meassage;
    }

    public String getMeassage() {
        return meassage;
    }


}
