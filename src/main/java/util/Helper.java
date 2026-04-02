package util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {
    public static boolean isEmptyOrNull(String string){
            return (string == null || string.isEmpty());
    }
    public static String generateId(String string){
        return UUID.randomUUID().toString();
    }
    public static boolean isValidEmail(String string){
        EmailValidator validator = EmailValidator.getInstance();
        return !validator.isValid(string);
    }
}
