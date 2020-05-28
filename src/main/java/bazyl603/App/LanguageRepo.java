package bazyl603.App;

import java.util.Optional;

public class LanguageRepo {
    Optional<Language> findById(Integer id) {
        var session = HibernateAction.getSessionFactory().openSession();
        var transaction = session.beginTransaction();   //transaction to read
        var result = session.get(Language.class, id);
        transaction.commit();
        session.close();

        return Optional.ofNullable(result);
    }
}
