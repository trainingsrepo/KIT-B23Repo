import java.net.Socket;
import java.net.*;
import java.io.*;

public class Client {

Socket socket;

BufferedReader br;
PrintWriter out;

public Client(){
    try{
        System.out.println("Sending request to server");
        socket=new Socket("127.0.0.1",7777);
    System.out.println("Connection done!!");

    br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    out = new PrintWriter(socket.getOutputStream());

    startReading();
    startWriting();

}
#feature101 code changes by Vivek for Reports Module in sept2024
 public Server(){
      try{server = new ServerSocket(7777);
        System.out.println("Server is ready to accept connection");
        System.out.println("waiting...");
        socket=server.accept();
        
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out = new PrintWriter(socket.getOutputStream());

        startReading();
        startWriting();
 }
 #end of feature101
 
    catch(Exception e){}
}