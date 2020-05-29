package bazyl603.App;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class ServiceTest {

    //.prepareGreeting(null, every)
    @Test
    public void test_nullName_prepareGreeting() {
        var repo =returnHelloRepository();
        var ST = new Service(repo);
        var result = ST.prepareGreeting(null, "-1");

        assertEquals("Hello " + Service.BACK_NAME + " !", result);
    }

    private LanguageRepo returnHelloRepository() {
        return new LanguageRepo() {
            @Override
            Optional<Language> findById(Integer id) {
                return Optional.of(new Language(null, "Hello", null));
            }
        };
    }
}
