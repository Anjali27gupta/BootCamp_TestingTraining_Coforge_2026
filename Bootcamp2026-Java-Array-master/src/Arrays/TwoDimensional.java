package Arrays;

public class TwoDimensional {

    public static void main(String[] args) {

        int StudentID[][] = new int[2][2];

        StudentID[0][0] = 100;
        StudentID[0][1] = 101;
        StudentID[1][0] = 102;
        StudentID[1][1] = 103;

        for (int i = 0; i < StudentID.length; i++) {
            for (int j = 0; j < StudentID[i].length; j++) {
                System.out.println("Student ID " + i + j + " is: " + StudentID[i][j]);
            }
        }
    }
}
