package com.hibernatemapping.hibernatemapping.repo;

import com.hibernatemapping.hibernatemapping.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
}
