package com.model.common.util;

import java.util.Random;

/**
 * packageName : com.model.common.model
 * className : AdminModel
 * user : jwlee
 * date : 2022/10/02
 */
public class KeyGenerator {

    static char[] strToken = {
            '0','1','2','3','4','5','6','7','8','9',
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
    };

    /**
     * Random Key 생성.
     * @param length
     * @return
     */
    public static String createKey(int length)
    {
        StringBuilder sb = new StringBuilder();

        Random rand = new Random();

        for (int i = 0 ; i < length ; i++)
        {
            sb.append( strToken[rand.nextInt(Integer.MAX_VALUE) % strToken.length] );
        }

        return sb.toString();
    }

}
