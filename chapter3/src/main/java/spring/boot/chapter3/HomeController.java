package spring.boot.chapter3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("title","我的jsp spring Boot");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("我的测试哈" + i);
        }
        mv.addObject("list", list);
        return  mv;
    }
}
