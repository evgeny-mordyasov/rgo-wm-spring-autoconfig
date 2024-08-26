package rgo.wm.spring.autoconfig.web;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;
import rgo.wm.spring.web.ExceptionResponseAdvice;

@AutoConfiguration
@Import(ExceptionResponseAdvice.class)
class WebConfiguration {
}
