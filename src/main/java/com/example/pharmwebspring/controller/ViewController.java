package com.example.pharmwebspring.controller;

import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import com.example.pharmwebspring.Model.*;
import com.example.pharmwebspring.Model.PharmAPI;
import com.example.pharmwebspring.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

@Controller
public class ViewController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/index")
    public String index(Model model) {
            return "index";
    }

    @RequestMapping("/location")
    public String location(Model model) {
       List<PharmAPI> member = loginService.printloc();

       model.addAttribute("memberList", member);

       return "location";
    }

    /*@GetMapping("/index")
    public String indexpage(){
        return "index";
    }*/

    @GetMapping("/register")
    public String resgisterpage(){
        return "register";
    }

    @GetMapping("/login")
    public String loginpage(){
        return "login";
    }

    @GetMapping("/about")
    public String aboutpage(){
        return "about";
    }

    @GetMapping("/cart")
    public String cartpage(Model model){
        return "cart";
    }

    @GetMapping("/order")
    public String orderpage(){
        return "order";
    }

    @GetMapping("/custom")
    public String custompage(){
        return "custom";
    }

    @GetMapping("/footer")
    public String footerpage(){
        return "footer";
    }

    @GetMapping("/header")
    public String headerpage(){
        return "header";
    }

   /* @RequestMapping(value = "/location", method = RequestMethod.GET, produces = "application/text;charset=utf8")
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
    }*/

    /*@GetMapping("/location")
    public String locationpage() {return "location";}

     */

    @GetMapping("/main")
    public String mainpage(){
        return "main";
    }

    @GetMapping("/mp_cart")
    public String mp_cartpage(){
        return "mp_cart";
    }

    @GetMapping("/mp_delete")
    public String mp_deletepage(){
        return "mp_delete";
    }

    @GetMapping("/mp_history")
    public String mp_historypage(){
        return "mp_history";
    }

    @GetMapping("/mp_profile")
    public String mp_profilepage(Model model){
        return "mp_profile";
    }

    @GetMapping("/mypage")
    public String mypagepage(){
        return "mypage";
    }

    @GetMapping("/shop")
    public String shoppage(){
        return "shop";
    }

    @GetMapping("/shop_allergy")
    public String shop_allergypage(){
        return "shop_allergy";
    }

    @GetMapping("/shop_ent")
    public String shop_entpage(){
        return "shop_ent";
    }

    @GetMapping("/shop_etc")
    public String shop_etcpage(){
        return "shop_etc";
    }

    @GetMapping("/shop_eye")
    public String shop_eyepage(){
        return "shop_eye";
    }

    @GetMapping("/shop_heart")
    public String shop_heartpage(){
        return "shop_heart";
    }

    @GetMapping("/shop_single")
    public String shop_singlepage(){
        return "shop_single";
    }

    @GetMapping("/shop_tooth")
    public String shop_toothpage(){
        return "shop_tooth";
    }

    @GetMapping("/shop_urology")
    public String shop_urologypage(){
        return "shop_urology";
    }

    @GetMapping("/shop_vitamin")
    public String shop_vitaminpage(){
        return "shop_vitamin";
    }

    @GetMapping("/thankyou")
    public String thankyoupage(){
        return "thankyou";
    }

    @GetMapping("/tips")
    public String tipspage(){
        return "tips";
    }

    @GetMapping("/getapi")
    public String getapipage(){
        return "getapi";
    }

}