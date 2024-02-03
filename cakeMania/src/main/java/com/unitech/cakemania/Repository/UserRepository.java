package com.unitech.cakemania.Repository;


import com.unitech.cakemania.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel,Integer> {
    Optional<UserModel> findByUsername(String username);
}
