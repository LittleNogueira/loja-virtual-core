package com.transire.lojavirtual.service;

import com.transire.lojavirtual.builder.ProductBuilder;
import com.transire.lojavirtual.dto.ProductDto;
import com.transire.lojavirtual.model.Product;
import com.transire.lojavirtual.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDto> findAll(){
        return ProductBuilder.convert(this.productRepository.findAll());
    }

    public ProductDto findById(Long id){
        return new ProductDto(this.productRepository.findById(id).get());
    }

    public ProductDto save(ProductDto productDto){
        Product product = ProductBuilder.convert(productDto);
        productRepository.save(product);
        return new ProductDto(product);
    }

    public ProductDto update(Long id, ProductDto productDto) {
        Product productBase = this.productRepository.getOne(id);
        Product product = ProductBuilder.merge(productBase,productDto);
        this.productRepository.save(product);
        return new ProductDto(product);
    }

    public void delete(Long id){
        this.productRepository.deleteById(id);
    }
}
