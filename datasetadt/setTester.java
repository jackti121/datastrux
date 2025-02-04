package datasetadt;

public class setTester {
    public static void main(String[] args) {
        set setthingy = new set();
        // setthingy.addElt("George");
        // System.out.println(setthingy);
        // System.out.println("size of my set is: "+setthingy.cardinality());
        // System.out.println(setthingy.contains("George"));
        // System.out.println(setthingy.contains("Gabriel"));
        // System.out.println("Delete Element: "+ setthingy.delElt("HELLO WORLD"));
        setthingy.addElt("a");
        setthingy.addElt("b");
        setthingy.addElt("c");
        setthingy.addElt("d");
        setthingy.addElt("e");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        setthingy.delElt("f");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        setthingy.delElt("a");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        setthingy.delElt("e");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        setthingy.delElt("c");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        System.out.println("is the set empty? " + setthingy.isEmpty());
        setthingy.delElt("d");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        setthingy.delElt("b");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        setthingy.delElt("c");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        System.out.println("is the set empty? " + setthingy.isEmpty());
    }
}
