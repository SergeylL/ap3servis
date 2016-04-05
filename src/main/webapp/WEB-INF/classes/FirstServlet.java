import javax.servlet.*;
import java.io.IOException;

public class FirstServlet implements Servlet{

    public void init(ServletConfig config) throws ServletException{
        System.out.println("init");
    }
    public void service(ServletRequest request, ServletResponse response)throws ServletException,IOException{
        System.out.println("Service");
    }
    public void destroy(){
        System.out.println("destroy");
    }

    public String getServletInfo(){
        return null;
    }
    public ServletConfig getServletConfig(){
        return null;
    }
}