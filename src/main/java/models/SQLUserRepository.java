package models;

import data.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by UseR7 on 10.10.2016.
 */
public class SQLUserRepository {
private static String email;
//    public static void add(Order order) {
//        Connection conn = DatabaseUtil.getConn();
//        try {
//            PreparedStatement st = conn.prepareStatement("INSERT  INTO Users VALUES (?,?,?,?,?,?,?,?)");
//            st.setString(1, order.getName());
//            st.setString(2, order.getEmail());
//            st.setString(3, order.getAddress());
//            st.setString(4, order.getGender());
//            st.setString(5, order.getCity());
//            st.setString(6, order.getAbout());
//            st.setString(7, order.getSubscription());
//            st.setString(8, order.getIsAdmin());
//            st.execute();
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

}
