public class CustomStack {

    private StackNode _head;

    public CustomStack() {
        _head = null;
    }

    public void push(String word) {
        var node = new StackNode(word);

        // Actualizar
        // Insertar el nuevo nodo al inicio (tope de la pila).
        node.setNext(_head);

        _head = node;
    }

    public String pop() {
        String word = null;

        // Actualizar
        // Si la pila no está vacía, devolvemos la palabra del tope.
        if (_head != null) {
            word = _head.getWord();
            _head = _head.getNext();
        }

        return word;
    }

    public int size() {
        var length = 0;

        // Actualizar
        // Recorremos la lista contando nodos.
        StackNode current = _head;
        while (current != null) {
            length++;
            current = current.getNext();
        }

        return length;
    }

    public String getWords() {
        var builder = new StringBuilder("(" + size() + ") [");
        for (var word = pop(); word != null; word = pop()) {
            builder.append(" " + word);
        }
        builder.append(" ]");
        return builder.toString();
    }
}