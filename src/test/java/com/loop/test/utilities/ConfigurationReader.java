package com.loop.test.utilities;


import java.io.FileInputStream;
import java.util.Properties;

/**
 * This class is designed to read properties file and
 * send the data to source code
 */
public class ConfigurationReader {

    private  static Properties properties;
    static {
        try {
            String path="configuration.properties";
            FileInputStream input=new FileInputStream(path);
            properties=new Properties();
            input.close();//it is going to help us to read from config properties

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static  String getProperty(String keyName){
        return  properties.getProperty(keyName);
    }
}
