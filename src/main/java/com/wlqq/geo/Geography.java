package com.wlqq.geo;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

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


    public static void main(String[] args) throws SQLException, IOException {
        Geography geography = Geography.getInstance();
        // 读取json，写入数据库
        String jsonStr = FileUtils.readFileToString(new File("D:\\gitProject\\ChineseGeography\\doc\\行政区域经纬度"), UTF_8);
        List<Region> regions = JSON.parseArray(jsonStr, Region.class);
        List<String> batchSql = new ArrayList<>(200);
        int index = 0;
        int totalSize = regions.size();
        for (Region region : regions) {
            index ++;
            String sql = "insert into region (`code`, `parent_code`, `name`, `level`, `latitude`, `longitude`) values ("
                    +region.getCode()+", "+region.getParentCode()+", \""+region.getName()+"\", "+region.getLevel()+", \""+region.getLatitude()+"\",\""+region.getLongitude()+"\")";
            batchSql.add(sql);
            if (index % 200 == 0 || index == totalSize) {
                geography.executeBatchSql(batchSql);
                batchSql.clear();
                System.out.println(String.format("inserted %s records", index % 200 == 0 ? 200 : index % 200));
            }
        }

        // 查漏补缺，完善数据库


        // 导出json

    }


    private void executeSql(String sql) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/geo", "root", "root");
        Statement stmt = connection.createStatement();
        stmt.executeBatch();
        stmt.executeUpdate(sql);
        stmt.close();
        connection.close();
    }

    private void executeBatchSql(Collection<String> batchSql) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/geo", "root", "root");
        Statement stmt = connection.createStatement();
        for (String sql : batchSql) {
            stmt.addBatch(sql);
        }
        stmt.executeBatch();
        stmt.close();
        connection.close();
    }



}
