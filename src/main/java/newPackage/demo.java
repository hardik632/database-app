package newPackage;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.sql.*;

public class demo {
    public static void main(String[] args) {
    try
    {
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/technicalBlog";
        String uname="postgres";
        String pwd="root";
        Connection con= DriverManager.getConnection(url,uname,pwd);
        Statement stmt=con.createStatement();
        String q="select* from student where marks between 60 and 100";
        ResultSet rs=stmt.executeQuery(q);
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+":" +rs.getString(2) +":"+rs.getInt(3));
        }
        con.close();
    }
    catch (Exception e) {
        System.out.println(e);
    }
    }
}
