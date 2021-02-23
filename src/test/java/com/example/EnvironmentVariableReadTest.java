package com.example;

import com.example.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:application-test.properties")
public class EnvironmentVariableReadTest {

    @Autowired
    private TestService testService;

    @Test
    public void environmentVariableReadTest() {
        String variable = testService.getEnvironmentVariableFromAutowiredComponent();
        assertNotNull(variable);
    }
}
