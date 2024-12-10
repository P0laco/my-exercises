package io.codeforall.fanstatics.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {

    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        EntityManager em = emf.createEntityManager();

        Category category = new Category();
        Product product = new Product();
        Product product1 = new Product();
        Product product2 = new Product();

        product.setCategory(category);
        product.setName("lava-loiça");
        product1.setCategory(category);
        product1.setName("detergente");
        product2.setCategory(category);
        product2.setName("amaciador");

        category.setName("limpeza");
        category.addProduct(product);
        category.addProduct(product1);
        category.addProduct(product2);



        em.getTransaction().begin();
        em.persist(category);
        em.getTransaction().commit();

        System.out.println("Result: " +
                em.createNativeQuery("select 1 + 1").getSingleResult());

        em.close();

        emf.close();

    }
}
