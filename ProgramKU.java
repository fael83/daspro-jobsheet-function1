public class ProgramKU {

    public static void tampilHinggaKei(int i){
        for (int j = 1; j<=1;j++){
            System.out.print(j);
        }
    }
    public static int Jumlah(int bil1, int bil2){
        return (bil1 + bil2);
    }
    public static void tampilJumlah(int bil1, int bil2){
        tampilHinggaKei(Jumlah(bil1, bil2));
    }
    public static void main(String[] args) {
        int temp = Jumlah(1, 1);
        tampilJumlah(temp, 5);
    }
}