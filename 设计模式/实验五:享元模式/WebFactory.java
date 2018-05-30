import java.util.*;

public class WebFactory {
   public static final HashMap<String, Web> WebMap = new HashMap<>();

   public static Web getWeb(String type) {
      Web newWeb = (Web)WebMap.get(type);

      //如果空对象，则新建并加入map
      if(newWeb == null) {
         if (type == "信息发布") {
            newWeb = new SendMessage();
         }
         else if (type == "产品展示") {
            newWeb = new Show();
         }
         else if (type == "博客留言") {
            newWeb = new Blog();
         }
         else {
             System.out.println("选择类型错误");
         }
         WebMap.put(type, newWeb);
      }
      return newWeb;
   }

   public static void showSize(){
       System.out.println("当前保存的对象数:"+WebMap.size());
   }
}
