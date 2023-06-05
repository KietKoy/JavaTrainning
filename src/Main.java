public class Main {
    public static void main(String[] args) {
        int i = 0;
        int[] arr = new int[5];
        arr = new int[]{1, 2, 3, 4, 5};
        while(i < 10) {
            System.out.println(arr[++i]);
        }
    }
}