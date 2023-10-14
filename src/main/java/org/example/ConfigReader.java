package org.example;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;

    public ConfigReader(){
        try{
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            properties = new Properties();
            properties.load(fis);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getBaseURI(){
        return properties.getProperty("baseURI");
    }
}
