/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crudservlet;

import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author 1122159
 */
public class SaveServletTest {
    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;
    @Mock
    RequestDispatcher rd;
    
    public SaveServletTest() {
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
     * Test of doPost method, of class SaveServlet.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
         StringWriter stringWriter = new StringWriter();
         PrintWriter writer = new PrintWriter(stringWriter);
         when(response.getWriter()).thenReturn(writer);
         when(request.getParameter("isbn")).thenReturn("7777777778888888998888");
         when(request.getParameter("title")).thenReturn("title");
         when(request.getParameter("author")).thenReturn("author");
         when(request.getParameter("type")).thenReturn("E");
         when(request.getRequestDispatcher("index.html")).thenReturn(rd);
        SaveServlet instance = new SaveServlet();
        instance.doPost(request, response);
    }
}