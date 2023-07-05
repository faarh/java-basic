public class Main {
    public static void main(String[] args) {
        ComplexNumber C1 = new ComplexNumber(7,4);
        C1.print();
        ComplexNumber C2 = new ComplexNumber(4, 5);
        C2.print();
        ComplexNumber C3 = C1.add(C2);
        C3.print();
        ComplexNumber C4 = C1.subtract(C2);
        C4.print();

    }
}
