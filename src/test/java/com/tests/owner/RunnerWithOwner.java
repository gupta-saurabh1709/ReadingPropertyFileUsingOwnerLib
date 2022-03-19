package com.tests.owner;

import com.utils.owner.config;
import org.aeonbits.owner.ConfigFactory;

public class RunnerWithOwner {
    public static void main(String[] args) {
        config config = ConfigFactory.create(config.class);
        System.out.println(config.browser());
        System.out.println(config.takescreenshot());
        config.tools().forEach(System.out::println);
    }
}
