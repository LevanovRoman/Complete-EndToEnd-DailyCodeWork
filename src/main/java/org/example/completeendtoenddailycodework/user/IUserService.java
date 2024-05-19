package org.example.completeendtoenddailycodework.user;

import org.example.completeendtoenddailycodework.registration.RegistrationRequest;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> getAllUser();

    User registerUser(RegistrationRequest registrationRequest);

    User findByEmail(String email);
}
