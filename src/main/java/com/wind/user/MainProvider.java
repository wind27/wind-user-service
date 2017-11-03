package com.wind.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * MainProvider
 *
 * @author qianchun 17/9/18
 **/

@Import({ DispatcherServletAutoConfiguration.class, EmbeddedServletContainerAutoConfiguration.class,
        ErrorMvcAutoConfiguration.class, HttpEncodingAutoConfiguration.class,
        HttpMessageConvertersAutoConfiguration.class, JacksonAutoConfiguration.class, MultipartAutoConfiguration.class,
        ServerPropertiesAutoConfiguration.class, WebMvcAutoConfiguration.class })
@ImportResource(locations = { "classpath*:spring/applicationContext-provider.xml"})
@SpringBootApplication
public class MainProvider {
    public static void main(String[] args) {
        try {
            SpringApplication.run(MainProvider.class, args);
            synchronized (MainProvider.class) {
                while (true) {
                    MainProvider.class.wait();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("******************************* stop ");
        }
    }
}
