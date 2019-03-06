/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crudservlet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1122159
 */
public class TitleTest {
    Title instance;
    public TitleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        instance = new Title();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIsbn method, of class Title.
     */
    @Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        instance.setIsbn("556655");
        String expResult = "556655";
        String result = instance.getIsbn();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIsbn method, of class Title.
     */
    @Test
    public void testSetIsbn() {
        System.out.println("setIsbn");
        String isbn = "556655";
        instance.setIsbn(isbn);
    }

    /**
     * Test of getTitle method, of class Title.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        instance.setTitle("Title");
        String expResult = "Title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Title.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "Title";
        instance.setTitle(title);
    }

    /**
     * Test of getAuthor method, of class Title.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        instance.setAuthor("Author");
        String expResult = "Author";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAuthor method, of class Title.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "Author";
        Title instance = new Title();
        instance.setAuthor(author);
    }

    /**
     * Test of getType method, of class Title.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        instance.setType("G");
        String expResult = "G";
        String result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setType method, of class Title.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "E";
        instance.setType(type);
    }
}