import java.util.Arrays; 


public class Testers{
    //isElement
    /* 
    input: array[], int value
    output:boolean
    method:
        for i=0 thru array.length
            if array[i]= value
            return true
        return false*/

    public static boolean isElement(int[] array,int value) {
        for(int i =0; i < array.length; i ++)
            if(array[i] == value)
                return true;
            return false;
    }

    //tester for isElement
    public static void test_isElement(int [] array) {
        int value = array[array.length - 1]; //selecting an element from the array
        System.out.println("Testing isElement with value:" + value);
        System.out.println("Result:" + isElement(array, value)); //Expected to return true

    }

    //main changes

    public static void main(String[] args){
        //creating an input array for testtinf
        int[] array = {3,4,5,12,87,31,56,32,29,0,4,5,6,7};
        //printing the array
        System.out.println("Array for testing:" + Arrays.toString(array));
        //Run tests
        test_isElement(array);
    }

    
}
