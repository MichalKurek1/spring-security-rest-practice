package pl.vrum.springTest.Model;

import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private Long id;
    String name;

    Role(){

    }

    public Long getId() {
        return id;
    }

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
