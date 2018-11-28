package spring.boot.chapter2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "hello world2";
    }

    @RequestMapping(value = "/path/{id}")
    @ResponseBody
    public String getId(@PathVariable String id) {
        return id;
    }

    @RequestMapping("/index")
    public ModelAndView view() {
        ModelAndView mv = new ModelAndView("/index");
        mv.addObject("title", "我的spring boot");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("我的测试哈" + i);
        }
        mv.addObject("list", list);
        return mv;
    }
    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        return  "please login!";
    }
}
