package com.vi.users.user.service;


import com.vi.users.signup.beans.UserEntityBean;
import com.vi.users.signup.dto.ListOfUsersResponseDTO;

/**
 * Created by Ashok Kumar N
 * on 28/03/20.
 */
public interface UserService {

    public ListOfUsersResponseDTO save(UserEntityBean user);

}
