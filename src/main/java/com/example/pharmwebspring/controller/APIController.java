package com.example.pharmwebspring.controller;

import com.example.pharmwebspring.Model.Login;
import com.example.pharmwebspring.Model.Pharmacy;
import com.example.pharmwebspring.Model.RegisterRes;
import com.example.pharmwebspring.Model.User;
import com.example.pharmwebspring.Service.LoginService;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Member;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;


@RestController
@RequestMapping("/api")
public class APIController {
//
//    @PostMapping("/")
//    public String Home(){
//        return "index";
//    }

    @Autowired
    LoginService loginService;

//    @PostMapping("/uregi")
//    public RegisterRes regUser(@RequestBody User regUser){
//        // validation
//        Login login = new Login();
//        User userRegi = new User();
//        RegisterRes registerRes = new RegisterRes();
//
//        userRegi.setUser_id(regUser.getUser_id());
//        userRegi.setUser_pw(regUser.getUser_pw());
//        userRegi.setUser_pw(regUser.getUser_name());
//        userRegi.setUser_pw(regUser.getUser_phone());
//        userRegi.setUser_pw(regUser.getUser_email());
//        userRegi.setUser_pw(regUser.getUser_adr());
//
//        User user = loginService.getUser(login);
//
//        if(user==null){
//            loginService.insertUser(regUser);
//            registerRes.setStatus(200);
//        }else{
//            registerRes.setStatus(400);
//        }
//
//        return registerRes;
//    }
//
//    @PostMapping("/pregi")
//    public RegisterRes regPharmacy(@RequestBody Pharmacy pharmacy){
//
//        loginService.insertPharmacy(pharmacy);
//        RegisterRes registerRes = new RegisterRes();
//        registerRes.setStatus(200);
//        return registerRes;
//    }

    @PostMapping("/uidlogin") //sql -> 값 가져와서 성공 실패 보는
    public RegisterRes LoginUser(@RequestBody Login login){

        RegisterRes registerRes = new RegisterRes();
        User user = loginService.checkUser(login);

        if(user==null){

            registerRes.setStatus(400);
        }else{

            registerRes.setStatus(200);
        }
        return registerRes;
    }


    @PostMapping("/pidlogin") //sql -> 값 가져와서 성공 실패 보는
    public RegisterRes LoginPharmacy(@RequestBody Login login){

        RegisterRes registerRes = new RegisterRes();
        Pharmacy pharmacy = loginService.checkPharmacy(login);

        if(pharmacy==null){

            registerRes.setStatus(400);
        }else{

            registerRes.setStatus(200);
        }
        return registerRes;
    }



    @RequestMapping(value = "/llocation", method = RequestMethod.GET, produces = "application/text;charset=utf8")
    public String location(Local local, Model model) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552657/ErmctInsttInfoInqireService/getParmacyFullDown");

        urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "=hKyEVkCoDXA2F8YRMshfBtDUTrs7QSbgYJ%2FiiR11pb%2FqeaLKuTC1%2F6LgUkKOHW5eMi8EDmwUeEwi0RMEtAMM8Q%3D%3D&pageNO=1&numOfRows=100&");

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/xml;charset=UTF-8");

        BufferedReader rd;
        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }

        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }

        rd.close();
        conn.disconnect();
        return sb.toString();
        //return "location";
    }


}
