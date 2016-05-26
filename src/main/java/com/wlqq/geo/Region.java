package com.wlqq.geo;

/**
 * Author: liushaoping
 * Date: 2016/5/23.
 */
public class Region {
    /**
     * 行政区编码
     */
    private long code;
    /**
     * 直接上级行政区编码
     */
    private long parentCode;
    /**
     * 行政区标准名称
     */
    private String standardName;
    /**
     * 行政区名称
     */
    private String name;
    /**
     * 行政区名称拼音缩写
     */
    private String pinyinShorthandName;
    /**
     * 行政区名称拼音
     */
    private String pinyinName;
    /**
     * 行政区简称
     */
    private String shorthand;
    /**
     * 行政区别名
     */
    private String alias;
    /**
     * 行政区级别
     */
    private Level level;
    /**
     * 是否为首都、省会城市、市中心
     */
    private boolean capital;
    /**
     * 行政区电话区号
     */
    private String areaCode;
    /**
     * 行政区邮政编码
     */
    private String zipCode;
    /**
     * 车牌号前缀
     */
    private String plateNumberPrefix;
    /**
     * 中国自然地理区，七大自然地理分区(华东、华北、华中、华南、西南、西北、东北)
     * 华东（上海市、江苏省、浙江省、安徽省、江西省、山东省、福建省、台湾省）
     * 华北（北京市、天津市、山西省、河北省、内蒙古自治区中部）
     * 华中（河南省、湖北省、湖南省）
     * 华南（广东省、广西壮族自治区、海南省、香港特别行政区、澳门特别行政区）
     * 西南（重庆市、四川省、贵州省、云南省、西藏自治区）
     * 西北（陕西省、甘肃省、青海省、宁夏回族自治区、新疆维吾尔自治区、内蒙古自治区西部阿拉善盟）
     * 东北（黑龙江省、吉林省、辽宁省、内蒙古东部）
     * 注：亦有在此基础上将内蒙古自治区的呼伦贝尔市、兴安盟、通辽市、赤峰市划入东北地区的划分方式
     */
    private String naturalGeoArea;
    /**
     * 行政区中心经度
     */
    private String lng;
    /**
     * 行政区中心纬度
     */
    private String lat;
    /**
     * 行政区中心经纬度HASH
     */
    private String geoHash;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public long getParentCode() {
        return parentCode;
    }

    public void setParentCode(long parentCode) {
        this.parentCode = parentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getGeoHash() {
        return geoHash;
    }

    public void setGeoHash(String geoHash) {
        this.geoHash = geoHash;
    }

    public String getShorthand() {
        return shorthand;
    }

    public void setShorthand(String shorthand) {
        this.shorthand = shorthand;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public String getPlateNumberPrefix() {
        return plateNumberPrefix;
    }

    public void setPlateNumberPrefix(String plateNumberPrefix) {
        this.plateNumberPrefix = plateNumberPrefix;
    }

    public String getNaturalGeoArea() {
        return naturalGeoArea;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public String getPinyinShorthandName() {
        return pinyinShorthandName;
    }

    public void setPinyinShorthandName(String pinyinShorthandName) {
        this.pinyinShorthandName = pinyinShorthandName;
    }

    public String getPinyinName() {
        return pinyinName;
    }

    public void setPinyinName(String pinyinName) {
        this.pinyinName = pinyinName;
    }

    public void setNaturalGeoArea(String naturalGeoArea) {
        this.naturalGeoArea = naturalGeoArea;
    }

    public enum Level implements DisplayEnum {
        GEOAREA("地理区域"),
        PROVINCE("省"),
        CITY("市"),
        COUNTRY("县"),
        TOWN("城镇")
        ;


        private String display;
        private Level(String display) {
            this.display = display;
        }
        public String display() {
            return this.display;
        }
    }
}
