package com.vi.users.group.entity;

import com.vi.jpautils.AuditModel;
import com.vi.users.role.entity.RoleEntity;
import com.vi.users.user.entity.UsersEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

/**
 * Created by Ashok Kumar N
 * on 29/02/20.
 */

@Entity
@Table(name = "USER_GROUP")
public class UserGroupEntity extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotEmpty
    @Column(columnDefinition = "VARCHAR (300)",unique = true)
    private String name;

    @OneToMany(mappedBy = "userGroupEntity")
    private Set<RoleEntity> roles;


    @OneToMany(mappedBy = "userGroupEntity")
    private Set<UsersEntity> usersEntity ;


    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(final Set<RoleEntity> roles) {
        this.roles = roles;
    }

    public Set<UsersEntity> getUsersEntity() {
        return usersEntity;
    }

    public void setUsersEntity(final Set<UsersEntity> usersEntity) {
        this.usersEntity = usersEntity;
    }
}
