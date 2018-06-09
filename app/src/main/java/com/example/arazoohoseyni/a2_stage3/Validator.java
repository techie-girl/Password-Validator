package com.example.arazoohoseyni.a2_stage3;
/* References: https://howtodoinjava.com/regex/how-to-build-regex-based-password-validator-in-java/
https://memorynotfound.com/custom-password-constraint-validator-annotation/
ARAZOO HOSEYNI June 9th
*/

    public boolean validate(String password){
        this.password = password;
        //length of pasword = 8 +
        if (password.length() < 8){
            valid = false;
            message = message.concat("\nPassword is not long enough, must be 8 chars +");
        }
        //password must no be "password"making it case insensitve, so even if PASSWORD cap is put in it still fails.
        if (password.toLowerCase().equals("password")){
            valid = false;
            message = message.concat("\nTje passowrd cannot be the word password");
        }
        //at least one digit is required
        if (!password.matches(".*\\d+.*")){
            valid = false;
            message = message.concat("\nUse numbers(1-9)");
        }
        //at least one special character is required
        if (password.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            message = message.concat("\nyour passowrd is missing the use of special characters");
        }
        return valid;
    }

    public String printMessage(){
        return message;
    }
}
