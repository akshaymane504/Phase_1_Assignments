//Write a program which will take a string as input and will convert it into other primitive data types.
public class P1 {
    public static void main(String[] args) {
        String a = "5";
        System.out.println("String = "+a);

        int b = Integer.parseInt(a);
        System.out.println("Int = "+b);

        int c = Integer.parseUnsignedInt(a);
        System.out.println("Unsigned Int = "+c);

        float e = Float.parseFloat(a);
        System.out.println("Float = "+e);

        double f = Double.parseDouble(a);
        System.out.println("Double = "+f);

    }
}
