package idv.workshop.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemoConnectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String jbcdUrl = "jdbc:sqlite:demo.sqlite";  //協定:子協定:資料來源辨識
        try (Connection conn = DriverManager.getConnection(jbcdUrl)) {  //取得Connection物件
            System.out.printf("已%s 資料庫連線%n", conn.isClosed() ? "關閉" : "開啟");
        }
    }
}
