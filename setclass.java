public class setclass {
    private int size;
    public static int stdsize = 10000;
    private String[] mySet;

    public setclass() {
        mySet = new String[stdsize];
        size = 0;
    }
    public boolean contains(String elem) {
        for (int i = 0; i < size; i++) {
            if (mySet[i].equals(elem)) {
                return true;
            }
        }
        return false;
    }
    public int returnSize() {
        return size;
    }
    public void add(String elem) {
        mySet[size] = elem;
        size += 1;
    }
    public void remove(String elem) {
        for (int i = 0; i < size; i++) {
            if (mySet[i].equals(elem)) {
                for (int j = i; j < size; j++) {
                    mySet[j] = mySet[j+1];
                }
                size = size - 1;
            }
        }
    }
    public String toString() {
        String retval = "( ";
        for (int i = 0; i < size; i++) {
            retval = retval + mySet[i] + ", ";
        }
        retval = retval + ")";
        return retval;
    }
    public static setclass union(setclass a, setclass b) {
        setclass retval = new setclass();
        for (int i = 0; i < a.size; i++) {
            retval.add(a.mySet[i]);
        }
        for (int i = 0; i < b.size; i++) {
            if (!retval.contains(b.mySet[i])) {
                retval.add(b.mySet[i]);
            }
        }
        return retval;
    }
    public static void main(String[] args) {
        setclass a = new setclass();
        setclass b = new setclass();
        a.add("hi");
        a.add("hey");
        a.add("hello");
        a.add("hallo");
        for (int i = 0; i < 10; i++) {
            a.add(Integer.toString(i));
        }
        for (int i = 4; i < 13; i++) {
            b.add(Integer.toString(i));
        }
        b.add("hello");
        b.add("hallo");
        b.add("hola");
        System.out.println(b);
        System.out.println(a.returnSize());
        System.out.println(a);
        System.out.println(union(a, b));
        System.out.println(a.returnSize());
        System.out.println(a);
    }
}


