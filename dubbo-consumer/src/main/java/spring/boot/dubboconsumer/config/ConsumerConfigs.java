package spring.boot.dubboconsumer.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerConfigs {
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("consumer-sp");
        return applicationConfig;
    }

    @Bean
    public com.alibaba.dubbo.config.ConsumerConfig consumerConfig() {
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig = new com.alibaba.dubbo.config.ConsumerConfig();
        consumerConfig.setTimeout(3000);
        consumerConfig.setCheck(false); // 启动时检查提供者是否存在，true报错，false忽略
        return consumerConfig;
    }

    /**
     * http://dubbo.apache.org/zh-cn/docs/user/references/registry/zookeeper.html
     * @return RegistryConfig
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("192.168.142.161");
        registryConfig.setAddress("192.168.142.161,192.168.142.162,192.168.142.163");
        registryConfig.setProtocol("zookeeper");
        registryConfig.setPort(2181);
        registryConfig.setClient("zkclient");
        return registryConfig;
    }
}
