package me.kwakinsung.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.kwakinsung.springbootdeveloper.config.jwt.TokenProvider;
import me.kwakinsung.springbootdeveloper.domain.User;
import org.springframework.stereotype.Service;

import java.time.Duration;

@RequiredArgsConstructor
@Service
public class TokenService {

    private final TokenProvider tokenProvider;
    private final RefreshTokenService refreshTokenService;
    private final UserService userService;

    public String createNewAccessToken(String refreshToken) {
        //전달받은 리프레시 토큰으로 유효성 검사 진행하고,
        //유효할때, 사용자 id를 찾는다.
        //사용자 id로 사용자를 찾은후에 generateToken()메서드를 호출해서 새로운 액세스 토큰 생성
        // 토큰 유효성 검사에 실패하면 예외 발생
        if(!tokenProvider.validToken(refreshToken)) {
            throw new IllegalArgumentException("Unexpected token");
        }

        Long userId = refreshTokenService.findByRefreshToken(refreshToken).getUserId();
        User user = userService.findById(userId);

        return tokenProvider.generateToken(user, Duration.ofHours(2));
    }
}