package com.vi.users.signup.controller;

import com.vi.users.signup.Utility.MapBuilder;
import com.vi.users.signup.beans.UserEntityBean;
import com.vi.users.signup.dto.ListOfUsersResponseDTO;
import com.vi.users.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/users")
public class RegisterController {

    final
    UserService userService;

    public RegisterController(final UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public Map<String, ListOfUsersResponseDTO> addUser(@RequestBody UserEntityBean user) {

        final ListOfUsersResponseDTO users = userService.save(user);
        return MapBuilder.of("Users", users);

    }

}
