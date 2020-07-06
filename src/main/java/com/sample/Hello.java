package com.sample;

import org.apache.commons.lang.StringUtils;

public class Hello {

    private String name;

    public Hello(String name) {
        this.name = name;
    }

    public String getMessage() {
        return "Hello " + (StringUtils.isNotEmpty(name) ? name : "noname");
    }
}
