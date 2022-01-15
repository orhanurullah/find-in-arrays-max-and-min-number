public class Main {

    public static int min(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < temp){
                temp = arr[i];
            }
        }
        return temp;
    }
    public static int max(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > temp){
                temp = arr[i];
            }
        }
        return temp;
    }
    public static int nearestSmallestNumber(int[] arr, int num){
        int temp = min(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < num && arr[i] > temp){
                temp = arr[i];
            }
        }
        return temp;
    }
    public static int nearestBiggestNumber(int[] arr, int num){
        int temp = max(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > num && arr[i] < temp){
               temp = arr[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {12, 143, 53, -2199, 9, 14, -432, 1};
        System.out.println("Dizinin En Küçüğü : " + min(arr));
        System.out.println("Dizinin En Büyüğü : " + max(arr));

        System.out.println("Girilen Sayıya En Yakın Küçük Sayı : " +
                nearestSmallestNumber(arr, 5));

        System.out.println("Girilen Sayıya En Yakın Büyük Sayı : " +
                nearestBiggestNumber(arr, 5));


    }
}
