package spring.boot.dubboprovider.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:provider.xml")
public class ProviderConfig {
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider-sp");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("192.168.142.161,192.168.142.162,192.168.142.163");
        registryConfig.setProtocol("zookeeper");
        registryConfig.setPort(2181);
        registryConfig.setClient("zkclient");
        return registryConfig;
    }
}
