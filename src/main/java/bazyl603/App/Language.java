package bazyl603.App;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Languages")
public class Language {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer id;
    private String welcomeMsg;
    private String code;

    //Hibernate need it.
    @SuppressWarnings("unused")
    Language() {}

    public Language(Integer id, String welcomeMsg, String code) {
        this.id = id;
        this.welcomeMsg = welcomeMsg;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }
    public String getWelcomeMsg() {
        return welcomeMsg;
    }
    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}
