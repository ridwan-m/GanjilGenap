public class OperatorTernary{
    public static void main(String[] args) {
        int nilai = 74;
        String hasilUjian = nilai > 75 ? "Lulus" : "Tidak Lulus";
        System.out.println(hasilUjian);

        boolean isRaining = true;
        String answer = isRaining == true ? "Tidak Boleh Keluar Rumah" : "Boleh Keluar Rumah";
        System.out.println(answer);

        int battery = 90;
        boolean isPowerOn = battery >0 ? true : false;
        System.out.println("PowerOn Is "+isPowerOn);

        boolean isAvailable = true;
        String checkProductAvail = isAvailable? "Cmon Buy Me !" : "Sry, Sold Out";
        System.out.println(checkProductAvail);
    }
}