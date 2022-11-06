package com.hibernatemapping.hibernatemapping;

import com.hibernatemapping.hibernatemapping.entity.Product;
import com.hibernatemapping.hibernatemapping.repo.ProductRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateMappingApplicationTests {

	@Autowired
	ProductRepo productRepo;

	@Test
	void contextLoads() {
	}


	@Test
	void createProduct() {

		Product product = new Product("phone","great phone");

		productRepo.save(product);

	}
}
