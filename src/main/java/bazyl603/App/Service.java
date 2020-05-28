package bazyl603.App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service {
    static final String BACK_NAME = "Word";
    static final Language BACK_LANG = new Language(1, "Hello", "en");
    private final Logger logger = LoggerFactory.getLogger(Service.class);
}
