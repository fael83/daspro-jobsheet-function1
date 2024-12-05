import java.util.Scanner;
public class Assignment2 {
        static int grade[] [] = new int [5][7];
        static String name []= {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        static void studentGrade(){
            Scanner sc = new Scanner(System.in);
            System.out.println("===========================");
            System.out.println("Input Students' Grade Data.");
            for(int i = 0; i < grade.length; i++){
                for (int j = 0; j < grade[1].length; j++){
                    System.out.print("Input grade for " + name[i] + " on week " + (j+1) + ": ");
                    grade[i][j]= sc.nextInt();
                }   
            }
            System.out.println();
            return;
        }
        static void displayAllGrades(){
            System.out.println("===========================");
            System.out.println("Display All Student Grades.");
            System.out.print("\t");
            for (int i = 0; i < grade[1].length; i++){
                System.out.print("Week " +(i+1)+ "\t");
            }
            System.out.println();
            for (int i = 0; i < grade.length; i++){
                System.out.print(name[i] +"\t");
                for (int j = 0; j < grade[1].length; j++){
                    System.out.print(grade[i][j] +"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        static void highestGrade(){
            System.out.println("================================================================");
            int a = 0;
            int maxNum = 0;
            for (int i=0; i<grade[1].length;i++){   
                int jumlah = 0;
                for (int j =0; j < grade.length;j++){
                    jumlah+=grade[j][i];
                }
                if (jumlah > maxNum) {
                    maxNum = jumlah;
                    a = (i+1);
                }
            }
            System.out.println("The highest grade from all students on the week " + a + " with value " + maxNum);
            System.out.println();
        }
        static void highestGradeforEachWeek(){
            System.out.println("===============================");
            System.out.println("Student With The Highest Grade.");
            String nameStudent= " ";
            int maxNum=0;
            for (int i = 0; i < grade[1].length; i++){
                int jumlah=0;
                System.out.print("Week " + (i+1) + ": " );
                for (int j = 0; j<grade.length;j++){
                    if (grade[j][i] > jumlah) {
                        jumlah = grade[j][i];
                        nameStudent = name[j];
                    }
                }
                System.out.print(nameStudent + " (score " + jumlah + ")");
                System.out.println();
            }
        }
        public static void main(String[] args) {
            studentGrade();
            displayAllGrades();
            highestGrade();
            highestGradeforEachWeek();
        }
}
