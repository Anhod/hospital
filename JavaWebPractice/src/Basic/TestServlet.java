package Basic;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    public TestServlet(){
        System.out.println("构造方法");
    }

    public void init(){
        System.out.println("调用init方法");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");

//      //获取初始化参数
        String value = getInitParameter("myparam1");
        System.out.println(value);

        //获取上下文参数，1.获取上下文对象  2.获取上下文参数
        ServletContext context = getServletContext();
        String value2 = context.getInitParameter("myparam");
        System.out.println("上下文参数："+value2);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
