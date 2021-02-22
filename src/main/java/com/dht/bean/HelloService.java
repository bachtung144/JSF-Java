package com.dht.bean;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@ManagedBean
@Named("helloService")
@SessionScoped
public class HelloService {
    public String convert(String input) {
        return "HELLO: " + input.toUpperCase();
    }
}
