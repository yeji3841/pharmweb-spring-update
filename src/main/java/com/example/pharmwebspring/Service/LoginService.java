package com.example.pharmwebspring.Service;

import com.example.pharmwebspring.Model.Login;
import com.example.pharmwebspring.Model.PharmAPI;
import com.example.pharmwebspring.Model.Pharmacy;
import com.example.pharmwebspring.Model.User;

import javax.swing.*;
import java.util.List;

public interface LoginService {
    void insertUser(User user);
    void insertPharmacy(Pharmacy pharmacy);

    User checkUser(Login login);
    Pharmacy checkPharmacy(Login login);

    /*void insertPharmAPI(PharmAPI pharmAPI);
    PharmAPI checkPharmAPI(PharmAPI pharmAPI);*/

    List<PharmAPI> printloc();

}
