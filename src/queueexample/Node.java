/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

/**
 *
 * @author ethornbury
 */
public class Node<T> {
    
    T element;
    Node<T> next;
    
    
    public Node(T elem, Node<T> next){
        this.element = elem;
        this.next = next;
    }
    
    public Node(T elem){
        this(elem, null);
       
    }
    
    @Override
    public String toString(){
        return element.toString();
    }
    
    
}
