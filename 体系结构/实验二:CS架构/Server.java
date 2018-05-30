import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.sql.*;
import java.util.ArrayList;

public class Server extends Thread{
   private String hostname = "localhost";
   private int port = 2333;
   private ServerSocket serverSocket;

   public Server() throws IOException{
       serverSocket = new ServerSocket(port);
       serverSocket.setSoTimeout(66666);
   }

   public String getScore(String name,String password){
       String driver = "org.mariadb.jdbc.Driver";
       //从配置参数中获取数据库url
       String url = "jdbc:mariadb://115.159.85.157:3306/hmc";
       //从配置参数中获取用户名
       String user = "root";
       //从配置参数中获取密码
       String pass = "71190303";
//       String name = "hmc";
//       String password = "333";
       String sql = "select score from People where name='" + name+"' and password="+password;
//        System.out.println(sql);
       ArrayList<Integer> myList = new ArrayList<>();

       try {
           //注册驱动
           Class.forName(driver);
           //获取数据库连接
           Connection conn = DriverManager.getConnection(url, user, pass);
           //创建Statement对象
           Statement stmt = conn.createStatement();
           //执行查询
//            ResultSet rs = stmt.executeQuery("select * from People where name="+"'name'"+";");
//            ResultSet rs = stmt.executeQuery("select score from People");
           ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()){
//                System.out.println(rs.getInt("score"));
//            }
           String chengJi;
           while (rs.next()){
               myList.add(rs.getInt("score"));
           }
           if (myList.size()==1){
               chengJi = Integer.toString(myList.get(0));
               chengJi = "查询结果是" + chengJi;
           }
           else {
               chengJi = "查询信息错误";
           }
           return chengJi;
       }
       catch (ClassNotFoundException e){
           e.printStackTrace();
           return "没有该同学信息";
       }
       catch (Exception s){
           s.printStackTrace();
           return "没有该同学信息";
       }
   }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("等待连接中，端口号为" + serverSocket.getLocalPort() + "...");
                Socket customer = serverSocket.accept();

                DataOutputStream out = new DataOutputStream(customer.getOutputStream());
                DataInputStream in = new DataInputStream(customer.getInputStream());
                String name = in.readUTF();
                String password = in.readUTF();
                String score = getScore(name,password);
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
