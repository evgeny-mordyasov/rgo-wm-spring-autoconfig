package rgo.wm.spring.autoconfig.common;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import rgo.wm.spring.common.ReadinessEventListener;

@AutoConfiguration
class CommonConfiguration {

    @Bean
    ReadinessEventListener readinessEventListener() {
        return new ReadinessEventListener();
    }
}
