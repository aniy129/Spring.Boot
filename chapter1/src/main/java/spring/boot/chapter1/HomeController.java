package spring.boot.chapter1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Value("${test.t}")
    private  String tests;
    @RequestMapping(value = "/home")
    @ResponseBody
    public String Home() {
        return "hello home "+tests;
    }

    @RequestMapping("/")
    @ResponseBody
    public String Index() {
        return "hello world";
    }
}
