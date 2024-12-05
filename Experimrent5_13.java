public class Experimrent5_13 {
    public static double average(int... a) {
        if (a.length == 0)
        return 0;
        int total=0;
        for (int i : a){
            total+=i;
        }
        return total / a.length;
    }
    public static void main(String[] args) {
        System.out.println(average(10, 10, 10, 10, 10, 10));
        System.out.println(average());
    }
}