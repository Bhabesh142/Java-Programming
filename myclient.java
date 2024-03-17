import java.io.*;
import java.net.*;

class myclient
{
 public static void main(String st[]) throws Exception
 {
  Socket s=new Socket("localhost",51012);
  
  DataInputStream din=new DataInputStream(s.getInputStream());
  DataOutputStream dout=new DataOutputStream(s.getOutputStream());
   
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
  String str=" ",str2="";
  while(!str.equals("stop"))
  {
   str=br.readLine();
   dout.writeUTF(str);
   dout.flush();
   str2=din.readUTF();
   System.out.println("Sever message: " + str2);
  }
  
  din.close();
  dout.close();
  s.close();
 }
}