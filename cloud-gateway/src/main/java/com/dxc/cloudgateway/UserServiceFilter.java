package com.dxc.cloudgateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFilter implements GatewayFilterFactory<UserServiceFilter.Config> {
	@Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            System.out.println("gateway filter name " + config.getName());
            return chain.filter(exchange);
        };
    }

    @Override
    public Config newConfig() {
        return new Config("UserServiceFilter");
    }

    public static class Config {

        public Config(String name){
            this.name = name;
        }
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
