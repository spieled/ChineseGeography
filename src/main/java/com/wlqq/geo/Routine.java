package com.wlqq.geo;

/**
 * 路径
 * Author: liushaoping
 * Date: 2016/5/24.
 */
public class Routine {
    /**
     * 起始地
     */
    private Region from;
    /**
     * 到达地
     */
    private Region to;
    /**
     * 大约里程
     */
    private String distance;

    public Region getFrom() {
        return from;
    }

    public void setFrom(Region from) {
        this.from = from;
    }

    public Region getTo() {
        return to;
    }

    public void setTo(Region to) {
        this.to = to;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
