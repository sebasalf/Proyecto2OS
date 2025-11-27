/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author CMG
 * @param <T>
 */
public class node<T> {
    private T data;
    private node pNext;
    private node pLast;
    
    public node(){
        this.data = null;
        this.pNext = null;
        this.pLast = null;
    }
    
    public node(T data) {
        this.data = data;
        this.pNext = null;
        this.pLast = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public node getpNext() {
        return pNext;
    }

    public void setpNext(node pNext) {
        this.pNext = pNext;
    }

    public node getpLast() {
        return pLast;
    }

    public void setpLast(node pLast) {
        this.pLast = pLast;
    }
   

    
    
    
    
}
