package me.kwakinsung.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.kwakinsung.springbootdeveloper.domain.RefreshToken;
import me.kwakinsung.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {

    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        //전달받은 리프레시 토큰으로 리프레시 토큰객체를 검색해서 전달
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}