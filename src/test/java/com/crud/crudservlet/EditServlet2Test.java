/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crudservlet;

import java.io.PrintWriter;
import java.io.StringWriter;
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
public class EditServlet2Test {
    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;
    
    public EditServlet2Test() {
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
     * Test of doPost method, of class EditServlet2.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        when(request.getParameter("isbn")).thenReturn("7766885577");
        when(request.getParameter("title")).thenReturn("title444444444");
        when(request.getParameter("author")).thenReturn("author22");
        when(request.getParameter("type")).thenReturn("E");
        
        EditServlet2 instance = new EditServlet2();
        instance.doPost(request, response);
    }
}