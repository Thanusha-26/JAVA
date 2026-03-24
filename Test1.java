package pack2;

import pack1.Calculator;

class Test1 {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        System.out.println("Addition is: " + c.add(10, 20));
        System.out.println("Subtraction is: " + c.sub(20, 10));
    }
}