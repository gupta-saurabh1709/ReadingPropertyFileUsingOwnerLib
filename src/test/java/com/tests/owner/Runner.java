package com.tests.owner;

import com.utils.owner.PropertyUtils;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

        //Reading String type value from Properties file
        String browser= PropertyUtils.readPropertyFile("browser");
        System.out.println(browser);

        //Reading Long type value from Properties file
        String timeout=PropertyUtils.readPropertyFile("timeout");
        System.out.println(Long.parseLong(timeout));

        //Reading Boolean type value from Properties file
        String isScreenShotNeeded=PropertyUtils.readPropertyFile("takeScreenshot");
        System.out.println(Boolean.parseBoolean(isScreenShotNeeded));

        //Reading List type value from Properties file
        String tools=PropertyUtils.readPropertyFile("tools");
        List<String > listOfTools= Arrays.asList(tools.split(","));
        listOfTools.forEach(System.out::println);



    }
}
