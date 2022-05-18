package com.tectoro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.Model.Users;
@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
