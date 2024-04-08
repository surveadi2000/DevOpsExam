public class Multiplication {
    public static void main(String[] args) {
        // Define two numbers to multiply
        int num1 = 5;
        int num2 = 7;

        // Calculate the product
        int result = multiply(num1, num2);

        // Display the result
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
    }

    // Method to perform multiplication of two numbers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}
