class DemoTypeConvrnNCasting {
    public static void main(String args[]) {
        System.out.println("***DemoTypeConvrnNCasting***");
        
        // byte b = 125;
        // int a = b; //Type Conversion 

        // int a =12;
        // byte k = (byte) a;      //Type Casting

        int a = 258;
        byte k = (byte) a;      //Perform moduls operation. 258/256 gives reminder of 2. byte range is 256. -128 to +127 

        System.out.println(k);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);

        //Conversion is automatic casting or implicit casting
        //Casting is explicit conversion

        //Type promotion
        byte x1 = 10;
        byte x2 = 30;
        int result = x1 * x2;
        System.out.println("Result is :" + result);         

    }
}