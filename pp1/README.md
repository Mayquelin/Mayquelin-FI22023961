# Práctica programada 1



Codigo

package com.mycompany.inverso.java;

import java.util.Scanner;


public class InversoJava {
    int numInvertido(int num, int invert){
        if (num>0){
        return numInvertido (num/10, num%10+invert*10);
        }
        else{
        return invert;
        
        }
    }
    public static void main(String[] args) {
        InversoJava numInver = new InversoJava();
        Scanner sc= new Scanner(System.in);
        int num, inver = 0;
        System.out.print("Ingresar numero: ");
        num = sc.nextInt();
        System.out.print("Número invertido: " + numInver.numInvertido(num,inver));
      
    }
   
}


Nombre:
Mayquelin Narbaez

Número de carné
FI22023961


WEB
<https://www.youtube.com/watch?v=ErMT3ShkOL4>
<https://openai.com/es-419/>


¿Es posible implementar una solución equivalente pero de comportamiento iterativo?
Si ya una función recursiva, puedes reescribirla como un algoritmo iterativo usando estructuras
 como while, for, pilas (stack) o colas, dependiendo del problema.
 
 
 ¿Cree que hay alguna otra manera recursiva de generar el mismo resultado?
Si ya que puedes variar el orden, la estructura, o incluso el tipo de recursión 
 y aún así obtener el mismo resultado final.
 
 ¿Qué relación observa entre el algoritmo para invertir un número natural (calculando y utilizando los cocientes y residuos de las divisiones)
 con las estrategias para pasar de una base numérica a otra?
 La relacion que ambos tienen es que son muy directas ya que los dos utilizan la misma operacion 
 fundamental, la división entera sucesiva.