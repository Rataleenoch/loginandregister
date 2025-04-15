/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public class Validator {

    public static boolean isValidUsername(String username) {
        return username.length() >= 5 && username.contains("_");
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()_\\-{}:;.,<>/].*");

        return hasUpperCase && hasNumber && hasSpecialChar;
    }
}
    public class ValidatorTest {

    // --- Username Validation Tests ---

    @Test
    public void testValidUsername_withUnderscoreAndFiveChars() {
        assertTrue(Validator.isValidUsername("user_"));
    }

    @Test
    public void testValidUsername_withUnderscoreAndLongerName() {
        assertTrue(Validator.isValidUsername("john_doe"));
    }

    @Test
    public void testInvalidUsername_tooShort() {
        assertFalse(Validator.isValidUsername("usr_"));
    }

    @Test
    public void testInvalidUsername_noUnderscore() {
        assertFalse(Validator.isValidUsername("username"));
    }

    // --- Password Validation Tests ---

    @Test
    public void testValidPassword() {
        assertTrue(Validator.isValidPassword("Passw0rd!"));
    }

    @Test
    public void testInvalidPassword_tooShort() {
        assertFalse(Validator.isValidPassword("P0!a"));
    }

    @Test
    public void testInvalidPassword_noUppercase() {
        assertFalse(Validator.isValidPassword("password1!"));
    }

    @Test
    public void testInvalidPassword_noDigit() {
        assertFalse(Validator.isValidPassword("Password!"));
    }

    @Test
    public void testInvalidPassword_noSpecialChar() {
        assertFalse(Validator.isValidPassword("Password1"));
    }

    @Test
    public void testInvalidPassword_noUppercaseNoDigitNoSpecialChar() {
        assertFalse(Validator.isValidPassword("password"));
    }
}
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isValidUsername method, of class Login.
     */
    @Test
    public void testIsValidUsername() {
        System.out.println("isValidUsername");
        String username = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.isValidUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPassword method, of class Login.
     */
    @Test
    public void testIsValidPassword() {
        System.out.println("isValidPassword");
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.isValidPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chkLogin method, of class Login.
     */
    @Test
    public void testChkLogin() {
        System.out.println("chkLogin");
        String username = "";
        String password = "";
        Login instance = new Login();
        instance.chkLogin(username, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
