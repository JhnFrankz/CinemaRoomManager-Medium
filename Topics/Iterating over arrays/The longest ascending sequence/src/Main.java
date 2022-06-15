import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] x = new int[size];
        int longest = 1;
        int count = 1;

        for (int i = 0; i < size; i++) {
            x[i] = Integer.parseInt(scanner.next());

            if (i > 0) {
                if (x[i] > x[i - 1]) {
                    count++;
                    continue;
                }
                longest = count > longest ? count : longest;
                count = 1;
            }
        }

        longest = count > longest ? count : longest;
        System.out.println(longest);

    }
}