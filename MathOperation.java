class MathOperation {

    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperation obj = new MathOperation();

        System.out.println(obj.add(10, 20));        // Calls add(int, int)
        System.out.println(obj.add(10, 20, 30));    // Calls add(int, int, int)
        System.out.println(obj.add(5.5, 4.5));      // Calls add(double, double)
    }
}
