package com.unitech.cakemania.Auth;

import com.unitech.cakemania.Jwt.JwtService;
import com.unitech.cakemania.User.Role;
import com.unitech.cakemania.Model.UserModel;
import com.unitech.cakemania.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        UserModel userModel = UserModel.builder()
                .username(request.getUsername())
                .username(request.getName())
                .username(request.getLastName())
                .username(request.getEmail())
                .username(request.getPassword())
                .username(request.getPhone())
                .role(Role.USER)
                .build();
        userRepository.save(userModel);

        return AuthResponse.builder()
                .token(jwtService.getToken(userModel))
                .build();
    }
}
