package com.MongoDBtest.Repoitory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoDBtest.Model.Students;

public interface StudentsRepository extends MongoRepository<Students, Integer> {

}
