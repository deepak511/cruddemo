/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crudservlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author 1122159
 */
public class DeleteServletTest {
    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;
    
    public DeleteServletTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of doGet method, of class DeleteServlet.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        when(request.getParameter("isbn")).thenReturn("77777777");
        DeleteServlet instance = new DeleteServlet();
        instance.doGet(request, response);
    }
}