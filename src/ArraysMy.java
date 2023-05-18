import java.util.ArrayList;
import java.util.List;

public class ArraysMy {
    public static int findFirst(int[] arr, int x){
        for (int i = 0; i <= arr.length-1; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static int findLast(int[] arr, int x){
        for (int i = arr.length-1; i >= 0; i--){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static int maxAbs(int[] arr){
        int max = arr[0];
        int maxResult = arr[0];
        for (int el: arr){
            if (max < Math.abs(el)){
                max = Math.abs(el);
                maxResult = el;
            }
        }
        return maxResult;
    }

    public static int countPositive(int[] arr){
        int counter = 0;
        for (int el: arr){
            if (el > 0){
                counter++;
            }
        }
        return counter;
    }

    public static boolean palindrom(int[] arr){
        int count = arr.length - 1;
        for (int i = 0; i <= count/2; i++){
            if(arr[i] != arr[count-i]){
                return false;
            }
        }
        return true;
    }

    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    public static int[] reverseBack(int[] arr){
        int[] arrRevers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrRevers[i] = arr[arr.length - i - 1];
        }
        return arrRevers;
    }

    public static int[] concat(int[] arr1, int[] arr2){
        int[] arrConcat = new int[arr1.length + arr2.length];
        int count = 0;
        for (int el1 : arr1) {
            arrConcat[count++] = el1;
        }
        for (int el2 : arr2) {
            arrConcat[count++] = el2;
        }
        return arrConcat;
    }

    public static int[] findAll(int[] arr, int x){
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i <= arr.length-1; i++){
            if (arr[i] == x){
                temp.add(i);
            }
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++){
            result[i] = temp.get(i);
        }
        return result;
    }

    public static int[] deleteNegative(int[] arr){
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i <= arr.length-1; i++){
            if (arr[i] >= 0){
                temp.add(arr[i]);
            }
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++){
            result[i] = temp.get(i);
        }
        return result;
    }

    public static int[] add(int[] arr, int x, int pos){
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i <= arr.length-1; i++){
            if (i == pos){
                temp.add(x);
            }
            temp.add(arr[i]);
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++){
            result[i] = temp.get(i);
        }
        return result;
    }

    public static int[] addArr(int[] arr, int[] ins, int pos){
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i <= arr.length-1; i++){
            if (i == pos){
                for (int el1 : ins) {
                    temp.add(el1);
                }
            }
            temp.add(arr[i]);
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++){
            result[i] = temp.get(i);
        }
        return result;
    }


}
