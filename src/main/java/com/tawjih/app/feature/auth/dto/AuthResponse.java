package com.tawjih.app.feature.auth.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponse {
    private String token;
    private String refreshToken;
    private UserDTO user;
    private Long expiresIn;
}
