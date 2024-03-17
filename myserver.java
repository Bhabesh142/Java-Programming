import java.io.*;
import java.net.*;

class myserver
{
 public static void main(String st[]) throws Exception
 {
  ServerSocket ss=new ServerSocket(51012);
   
  Socket s1=ss.accept();
  
  DataInputStream din=new DataInputStream(s1.getInputStream());
  DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
   
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
  String str=" ",str2="";
  while(!str.equals("stop"))
  {
   str=din.readUTF();
   System.out.println("Client message: " + str);
   str2=br.readLine();
   dout.writeUTF(str2);
   dout.flush();
  }
  
  din.close();
  s1.close();
  ss.close();
 }
}