package ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.entity.PersonEntity;
import ru.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<PersonEntity> personList() { return personRepository.findAll();    }
    public PersonEntity getPerson(String lastname) { return personRepository.findById(lastname);    }
    public void addPerson(PersonEntity personEntity) { personRepository.saveAndFlush(personEntity);    }

}
