package ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.entity.ProductEntiry;
import ru.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<ProductEntiry> productList() { return productRepository.findAll();    }
    public ProductEntiry getProduct(String name) { return productRepository.findById(name);    }
    public void addProduct( ProductEntiry productEntiry) {  productRepository.saveAndFlush(productEntiry);    }
    public void addProductlist( List<ProductEntiry> productEntiry) {  productRepository.saveAll(productEntiry);    }
}
