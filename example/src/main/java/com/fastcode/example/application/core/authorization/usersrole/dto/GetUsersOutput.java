package com.fastcode.example.application.core.authorization.usersrole.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetUsersOutput {

    private String firstname;
    private Boolean isactive;
    private String emailaddress;
    private String lastname;
    private String password;
    private Boolean isemailconfirmed;
    private Long id;
    private String username;
    private Long usersroleRoleId;
    private Long usersroleUsersId;
}