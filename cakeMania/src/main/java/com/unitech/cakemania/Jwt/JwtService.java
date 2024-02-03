package com.unitech.cakemania.Auth;

import com.unitech.cakemania.User.UserRole;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtService {
    public String getToken(UserDetails userDetails) {
        return null
    }
}
