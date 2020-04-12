package com.vi.users.user.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vi.jpautils.AuditModel;
import com.vi.users.group.entity.UserGroupEntity;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class UsersEntity extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userid;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password")
    @Transient
    private String password;

    @Column(name = "first_name")
    @NotEmpty(message = "Please provide your first name")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "Please provide your last name")
    private String lastName;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "group_id")
    private UserGroupEntity userGroupEntity ;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserGroupEntity getUserGroupEntity() {
        return userGroupEntity;
    }

    public void setUserGroupEntity(final UserGroupEntity userGroupEntity) {
        this.userGroupEntity = userGroupEntity;
    }
}
