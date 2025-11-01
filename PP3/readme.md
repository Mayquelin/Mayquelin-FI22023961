## 1. Información Personal

- **Nombre:** 
- **Carné:** 

---

## 2. IDE o Editor Utilizado

- **Editor:** Visual Studio Code (VS Code)  
- **Extensiones usadas:**
  - Java Extension Pack  
  - Checkstyle for Java  
  - IntelliCode  
- **JDK:** OpenJDK 21  

---

## 3. Páginas Web Consultadas

Durante el desarrollo y resolución de problemas, se consultaron las siguientes fuentes:

1. [Stackoverflow](https://stackoverflow.com/questions/29349920/implementation-of-removefirst-method-in-slinkedlist-in-java) — Remove first 

2. [GeeksForGeeks](https://www.geeksforgeeks.org/dsa/insertion-in-doubly-circular-linked-list/) — Add first & Last


3. [GeeksForGeeks](https://www.geeksforgeeks.org/dsa/deletion-in-doubly-circular-linked-list/) — Remove 



## 4. Preguntas
Cola: 
1. Usaría una lista enlazada simple circular con un puntero al final (tail) y acceso al inicio a través de tail.next.

Razones:
	- 	Permite insertar (enqueue) y eliminar (dequeue) en O(1).
	-	La circularidad mantiene siempre conectado el último nodo con el primero, evitando punteros nulos.
	-	Facilita el manejo de casos con un solo elemento.

Pila: Usaría una lista enlazada simple que inserta y elimina por la cabeza (head).
Razones:
	-	push y pop son operaciones simples en O(1).
	-	No requiere puntero al final, solo al inicio.
	-	Estructura más ligera y directa que una lista circular.