class Convertcm {
    static void convert(int cenm) {
        float inches = (float) (cenm / 2.54);
        int feet = (int) (inches / 12);
        inches %= 12;

        System.out.println(feet + " feet " + inches + " inches"); 
    }
}


public class Convert {
    public static void main(String[] arg) {
        Convertcm.convert(344);
        Convertcm.convert(456);
        Convertcm.convert(1235);
    }
}