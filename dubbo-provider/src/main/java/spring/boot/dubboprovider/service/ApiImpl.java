package spring.boot.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import csk.dubbo.protocol.Api;

@Service(timeout = 5000)
public class ApiImpl implements Api {
    @Override
    public int add(int x, int y) {
        return x + y;
    }
}
