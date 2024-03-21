class DemoAssignmentOperators {
    public static void main(String args[]) {
        int num1=0;
        num1 += 2;      // num1 = num1 + 2; This same notation can be applied to Sub, Mult, Div and modulus as well 
        System.out.println(num1);

        num1++; //post-increment
        ++num1; //pre-increment

        //similarly we have post and decrement as well

        int num2 = 7;
        int num3 = 7;
        int result = num2++;        //first fetch value for result and then increment, however num2 would have incremented to 8 
        int result1 = ++num3;       //first increment and then fetch value for result, however num3 would have incremented to 8 

        System.out.println(result);
        System.out.println(result1);
    }
}