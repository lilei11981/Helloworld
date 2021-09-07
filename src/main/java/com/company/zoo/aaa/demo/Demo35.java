package com.company.zoo.aaa.demo;

import com.mysql.jdbc.Statement;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lilei
 * @date 2021-08-27 下午11:26
 * @apiNote
 */

public class Demo35 {

    private final static String FIELD_SPLIT = "\u0001";
    private final static String LINE_SPLIT = "\u000F";

    public static void main(String[] args) {
        StringBuilder sql = new StringBuilder(
                "LOAD DATA LOCAL INFILE 'acct.dat' INTO TABLE user_list_info FIELDS TERMINATED BY '").append(
                FIELD_SPLIT)
                .append("'  LINES TERMINATED BY '")
                .append(LINE_SPLIT)
                .append("' (@dummy ,@dummy,@dummy,client_name,list_value,@dummy,@dummy,@dummy,@dummy) ")
                .append(" set list_id=concat('blacklist_',list_value), list_library_id='")
                .append("4115537065807118363")
                .append("', create_time='")
                .append(getCurrentDateStr())
                .append("', update_time='")
                .append(getCurrentDateStr())
                .append("', operator_id='")
                .append("batch_import")
                .append("', tenant_id='")
                .append("000")
                .append(
                        "', audit_serial_no = '001', creator_name= 'batch',verify_status='2',creator='batch',modifier='batch',list_type='2' ");

        try {
            String driverClassName = "com.mysql.jdbc.Driver";    //启动驱动
            String url = "jdbc:mysql://127.0.0.1:3306/java?useSSL=false";    //设置连接路径
            String username = "lilei";    //数据库用户名
            String password = "123456";    //数据库连接密码
            Class.forName(driverClassName); //执行驱动
            Connection connection = DriverManager.getConnection(url, username, password); //获取连接
            PreparedStatement statement = connection.prepareStatement(sql.toString());
            InputStream inputStream = new FileInputStream("/Users/lilei/Downloads/demo/TP_BLACK_LIST_TB_20210822.dat");
            Statement mysqlStatement = statement.unwrap(com.mysql.jdbc.Statement.class);
            mysqlStatement.setLocalInfileInputStream(inputStream);
            int result = mysqlStatement.executeUpdate(sql.toString());
            System.out.println(result);
        } catch (Exception e ) {
            e.printStackTrace();
        }

    }

    private static String getCurrentDateStr() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }
}
