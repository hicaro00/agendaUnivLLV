package com.lizana.user_management.infrastructure.ports;

import com.lizana.user_management.domain.models.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository <User, String >{
}
