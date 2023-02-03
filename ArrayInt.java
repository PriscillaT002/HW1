import java.util.Arrays; 


public class ArrayInt{

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
    /* */
    //2. addAllfunction
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
    public static boolean isElement(int[] array,int value) {
        for(int i =0; i < array.length; i ++)
            if(array[i] == value)
                return true;
            return false;
    }
    //Tester for isElementfunction
    public static void test_isElement(int [] array) {
        int value = array[array.length - 1]; //selecting an element from the array
        System.out.println("Testing isElement with value:" + value);
        System.out.println("Result:" + isElement(array, value)); //Expected to return true

    }

    //indexOf pseudo code
    /* */
    //8. multiplyAllfunction
    //Tester for multiplyAllfunction

    //findMin pseudo code
    /* */
    //9. multiplyAllfunction
    //Tester for multiplyAllfunction

    //findMinIndex pseudo code
    /* */
    //10. multiplyAllfunction
    //Tester for multiplyAllfunction

    //findMax pseudo code
    /* */
    //11. multiplyAllfunction
    //Tester for multiplyAllfunction

    //findMaxIndex pseudo code
    /* */
    //12. multiplyAllfunction
    //Tester for multiplyAllfunction

    //reverse pseudo code
    /* */
    //13. multiplyAllfunction
    //Tester for multiplyAllfunction

    //intersection pseudo code
    /* */
    //14. multiplyAllfunction
    //Tester for multiplyAllfunction

    //union pseudo code
    /* */
    //14. multiplyAllfunction
    //Tester for multiplyAllfunction



    //main: runs tester functions
    public static void main(String[] args){

        //===================
        //Test Main Functions
        //===================
        //testCopy();
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
        //testIntersection();
        //testUnion();

    }

    
}
