/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.crudservlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author 1122159
 */

//@RunWith(PowerMockRunner.class)
@RunWith(MockitoJUnitRunner.class)
public class TitleDaoTest extends TestCase {
    
    
    @Mock
    private Connection c;
    @Mock
    private PreparedStatement stmt;
    @Mock
    private ResultSet rs;
    @InjectMocks
    TitleDao titleDao;
    TitleDaoTest titleDaoTest;

    public TitleDaoTest() {
        
    }
    
    @Override
    protected void setUp() throws Exception {
        
        super.setUp();
        
        
        
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getConnection method, of class TitleDao.
     */
    public void testGetConnection() {
       
    }

    /**
     * Test of save method, of class TitleDao.
     */
   @Test
    public void testSave() throws SQLException{
        System.out.println("save");
        //when(c.prepareStatement(any(String.class))).thenReturn(stmt);
        //mockStatic(DriverManager.class);
        //expect(DriverManager.getConnection("jdbc:mysql://10.200.64.182:3306/testdb", "jacplus", "jac567"))
               // .andReturn(c);
        //expect(DriverManager.getConnection(null))
               // .andReturn(null);
        //replay(DriverManager.class);
        Title t = new Title();
        t.setIsbn("888888888888888");
        t.setTitle("kkkkkk");
        t.setAuthor("aaaa");
        t.setType("E");
        int expResult = 1;
        int result = TitleDao.save(t);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class TitleDao.
     */
   @Test
    public void testUpdate() {
        System.out.println("update");
        Title t = new Title();
        t.setIsbn("test");
        t.setTitle("aaaaaaaaaaaaaaaaaa");
        t.setAuthor("kkkkkkkkkkkkkk");
        t.setType("E");
        int expResult = 1;
        int result = TitleDao.update(t);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class TitleDao.
     */
   @Test
    public void testDelete() {
        System.out.println("delete");
        String isbn = "1222111131";
        int expResult = 1;
        int result = TitleDao.delete(isbn);
        assertEquals(expResult, result);
    }

    /**
     * Test of gettitleByIsbn method, of class TitleDao.
     */
   @Test
    public void testGettitleByIsbn() {
        System.out.println("gettitleByIsbn");
        String isbn = "ww11221133";
        Title expResult = new Title();
        expResult.setIsbn("ww11221133");
        expResult.setTitle("sssssssddddddddd");
        expResult.setAuthor("ssssssdddddddddddd");
        expResult.setType("G");
        Title result = TitleDao.gettitleByIsbn(isbn);
        assertEquals(expResult.getIsbn(), result.getIsbn());
    }

    /**
     * Test of getAllEmployees method, of class TitleDao.
     */
   //@Test
    public void testGetAllTitles() {
        System.out.println("getAllEmployees");
        List expResult = null;
        List result = TitleDao.getAllTitles();
        assertEquals(expResult, result);
    }
}
