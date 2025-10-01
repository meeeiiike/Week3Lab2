package ie.atu.lab2;

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
    public Product addSingleProduct(@RequestBody Product product){
        productList.add(product);
        return product;
    }
}
