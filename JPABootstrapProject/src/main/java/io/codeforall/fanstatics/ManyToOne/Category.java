package io.codeforall.fanstatics.ManyToOne;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL,
    orphanRemoval = true,
    mappedBy = "category")
    private Set<Product> products;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){

        if (this.products == null) {
            products = new HashSet<>();
        }
            products.add(product);
            product.setCategory(this);
    }
}
