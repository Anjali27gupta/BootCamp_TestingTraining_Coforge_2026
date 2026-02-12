package AccessModifiers;

public class C_03_Protected extends B {

    public static void main(String[] args) {
        C_03_Protected obj = new C_03_Protected();
        int output = obj.z;                
        System.out.println("Output is : " + output);
        obj.ProtectedMethod();             
    }
}
