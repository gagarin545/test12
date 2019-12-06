package ru;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.entity.PayEntity;
import ru.entity.PersonEntity;
import ru.entity.ProductEntiry;
import ru.service.PayService;
import ru.service.PersonService;
import ru.service.ProductService;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayServiceTest {
    @Resource
    private EntityManagerFactory emf;
    private EntityManager em;

    @Resource
    PayService payService;

    @Resource
    PersonService personService;

    @Resource
    ProductService productService;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void personTest() throws Exception {


        PayEntity payEntity = new PayEntity();
        payEntity.setCount((int) 2);
        PersonEntity personEntity = personService.getPerson("Иванов");
        System.out.println(payEntity.getId());
        payEntity.setPersonEntity( personEntity);
        ProductEntiry productEntiry =  productService.getProduct("Соковыжималка");
        System.out.println(productEntiry.getName() + ' ' + productEntiry.getPurchase_item());
        payEntity.setProductEntiry( productEntiry);
        payEntity.setPurchase_date( new Timestamp(Calendar.getInstance().getTimeInMillis()));

        payService.addPay(payEntity);
        List<PayEntity> pay =  payService.payList();
        pay.forEach(x-> System.out.println(">>" + x.getCount() + ' ' + x.getPersonEntity().getName() + ' ' + x.getProductEntiry().getName()));
    }

}
