class CustomHashSet {
    private static final int SIZE = 100;  // Fixed size for simplicity
    private Integer[] table;  // Hash table

    public CustomHashSet() {
        table = new Integer[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;  // Simple hash function
    }

    public void insert(int key) {
        int index = hash(key);
        while (table[index] != null) {
            if (table[index] == key) return;  // Avoid duplicates
            index = (index + 1) % SIZE;  // Linear probing
        }
        table[index] = key;
    }

    public boolean contains(int key) {
        int index = hash(key);
        while (table[index] != null) {
            if (table[index] == key) return true;
            index = (index + 1) % SIZE;
        }
        return false;
    }

    public void remove(int key) {
        int index = hash(key);
        while (table[index] != null) {
            if (table[index] == key) {
                table[index] = null;  // Remove key
                return;
            }
            index = (index + 1) % SIZE;
        }
    }

    public void display() {
        for (Integer num : table) {
            if (num != null) System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomHashSet set = new CustomHashSet();
        set.insert(10);
        set.insert(20);
        set.insert(30);
        set.display();
        System.out.println(set.contains(20));  // true
        set.remove(20);
        set.display();
    }
}
