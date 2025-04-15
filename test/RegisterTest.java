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
public class RegisterTest {

public class Validator {

    public static boolean isValidUsername(String username) {
        return username.length() >= 5 && username.contains("_");
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) return false;

        boolean hasUpperCase = password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()_\\-{}:;.,<>/].*");

        return hasUpperCase && hasNumber && hasSpecialChar;
    }

    public static boolean isValidPhone(String phnNum) {
        String saCode = "+27";
        if (phnNum.length() != 12 || !phnNum.startsWith(saCode)) return false;

        String rest = phnNum.substring(3);
        if (!rest.matches("\\d{9}")) return false;

        int fourthDigit = Character.getNumericValue(phnNum.charAt(3));
        return fourthDigit >= 6 && fourthDigit <= 8;
    }
}
public class ValidatorTest {

    @Test
    public void testValidUsername() {
        assertTrue(Validator.isValidUsername("user_"));
        assertFalse(Validator.isValidUsername("usr"));           // Too short
        assertFalse(Validator.isValidUsername("user1"));         // No underscore
    }

    @Test
    public void testValidPassword() {
        assertTrue(Validator.isValidPassword("Passw0rd!"));      // Valid
        assertFalse(Validator.isValidPassword("passw0rd"));      // No uppercase
        assertFalse(Validator.isValidPassword("PASSWORD!"));     // No digit
        assertFalse(Validator.isValidPassword("Passw0rd"));      // No special char
        assertFalse(Validator.isValidPassword("Pa1!"));          // Too short
    }

    @Test
    public void testValidPhone() {
        assertTrue(Validator.isValidPhone("+27812345678"));      // Valid
        assertFalse(Validator.isValidPhone("+27512345678"));     // Fourth digit < 6
        assertFalse(Validator.isValidPhone("0821234567"));       // Missing +27
        assertFalse(Validator.isValidPhone("+2781234abc8"));     // Letters in number
        assertFalse(Validator.isValidPhone("+278123456"));       // Too short
    }
}

    public RegisterTest() {
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
     * Test of isValidPhone method, of class Register.
     */
    @Test
    public void testIsValidPhone() {
        System.out.println("isValidPhone");
        String phnNum = "";
        Register instance = new Register();
        boolean expResult = false;
        boolean result = instance.isValidPhone(phnNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidUsername method, of class Register.
     */
    @Test
    public void testIsValidUsername() {
        System.out.println("isValidUsername");
        String username = "";
        Register instance = new Register();
        boolean expResult = false;
        boolean result = instance.isValidUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidPassword method, of class Register.
     */
    @Test
    public void testIsValidPassword() {
        System.out.println("isValidPassword");
        String password = "";
        Register instance = new Register();
        boolean expResult = false;
        boolean result = instance.isValidPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chkRegister method, of class Register.
     */
    @Test
    public void testChkRegister() {
        System.out.println("chkRegister");
        String username = "";
        String password = "";
        String phnNum = "";
        Register instance = new Register();
        instance.chkRegister(username, password, phnNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Register.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Register.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Login method, of class Register.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        Register instance = new Register();
        instance.Login();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
