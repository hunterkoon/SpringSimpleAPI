package FirstAPISpring.JavaAPI.model;

import jdk.jfr.Unsigned;

import javax.persistence.*;

// Model of Date

//entidade referece a tabela ao qual os dados serão armazenados
@Entity(name = "user")
public class UserModel {

    //declara o ID e gera um valor sequencial
    @Id
    @GeneratedValue
    public Integer id;

    @Column(nullable = false, length = 255)
    public String name;

    @Column(nullable = false, length = 45)
    public String login;

    @Column(nullable = false, length = 45)
    public String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
