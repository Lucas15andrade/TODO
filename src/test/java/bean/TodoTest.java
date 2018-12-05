/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.IListaDaoImp;
import interfaces.IListaDao;
import java.util.ArrayList;
import java.util.List;
import model.Lista;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class TodoTest {
    
    public TodoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListaConteduo method, of class Todo.
     */
    @Test
    public void testGetListaConteduo() {
        System.out.println("getListaConteduo");
        Todo instance = new Todo();
        Lista expResult = new Lista();
        Lista result = instance.getListaConteduo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaConteduo method, of class Todo.
     */
    @Test
    public void testSetListaConteduo() {
        System.out.println("setListaConteduo");
        Lista listaConteduo = new Lista();
        Todo instance = new Todo();
        instance.setListaConteduo(listaConteduo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLista method, of class Todo.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        Todo instance = new Todo();
        ArrayList expResult = new ArrayList<>();
        ArrayList result = (ArrayList) instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLista method, of class Todo.
     */
    @Test
    public void testSetLista() {
        System.out.println("setLista");
        List<Lista> lista = null;
        Todo instance = new Todo();
        instance.setLista(lista);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class Todo.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        Todo instance = new Todo();
        instance.salvar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deletar method, of class Todo.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        IListaDao ld = new IListaDaoImp();
        Lista listaDeletar = new Lista();
        System.out.println("OBJETO: "+listaDeletar.getConteudo());
        Todo instance = new Todo();
        instance.setListaConteduo(listaDeletar);
        instance.salvar();
        instance.deletar(listaDeletar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class Todo.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        Lista listaEditar = null;
        Todo instance = new Todo();
        instance.editar(listaEditar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
