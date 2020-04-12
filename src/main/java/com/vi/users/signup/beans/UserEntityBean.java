package com.vi.users.signup.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class UserEntityBean {
    @NotEmpty(message = "Please provide your email")
    private String email;
    @NotEmpty(message = "Please provide your password")
    private String password;
    @NotEmpty(message = "Please provide your first name")
    private String firstName;
    @NotEmpty(message = "Please provide your last name")
    private String lastName;
    @NotEmpty(message = "Please provide UserGroupDetails")
    private String userGroup;
}
