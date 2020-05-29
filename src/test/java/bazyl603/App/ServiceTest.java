package bazyl603.App;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class ServiceTest {

    //.prepareGreeting(null, every)
    @Test
    public void test_nullName_prepareGreeting() {
        var repo = returnHelloRepository();
        var ST = new Service(repo);
        var result = ST.prepareGreeting(null, "-1");

        assertEquals("Hello " + Service.BACK_NAME + " !", result);
    }

    //.prepareGreeting("testName", every)
    @Test
    public void test_nameExist_prepareGreeting() {
        var repo = returnHelloRepository();
        var ST = new Service(repo);
        var name = "testName";
        var result = ST.prepareGreeting(name, "-1");

        assertEquals("Hello " + name + " !", result);
    }

    //.prepareGreeting(null, null)
    @Test
    public void test_nullLang_prepareGreeting() {
        var repo = returnHelloRepository();
        var ST = new Service(repo);
        var result = ST.prepareGreeting(null, null);

        assertEquals("Hello " + Service.BACK_NAME + " !", result);
    }

    //.prepareGreeting(null, "string")
    @Test
    public void test_textLang_prepareGreeting() {
        var repo = returnHelloRepository();
        var ST = new Service(repo);
        var result = ST.prepareGreeting(null, "string");

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
