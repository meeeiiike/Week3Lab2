package ie.atu.lab2;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    List<Product> productList = new ArrayList<>();

    @GetMapping("/viewAllProducts")
    public List<Product> viewAllProducts(){

        return productList;
    }

    @PostMapping("/addSingleProduct")
    public Product addSingleProduct(@Valid @RequestBody Product product){
        productList.add(product);
        return product;
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@Valid @RequestBody List<Product> products){
        productList.addAll(products);
        return productList;
    }

    @GetMapping("/countProducts")
    public int countProducts(){
        return productList.size();
    }

}