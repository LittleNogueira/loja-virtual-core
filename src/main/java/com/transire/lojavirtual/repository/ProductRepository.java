package com.transire.lojavirtual.repository;

import com.transire.lojavirtual.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
