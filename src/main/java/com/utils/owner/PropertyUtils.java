package com.utils.owner;

import java.io.*;
import java.util.Properties;

public final class PropertyUtils {

    private PropertyUtils() {
    }

    /*
    1. Explicit call to readPropertyFile everytime to fetch Value
    2. Improper exception shown to user Is file path is wrong or if value not present in config file
    3. We are connecting to external file every time we fetch a value
    4. Fetching integer,boolean or List of values not possible
     */

    public static String readPropertyFile(String key) {
        Properties properties = null;
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config1.properties");
            properties = new Properties();
            properties.load(inputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Problem with Property File");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return (String) properties.get(key);
    }
}
