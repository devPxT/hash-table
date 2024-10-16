public class Main {
    public static void main(String[] args) throws Exception {
        HashTable hashTable = new HashTable(10);

        int[] valores = {12, 25, 37, 41, 53, 64, 78, 89};
        for (int valor : valores) {
            hashTable.insert(valor);
        }
        
        if (hashTable.search(25) == true) {
            System.out.println("search 25 - true");
        } else {
            System.out.println("search 25 - false");
        }

        hashTable.remove(37);
    }
}
