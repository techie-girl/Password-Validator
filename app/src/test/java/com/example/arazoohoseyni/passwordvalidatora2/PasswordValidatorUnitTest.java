package com.example.arazoohoseyni.passwordvalidatora2;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordValidatorUnitTest {
    static String WeakPassword1 = "password";
    static String WeakPassword2 = "PASSWORD";
    static String WeakPassword3 = "1234567";
    static String StrongPassword = "@pp1Ebottom";

    static Validator validator;

    @BeforeClass
    public static void setup()
    {
        validator = new Validator();
    }

    @Test
    public void WeakPassword1IsWeak()
    {
        //if the password entered is password then return false
        assertFalse(validator.validate(WeakPassword1));
    }

    @Test
    public void WeakPassword2IsWeak()
    {
        //making it case insensitve, so even if PASSWORD cap is put in it still fails.
        assertFalse(validator.validate(WeakPassword2));
    }

    @Test
    public void WeakPassword3IsWeak()
    {
        //must have 8 char, else false
        assertFalse(validator.validate(WeakPassword3));
    }

    @Test
    public void StrongPasswordIsStrong()
    {
        //last test to pass with all requirements. :)
        assertTrue(validator.validate(StrongPassword));
    }
}
