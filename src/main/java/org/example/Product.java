package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;


@Getter
public class Product {
    private String name;
    private List<Product> composition;
    private Set<Product> visited;

    public Product(String name) {
        this.name = name;
        this.composition = new ArrayList<>();
        this.visited = new HashSet<>();
    }

    public boolean addComponent(Product component) {
        if (component == this || isRecursiveComponent(component)) {
            return false;
        }
        return composition.add(component);
    }

    private boolean isRecursiveComponent(Product component) {
        visited.clear();
        return isRecursiveComponentHelper(component);
    }

    private boolean isRecursiveComponentHelper(Product component) {
        if (visited.contains(component)) {
            return true;
        }
        visited.add(component);

        for (Product p : component.composition) {
            if (p == this || isRecursiveComponentHelper(p)) {
                return true;
            }
        }
        return false;
    }
}

