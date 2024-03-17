import java.net.*;
class getPort
{
 public static void main(String s[]) throws Exception
 {
  ServerSocket ss=new ServerSocket(0);
  System.out.println(ss.getLocalPort());
  ss.close();
 }
}