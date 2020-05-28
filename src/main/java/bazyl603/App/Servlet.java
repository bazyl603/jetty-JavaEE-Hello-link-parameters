package bazyl603.App;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "Hello", urlPatterns = {"/*"})
public class Servlet extends HttpServlet {

}
