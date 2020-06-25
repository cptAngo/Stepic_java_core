public class Main {
    public static void main(String[] args) {
        ComplexNumber cn1  = new ComplexNumber(1321, 124.55);
        String cn2  = new String("sdfds");
        System.out.println(cn1.equals(cn2));
        System.out.println(cn1.hashCode());
        System.out.println(cn2.hashCode());
    }
}
