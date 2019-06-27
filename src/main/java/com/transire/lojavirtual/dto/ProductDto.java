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
    private Integer amount;

    public ProductDto(String name, BigDecimal value, String description, Integer amount){
        this.name = name;
        this.value = value;
        this.description = description;
        this.amount = amount;
    }

    public ProductDto(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.value = product.getValue();
        this.description = product.getDescription();
        this.amount = product.getAmount();
    }
}
