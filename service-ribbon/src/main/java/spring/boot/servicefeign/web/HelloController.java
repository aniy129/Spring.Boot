package spring.boot.servicefeign.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.boot.servicefeign.service.HelloService;

@Controller
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/")
    @ResponseBody
    public String hi(@RequestParam String name){
        return"ribbon"+ helloService.hiService(name);
    }
}
