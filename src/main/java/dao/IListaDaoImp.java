/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IListaDao;
import java.util.List;
import model.Lista;

/**
 *
 * @author lucas
 */
public class IListaDaoImp extends GenericDaoImpl<Lista, Integer> implements IListaDao{

    public IListaDaoImp() {
        super(Lista.class);
    }
    
}
