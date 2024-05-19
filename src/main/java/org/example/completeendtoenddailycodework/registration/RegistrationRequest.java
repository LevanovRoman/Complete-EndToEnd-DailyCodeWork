package org.example.completeendtoenddailycodework.registration;

import lombok.Data;
import org.example.completeendtoenddailycodework.user.Role;

import java.util.Collection;

@Data
public class RegistrationRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Collection<Role> roles;
}
