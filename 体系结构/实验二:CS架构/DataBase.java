import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBase {
    // 数据库身份验证
    String driver = "org.mariadb.jdbc.Driver";
    String url = "jdbc:mariadb://localhost:3306/test";
    String user = "hmc";
    String pass = "654321";

    DataBase(){}

    public String getScore(String name,String password){
        String sql = "select score from Student where name='" + name+"' and password="+password;
        // 判断是否查询正确
        ArrayList<Integer> myList = new ArrayList<>();
        String chengJi;

        try {
            //注册驱动
            Class.forName(driver);
            //获取数据库连接
            Connection conn = DriverManager.getConnection(url, user, pass);
            //创建Statement对象
            Statement stmt = conn.createStatement();
            //执行查询
            ResultSet rs = stmt.executeQuery(sql);
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
            return "";
        }
        catch (Exception s){
            s.printStackTrace();
            return "没有该同学信息";
        }
    }
}
