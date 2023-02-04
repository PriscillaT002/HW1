import java.util.Arrays;
//package com.gradescope.arrays;


public class MyArray1{

    // 0. helper functions
     static String arrayToString(int[] array){
        String arrString= " ";
        for (int i=0; i <array.length; i++){
            arrString+=" " + array[i];
        };
        return arrString;
    }


    //copy pseudo code
    /* */
    //1. copyfunction
    //Tester for copyfunction


    //addAll pseudo code
    /*   
    input: array[]
    output:int sum
    method:
        int array[] = {}
        int sum()
        int sum = 0
        for i = 0; i < array.length
            sum += array[i]
        return sum*/
    //2. addAllfunction
    public static int addAll(int[] array) {
        {
            int sum = 0;
            int i;
            for (i = 0; i < array.length; i ++)
                sum += array[i];
            return sum;


        }

    }
    //Tester for addAllfunction
    public static void testAddAll(){

        int [] testArray={1,2,3,4};
        System.out.println("1.===== Testing: addAll ======");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        int total = addAll(testArray);
        System.out.println("Total:"+total);
        System.out.println("1. ===Done: addAll\n");

    }

    //addArrays pseudo code
    /* */
    //3. addArraysfunction
    //Tester for addArraysfunction

    //multiplyAll pseudo code
    /* */
    //4. multiplyAllfunction
    //Tester for multiplyAllfunction


    //findAverage pseudo code
    /* */
    //5. findAveragefunction
    //Tester for findAveragefunction

    //swap pseudo code
    /* */
    //6. swapfunction
    //Tester for swapfunction

    //isElement pseudo code
    /* 
    input: array[], int value
    output:boolean
    method:
        for i=0 thru array.length
            if array[i]= value
            return true
        return false*/
    //7. isElementfunction
    // public static boolean isElement(int[] array,int value) {
    //     for(int i =0; i < array.length; i ++)
    //         if(array[i] == value)
    //             return true;
    //         return false;
    // }
    //Tester for isElementfunction
    // public static void testisElement() {
    //     int [] testArray={1,2,3,4};
    //     int value = 3;
    //     System.out.println("7.====== Testing: isElement =====");
    //     System.out.print("Input array: ");
    //     System.out.println(arrayToString(testArray));
    //     System.out.print("Input value: ");
    //     System.out.println(value);
    //     boolean present = isElement(testArray);
    //     System.out.println("Present?:" + present);
    //     System.out.println("7. === Done:isElement\n");

    // }

    //indexOf pseudo code
    /* */
    //8. indexOffunction
    //Tester for indexOffunction

    //findMin pseudo code
    /* */
    //9. findMinfunction
    //Tester for findMinfunction

    //findMinIndex pseudo code
    /* */
    //10. findMinIndexfunction
    //Tester for findMinIndexfunction

    //findMax pseudo code
    /* */
    //11. findMaxfunction
    //Tester for findMaxfunction

    //findMaxIndex pseudo code
    /* */
    //12. findMaxIndexfunction
    //Tester for findMaxIndexfunction

    //reverse pseudo code
    /* */
    //13. reversefunction
    //Tester for reversefunction

    //returnReverse pseudo code
    /* */
    //14. returnReversefunction
    //Tester for returnReversefunction

    //intersection pseudo code
    /* */
    //15. intersectionfunction
    //Tester for intersectionfunction

    //union pseudo code
    /* */
    //16. unionfunction
    //Tester for unionfunction



    //main: runs tester functions
    public static void main(String[] args){

        //===================
        //Test Main Functions
        //===================
        //testCopy();
        testAddAll();
        //testAddArrays();
        //testFindAverage();
        //testSwap();
        //testIsElement();
        //testIndexOf();
        //testFindMin();
        //testFindMinIndex();
        //testFindMax();
        //testFindMaxIndex();
        //testReverse();
        //testReturnReverse();
        //testIntersection();
        //testUnion();

    }

    
}
