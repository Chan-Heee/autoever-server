package hello.autoeverserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 모든 경로에 대해 모든 출처에서 CORS 허용
        registry.addMapping("/**")
                .allowedOrigins("*")  // 모든 출처에서 요청을 허용
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD")  // 허용할 HTTP 메소드
                .allowedHeaders("*")  // 모든 헤더 허용
                .allowCredentials(true);  // 자격 증명 포함을 허용 (쿠키 등)
    }
}