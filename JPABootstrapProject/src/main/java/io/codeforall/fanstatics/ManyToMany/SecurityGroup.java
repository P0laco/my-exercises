package io.codeforall.fanstatics.ManyToMany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sgroup")
public class SecurityGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "sgroup",
    fetch = FetchType.EAGER)
    private List<User> users;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }
}
