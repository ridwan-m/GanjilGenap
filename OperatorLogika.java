public class OperatorLogika{
    public static void main(String[] args) {
        //Contoh AND
        System.out.println("Contoh AND ");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        //Contoh OR
        System.out.println("Contoh OR ");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        //Contoh NOT
        System.out.println(!true);
        boolean hujan = true;
        System.out.println(!hujan);
        System.out.println((!hujan && true) || (10 > 8));
        int nilai = 102;
        System.out.println(nilai >= 88 && nilai == 100);
    }
}