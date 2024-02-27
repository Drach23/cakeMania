package com.unitech.cakemania.Repository;

import com.unitech.cakemania.Model.UserAddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository extends JpaRepository<UserAddressModel,Long> {

}
