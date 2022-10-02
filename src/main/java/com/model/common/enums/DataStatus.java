package com.model.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jwlee
 * Date: 2022/10/02
 */
public enum DataStatus {
    Active("1"),
    InActive("2")
    ;

    private String stringValue;

    private DataStatus(String intValue) {
        this.stringValue = intValue;
    }

    public String toStr(){return stringValue;}

    private static final Map<String,DataStatus> lookup = new HashMap<>();

    static {
        for(DataStatus rt : DataStatus.values()){
            lookup.put(rt.stringValue,rt);
        }
    }

    public static DataStatus get(String typeStr){return lookup.get(typeStr);}
}
