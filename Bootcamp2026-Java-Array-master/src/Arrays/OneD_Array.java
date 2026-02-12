package Arrays;

public class OneD_Array {

    public static void main(String[] args) {

        int StudentID[] = new int[5];

        StudentID[0] = 100;
        StudentID[1] = 101;
        StudentID[2] = 102;
        StudentID[3] = 103;
        StudentID[4] = 104;

        for (int i = 0; i < StudentID.length; i++) {
            System.out.println("Student ID is " + i + " : " + StudentID[i]);
        }
    }
}
