package com;

import com.xxgc.entity.User;
import com.xxgc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class DfxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DfxyApplication.class,args);
    }


}

