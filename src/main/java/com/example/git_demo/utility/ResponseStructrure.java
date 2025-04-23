package com.example.git_demo.utility;

public class ResponseStructrure <obj>{
    private int statuscode;
    private String Message;
    private obj data;


    public int getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(int statuscode) {
        this.statuscode = statuscode;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public obj getData() {
        return data;
    }

    public void setData(obj data) {
        this.data = data;
    }
}
