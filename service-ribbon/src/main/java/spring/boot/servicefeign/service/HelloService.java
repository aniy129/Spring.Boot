package spring.boot.servicefeign.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sorry")//设置短路时调用的方法
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-client/?name="+name,String.class);
    }

    /**
     * 熔断器调用的方法
     * @param name 传入参数
     * @return 返回结果
     */
    public String sorry(String name){
        return "sorry,can't,"+name;
    }
}
