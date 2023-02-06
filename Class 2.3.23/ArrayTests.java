import MyArray1; 
public class ArrayTests {

       //Tester for copyfunction
       public static void testCopy(){

        int [] testArray={1,2,3,4};
        System.out.println("1.===== Testing: Copy ======");
        System.out.print("Input array: ");
        System.out.println(arrayToString(testArray));
        int[] copy = copy(testArray);
        System.out.println("Copy:"+ arrayToString(copy));
        System.out.println("1. ===Done: copy===\n");

    }
    
}
