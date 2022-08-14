package com.conbeve.product;

@Service
public class CategoryService {
     Iterable<Product>getProducts(int id){
        return this.productRepository.findById(id);
     }
}
//define product repository
