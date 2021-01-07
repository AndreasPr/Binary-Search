/**
 * Created on 07/Jan/2021 to BinarySearch
 */
public class binarySearch {


    static int binarySearchFunc(int[] arrayForSearch, int lengthOfArray, int elementForSearch){
        int start = 0;
        int end = lengthOfArray - 1;

        while(start < end){
            //Calculate the mid index
            int middle = start + (end - start)/2;

            if(arrayForSearch[middle] == elementForSearch){
                return middle;
            }

            if(arrayForSearch[middle] < elementForSearch){
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }

        }
        return -1;

    }


    public static void main(String args[]){
        binarySearch bs = new binarySearch();
        int[] arrayForSearch = {1,3,6,7,9,11,35,56,67,89,100,123,134};
        int lengthOfArray = arrayForSearch.length;
        int elementForSearch = 123;
        int result = binarySearchFunc(arrayForSearch, lengthOfArray, elementForSearch);
        if(result == -1){
            System.out.println("Element was not found!");
        }
        else{
            System.out.println("Element was FOUND at index: " + result);
        }
    }
}
