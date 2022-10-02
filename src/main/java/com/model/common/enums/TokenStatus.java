package com.model.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jwlee
 * Date: 2022/10/02
 */
public enum TokenStatus {

    Valid(1),
    Invalid(2),
    Expired(3)
    ;

    private int intValue;

    private TokenStatus(int intValue) {
        this.intValue = intValue;
    }

    public int toInt(){return intValue;}

    private static final Map<Integer, TokenStatus> lookup = new HashMap<>();

    static
    {
        for (TokenStatus rt : TokenStatus.values())
            lookup.put(new Integer(rt.intValue), rt);
    }

    public static TokenStatus get(int typeInt){return lookup.get(typeInt);}

}
