package com.vi.users.group.repository;

import com.vi.users.group.entity.UserGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ashok Kumar N
 * on 29/02/20.
 */

@Repository
public interface GroupEntityRepository extends JpaRepository<UserGroupEntity, Long> {
     UserGroupEntity findByName(String name);
     List<UserGroupEntity> findAllByNameIn(List<String> names);
     UserGroupEntity findById(int id);
}
