package com.venky.repo;

import org.springframework.data.repository.CrudRepository;

import com.venky.model.Amazon;

public interface AmazonRepo extends CrudRepository<Amazon, Integer> {

}
