package com.crud.operation.springbootbackend.repository;

import com.crud.operation.springbootbackend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Employee, Integer> {

}
