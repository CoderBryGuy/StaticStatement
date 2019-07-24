package com._company;

public class Main {

//    public static int multiplier = 7;

    public static void main(String[] args) {
	// write your code here
//    StaticTest firstInstance = new StaticTest("1st instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//
//
//      int answer = multiply(6);
//        System.out.println("The answer is " + answer);
//        System.out.println("Multiplier is " + multiplier);

//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);

        //Math m = new Math();

        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();


        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);


    }

//    public static int multiply(int number){
//        return number * multiplier;
//    }
}
