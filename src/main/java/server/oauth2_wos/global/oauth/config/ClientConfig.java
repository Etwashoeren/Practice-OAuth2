package server.oauth2_wos.global.oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClientConfig { //RestTemplate를 사용하기 위한 클래스

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
