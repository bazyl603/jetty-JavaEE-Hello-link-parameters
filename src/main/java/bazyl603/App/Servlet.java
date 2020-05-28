package bazyl603.App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "Hello", urlPatterns = {"/*"})
public class Servlet extends HttpServlet {
    private static final String NAME = "name";
    private static final String LANG = "lang";
    private final Logger logger = LoggerFactory.getLogger(Servlet.class);
}
