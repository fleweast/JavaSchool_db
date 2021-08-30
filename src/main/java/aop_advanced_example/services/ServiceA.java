package aop_advanced_example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {

    @Autowired
    private ServiceB serviceB;


    public void doA() {
        serviceB.doB();
    }
}
