public class CustomQueue {

    private QueueNode _head;

    public CustomQueue() {
        _head = null;
    }

    public void enqueue(int index) {
        var node = new QueueNode(index);

        // Actualizar
        // Insertar al final de la lista (cola FIFO).
        if (_head == null) {
            // Si la cola está vacía, el nuevo nodo es la cabeza.
            _head = node;
        } else {
            // Recorremos hasta el último nodo y lo enlazamos.
            QueueNode current = _head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public int dequeue() {
        var index = -1;

        // Actualizar
        // Si la cola NO está vacía, sacamos el primer nodo.
        if (_head != null) {
            index = _head.getIndex();
            _head = _head.getNext();
        }

        return index;
    }

    public int getSize() {
        var size = 0;

        // Actualizar
        // Recorremos la lista contando cuántos nodos hay.
        QueueNode current = _head;
        while (current != null) {
            size++;
            current = current.getNext();
        }

        return size;
    }

    public String getIndexes() {
        var builder = new StringBuilder();
        for (var index = dequeue(); index > -1; index = dequeue()) {
            builder.append(" " + index);
        }
        return builder.toString();
    }
}