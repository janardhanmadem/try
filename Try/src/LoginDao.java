

import java.sql.*;  
  
public class LoginDao {  
public static boolean validate(String name,String pass){  
boolean status=false; 
UserAuthPubKey usr=new UserAuthPubKey();
//String arg;
String arr[]={"hi","2"};
usr.key(arr);
try{  

Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=DriverManager.getConnection("jdbc:mysql://intranet.myplex.in:3306/bugs?"+"user=bugs&password=Apa1yaBug5");	
PreparedStatement ps=con.prepareStatement( "select username from resources where username=? and password=MD5(?)");  
ps.setString(1,name);  
ps.setString(2,pass); 
System.out.println("");
      
ResultSet rs=ps.executeQuery();  
status=rs.next();
          
}catch(Exception e){System.out.println(e);}  
return status; 
}  
}  