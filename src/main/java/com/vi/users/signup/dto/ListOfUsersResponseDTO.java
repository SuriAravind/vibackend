package com.vi.users.signup.dto;

import com.vi.jpautils.AuditModel;
import com.vi.users.user.entity.UsersEntity;
import lombok.*;


@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class ListOfUsersResponseDTO extends AuditModel {

    private UsersEntity userModelResponseDTOList;
    private Boolean paginationRequired;
    private Long totalUsers;

}
