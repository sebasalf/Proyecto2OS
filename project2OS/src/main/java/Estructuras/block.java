/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;
import java.awt.Color;  
/**
 *
 * @author CMG
 */
public class block {
    private int numero;
    private boolean disponible;
    private block pNext;
    private block pLast;
    private Color color;
    private String pertenencia;

    public block(int numero) {
        this.numero = numero;
        this.disponible = true;
        this.pNext = null;
        this.pLast = null;
        this.pertenencia = "";
        this.color = Color.WHITE;         
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public block getpNext() {
        return pNext;
    }

    public void setpNext(block pNext) {
        this.pNext = pNext;
    }

    public block getpLast() {
        return pLast;
    }

    public void setpLast(block pLast) {
        this.pLast = pLast;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getPertenencia() {
        return pertenencia;
    }

    public void setPertenencia(String pertenencia) {
        this.pertenencia = pertenencia;
    }
    
}
