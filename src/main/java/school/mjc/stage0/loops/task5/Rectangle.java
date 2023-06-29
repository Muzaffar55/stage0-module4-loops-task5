package school.mjc.stage0.loops.task5;

public class Rectangle {
    public static void printRectangleFrom8s(int height, int length){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == length - 1) {
                    System.out.print(8);
                } else if (j == 0 || j == height - 1) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
