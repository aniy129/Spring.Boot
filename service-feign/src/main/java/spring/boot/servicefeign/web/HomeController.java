package spring.boot.servicefeign.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.servicefeign.service.IHelloService;

@RestController
public class HomeController {
    @Autowired
    IHelloService iHelloService;

    @RequestMapping("/")
    public String index(@RequestParam String name) {
        return "feign" + iHelloService.sayHiFromClientOne(name);
    }
}
