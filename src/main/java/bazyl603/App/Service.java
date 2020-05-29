package bazyl603.App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class Service {
    static final String BACK_NAME = "World";
    static final Language BACK_LANG = new Language(1, "Hello", "en");
    private final Logger logger = LoggerFactory.getLogger(Service.class);

    private LanguageRepo repository;

    Service() {
        this(new LanguageRepo());
    }

    Service(LanguageRepo repository) {
        this.repository = repository;
    }

    String prepareGreeting(String name, String lang){
        Integer langId;
        try {
            langId = Optional.ofNullable(lang).map(Integer::valueOf).orElse(BACK_LANG.getId());
        } catch (NumberFormatException e) {
            logger.warn("Wrong format id, no (" + lang + ")");
            langId = BACK_LANG.getId();
        }
        var welcomeMsg = repository.findById(langId).orElse(BACK_LANG).getWelcomeMsg();

        return welcomeMsg + " " + Optional.ofNullable(name).orElse(BACK_NAME) + " !";
    }
}
