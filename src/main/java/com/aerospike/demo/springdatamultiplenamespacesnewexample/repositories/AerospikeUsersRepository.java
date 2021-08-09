package com.aerospike.demo.springdatamultiplenamespacesnewexample.repositories;

import com.aerospike.demo.springdatamultiplenamespacesnewexample.annotations.UsersRepository;
import com.aerospike.demo.springdatamultiplenamespacesnewexample.objects.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;

@UsersRepository
public interface AerospikeUsersRepository extends AerospikeRepository<User, Object> {
}
