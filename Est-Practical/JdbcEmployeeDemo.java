import java.sql.*;
public class JdbcEmployeeDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String username = "Akshita";
        String password = "Akshu@1502";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM employee";
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Employee Records:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}