package ie.atu.lab2;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    @NotBlank
    @Size(min = 1, max = 50, message = "must be between 3 and 50 chars")
    private String name;
    @NotNull // says primitives cannot be annotated but clearly can? unusre why giving warning
    @Positive
    @DecimalMin(value = "0.01", message = "price must be at least 0.01")
    private double price;

}