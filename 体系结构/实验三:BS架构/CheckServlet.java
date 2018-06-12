import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckServlet extends HttpServlet {

    /**
     * Constructor of the object.
     */
    public CheckServlet() {
        super();
    }

    /**
     * The doPost method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to post.
     *
     * @param request the request send by the client to the server
     * @param response the response send by the server to the client
     * @throws ServletException if an error occurred
     * @throws IOException if an error occurred
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = "";
        String password = "";
        boolean ok = false;

        String chengJi = "";
        DataBase Student = new DataBase();

        if(request!=null){
            name=request.getParameter("name");
            password=request.getParameter("password");
            chengJi = Student.getScore(name,password);
            ok = true;
        }
        response.setContentType("text/html;charset=Utf-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("  <BODY>");
        out.print("<h2>");
        out.print("查询结果");
        out.print("</h2>");
        if(ok==true){
            out.println(chengJi);
        }
        else out.println("查询失败！");
        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }

}