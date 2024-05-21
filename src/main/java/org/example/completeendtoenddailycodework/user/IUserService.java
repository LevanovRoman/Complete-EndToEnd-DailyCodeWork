package org.example.completeendtoenddailycodework.user;

import org.example.completeendtoenddailycodework.registration.RegistrationRequest;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> getAllUser();

    User registerUser(RegistrationRequest registrationRequest);

    User findByEmail(String email);

    Optional<User> findById(Long id);

    void updateUser(Long id, String firstName, String lastName, String email);

    void deleteUser(Long id);
}
