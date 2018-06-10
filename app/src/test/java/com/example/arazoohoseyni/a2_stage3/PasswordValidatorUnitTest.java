package com.example.arazoohoseyni.a2_stage3;
//adding new requirementsfor stage 2
// ARAZOO HOSEYNI June 9th, 2018
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class PasswordValidatorUnitTest {
  @Test
  public void addition_isCorrect() {
    assertEquals(4, 2 + 2);
  }


  static String WeakPassword1 = "password";
  static String WeakPassword2 = "PASSWORD";
  static String WeakPassword3 = "1234567";
  static String WeakPassword4 = "QWert!yu";
  static String WeakPassword5 = "Qwerty1233";
  static String StrongPassword = "@pp1Ebottom";

  static Validator validator;

  @BeforeClass
  public static void setup() {
    validator = new Validator();
  }

  @Test
  public void WeakPassword1IsWeak() {
    //if the password entered is password then return false
    assertFalse(validator.validate(WeakPassword1));
  }

  @Test
  public void WeakPassword2IsWeak() {
    //making it case insensitve, so even if PASSWORD cap is put in it still fails.
    assertFalse(validator.validate(WeakPassword2));
  }

  @Test
  public void WeakPassword3IsWeak() {
    //must have 8 char, else false
    assertFalse(validator.validate(WeakPassword3));
  }

  @Test
  public void WeakPassword4IsWeak() {
    //rrequired one number
    assertFalse(validator.validate(WeakPassword4));
  }

  @Test
  public void WeakPassword5IsWeak() {
    //missing special CHAR
    assertFalse(validator.validate(WeakPassword5));
  }


  @Test
  public void StrongPasswordIsStrong() {
    //strong passwrd.. PASS
    assertTrue(validator.validate(StrongPassword));

  }
}