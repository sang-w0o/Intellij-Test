package com.example.service;

import com.example.components.TestComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestComponent testComponent;

    public String getEnvironmentVariableFromAutowiredComponent() {
        return testComponent.getEnvironmentVariable();
    }
}
