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
#feature102 changes by ethan for transactions in sep 2024
 public static void main(String s[]) throws Exception {
        Socket sa = null;
        ServerSocket ss2 = null;
        System.out.println("Host starts accepting response ");
        try {
            ss2 = new ServerSocket(9999);
        } catch (IOException e) {
            System.out.println("server error");
        }
        while (true) {
            try {
                sa = ss2.accept();
                System.out.println("connetion established by"+ ss2.getInetAddress());
                ServerThread st = new ServerThread(sa);
                st.start();
            } 
             }#end of feature102
    catch(Exception e){}
}