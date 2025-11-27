public static void main(String[] args) {
    for (int i = 1; i < 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + ": can divide for both 3 and 5");
        } else if (i % 5 == 0) {
            System.out.println(i + ": can divide for 5");
        }else if (i % 3 == 0 ) {
            System.out.println(i + ": can divide for 3 ");
        } else {
            System.out.println(i);
        }
    }
}
