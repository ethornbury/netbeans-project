/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

/**
 *
 * @author ethornbury
 * @param <T>
 */
public interface Queue<T> {
    
    public void enqueue(T elem);
    
    public T dequeue();
    
    public boolean isEmpty();
    
    public T peek();
    
    public int size();
    
}
