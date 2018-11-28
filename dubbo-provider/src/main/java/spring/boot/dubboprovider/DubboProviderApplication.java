package spring.boot.dubboprovider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@DubboComponentScan(basePackages = {"spring.boot.dubboprovider.service"})
public class DubboProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboProviderApplication.class, args);
       while (true){
           System.in.read();
       }
    }
}
