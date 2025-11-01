import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Random;

public class TheQueue<Type> implements TheQueueInterface<Type> {

    private Deque<Type> _queue;

    public TheQueue() {
        _queue = new ArrayDeque<Type>();
    }

    public void enqueue(Type item) {
        _queue.add(item);
    }

    public Type dequeue() 
    {
        // almaceno el primer elemento que a la vez elimino
        var eliminado = _queue.pollFirst();
        return eliminado;
    }

    public Type getFront() {
        return _queue.pollFirst();
    }

    public boolean isEmpty() {
        return _queue.isEmpty();
    }

    public int getSize() {
        return _queue.size();
    }

public String[] getCodons() 
{
    int size = _queue.size();
    if (size % 3 != 0) 
    {
        throw new IllegalStateException("La cantidad de nucleótidos debe ser múltiplo de 3");
    }
    String[] codons = new String[size / 3];
    for (int i = 0; i < codons.length; i++) 
    {
        String n1 = (String) _queue.pollFirst();  // quita y devuelve
        String n2 = (String) _queue.pollFirst();
        String n3 = (String) _queue.pollFirst();
        if (n1 == null || n2 == null || n3 == null) 
        {
            throw new IllegalStateException("La cola no tenía suficientes elementos");
        }
        codons[i] = n1 + n2 + n3;        // orden FIFO: primero en entrar, primero en salir
    }
    return codons;
}


    public String print() 
    {
        return _queue.toString();
    }

    public static void main(String[] args) {
        var amount = Integer.parseInt(args[0]);
        String[] nucleotides = {
                "A", // [0]
                "C", // [1]
                "G", // [2]
                "T", // [3]
        };
        TheQueueInterface<String> queue = new TheQueue<String>();
        // agregué import random
        var random = new Random();
        for (; amount > 0; amount--) {
            var index = random.nextInt(4);
            var amino = nucleotides[index];
            queue.enqueue(amino);
        }
        System.out.println("Filled {full}");
        System.out.println(" ↳ print() → " + queue.print());
        System.out.println("   ↳ getFront() → " + queue.getFront());
        System.out.println("   ↳ getSize() → " + queue.getSize());
        System.out.println("   ↳ isEmpty() → " + queue.isEmpty());
        System.out.println("\ngetCodons() → " + Arrays.toString(queue.getCodons()));
        System.out.println("\nEnd {empty}");
        System.out.println(" ↳ print() → " + queue.print());
        System.out.println("   ↳ getFront() → " + queue.getFront());
        System.out.println("   ↳ getSize() → " + queue.getSize());
        System.out.println("   ↳ isEmpty() → " + queue.isEmpty());
    }
}