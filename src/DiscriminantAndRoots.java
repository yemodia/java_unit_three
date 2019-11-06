public class DiscriminantAndRoots {
    private static String checkingRoots(int a, int b, int c) {
        double discriminant = Math.pow(b,2)-4* a * c;
        if (discriminant > 0)
            return a + "x^2 + " + b + "x + " + c +" has 2 imaginary roots" ;
        else if (discriminant == 0)
            return a + "x^2  + " + b + "x + " + c +" has 1 real root" ;
        else
            return a + "x^2 + " + b + "x +" + c +" has 2 real roots";

    }
    public static void main(String[] args){

        System.out.println(checkingRoots(1, 2, 3));
        System.out.println(checkingRoots(-4, 5, 3));

    }
}
