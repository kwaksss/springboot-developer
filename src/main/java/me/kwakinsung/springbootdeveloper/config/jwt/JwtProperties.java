package me.kwakinsung.springbootdeveloper.config.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    //해당 값들을 변수로 접근하는데 사용할 JwtProperties클래스..

    private String issuer;//application.yml에서 설정한 jwt.issuer값
    private String secretKey;//jwt.secret_key값이 매핑
}