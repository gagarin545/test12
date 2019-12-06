package ru;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.entity.PersonEntity;


import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;
import ru.service.PersonService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {
    @Resource
    private EntityManagerFactory emf;
    private EntityManager em;

    @Resource
    private PersonService personService;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void personTest() throws Exception {
        List<PersonEntity> person =  personService.personList();
        if( person.size() == 0) {
            PersonEntity personEntity = new PersonEntity();
            personEntity.setName("Василий");
            personEntity.setLastname("Сергеев");
            personEntity.setAge(30);
            personService.addPerson(personEntity);

            PersonEntity personEntity1 = new PersonEntity();
            personEntity1.setName("Иван");
            personEntity1.setLastname("Иванов");
            personEntity1.setAge(10);
            personService.addPerson(personEntity1);

            PersonEntity personEntity2 = new PersonEntity();
            personEntity2.setName("Петр");
            personEntity2.setLastname("Петров");
            personEntity2.setAge(20);
            personService.addPerson(personEntity2);
        }

       person.forEach(x-> System.out.println(">>" + x.getName() + ' ' + x.getLastname() + ' ' + x.getAge()));
    }

}
