package com.octagnosis.api.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class JwtTokenDto {
    private String token;
}
