package org.example.completeendtoenddailycodework.registration.password;

import org.example.completeendtoenddailycodework.user.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IPasswordResetTokenService {

    String validatePasswordResetToken(String theToken);

    Optional<User> findUserByPasswordResetToken(String theToken);

    void resetPassword(User theUser, String password);

    void createPasswordResetTokenForUser(User user, String passwordResetToken);
}
