Práctica programada 2

 Número de carné
 FI22023961

IDE utilizado
NetBeans

 Web
<https://stackoverflow.com/questions/44307564/reversing-a-stack-in-java>
<openai.com/es-419/>

¿Cree que existe otra forma de efectuar la inversión del contenido de un archivo sin necesidad de usar una pila? Si sí, indique cómo (sin necesidad de código).
.Abriendo el archivo de letura binaria o aleatoria.
.Escribir cada carácter  en un nuevo archivo, a medida  lo vas leyendo hacia atrás.
 
 ¿En qué ejemplo de la vida real (no informática) se puede ver reflejado el uso de una pila?
 .Una pila de platos en la cocina.
 
 .Montón de libros en un escritorio
 Si quieres obtener el primero, debes quitar los de arriba.
 
 .Apilado de cajas o contenedores
 Pasa igual que los libros
 
 
 Código
 
 package com.mycompany.revert;

import java.util.Stack;

public class Revert {
    public static void main(String[] args) {
      String textoOrigi = "amor";
        String textoInver = invertirCadena(textoOrigi);
        System.out.println(" El texto Original es: " + textoOrigi);
        System.out.println("El texto Invertido es: " + textoInver);
    }

    private static String invertirCadena(String texto) {
         Stack<Character> pila = new Stack<>();
         for (char c : texto.toCharArray()) {
            pila.push(c);
        }
         StringBuilder textoResultado = new StringBuilder();
        while (!pila.isEmpty()) {
            textoResultado.append(pila.pop());
        }

        return textoResultado.toString();
    }

}