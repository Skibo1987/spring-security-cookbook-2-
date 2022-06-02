package com.flamexander.spring.security.cookbook.dao.repositories;

import com.flamexander.spring.security.cookbook.dao.entities.Write;
import org.springframework.data.repository.CrudRepository;

public interface WriteRepository extends CrudRepository<Write, Long> {
}
