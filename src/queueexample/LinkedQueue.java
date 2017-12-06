/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

import java.util.Iterator;

/**
 *
 * @author ethornbury
 * @param <T>
 */
public class LinkedQueue<T> implements Queue<T>, Iterable<T> {
    
    private Node<T> first;
    private Node<T> last;
    
    public LinkedQueue(){
        first = null;
        last = null;
    }

    @Override
    public void enqueue(T elem) {
        Node<T> prevlast = last;
        last = new Node<>(elem);
        if(isEmpty()){
            first = last;           
        }
        else{
            prevlast.next = last;
        }
    }

    @Override
    public T dequeue() {
       if(isEmpty()){
           throw new EmptyQueueException();
       }
       T elem = first.element;
       first = first.next;
       if(isEmpty()){
           last = null;
       }
       return elem;
    }

    @Override
    public boolean isEmpty() {
      return first == null;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new EmptyQueueException();
        }
        return first.element;
    }

    @Override
    public int size() {
        int size = 0;
        
        Node<T> current = first;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }
    
    public Iterator<T> iterator(){
        return new LinkedQueueIterator(first);
    }
    
    private class LinkedQueueIterator implements Iterator<T>{
        Node<T> current;
        
        public LinkedQueueIterator(Node<T> first){
            current = first;
        }
        
        public boolean hasNext(){
            return current != null;
        }
        
        public T next(){
            T elem = current.element;
            current = current.next;
            return elem;
        }
    }
    
    
    
    
}
