package com.unitech.cakemania.Service;

import com.unitech.cakemania.Model.UserAddressModel;
import com.unitech.cakemania.Repository.UserAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserAddressService {
    @Autowired
    UserAddressRepository userAddressRepository;

    public ArrayList<UserAddressModel> findAllUserAddress() {
        return (ArrayList<UserAddressModel>) userAddressRepository.findAll();
    }

    //guardar una nueva direccion de usuario
    public UserAddressModel saveUserAddress(UserAddressModel userAddress){
        return userAddressRepository.save(userAddress);
    }
    public Optional<UserAddressModel> findById(Long id){
        return userAddressRepository.findById(id);
    }
    public boolean deleteById(Long id){
        try{
            userAddressRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
