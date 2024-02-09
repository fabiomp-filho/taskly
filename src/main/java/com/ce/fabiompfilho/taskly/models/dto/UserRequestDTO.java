package com.ce.fabiompfilho.taskly.models.dto;

import com.ce.fabiompfilho.taskly.enums.RoleEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequestDTO {

    @Size(message = "username must have a max of 20 chars", max = 20)
    @NotEmpty(message = "field username can't be empty")
    private String username;
    @Size(message = "password must have a max of 255 chars", max = 255)
    @NotEmpty(message = "field password can't be empty")
    private String password;
    @Email(message = "field email need a valid email")
    private String email;
    @NotEmpty(message = "field firstName can't be empty")
    private String firstName;
    @NotEmpty(message = "field lastName can't be empty")
    private String lastName;
    @NotEmpty(message = "field role can't be empty")
    private RoleEnum role;

}
