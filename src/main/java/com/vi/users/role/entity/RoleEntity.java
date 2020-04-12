package com.vi.users.role.entity;

import com.vi.jpautils.AuditModel;
import com.vi.users.group.entity.UserGroupEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 * Created by Ashok Kumar N
 * on 29/02/20.
 */

@Entity
@Table(name = "USER_ROLE")
public class RoleEntity extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Column(columnDefinition = "VARCHAR (300)",unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private UserGroupEntity userGroupEntity;



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

    public UserGroupEntity getUserGroupEntity() {
        return userGroupEntity;
    }

    public void setUserGroupEntity(final UserGroupEntity userGroupEntity) {
        this.userGroupEntity = userGroupEntity;
    }

}
