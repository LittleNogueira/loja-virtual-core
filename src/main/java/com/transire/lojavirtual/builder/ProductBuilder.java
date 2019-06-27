package com.transire.lojavirtual.builder;

import com.transire.lojavirtual.dto.ProductDto;
import com.transire.lojavirtual.model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductBuilder {

    public static Product convert(ProductDto productDto){
        return new Product(productDto.getName(),productDto.getValue(),productDto.getDescription(),productDto.getAmount());
    }

    public static List<ProductDto> convert(List<Product> products){
        return products.stream().map(ProductDto::new).collect(Collectors.toList());
    }

    public static Product merge(Product baseProduct, ProductDto productDto){
        Product product = baseProduct;
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setAmount(productDto.getAmount());
        product.setValue(productDto.getValue());

        return product;
    }

}
