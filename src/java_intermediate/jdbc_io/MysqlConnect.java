package java_intermediate.jdbc_io;

import java.sql.*;

public class MysqlConnect {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/sakila", "root", "abcd");

            Statement query = con.createStatement();

            ResultSet resultSet = query.executeQuery("select * from sakila.actor;");


            while (resultSet.next()){

                String id = resultSet.getString("actor_id");
                String fn = resultSet.getString(2);
                String ln = resultSet.getString(3);

                System.out.print(id + "--" + fn + "--" + ln + "--" + "\t\t");
                System.out.println();


            }


        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }
}
