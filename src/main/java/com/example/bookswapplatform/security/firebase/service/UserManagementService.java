package com.example.bookswapplatform.security.firebase.service;

import com.example.bookswapplatform.dto.BaseResponseDTO;
import com.google.firebase.auth.FirebaseAuthException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserManagementService {
    ResponseEntity<BaseResponseDTO> setUserClaims(String uid) throws FirebaseAuthException;

}
