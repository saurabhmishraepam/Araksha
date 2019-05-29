package com.epam.araksa.repository;

import com.epam.araksa.dto.LogTime;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeLoginTimeRepository extends MongoRepository<LogTime, String> {
}
