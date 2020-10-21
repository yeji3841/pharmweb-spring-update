package com.example.pharmwebspring.controller;

import com.example.pharmwebspring.Model.PharmAPI;
import com.example.pharmwebspring.Service.LoginService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import javax.annotation.Resource;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

@Controller
public class PharmAPIController {

   /* @RequestMapping()
    public ModelAndView locaton() throws Exception{
        ModelAndView mv = new ModelAndView("templates/location");

        return mv;
    }


    @GetMapping("/serchList")
    public void serchInfo(Model model) throws ParserConfigurationException, SAXException, IOException{

    }*/


}
