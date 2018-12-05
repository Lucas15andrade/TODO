/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.IListaDaoImp;
import interfaces.IListaDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Lista;

/**
 *
 * @author lucas
 */
@ManagedBean
@SessionScoped
public class Todo {

    List<Lista> lista;
    Lista listaConteduo;

    public Todo() {
        listaConteduo = new Lista();
        //IListaDao ld = new IListaDaoImp();
        //lista = ld.listAll();
        lista = new ArrayList<>();
    }

    public Todo(List<Lista> lista) {
        this.lista = lista;
    }

    public Lista getListaConteduo() {
        return listaConteduo;
    }

    public void setListaConteduo(Lista listaConteduo) {
        this.listaConteduo = listaConteduo;
    }

    public List<Lista> getLista() {
        IListaDao ld = new IListaDaoImp();
        this.lista = ld.findAll();
        return lista;
    }

    public void setLista(List<Lista> lista) {
        this.lista = lista;
    }

    public void salvar() {
        //System.out.println("Conteudo da lista: "+listaConteduo.getConteudo());
        IListaDao ld = new IListaDaoImp();
        if (listaConteduo.getConteudo() != null && listaConteduo.getConteudo() != "") {

            ld.save(this.listaConteduo);
        }
        listaConteduo = new Lista();
    }

    public void deletar(Lista listaDeletar) {
        IListaDao ld = new IListaDaoImp();
        System.out.println("Entrou no deletar");
        ld.delete(listaDeletar);
    }

    public void editar(Lista listaEditar) {
        //System.out.println("Entrou no editar");
        this.listaConteduo = listaEditar;
        //IListaDao ld = new IListaDaoImp();

    }
}
