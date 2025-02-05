public class setclass {
    private int size;
    public static int stdsize = 10000;
    private String[] mySet;

    public setclass() {
        mySet = new String[stdsize];
        size = 0;
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
    public static void main(String[] args) {
        setclass a = new setclass();
        a.add("hi");
        a.add("hey");
        a.add("hello");
        a.add("hallo");
        System.out.println(a.returnSize());
        System.out.println(a);
        a.remove("hello");
        System.out.println(a.returnSize());
        System.out.println(a);
    }
}


