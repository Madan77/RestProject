package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import contentmapping.Course; 

public class Access
{
public ArrayList<Course> getCourses(Connection con) throws SQLException
{
ArrayList<Course> courseList = new ArrayList<Course>();
PreparedStatement stmt = con.prepareStatement("SELECT * FROM COURSE");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
Course courseObj = new Course();
courseObj.setId(rs.getInt("ID"));
courseObj.setName(rs.getString("NAME"));
courseObj.setDuration(rs.getString("DURATION"));
courseObj.setFee(rs.getDouble("FEES"));
courseList.add(courseObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return courseList;
 
}
}