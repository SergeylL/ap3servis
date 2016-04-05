import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;
public class ConfigServlet implements Servlet{
    ServletConfig servletConfig;
    public void init(ServletConfig config) throws ServletException{
        servletConfig = config;
       Enumeration paremetrs;
        paremetrs = config.getInitParameterNames();
        while (paremetrs.hasMoreElements()){
            String parameter = (String) paremetrs.nextElement();
            System.out.println("Parameter name "+ parameter);
            System.out.println("Parametr value "+ config.getInitParameter(parameter));
        }
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
        return servletConfig;
    }
}