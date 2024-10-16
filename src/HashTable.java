import java.util.NoSuchElementException;

public class HashTable {
    private int[] data;

    public HashTable(int size) {
        this.data = new int[size];
    }

    public void insert(int key) {
        int index = hashFunction(key);
        this.data[index] = key;
    }

    public void remove(int key) {
        int index = hashFunction(key);
        if (data[index] == key) {
            data[index] = 0;
            return;
        }
        throw new NoSuchElementException("Chave " + key + " não encontrada.");
    }

    public boolean search(int key) {
        int index = hashFunction(key);

        if (this.data[index] == key) {
            return true;
        }
        return false;
    }

    private int hashFunction(int number) {
        while (number > 9) {
            number /= 10;
        }
        return number - 1;
    }
}
