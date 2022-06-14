package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    @PostConstruct
    public void InitMethod () {
        System.out.println("Init Method");
    }
    @PreDestroy
    public void DestroyMethod () {
        System.out.println("Destroy Method");
    }
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }

}
