package com.example.pharmwebspring.Parsing;

/*import java.io.*;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.apache.tomcat.jni.Local;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.NodeList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

@ResponseBody
@RequestMapping(value = "/location", method = RequestMethod.GET)
public class PharmParser {
   private DocumentBuilderFactory documentBuilderFactory;
   private DocumentBuilder documentBuilder;
   private Document document;
   private NodeList nodeList;
   public PharmParser(File file){
       DomParser(file);
   }

    public void DomParser(File file) {

       try {
           documentBuilderFactory = DocumentBuilderFactory.newInstance();
           documentBuilder = documentBuilderFactory.newDocumentBuilder();
           document = documentBuilderFactory.parse(file);
       }catch (ParserConfigurationException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }
    }

    public List<XmlDataVO> parse(String tagName){
       List<XmlDataVO> listOfData = new ArrayList<XmlDataVO>();
        nodeList = document.getElementsByTagName(tagName);
        for(int i = 0; i < nodeList.getLength() ; i ++){
            Element element = (Element) nodeList.item(i);
            int u_id = Integer.parseInt(this.getTagValue("id",element));
            String u_name = this.getTagValue("name", element);
            String u_address = this.getTagValue("address",element);
            String u_phone = this.getTagValue("phone",element);
            listOfData.add(new XmlDataVO(u_id, u_name, u_address, u_phone));


    }
}
*/