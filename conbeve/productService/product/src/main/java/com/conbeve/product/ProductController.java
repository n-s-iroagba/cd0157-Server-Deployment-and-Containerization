package com.conbeve.product;
import com.conbeve.product.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {
    private CategoryService categoryService;
    @Autowired 
    ProductController(CategoryService categoryService){
        this.categoryService=categoryService;
    }


    @GetMapping("/categories/{id}")
    public Iterable <Product>getProducts(){
        return categoryService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Iterable <Product>getProductDetails(){
        return productService.getProducts();
    }

    @PostMapping("/products")
     void postProducts(){
        return productService.saveProduct();
     }

    @DeleteMapping("/product/{id}")
       void deleteProducts(){
        return productService.deleteProduct();
    }
    @PutMapping("/products")
     void updateProduct(){
        return productService.updateProduct();
    }
}


