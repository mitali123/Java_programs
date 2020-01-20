/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author phapa
 */
public class Validation {
    public static Boolean isEmptyOrNull(String value) {
        if (value == null || value.isEmpty()) {
            return true;
        }
        return false;
    }

    public static Boolean usernameValidation(String value) {
        if (isEmptyOrNull(value)) {
            return false;
        } else {
            Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
            Matcher m = p.matcher(value);
            return m.matches();
        }
    }
    
    public static Boolean passwordValidation(String value) {
        if(isEmptyOrNull(value)){
            return false;
        }
        else {
            Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$");
            Matcher m = p.matcher(value);
            return m.matches();
        }
    }
}
