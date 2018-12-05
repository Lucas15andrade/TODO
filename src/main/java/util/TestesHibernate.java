/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.IListaDaoImp;
import interfaces.IListaDao;
import model.Lista;



/**
 *
 * @author lucas
 */
public class TestesHibernate {
    
    public static void main (String args[]){
        
//            Professor p = new Professor();
//            p.setNome("Andrade");
//            p.setEmail("andrade@gmail.com");
//            p.setTelefone("9999999");
//            p.setAreaFormacao("formado");
//            p.setDepartamento("depto");
//            p.setProjeto(null);
//            IProfessorDao pdao = new ProfessorDaoImp();
//            pdao.save(p);
            
            
            Lista lista = new Lista();
            lista.setConteudo("Deletar");
            IListaDao ld = new IListaDaoImp();
            ld.save(lista);
            ld.delete(lista);
            
            System.exit(0);
        
    }
    
}
