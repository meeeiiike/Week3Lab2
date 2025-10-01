package ie.atu.lab2;

import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

public class Product {
    @NotBlank
    @Size(min = 1, max = 50, message = "must be between 3 and 50 chars")
    private String name;
    @NotNull // says primitives cannot be annotated but clearly can? unusre why giving warning
    @Positive
    @DecimalMin(value = "0.01", message = "price must be at least 0.01")
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
