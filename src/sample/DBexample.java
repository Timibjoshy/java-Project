package sample;

import java.sql.*;

/**
 * Created by expert on 7/29/18.
 */
public class DBexample {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
       Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        Statement statement=connection.createStatement();
        //int i=statement.executeUpdate("insert into student values('8','aishu')");
       // System.out.println(i);
        Statement statement1 =connection.createStatement();
      //  ResultSet rs=statement1.executeQuery("select * from student");
      /* while (rs.next()){
            System.out.println(rs.getInt("id")+""+rs.getString("name"));
        }*/
      CallableStatement cs=connection.prepareCall("{call get_employee(?,?,?)}");
    cs.setInt(1,3);//database l ulla x te values kodukanam eg: database l 3.ghi kidakunnadhu
       cs.setString(2,"ghi");// x te place l SetInt kodutha value e koode kidakunna string eethano athu
      cs.registerOutParameter(3,Types.INTEGER);
        cs.execute();
       int y=cs.getInt("total");
        System.out.println(y);
        /*ResultSet rs1=cs.getResultSet();
        while (rs1.next()){
            System.out.println(rs1.getInt("id")+""+rs1.getString("name"));
        }*/
    }
}
