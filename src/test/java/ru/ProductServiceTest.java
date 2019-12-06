package ru;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.entity.PersonEntity;
import ru.entity.ProductEntiry;
import ru.service.PersonService;
import ru.service.ProductService;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
    @Resource
    private EntityManagerFactory emf;
    private EntityManager em;

    @Resource
    private ProductService productService;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void productTest() throws Exception {

       ProductEntiry productEntiry = new ProductEntiry();
        productEntiry.setCost((float) 201.20);
        productEntiry.setName("Телевизор");

        ProductEntiry productEntiry1 = new ProductEntiry();
        productEntiry1.setCost((float) 45.60);
        productEntiry1.setName("Смартфон");

        ProductEntiry productEntiry2 = new ProductEntiry();
        productEntiry2.setCost((float) 70.63);
        productEntiry2.setName("Соковыжималка");
        ProductEntiry productEntiry3 = new ProductEntiry();
        productEntiry3.setCost((float) 20.20);
        productEntiry3.setName("Наушники");
        ProductEntiry productEntiry4 = new ProductEntiry();
        productEntiry4.setCost((float) 10.73);
        productEntiry4.setName("Клавиатура");


        List<ProductEntiry> product =  productService.productList();
        if( product.size() == 0) {
            product.add(productEntiry);
            product.add(productEntiry1);
            product.add(productEntiry2);
            product.add(productEntiry3);
            product.add(productEntiry4);
            productService.addProductlist(product);
        }

        product.forEach(x-> System.out.println(">>" + x.getName() + ' ' + x.getCost() + ' ' + x.getPurchase_item()));
    }

}
