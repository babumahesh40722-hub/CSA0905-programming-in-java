import java.sql.*;
public class Main {
 public static void main(String[] args) throws Exception {
  String url=System.getenv().getOrDefault("DB_URL","jdbc:mysql://localhost:3306/campus");
  String user=System.getenv().getOrDefault("DB_USER","root"), pass=System.getenv().getOrDefault("DB_PASSWORD","");
  try(Connection c=DriverManager.getConnection(url,user,pass)) {
   DatabaseMetaData md=c.getMetaData();
   try(ResultSet rs=md.getColumns(c.getCatalog(),null,"bus_pass","%")) {
    while(rs.next()) System.out.println(rs.getString("COLUMN_NAME")+" : "+rs.getString("TYPE_NAME"));
   }
  }
 }
}
