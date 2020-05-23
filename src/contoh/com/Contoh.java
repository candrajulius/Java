package contoh.com;

public class Contoh {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 1) {
                    System.out.print(" * ");
                }
            }
            if (i == 1) {
                System.out.print("\n");
            }
        }
    }
}
