package $02_DataTypes;

public class ExplicitCast {

    public static void main(String[] args) {
        int i = 100;
        byte b = (byte) i;
        System.out.println(b);

        int x = 97;
        //type cast code is here
        char ch = (char) x;
        System.out.println(ch);
        
        int y = 130;
        byte z = (byte)y;
        System.out.println(z);  // output is -126 because the value  is outside the Range
        
        int m =612;
        byte n =(byte)m;
        char o =(char)n;
        System.out.println(n);
        System.out.println(o);

    }
}
