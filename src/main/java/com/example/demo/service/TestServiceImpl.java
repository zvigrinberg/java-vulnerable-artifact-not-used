package com.example.demo.service;


import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getTestString(String input) {
        return String.format("Hello %s from test Service!", input);
    }
}
