package TypeCasting;

public class Narrowing2 {
    public static void main(String[] args) {
        long Bignum=50000;
        short smallnum=(short) Bignum;
        System.out.println("the long value"+Bignum);
        System.out.println("the short value after casting"+smallnum);
    }
}
