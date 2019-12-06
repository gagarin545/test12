package ru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.entity.PersonEntity;

public interface PersonRepository  extends JpaRepository<PersonEntity, Long> {

    @Query("select b from PersonEntity b where b.lastname = :lastname")
    PersonEntity findById(@Param("lastname") String lastname);
}
