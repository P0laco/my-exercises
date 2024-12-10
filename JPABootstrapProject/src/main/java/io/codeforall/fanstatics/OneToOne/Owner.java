package io.codeforall.fanstatics.OneToOne;

import javax.persistence.*;

@Entity
@Table(name = "owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

   private String name;

   @OneToOne(
           cascade = {CascadeType.ALL},
           orphanRemoval = true,
           mappedBy = "owner")
   private Car car;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Integer getId() {
        return id;
    }

    public Car getCar() {
        return car;
    }

    public String getName() {
        return name;
    }

    public void setName(String type) {
        this.name = type;
    }
}
