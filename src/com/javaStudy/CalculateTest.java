package com.javaStudy;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	@BeforeClass
    public static void setUpBeforeClass() throws Exception {
         System.out.println("this is setUpBeforeClass()...");  
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
         System.out.println("this is tearDownAfterClass()...");  
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("this is setUp()...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("this is tearDown()...");
    }

    @Test
    public void testAdd() {
        System.out.println("this is testAdd()...");  
        int result = Calculate.add(2, 3);
        assertEquals("加法有问�?", 5, result);  
    }

    @Test
    public void testSubstract() {
        System.out.println("this is testSubstract()...");  
        int result = Calculate.substract(12, 2);
        assertEquals("减法有问�?", 10, result); 
    }

    @Test
    public void testMultiply() {
        int result = Calculate.multiply(2, 3);  
        assertEquals("乘法有问�?", 6, result);  
    }

    @Test
    public void testDivide() {
        int result = Calculate.divide(6,2);  
        assertEquals("除法有问�?", 3, result);  
    }

}
