import java.math.BigInteger;

public class text {
    public static BigInteger sqrt(BigInteger x) {
        BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
        BigInteger div2 = div;
        // Loop until we hit the same value twice in a row, or wind
        // up alternating.
        for(;;) {
            BigInteger y = div.add(x.divide(div)).shiftRight(1);
            if (y.equals(div) || y.equals(div2))
                return y;
            div2 = div;
            div = y;
        }
    }    
    public static BigInteger mod(BigInteger x,BigInteger y){
        BigInteger chia = x.divide(y);
        return x.subtract(chia.multiply(y));
    }
    public static void main(String[] args) {
        BigInteger a = new BigInteger("104229015434394780017196823454597012062804737684103834919430099907512793339407667578022877402970");
        int e3 = 272383;
        BigInteger p3 = new BigInteger("969568679903672924738597736880903133415133378800072135853678043226600595571519034043189730269981");
        BigInteger i = new BigInteger("2");
        BigInteger tmp = new BigInteger("1");
        while(sqrt(a).compareTo(i)==1){
            BigInteger x = i.pow(e3);
            if(mod(x, p3).compareTo(a)==0){
                System.out.println(i);
                break;
            }
            i.add(tmp);
        }
        System.out.println(sqrt(a));
    }
}
