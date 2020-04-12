package com.vi.users.role.repository;

import com.vi.users.role.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ashok Kumar N
 * on 29/02/20.
 */

@Repository
public interface RoleEntityRepository extends JpaRepository<RoleEntity, Long> {
    // Optional<IAServerEntity> findByTenant(String tenant);
}
