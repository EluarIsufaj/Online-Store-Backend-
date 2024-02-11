package com.example.demo.Repositories;

import com.example.demo.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    public Product findByTitleAndAuthorName(String title, String AuthorName);
}
