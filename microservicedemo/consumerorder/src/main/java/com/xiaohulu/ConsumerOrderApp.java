package com.xiaohulu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ConsumerOrderApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerOrderApp.class);

    }
    @Bean
    public RestTemplate getTemp(){
        return  new RestTemplate();
    }

}
