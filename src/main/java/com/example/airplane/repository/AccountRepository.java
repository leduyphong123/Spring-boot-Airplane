package com.example.airplane.repository;

import com.example.airplane.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {
    Account findByEmail (String email);
}
