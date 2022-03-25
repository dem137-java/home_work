package home_work_1;

public class Task1_3 {
    public static void main(String[] args) {
        int a = -42; //11010110
        int b = -15; //11110001

        System.out.println("заданные числа: " + a + " и " + b);
        System.out.println("в двоичном представлении: " + Integer.toBinaryString(a) + " и " + Integer.toBinaryString(b));

        //Побитовый AND (&)
        int c = a&b; // 11010110 & 11110001 = 11010000 или -48
        System.out.println("результат оператора & (побитовый AND) равен " + c + " или " + Integer.toBinaryString(c));

        //Побитовый AND с присвоением (&=)
        int d = a;
        d&=b; // 11010110 &= 11110001 = 11010000 или -48
        System.out.println("результат оператора &= (побитовый AND с присваиванием) равен " + d + " или " + Integer.toBinaryString(d));

        //Побитовый OR (|)
        int e = a|b; // 11010110 | 11110001 = 11110111 или -9
        System.out.println("результат оператора | (побитовый OR) равен " + e + " или " + Integer.toBinaryString(e));

        //Побитовый OR с присваиванием (|=)
        int f = a;
        f|=b; // 11010110 |= 11110001 = 11110111 или -9
        System.out.println("результат оператора | (побитовый OR с присваиванием) равен " + f + " или " + Integer.toBinaryString(f));

        //Побитовый исключающее OR (^)
        int g = a^b; // 11010110 ^ 11110001 = 00100111 или 39
        System.out.println("результат оператора ^ (побитовый XOR) равен " + g + " или " + Integer.toBinaryString(g));

        //Побитовый исключающее OR c присваиванием (^=)
        int j = a;
        j^=b; // 11010110 ^=11110001 = 00100111 или 39
        System.out.println("результат оператора ^= (побитовый XOR с присваиванием) равен " + j + " или " + Integer.toBinaryString(j));

        //Побитовый NOT (~)
        int k1 = ~a; // ~11010110 = 00101001 или 41
        int k2 = ~b; // ~11110001 = 00001110 или 14
        System.out.println("результат оператора ~ (побитовый NOT) для -42 равен " + k1 + " или " + Integer.toBinaryString(k1));
        System.out.println("результат оператора ~ (побитовый NOT) для -15 равен " + k2 + " или " + Integer.toBinaryString(k2));

        // Сдвиг вправо >>
        int l1 = a>>2; // 11010110>>2 = 11110101 или -11
        int l2 = b>>3; // 11110001>>3 = 11111110 или -2
        System.out.println("результат оператора >> (сдвиг вправо на 2) для -42 равен " + l1 + " или " + Integer.toBinaryString(l1));
        System.out.println("результат оператора >> (сдвиг вправо на 3) для -15 равен " + l2 + " или " + Integer.toBinaryString(l2));

        // Сдвиг вправо >>= с присваиванием
        int m1 = a;
        m1>>=2; // 11010110>>=2 = 11110101 или -11
        int m2 = b;
        m2>>=3; // 11110001>>=3 = 11111110 или -2
        System.out.println("результат оператора >> (сдвиг вправо на 2 c присваиванием) для -42 равен " + m1 + " или " + Integer.toBinaryString(m1));
        System.out.println("результат оператора >> (сдвиг вправо на 3 c присваиванием) для -15 равен " + m2 + " или " + Integer.toBinaryString(m2));

        // Сдвиг вправо >>> с заполнением нулями
        int n1 = a>>>4; // 11010110>>>=4 = 1111111111111111111111111101 или 268435453, видимо int пошел по кругу?
        int n2 = b>>>1; // 11110001>>>=1 = 1111111111111111111111111111000 или 2147483640
        System.out.println("результат оператора >>> (сдвиг вправо на 4 c заполнением нулями) для -42 равен " + n1 + " или " + Integer.toBinaryString(n1));
        System.out.println("результат оператора >>> (сдвиг вправо на 1 c заполнением нулями) для -15 равен " + n2 + " или " + Integer.toBinaryString(n2));

        // Сдвиг влево <<
        int o1 = a<<2; // 11010110<<2 = 1111111101011000 или -168 (больше 8 бит)
        int o2 = b<<3; // 11110001<<3 = 10001000 или -120
        System.out.println("результат оператора << (сдвиг влево на 2) для -42 равен " + o1 + " или " + Integer.toBinaryString(o1));
        System.out.println("результат оператора << (сдвиг влево на 3) для -15 равен " + o2 + " или " + Integer.toBinaryString(o2));

        // Сдвиг влево <<= с присваиванием
        int p1 = a;
        p1<<=2; // 11010110<<2 = 1111111101011000 или -168 (больше 8 бит)
        int p2 = b;
        p2<<=3; // 11110001<<3 = 10001000 или -120
        System.out.println("результат оператора << (сдвиг влево на 2 c присваиванием) для -42 равен " + p1 + " или " + Integer.toBinaryString(p1));
        System.out.println("результат оператора << (сдвиг влево на 3 c присваиванием) для -15 равен " + p2 + " или " + Integer.toBinaryString(p2));

        // Сдвиг вправо >>>= с заполнением нулями и присваиванием
        int r1 = a;
        r1>>>=4; // 11010110>>>=4 = 1111111111111111111111111101 или 268435453, видимо int пошел по кругу?
        int r2 = b;
        r2>>>=1; // 11110001>>>=1 = 1111111111111111111111111111000 или 2147483640
        System.out.println("результат оператора >>>= (сдвиг вправо на 4 c заполнением нулями и присваиванием) для -42 равен " + r1 + " или " + Integer.toBinaryString(r1));
        System.out.println("результат оператора >>>= (сдвиг вправо на 1 c заполнением нулями и присваиванием) для -15 равен " + r2 + " или " + Integer.toBinaryString(r2));

    }
}