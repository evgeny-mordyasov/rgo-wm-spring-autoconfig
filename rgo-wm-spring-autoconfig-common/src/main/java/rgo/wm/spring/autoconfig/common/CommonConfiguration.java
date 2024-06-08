package rgo.wm.spring.autoconfig.common;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import rgo.wm.spring.common.ReadinessEventListener;

@AutoConfiguration
public class CommonConfiguration {

    @Bean
    public ReadinessEventListener readinessEventListener() {
        return new ReadinessEventListener();
    }
}
