import java.util.Arrays;
//package com.gradescope.arrays; used for gradescope 



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
    /*  input: array[]
    output:new array[]
    method:
        int array[] = {}
        int new array [] = new int[array.length];
        for (i = 0; i < array.length; i++)
            new array[i] = array[i];
        return new array*/
    //1. copyfunction
    // public static copy(int[] array) {
    //     {
    //         int newArray [] = new int[array.length]; 
    //         int i;
    //         for (i = 0; i < array.length; i ++)
    //             newArray [i] = array[i];
    //             newArray[0]++;
    //         return newArray;


    //     }

    // }

    //Tester for copyfunction
    // public static void testCopy(){

    //     int [] testArray={1,2,3,4};
    //     System.out.println("1.===== Testing: Copy ======");
    //     System.out.print("Input array: ");
    //     System.out.println(arrayToString(testArray));
    //     int copy = copy(testArray);
    //     System.out.println("Copy:"+ copy);
    //     System.out.println("1. ===Done: copy===\n");

    // }


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
    // public static int addAll(int[] array) {
    //     {
    //         int sum = 0;
    //         int i;
    //         for (i = 0; i < array.length; i ++)
    //             sum += array[i];
    //         return sum;


    //     }

    //  }
    // //Tester for addAllfunction
    // public static void testAddAll(){

    //     int [] testArray={1,2,3,4};
    //     System.out.println("2.===== Testing: addAll ======");
    //     System.out.print("Input array: ");
    //     System.out.println(arrayToString(testArray));
    //     int total = addAll(testArray);
    //     System.out.println("Total:"+total);
    //     System.out.println("2. ===Done: addAll===\n");

    // }

    //addArrays pseudo code
    /* input: array[], array2[]
    output:new array[]
    method:
        int array[] = {}
        int array2[] = {}
        int length = array.length < array2.length
        int[] new array = new int [length];
        for (i = 0; i < length; i ++)
            new array [i] = array[i] + array2[i];
        return new array*/
    //3. addArraysfunction
    // public static int[] addArrays(int[] array, int[] array2) {
    //          {
    //             int[] length = array.length < array2.length ? array.length : array2.length;
    //             int[] newArray = new int[length];
    //             for (i = 0; i < length; i++) {
    //                 newArray [i] = array[i] + array2[i]; }
    //             return newArray;
    //             }

    //          }

    // //Tester for addArraysfunction
    // public static void testAddArrays(){

    //          int [] testArray={1,2,3,4};
    //          int [] testArray2={1,2,3,4};
    //          System.out.println("3.===== Testing: addArrays ======");
    //          System.out.print("Input array: \n");
    //          System.out.println(arrayToString(testArray));
    //          System.out.println(arrayToString(testArray2));
    //          total = addArrays(testArray, testArray2);
    //          System.out.println("Total:"+total);
    //          System.out.println("3. ===Done: addArrays===\n");
    
    //      }

    //multiplyAll pseudo code
    /*input: array[]
    output:int sum
    method:
        int array[] = {}
        int product()
        int product = 0
        for i = 0; i < array.length
            product *= array[i]
        return product */
    //4. multiplyAllfunction
    // public static int multiplyAll(int[] array) {
    //          {
    //             int product = 1;
    //              int i;
    //              for (i = 0; i < array.length; i ++)
    //                  product = product * array[i];
    //              return product;
    
    
    //          }
    
    //       }
    // //Tester for multiplyAllfunction
    //   public static void testMultiplyAll(){

    //      int [] testArray={1,2,3,4};
    //      System.out.println("4.===== Testing: MultiplyAll ======");
    //      System.out.print("Input array: ");
    //      System.out.println(arrayToString(testArray));
    //      int total = multiplyAll(testArray);
    //      System.out.println("Total:"+total);
    //      System.out.println("4. ===Done: MultiplyAll===\n");

    //  }


    //findAverage pseudo code
    /* input: array[]
    output:int sum
    method:
        int array[] = {}
        int average()
        int average = 0
        for i = 0; i < array.length
            average *= array[i]/2
        return average*/
    //5. findAveragefunction
    // public static int findAverage(int[] array) {
    //     {
    //        int total = 0;
    //         int i;
    //         for (i = 0; i < array.length; i ++)
    //             total += array[i];
    //             int average = total / array.length;
    //             return average;


    //     }

    //  }

    // //Tester for findAveragefunction
    // public static void testFindAverage(){

    //     int [] testArray={5,5,5,5,5};
    //     System.out.println("5.===== Testing: FindAverage ======");
    //     System.out.print("Input array: ");
    //     System.out.println(arrayToString(testArray));
    //     int Average = findAverage(testArray);
    //     System.out.println("Average:"+Average);
    //     System.out.println("5. ===Done: FindAverage===\n");

    // }

    //swap pseudo code
    /* input: array[], int index1, int index2
    output:array[]
    method:
        temp = array[index2]
        array[index2]=arry[index1]
        array[index1]= temp
        return array*/
    //6. swapfunction
    // public static int swap(int[] array, int index1, int index2) {
    //     {
    //        temp = array[index1];
    //        array[index2] = array[index1];
    //        array[index1] = temp;
    //        return array;


    //     }

    //  }

    // //Tester for swapfunction
    // public static void testSwap(){

    //     int [] testArray={1,2,3,4,5};
    //     int first = 3;
    //     int second = 5;
    //     System.out.println("6.===== Testing: Swap ======");
    //     System.out.print("Input array: ");
    //     System.out.println(arrayToString(testArray));
    //     System.out.print("Input 1st Element: ");
    //     System.out.println(first);
    //     System.out.print("Input 2nd Element: ");
    //     System.out.println(second);
    //     int [] Array = swap(testArray);
    //     System.out.println("Array with Swapped Elements:" + Array);
    //     System.out.println("6. ===Done: Swap===\n");

    // }

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
    // //Tester for isElementfunction
    // public static void testisElement() {
    //     int [] testArray={1,2,3,4};
    //     int value = 3;
    //     System.out.println("7.====== Testing: isElement =====");
    //     System.out.print("Input array: ");
    //     System.out.println(arrayToString(testArray));
    //     System.out.print("Input value: ");
    //     System.out.println(value);
    //     present = isElement(testArray);
    //     System.out.println("Present?:" + present);
    //     System.out.println("7. === Done:isElement\n");

    // }

    //indexOf pseudo code
    /* input: array[], int value
    output:int index
    method:
        int index = -1
        for i from 0 to n-1
            if array[i]= element
            return
        return index*/
    //8. indexOffunction
    // public static int indexOf(int[] array, int value) {
    //          {
    //             int length = array.length;
    //             int i = 0;
    //             while (i< length) {
    //                 if (array[i] == value){
    //                     return i;
    //                 }
    //                 else {
    //                     i = i + 1;
    //                 }
    //             }
    //             return -1;
    
    //          }
    
    //       }

    // //Tester for indexOffunction
    //    public static void testIndexOf(){
    //          int [] testArray={1,2,3,4};
    //          int value = 3;
    //          System.out.println("8.===== Testing: indexOf ======");
    //          System.out.print("Input array: ");
    //          System.out.println(arrayToString(testArray));
    //          System.out.print("Input value: ");
    //          System.out.println(value);
    //          int index = indexOf(testArray);
    //          System.out.println("Index:"+index);
    //          System.out.println("8. ===Done: indexOf===\n");
    
    //      }
   
    //findMin pseudo code
    /* input: array[]
    output:int min
    method:
        int array[] = {}
        int i ; min
        min = array[0]
        for (i=0; i<array.length;i++) 
            if (min > array[i])
            min = array[i]
            return min*/
    //9. findMinfunction
    //Tester for findMinfunction
    public static void testFindMin(){
        int [] testArray={1,2,3,4};
        System.out.println("9.===== Testing: findMin ======");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        int min = findMin(testArray);
        System.out.println("Minimum:"+min);
        System.out.println("9. ===Done: findMin===\n");

    }

    //findMinIndex pseudo code
    /* input: array[]
    output:int minIndex
    method:
        for i from 0 to n-1
            if array[i] = min
            return i
            */
    //10. findMinIndexfunction
    //Tester for findMinIndexfunction
    public static void testFindMinIndex(){
        int [] testArray={1,2,3,4};
        System.out.println("10.===== Testing: findMinIndex ======");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        int minIndex = findMinIndex(testArray);
        System.out.println("MinIndex:"+minIndex);
        System.out.println("10. ===Done: findMinIndex ===\n");

    }

    //findMax pseudo code
    /* input: array[]
    output:int max
    method:
        int array[] = {}
        int i ; max
        max = array[0]
        for (i=0; i<array.length;i++) 
            if (min < array[i])
            min = array[i]
            return max*/
    //11. findMaxfunction
    //Tester for findMaxfunction
    public static void testFindMax(){
        int [] testArray={1,2,3,4};
        System.out.println("11.===== Testing: findMax ======");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        int max = findMax(testArray);
        System.out.println("Maximum:"+max);
        System.out.println("11. ===Done: findMax===\n");

    }

    //findMaxIndex pseudo code
    /* input: array[]
    output:maxIndex
    method:
        for i from 0 to n-1
            if array[i] = max
            return i*/
    //12. findMaxIndexfunction
    //Tester for findMaxIndexfunction
    public static void testFindMaxIndex(){
        int [] testArray={1,2,3,4};
        System.out.println("12.===== Testing: findMaxIndex ======");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        int maxIndex = findMaxIndex(testArray);
        System.out.println("MaxIndex:"+maxIndex);
        System.out.println("12. ===Done: findMaxIndex ===\n");

    }

    //reverse pseudo code
    /* input: array[n]
    output:array[n]
    method:
        for i=0 to n
            tenp = array[i]
            array[i] = array[n-i-1]
            array[n-i-1]=temp
            return array[n]*/
    //13. reversefunction
    //Tester for reversefunction
    public static void testReverse(){
        int [] testArray={1,2,3,4};
        System.out.println("13.===== Testing: reverse ======");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        int reverse = reverse(testArray);
        System.out.println("Reversed Array:"+reverse);
        System.out.println("13. ===Done: reverse ===\n");

    }

    //returnReverse pseudo code                     
    /* input: array[]
    output:new array[]
    method:
        int array[] = {}
        int new array [] = new int[array.length];
        for i=0 to n
            tenp = array[i]
            array[i] = array[n-i-1]
            array[n-i-1]=temp
            new array[i] = array[i];
        return new array*/
    //14. returnReversefunction
    //Tester for returnReversefunction
    public static void testReturnReverse(){
        int [] testArray={1,2,3,4};
        System.out.println("14.===== Testing: Returnreverse ======");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        int index = returnReverse(testArray);
        System.out.println("New Reversed Array:"+index);
        System.out.println("14. ===Done: Returnreverse ===\n");

    }

    //intersection pseudo code
    /* input: array[], array2[]
    output:new array[]
    method:
    int array[]= {}
    int array2[]={}
    for(int i =0; i<array.length;i++)
        for (int j =0; i < array2.length; j++)
            if (array[i]==array2[j])
            new array[] = array2[]
        return new array*/
    //15. intersectionfunction
    //Tester for intersectionfunction
    public static void testIntersection(){
        int [] testArray={1,2,3,4};
        int [] testArray2={0,2,4,6};
        System.out.println("15.===== Testing: Intersection ======");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        System.out.print("Input Second array: ");
        System.out.println(arrayToString(testArray2));
        int intersection = intersection(testArray, testArray2);
        System.out.println("Intersection of Arrays:"+intersection);
        System.out.println("15. ===Done: Intersection===\n");

    }

    //union pseudo code
    /* input: array[], array2[]
    output:new array[]
    method:
        int array[]= {}
        int array2[]={}
        int a1 = array.length
        int a2 = array2.length
        new array[] = newvint[a1+a2]
            return new array*/
    //16. unionfunction
    //Tester for unionfunction
    public static void testUnion(){
        int [] testArray={1,2,3,4};
        int [] testArray2={0,2,4,6};
        System.out.println("16.===== Testing: Union ======");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        System.out.print("Input Second array: ");
        System.out.println(arrayToString(testArray2));
        int union = union(testArray, testArray2);
        System.out.println("Union of Arrays:"+union);
        System.out.println("16. ===Done: Union===\n");

    }



    //main: runs tester functions
    public static void main(String[] args){

        //===================
        //Test Main Functions
        //===================
        //testCopy();
        //testAddAll();
        //testAddArrays();
        //testMultiplyAll();
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
