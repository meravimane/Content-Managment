package com.contentMmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.contentMmanagement.model.Page;

public interface PageRepository extends MongoRepository<Page, String> {

}
