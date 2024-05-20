package org.example.completeendtoenddailycodework.registration.password;

import org.springframework.stereotype.Service;

public interface IPasswordResetTokenService {

    String validatePasswordResetToken(String theToken);
}
