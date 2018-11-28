package spring.boot.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class NetflixForHelloService implements IHelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry ,can't " + name;
    }
}
