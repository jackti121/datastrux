package datasetadt;

public class set {
    public static final int SETSIZE = 10000;
    private String[] mySet;
    private int size;

    public set() {
        mySet = new String[SETSIZE];
        size = 0;
    }

    public int cardinality() {
        return size;
    }

    public boolean contains(String elt) {
        boolean response = false;
        int pos = 0;
        while (pos < size && !response) {
            if (mySet[pos].equals(elt))
                response = true;
            else
                pos++;
        }
        return response;
    }

    public void addElt(String elt) {
        mySet[size] = elt;
        size += 1;
    }

    public String delElt(String elt) {
        String retval = "";
        if (this.contains(elt)) {
            int pos = 0;
            boolean found = false;
            while (pos < size && !found)
                if (mySet[pos].equals(elt))
                    found = true;
                else
                    pos++;
            for (int np = pos + 1; np < size; np++) {
                mySet[pos] = mySet[np];
                pos = np;
            }
            size--;
        }
        return retval;
    }

    public boolean isEmpty() {
        boolean answer = false;
        if (size == 0)
            answer = true;
        return answer;
    }

    public String toString() {
        String setOut = "{ ";
        for (int i = 0; i < size; i++)
            setOut += mySet[i] + " , ";
        setOut += " }";
        return setOut;
    }

}