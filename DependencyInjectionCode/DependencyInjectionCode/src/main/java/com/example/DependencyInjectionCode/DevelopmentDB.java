package com.example.DependencyInjectionCode;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name="deploy.environment",havingValue="development")
public class DevelopmentDB implements IDBService{

    public String getData(){
        return "Development Data";
    }
}
