package com.wlqq.geo;

/**
 * Geography is singleton design.
 * Author: liushaoping
 * Date: 2016/5/23.
 */
public class Geography {

    private Geography() {}

    private static Geography instance = new Geography();

    private static Geography getInstance() {
        return instance;
    }






}
