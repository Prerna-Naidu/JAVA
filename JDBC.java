import java.sql.*;
public class JDBC {
    static final String DB_URL="jdbc:mysql://localhost/Table1";
    static final String USER="guest";
    static final String PASS="guest123";
    static final String QUERY="SELECT id,first,last,age FROM Employees";
    public static void main(String[] args) {
        try(Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(QUERY)){
            while(rs.next()){
                System.out.println("ID:" +rs.getInt("id"));
                System.out.println("Age:" +rs.getInt("age"));
                System.out.println("First:" +rs.getString("first"));
                System.out.println("Last:" +rs.getString("last"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
