import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Server extends Thread{
   private int port = 2333;
   private ServerSocket serverSocket;

   public Server() throws IOException{
       serverSocket = new ServerSocket(port);
       serverSocket.setSoTimeout(66666);
   }

    @Override
    public void run() {
        while (true) {
            // 数据函数类
            DataBase Student = new DataBase();
            try {
                System.out.println("等待连接中，端口号为" + serverSocket.getLocalPort() + "...");
                Socket customer = serverSocket.accept();

                DataOutputStream out = new DataOutputStream(customer.getOutputStream());
                DataInputStream in = new DataInputStream(customer.getInputStream());
                String name = in.readUTF();
                String password = in.readUTF();
                String score = Student.getScore(name,password);
                out.writeUTF(score);
            } catch (SocketTimeoutException s) {
                System.out.println("连接超时");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
       try {
           Thread t = new Server();
           t.run();
       }
       catch (IOException e){
           e.printStackTrace();
       }
    }

}
