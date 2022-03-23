package home_work_1;

public class Task1_2 {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111

        System.out.println("заданные числа: " + a + " и " + b);
        System.out.println("в двоичном представлении: " + Integer.toBinaryString(a) + " и " + Integer.toBinaryString(b));

        //Побитовый AND (&)
        int c = a&b; // 00101010 & 00001111 = 00001010 или 10
        System.out.println("результат оператора & (побитовый AND) равен " + c + " или " + Integer.toBinaryString(c));

        //Побитовый AND с присвоением (&=)
        int d = a; // ввожу переменную d, чтобы не менять переменную a
        d&=b; // 00101010 &= 00001111 = 00001010 или 10
        System.out.println("результат оператора &= (побитовый AND с присваиванием) равен " + d + " или " + Integer.toBinaryString(d));

        //Побитовый OR (|)
        int e = a|b; // 00101010 | 00001111 = 00101111 или 47
        System.out.println("результат оператора | (побитовый OR) равен " + e + " или " + Integer.toBinaryString(e));

        //Побитовый OR с присваиванием (|=)
        int f = a;
        f|=b; // 00101010 |= 00001111 = 00101111 или 47
        System.out.println("результат оператора | (побитовый OR с присваиванием) равен " + f + " или " + Integer.toBinaryString(f));

        //Побитовый исключающее OR (^)
        int g = a^b; // 00101010 ^ 00001111 = 00100101 или 37
        System.out.println("результат оператора ^ (побитовый XOR) равен " + g + " или " + Integer.toBinaryString(g));

        //Побитовый исключающее OR c присваиванием (^=)
        int j = a;
        j^=b; // 00101010 ^= 00001111 = 00100101 или 37
        System.out.println("результат оператора ^= (побитовый XOR с присваиванием) равен " + j + " или " + Integer.toBinaryString(j));

        //Побитовый NOT (~)
        int k1 = ~a; // ~00101010 = 11010101 или -43
        int k2 = ~b; // ~00001111 = 11110000 или -16
        System.out.println("результат оператора ~ (побитовый NOT) для 42 равен " + k1 + " или " + Integer.toBinaryString(k1));
        System.out.println("результат оператора ~ (побитовый NOT) для 15 равен " + k2 + " или " + Integer.toBinaryString(k2));

        // Сдвиг вправо >>
        int l1 = a>>2; // 00101010>>2 = 00001010 или 10
        int l2 = b>>3; // 00001111>>3 = 00000001 или 1
        System.out.println("результат оператора >> (сдвиг вправо на 2) для 42 равен " + l1 + " или " + Integer.toBinaryString(l1));
        System.out.println("результат оператора >> (сдвиг вправо на 3) для 15 равен " + l2 + " или " + Integer.toBinaryString(l2));

        // Сдвиг вправо >>= с присваиванием
        int m1 = a;
        m1>>=2; // 00101010>>=2 = 00001010 или 10
        int m2 = b;
        m2>>=3; // 00001111>>=3 = 00000001 или 1
        System.out.println("результат оператора >> (сдвиг вправо на 2 c присваиванием) для 42 равен " + m1 + " или " + Integer.toBinaryString(m1));
        System.out.println("результат оператора >> (сдвиг вправо на 3 c присваиванием) для 15 равен " + m2 + " или " + Integer.toBinaryString(m2));

        // Сдвиг вправо >>> с заполнением нулями
        int n1 = a>>>4; // 00101010>>>4 = 00000010 или 2
        int n2 = b>>>1; // 00001111>>>1 = 00000111 или 7
        System.out.println("результат оператора >>> (сдвиг вправо на 4 c заполнением нулями) для 42 равен " + n1 + " или " + Integer.toBinaryString(n1));
        System.out.println("результат оператора >>> (сдвиг вправо на 1 c заполнением нулями) для 15 равен " + n2 + " или " + Integer.toBinaryString(n2));

        // Сдвиг влево <<
        int o1 = a<<2; // 00101010<<2 = 10101000 или 168
        int o2 = b<<3; // 00001111<<3 = 01111000 или 120
        System.out.println("результат оператора << (сдвиг влево на 2) для 42 равен " + o1 + " или " + Integer.toBinaryString(o1));
        System.out.println("результат оператора << (сдвиг влево на 3) для 15 равен " + o2 + " или " + Integer.toBinaryString(o2));

        // Сдвиг влево <<= с присваиванием
        int p1 = a;
        p1<<=2; // 00101010<<=2 = 10101000 или 168
        int p2 = b;
        p2<<=3; // 00001111<<=3 = 01111000 или 120
        System.out.println("результат оператора << (сдвиг влево на 2 c присваиванием) для 42 равен " + p1 + " или " + Integer.toBinaryString(p1));
        System.out.println("результат оператора << (сдвиг влево на 3 c присваиванием) для 15 равен " + p2 + " или " + Integer.toBinaryString(p2));

        // Сдвиг вправо >>>= с заполнением нулями и присваиванием
        int r1 = a;
        r1>>>=4; // 00101010>>>=4 = 00000010 или 2
        int r2 = b;
        r2>>>=1; // 00001111>>>=1 = 00000111 или 7
        System.out.println("результат оператора >>>= (сдвиг вправо на 4 c заполнением нулями и присваиванием) для 42 равен " + r1 + " или " + Integer.toBinaryString(r1));
        System.out.println("результат оператора >>>= (сдвиг вправо на 1 c заполнением нулями и присваиванием) для 15 равен " + r2 + " или " + Integer.toBinaryString(r2));

    }
}
