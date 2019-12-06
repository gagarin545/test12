package ru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.entity.PersonEntity;
import ru.entity.ProductEntiry;

public interface ProductRepository extends JpaRepository<ProductEntiry, Long> {
    @Query("select b from ProductEntiry b where b.name = :name")
    ProductEntiry findById(@Param("name") String name);
}
