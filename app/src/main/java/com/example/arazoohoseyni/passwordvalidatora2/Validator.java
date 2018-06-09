package com.example.arazoohoseyni.passwordvalidatora2;

public class Validator {
    private boolean valid;
    private String password;

    public boolean validate(String password){
        valid = true;
        this.password = password;
        if (password.toLowerCase().equals("password")){
            valid = false;
        }
        if (password.length() < 8){
            valid = false;
        }
        return valid;
    }
}