package com.template.core.domain.example.service;

import com.template.core.domain.example.domain.ExampleDomain;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public ExampleDomain example() {
        return new ExampleDomain();
    }
}
