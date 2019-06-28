package com.transire.lojavirtual.dto;

import com.transire.lojavirtual.model.Product;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ProductDto {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private BigDecimal value;

    @NotNull
    private String description;

    @NotNull
    private String url;

    public ProductDto(String name, BigDecimal value, String description, Integer amount, String url){
        this.name = name;
        this.value = value;
        this.description = description;
        this.url = url;
    }

    public ProductDto(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.value = product.getValue();
        this.description = product.getDescription();
        this.url = product.getUrl();
    }
}
