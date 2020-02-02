package com.Amazon.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;
    public ReadConfig(){
        File src = new File(System.getProperty("user.dir")+"\\src\\Configurations\\config.properties");
        try{
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("The exception is "+ e.getMessage());
        }
    }

    public String getUserID(){
        return pro.getProperty("UserID");
    }

    public String getURL(){
        return pro.getProperty("URL");
    }

    public String getPassword(){
        return pro.getProperty("Password");
    }

    public String getChromePath(){
        String chromepath = pro.getProperty("ChromePath");
        return chromepath;
    }
 }
