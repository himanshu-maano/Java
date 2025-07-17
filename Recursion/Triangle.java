public class Triangle {
    public static void main(String[] args) {
        triangle(4, 0);
        System.out.println();
        invertedTriangle(4, 0);
    }

    static void triangle (int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            System.out.print('*');
            triangle(r, c + 1);
        }
        else{
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    static void invertedTriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            invertedTriangle(r, c + 1);
            System.out.print('*');
        } else {
            invertedTriangle(r - 1, 0);
            System.out.println();
        }
    }
}
