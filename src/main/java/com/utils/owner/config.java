package com.utils.owner;

import org.aeonbits.owner.Config;

import java.util.List;

@Config.Sources(value="file:${user.dir}/src/test/resources/config.properties")
public interface config extends Config {
    @Key("BROWSER")
    String browser();
    @Key("TIMEOUT")
    Long timeout();
    @Key("takescreenshot")
    Boolean takescreenshot();
    List<String> tools();
}
