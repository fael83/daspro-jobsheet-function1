import java.util.Scanner;
public class Cube13 {
    static double calculateSurfaceArea(int l) {
         int area = 6 * (l * l);
         return area;
    }
    static double calculateVolume(int l) {
        int vol = l * l * l;
        return vol;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side the cube: ");
        int side = sc.nextInt();

        double L = calculateSurfaceArea(side);
        System.out.println("Area of the cube is: " + L);
        double vol = calculateVolume(side);
        System.out.println("Volume of the cube is: " + vol);
    }
}

