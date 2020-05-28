package bazyl603.App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service {
    static final String FALLBACK_NAME = "Word";
    static final Language FALBACK_LANG = new Language(1, "Hello", "en");
    private final Logger logger = LoggerFactory.getLogger(Service.class);
}
