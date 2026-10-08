// WAP to create a class X and this class will contan main method. class X also contain three variables A,B,C where A is instance var. B is static and C is local var and where the values of C is 20 then after print all these variables in a main function.


class X {
    int a;          // INSTANCE
    static int b;   // STATIC

    public static void main(String X[]) {
        int c = 20; // LOCAL

        X x1 = new X();

        System.out.println(x1.a); // Instance variable
        System.out.println(b);    // Static variable
        System.out.println(c);    // Local variable
        
    }
}
