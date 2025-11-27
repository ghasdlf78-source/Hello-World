import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    for (int i = 0; i < a.length; i++) {
        System.out.println("Nhập số " + i + " :");
        a[i] = sc.nextInt();
    }
    int max = a[0];
    int min = a[0];
    int max2 = a[0];
    for (int n : a) {
        if (n > max) {
            max = n;
        } else if (n < min)
            min = n;
        }
    for (int n : a) {
        if (n > max2&&n < max) {
            max2 = n;
        }
    }
    System.out.println("Số lớn nhất: " + max);
    System.out.println("Sô nhỏ nhất: " + min);
    System.out.println("Số lớn thứ 2: " + max2);
}
