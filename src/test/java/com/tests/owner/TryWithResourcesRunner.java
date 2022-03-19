package com.tests.owner;

import com.utils.owner.ConfigProperties;
import com.utils.owner.TryWithResources;

public class TryWithResourcesRunner {

    public static void main(String[] args) {
        String browser= TryWithResources.get(ConfigProperties.BROWSER);
        System.out.println(browser);

        String takeScreenShot=TryWithResources.get(ConfigProperties.TAKESCREENSHOT);
        System.out.println(takeScreenShot);

        String tools=TryWithResources.get(ConfigProperties.TOOLS);
        System.out.println(tools);
    }
}
