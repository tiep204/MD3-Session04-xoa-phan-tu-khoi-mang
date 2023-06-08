import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số mà bạn muốn xóa: ");
        int elementToRemove = sc.nextInt();
        int[] arr = {1, 3, 4, 6, 8, 5, 3, 5};
        int indexToRemove = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            int[] newArr = new int[arr.length - 1];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != indexToRemove) {
                    newArr[j] = arr[i];
                    j++;
                }
            }
            arr = newArr;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        } else {
            System.out.println("Phần tử không tồn tại trong mảng.");
        }
    }
}