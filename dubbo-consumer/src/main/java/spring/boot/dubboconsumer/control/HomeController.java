package spring.boot.dubboconsumer.control;

import com.alibaba.dubbo.config.annotation.Reference;
import csk.dubbo.protocol.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Reference
    Api service;

    @RequestMapping("/home")
    @ResponseBody
    public String index(Integer x, Integer y) {
        int a = x == null ? 1 : x;
        int b = y == null ? 2 : y;
        int z = service.add(a, b);
        return String.valueOf(z);
    }
}
