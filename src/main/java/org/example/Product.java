package org.example;



import lombok.Getter;

import java.util.ArrayList;

import java.util.List;


@Getter
public class Product {
    private String name;
    private List<Product> composition;

    public Product(String name) {
        this.name = name;
        this.composition = new ArrayList<>();
    }



    public boolean addComponent(Product component) {
        if (component == this || isRecursiveComponent(component)) {
            return false;
        }
        return composition.add(component);
    }

    private boolean isRecursiveComponent(Product component) {
        for (Product p : component.composition) {
            if (p == this || isRecursiveComponent(p)) {
                return true;
            }
        }
        return false;
    }
}

