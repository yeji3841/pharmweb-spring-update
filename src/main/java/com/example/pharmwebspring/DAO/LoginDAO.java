package com.example.pharmwebspring.DAO;

import com.example.pharmwebspring.Model.Login;
import com.example.pharmwebspring.Model.PharmAPI;
import com.example.pharmwebspring.Model.Pharmacy;
import com.example.pharmwebspring.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface LoginDAO {

    void setUser(User user);
    void setPharmacy(Pharmacy pharmacy);

    User getUser(Login login);
    Pharmacy getPharmacy(Login login);

   /* void setPharmAPI(PharmAPI pharmAPI);
    PharmAPI getPharmAPI(PharmAPI pharmAPI);*/



}
