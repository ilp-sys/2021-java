package EXE;

public class WrapperEx {
    public static void main(String args[]){

        //Character 사용
        System.out.println(Character.toLowerCase('A'));
        char c1 = '4', c2 = 'F';
        if(Character.isDigit(c1))
            System.out.println(c1 + "is a number");
        if(Character.isAlphabetic(c2))
            System.out.println(c2 + "is an alphabet");

        //Integer 사용
        System.out.println(Integer.parseInt("28"));
        System.out.println(Integer.toString(28));
        System.out.println(Integer.toBinaryString(28));
        System.out.println(Integer.toHexString(28));
        System.out.println(Integer.bitCount(28));

        Integer i = Integer.valueOf(28);
        System.out.println(i.doubleValue());

        //Double 사용
        Double d = Double.valueOf(3.14);
        System.out.println(d.toString());
        System.out.println(Double.parseDouble("3.14"));

        //Boolean사용
        boolean b = (4>3);
        System.out.println(Boolean.toString(b));
        System.out.println(Boolean.parseBoolean("false"));
    }
}