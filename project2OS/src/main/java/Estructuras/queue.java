/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import Estructuras.node;

/**
 *
 * @author CMG
 */
public class queue<T> {
    private int size;
    private node front;
    private node tail;

    public queue() {
        this.size = 0;
        this.front = null;
        this.tail = null;
        
    }public queue(node node) {
        this.size = 1;
        this.front = node;
        this.tail = node;
    }
    public queue(node front, node tail) {
        this.size = 2;
        this.front = front;
        this.tail = tail;
    }
    
    public void encueueNode(node node){
        this.size++;
        if(isEmpty()){
            this.front = node;
            this.tail = node;        
        }else{
            this.tail.setpNext(node);
            this.tail = node;
        }
    }
    public void encueueData(T data){
    node node = new node(data);
    this.size++;
    if(isEmpty()){
        this.front = node;
        this.tail = node;        
    }else{
        this.tail.setpNext(node);
        this.tail = node;
    }
    }
    
    public void encueueNodeFront(node node){
        node aux = this.front.getpNext();
        this.front = node;
        this.front.setpNext(aux);
    }
        
    public void dequeue(){
        if(isEmpty()){
        }else{
            this.size--;
            this.front = this.front.getpNext();
            if (isEmpty()){
                this.tail = null;
            }
        }
    }
   
    
    public void dequeueBack(){
        if(isEmpty()){
        }else if(this.front == this.tail){
            dequeue();
        }else{
            this.size--;
            node aux = this.front;
            while(aux.getpNext() != this.tail){
                aux = aux.getpNext();
            }
            this.tail = aux;
            aux.setpNext(null);  
        }
    }
    
    
    public T selectdata(int index){
        node aux = this.front;
        for (int i = index; i != 0; i--) {
            aux = aux.getpNext();
        }
        return (T) aux.getData(); 
    }
    
    public node selectNode(int index){
        node aux = this.front;
        for (int i = index; i != 0; i--) {
            aux = aux.getpNext();
        }
        return aux; 
    }
    
    public queue moveIndex(int from, int to){
        queue newQueue = new queue();
        node aux1 = this.selectNode(from);
        
        for (int i = 0; i == this.size-1; i++) {
            if(i == from){
                this.dequeue();
                
            }else if(i == to){
                newQueue.encueueNode(this.front);
                newQueue.encueueNode(aux1);
            }else{
                newQueue.encueueNode(this.front);
                this.dequeue();
            }
        }
        return newQueue;
    }
    
    public boolean isEmpty(){
        return this.front == null;
    }
    
    public boolean isSame(){
        return this.front == this.tail;
    }

    public int getSize() {
        return size;
    }

    public node getFront() {
        return front;
    }

    public node getTail() {
        return tail;
    }
    
    
    
}
