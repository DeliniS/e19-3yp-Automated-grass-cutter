package com.example.grasscutter.MobileApplication.Auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class SignInResponseDto {

    private String accessToken;
    private String refreshToken;
    private String idToken;
    private String tokenType;
    private String scope;
    private Integer expiresIn;

}

