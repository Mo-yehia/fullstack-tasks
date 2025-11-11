package main.com.myApp.model;


import lombok.*;
import main.com.myApp.validation.PasswordMatches;

import javax.validation.constraints.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@PasswordMatches
public class UserModel {

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email format")
    @Pattern(regexp = ".+@.+\\..+", message = "Email must contain a valid domain (e.g. .com, .net)")
    private String email;

    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @NotBlank(message = "Please confirm your password")
    private String confirmPassword;

}
