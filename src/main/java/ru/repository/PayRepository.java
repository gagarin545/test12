package ru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.entity.PayEntity;

public interface PayRepository extends JpaRepository<PayEntity, Long> {

}
