package com.aerospike.demo.springdatamultiplenamespacesnewexample.repositories;

import com.aerospike.demo.springdatamultiplenamespacesnewexample.annotations.ProductsRepository;
import com.aerospike.demo.springdatamultiplenamespacesnewexample.objects.Product;
import org.springframework.data.aerospike.repository.AerospikeRepository;

@ProductsRepository
public interface AerospikeProductsRepository extends AerospikeRepository<Product, Object> {
}
