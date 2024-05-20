package org.example.completeendtoenddailycodework.registration.password;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PasswordResetTokenService implements IPasswordResetTokenService{

    private final PasswordResetTokenRepository passwordResetTokenRepository;

    @Override
    public String validatePasswordResetToken(String theToken) {

        Optional<PasswordResetToken> passwordResetToken = passwordResetTokenRepository.findByToken(theToken);
        if (passwordResetToken.isEmpty()) {
            return "invalid";
        }
        Calendar calendar = Calendar.getInstance();
        if ((passwordResetToken.get().getExpirationTime().getTime() - calendar.getTime().getTime()) <= 0) {
            return "expired";
        }
        return "valid";
    }
}