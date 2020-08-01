package com.lihongkun.labs.spring.boot.hello;

public class HelloService {

    private String msg;

    public void sayHello(){
        System.out.println("hello " + msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
