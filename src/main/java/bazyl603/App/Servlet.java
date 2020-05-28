package bazyl603.App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Hello", urlPatterns = {"/*"})
public class Servlet extends HttpServlet {
    private static final String NAME = "name";
    private static final String LANG = "lang";
    private final Logger logger = LoggerFactory.getLogger(Servlet.class);

    private Service service;

    public Servlet() {
        this(new Service());
    }
    Servlet(Service service){
        this.service = service;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Request with parameters " + req.getParameterMap());

        String name = req.getParameter(NAME);
        String lang =  req.getParameter(LANG);
        resp.getWriter().write(service.prepareGreeting(name, lang));
    }
}
