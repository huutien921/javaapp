/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.List;

/**
 *
 * @author ACER
 */
public interface GennericDAO<T,E,K> {
    T insert(E e);
    T update(E e);
    T delete(K k);
    List<E> findAll();
    E find(K k);
    
}
