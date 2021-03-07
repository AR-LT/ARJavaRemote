package basics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestAnnotation {


    @BeforeAll
    public static void setUp() {
        System.out.println("This message will be displayed once before executing all test methods ");
    }

    @BeforeEach
    public void init() {
        System.out.println("This message will be show before each test method");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("This message will be displayed once after executing all test methods ");
    }

    @AfterEach
    public void tear() {
        System.out.println("This message will be show after each test method");
    }

    @Test
    // bus rasomas testavimo metodas, tokiu metodu gali buti daug
    public void firstTest() {
        System.out.println("Executing first test ... ");
    }

    @Test
    public void secondTest() {
        System.out.println("Executing second test ... ");
    }

    @Test
    @DisplayName("Testo pavadinimas")
    public void thirdTest() {
        System.out.println("Executing third test ... ");
    }

    @Test
    @Disabled
    public void fourthTest() {
        System.out.println("Executing fourth test ... ");
    }
}


