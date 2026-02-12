package exception_Handling;

public class C_01_Checked_Exception_Try_Catch {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;   
        } catch (Exception e) {
            System.out.println("Exception handled");
        }

        System.out.println("Program continues...");
    }
}
