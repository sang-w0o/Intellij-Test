package com.example.components;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class TestComponent {

    @Value("${test.environment.variable}")
    private String environmentVariable;
}
