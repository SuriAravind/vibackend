package com.vi.users.user.repository;

import com.vi.users.user.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Ashok Kumar N
 * on 29/02/20.
 */

@Repository
public interface UsersEntityRepository extends JpaRepository<UsersEntity, Long> {
    Optional<UsersEntity> findByEmail(String email);
}
