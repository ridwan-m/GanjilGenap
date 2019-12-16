public class OperatorAritmatika{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int tambah = a + b;
        int kurang = a - b;
        int kali = a * b;
        double bagi = a / b;
        int mod = a % b;
        int c = 1;
        c++;
        System.out.println(c);
        c--;
        System.out.println(c);

        System.out.println(a + " + " + b + " = " + tambah);
        System.out.println(a + " - " + b + " = " + kurang);
        System.out.println(a + " * " + b + " = " + kali);
        System.out.println(a + " / " + b + " = " + bagi);
        System.out.println(a + " % " + b + " = " + mod);

        int alas = 10;
        int tinggi = 15;
        
        double luas = alas * tinggi / 2;
        double perhitungan = (2 + 3) * 5 / 2;
        System.out.println(perhitungan);
    }
}