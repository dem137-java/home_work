package home_work_1;

public class Task3 {
    public static void main(String[] args) {

        int a = Math.abs(-9);
        long b = Math.addExact(2147483640,5);
        double c = Math.cbrt(27);
        double d = Math.ceil(3458.78); //Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.
        double e = Math.copySign(35.21,-1.00);
        int f = Math.decrementExact(250); // м.б. long
        double g = Math.floor(c);
        double j = Math.hypot(a,c); //Returns sqrt(x2 +y2) without intermediate overflow or underflow.
        int k = Math.incrementExact(f); // м.б. long
        double l = Math.max(a,e); //Returns the greater of two double values. м.б. float, int, long
        double m1 = Math.min(c,e);
        double m2 = Math.min(c,f); //Returns the smaller of two double values. м.б. float, int, long
        int n = Math.multiplyExact(f,k); // м.б. long
        int o = Math.negateExact(a); //Returns the negation of the argument, throwing an exception if the result overflows an int. м.б. long
        double p = Math.pow(c,2); // степень
        double r1 = Math.random(); //Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
        int r2 = (int) (Math.random()*10);
        long s = Math.round(1.49); // мб int, аргумент float
        double t = Math.sqrt(a);
        int u = Math.subtractExact(a,o); // отнять от одного аргумента другой, мб long
        double v = Math.ulp(3.268); //???
        int w = Math.toIntExact(b); // преобразует long в int


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);
        System.out.println(w);
    }
}
