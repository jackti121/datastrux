public class settester {
    public static void main(String[] args) {
        set setthingy = new set();
        // setthingy.add("George");
        // System.out.println(setthingy);
        // System.out.println("size of my set is: "+setthingy.cardinality());
        // System.out.println(setthingy.contains("George"));
        // System.out.println(setthingy.contains("Gabriel"));
        // System.out.println("Delete Element: "+ setthingy.delete("HELLO WORLD"));

        setthingy.add("a");
        setthingy.add("b");
        setthingy.add("c");
        setthingy.add("d");
        setthingy.add("e");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        setthingy.delete("f");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        setthingy.delete("a");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());

        setthingy.delete("e");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());

        setthingy.delete("c");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        System.out.println("is the set empty? " + setthingy.isEmptySet());
        setthingy.delete("d");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        setthingy.delete("b");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        setthingy.delete("c");
        System.out.println("set is: " + setthingy);
        System.out.println("size size is: " + setthingy.cardinality());
        System.out.println("is the set empty? " + setthingy.isEmptySet());

    }

}