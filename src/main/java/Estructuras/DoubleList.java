/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author CMG
 */
public class DoubleList {
    private int size;
    private block first;
    
    public DoubleList() {
        this.first = null;
        this.size = 0;
    }    

    public DoubleList(block first) {
        this.first = first;
        this.size = 1;
    }

    public void insertFirst(block node){
        if(isEmpty()){
            this.first = node;
            this.size++;
        }else{
            block aux = this.first;
            this.first = node;
            this.first.setpNext(aux);
            aux.setpLast(this.first);
            this.size++;
        }
    }
    
    public void insertLast(block node){
        if(isEmpty()){
            this.first = node;
            this.size++;
        }else{
            block aux = this.first;
            while(aux.getpNext() != null){
                aux = aux.getpNext();
            }
            aux.setpNext(node);
            node.setpLast(aux);
            this.size++;
        }
    }
    
    public void deleteIndex(int index){
        if(index == 0){
            block aux = this.first.getpNext();
            aux.setpLast(null);
            this.first = aux;
        }else{
            block aux1 = this.first;
            for (int i = 0; i < index ; i++) {
                aux1 = aux1.getpNext();
            }
            aux1.getpLast().setpNext(aux1.getpNext());
            aux1.getpNext().setpLast(aux1.getpLast());
            this.size++;
        }
    }
    
    public block getBlock(int index){
        block aux = this.first;
        for (int i = 0; i < index; i++) {
            aux = aux.getpNext();
        }
        return aux;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public block getFirst() {
        return first;
    }

    public void setFirst(block first) {
        this.first = first;
    }
    public boolean isEmpty(){
        return this.first == null;
    }

    public String toString(int index) {
        return "DoubleList{" + "size=" + size + ", first=" + this.getBlock(index).getPertenencia() + '}';
    }
    
    
    
}
