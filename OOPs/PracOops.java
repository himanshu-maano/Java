import java.util.Scanner;

public class PracOops {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        // Create 2 complex numbers
        Complex c1 = new Complex(sc);
        Complex c2 = new Complex(sc);

        // Performing operation on complex num
        Complex resultSum = Complex.sum(c1, c2);
        Complex resultDiff = Complex.diff(c1, c2);
        Complex resultProd = Complex.prod(c1, c2);

        resultSum.print();
        resultDiff.print();
        resultProd.print();

        sc.close();
    }
    
}

class Complex {

    int real;
    int img;

    // Constructor taking input from user....
    Complex(Scanner sc) {
        System.out.println("Enter real part : ");
        this.real = sc.nextInt();
        System.out.println("Enter imaginery part : ");
        this.img = sc.nextInt();
    }

    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    static Complex sum(Complex a, Complex b) {
        int sumReal = a.real + b.real;
        int sumImg = a.img + b.img;
        return new Complex(sumReal, sumImg);
    }

    static Complex diff(Complex a, Complex b){
        int diffReal = a.real - b.real;
        int diffImg = a.img - b.img;
        return new Complex(diffReal, diffImg);
    }

    static Complex prod(Complex a, Complex b) {
        int realProd = ((a.real * b.real) - (a.img * b.img));
        int imgProd = ((a.real * b.img) + (a.img * b.real));

        return new Complex(realProd, imgProd);
    }

    void print() {
        if(this.real == 0 && this.img != 0){
            System.out.println(this.img + "i");
        }
        else if(this.img == 0 && this.real != 0){
            System.out.println(this.real);
        }
        else if(this.img < 0){
            System.out.println(this.real + "" + this.img + "i");
        }
        else{
            System.out.println(this.real + "+" + this.img + "i");
        }
    }
}
