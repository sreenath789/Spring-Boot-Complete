package com.example.DependencyInjectionCode;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name="deploy.environment",havingValue="production")
public class ProductionDB implements IDBService{

    public String getData(){
        return "Production Data";
    }
}
