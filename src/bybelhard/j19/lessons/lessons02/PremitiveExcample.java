package bybelhard.j19.lessons.lessons02;

//bybelhard.j19.lessons.lessons02

public class PremitiveExcample {

//psvm

    public static void main(String[] args) {
      /*  short sh1 = 5; //
        int i = 100;
        double d = 3.14;

        System.out.println(sh1+1/d);
*/

        /*int i=0;
        System.out.println(i++);
        System.out.println(++i);}
       */
        byte b = 20;
        short s=20000;
        char c = 'a';
        long l=20000000000L;
        int r=5; // радиус круга
        int d=2; //степень возведения
        double n=3.1415;
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(l);
        System.out.println((b+s)/2);
        System.out.println(s%b*3);
        System.out.println(b>=27);
        System.out.println(l-s);
        System.out.println(--b);
        System.out.println(c++);
        System.out.println(s==l);
        System.out.println(b!=c);
        System.out.println("длинна окружности C=" + r*2*n);
        System.out.println("площадь круга S="+ Math.pow(r,d)*n);
    }}

