package set;
//hi
public class set {

    //Variable Declaration//
    
    private int size;
    private String[] mySet;
    public static final int stdsize = 10000;

    //Universal Set + Variables/

    public static set uSet = new set();
    static {
        uSet.add("t");
        uSet.add("e");
        uSet.add("x");
        uSet.add("a");
        uSet.add("s");
    }

    //Constructor//

    public set() {
        mySet = new String[stdsize];
        size = 0;
    }

    

    
    /** 
     * Returns if
     * @param elem
     * @return boolean
     */
    public boolean element_of(set a) {
        String elem = this.toString();
        for (int i = 0; i < size; i++) {
            if (a.mySet[i].equals(elem)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    /** 
     * @param elem
     * @return String
     */
    public String get(String elem) {
        for (int i = 0; i < size; i++) {
            if (mySet[i].equals(elem)) {
                return mySet[i];
            }
        }
        return null;
    }

    
    /** 
     * @return int
     */
    public int cardinality() {
        return size;
    }

    
    /** 
     * @param elem
     */
    public void add(String elem) {
        mySet[size] = elem;
        size += 1;
    }

    
    /** 
     * @param elem
     * @param index
     */
    public void add(String elem, int index) {
        size += 1;
        for (int i = size+1; i> index; i--) {
            mySet[i] = mySet[i-1];
        }
        mySet[index] = elem;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEmptySet() {
        for (int i = 0; i < size; i++) {
            if (mySet[i] != null) {
                return false;
            }
        }
        return true;
    }

    
    /** 
     * @param elem
     */
    public void delete(String elem) {
        for (int i = 0; i < size; i++) {
            if (mySet[i].equals(elem)) {
                for (int j = i; j < size; j++) {
                    mySet[j] = mySet[j+1];
                }
                size = size - 1;
                break;
            }
        }
    }

    
    /** 
     * @param index
     */
    public void delete(int index) {
        mySet[index] = mySet[index+1];
        for (int i = index+1; i < size; i++) {
            mySet[i] = mySet[i+1];
        }
        size -= 1;
    }

    
    /** 
     * @return String
     */
    public String toString() {
        String retval = "( ";
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                retval = retval + mySet[i] + " )";
                return retval;
            }
            retval = retval + mySet[i] + ", ";
        }
        return retval;
    }

    
    /** 
     * @param a
     * @param b
     * @return set
     */
    public static set union(set a, set b) {
        set retval = new set();
        for (int i = 0; i < a.size; i++) {
            retval.add(a.mySet[i]);
        }
        for (int i = 0; i < b.size; i++) {
            if (!retval.element_of(b.mySet[i])) {
                retval.add(b.mySet[i]);
            }
        }
        return retval;
    }

    
    /** 
     * @param b
     * @return set
     */
    public set subtraction(set b) { 
        set retval = new set();
        for (int i = 0; i < size; i++) {
            if (!b.element_of(mySet[i])) {
                retval.add(mySet[i]);
            }
        }
        return retval;
    }

    
    /** 
     * @return set
     */
    public set complement() {
        set retval = uSet.subtraction(this);
        return retval;
    }

    
    /** 
     * @param b
     * @return boolean
     */
    public boolean is_subset(set b) {
        for (int i = 0; i < size; i++) {
            if (b.element_of(mySet[i]) == false) {
                return false;
            }
        }
        return true;
    }

    
    /** 
     * @param a
     * @param b
     * @return set
     */
    public static set intersection(set a, set b) {
        set retval = new set();
        for (int i = 0; i < a.size; i++) {
            if (b.element_of(a.mySet[i])) {
                if (retval.element_of(a.mySet[i]) == false) {
                    retval.add(a.mySet[i]);
                }
            }
        }
        return retval;
    }
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("hi");
    }
}