package com.unitech.cakemania.Controller;

import com.unitech.cakemania.Model.UserAddressModel;
import com.unitech.cakemania.Service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("userAddress")
public class UserAddressController {
    @Autowired
    UserAddressService userAddressService;
    //encontrar todos las direcciones de los usuarios
    @GetMapping() // http://localhost:8080/userAdress
    public ArrayList<UserAddressModel> findAllAdressUser(){
        return userAddressService.findAllUserAddress();
    }
    //guardar una direccion de usuario
    @PostMapping() //  http://localhost:8080/userAdress
    public UserAddressModel saveAdressUser(@RequestBody UserAddressModel userAddress) {
        return userAddressService.saveUserAddress(userAddress);
    }
    //editar una direccion de usuario
    @PutMapping() //  http://localhost:8080/userAdress
    public UserAddressModel updateAdressUser(@RequestBody UserAddressModel userAddress) {
        return userAddressService.saveUserAddress(userAddress);
    }

    @GetMapping(path = "/findById") // http://localhost:8080/userAdress/findById?id=1
    public Optional<UserAddressModel> findById(@RequestParam("id")Long id){
        return this.userAddressService.findById(id);
    }
    @DeleteMapping(path = "deleteById") //  http://localhost:8080/userAdress/deleteById?id=1
    public boolean deleteById(@RequestParam("id")Long id){
        return this.userAddressService.deleteById(id);
    }
}
