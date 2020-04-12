package com.vi.users.user;

import com.vi.users.group.entity.UserGroupEntity;
import com.vi.users.group.repository.GroupEntityRepository;
import com.vi.users.signup.beans.UserEntityBean;
import com.vi.users.signup.dto.ListOfUsersResponseDTO;
import com.vi.users.user.entity.UsersEntity;
import com.vi.users.user.repository.UsersEntityRepository;
import com.vi.users.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Ashok Kumar N
 * on 28/03/20.
 */
@Service
public class UserServiceImpl implements UserService {

    final
    UsersEntityRepository userRepository;

    final
    GroupEntityRepository groupEntityRepository;


    public UserServiceImpl(UsersEntityRepository userRepository, GroupEntityRepository groupEntityRepository) {
        this.userRepository = userRepository;
        this.groupEntityRepository = groupEntityRepository;
    }

    public ListOfUsersResponseDTO save(UserEntityBean user) {
        ListOfUsersResponseDTO lusers = null;

        UsersEntity users = new UsersEntity();
        users.setEmail(user.getEmail());
        users.setFirstName(user.getFirstName());
        users.setLastName(user.getLastName());
        users.setPassword(user.getPassword());
        UserGroupEntity userGroupEntity = groupEntityRepository.findByName(user.getUserGroup());
        users.setUserGroupEntity(userGroupEntity);
        UsersEntity usersEntity = userRepository.save(users);

        lusers = lusers.builder().userModelResponseDTOList(usersEntity).paginationRequired(false)
                .totalUsers(1L).build();
        return lusers;
    }

}
