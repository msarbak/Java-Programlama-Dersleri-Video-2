package yt.video2;

public class Program {
    public static void main(String[] args) {
        Sayi a = new Sayi(100);
        Sayi b = new Sayi(200);
        System.out.println(a);
        System.out.println(b);
        Sayi tmp = a;
        a = b;
        b = tmp;
        System.out.println(a);
        System.out.println(b);

    }
}
