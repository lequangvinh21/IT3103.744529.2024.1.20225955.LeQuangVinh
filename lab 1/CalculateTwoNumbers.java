import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        // Input two numbers as strings
        String strNum1 = JOptionPane.showInputDialog(null, "Please enter the first number:", "Input", JOptionPane.INFORMATION_MESSAGE);
        String strNum2 = JOptionPane.showInputDialog(null, "Please enter the second number:", "Input", JOptionPane.INFORMATION_MESSAGE);
        
        // Convert the input strings to double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Perform calculations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        // Check if the divisor is zero before performing division
        String quotient = (num2 != 0) ? String.valueOf(num1 / num2) : "Undefined (Division by zero)";

        // Prepare the result message
        String result = "Sum: " + sum + 
                        "\nDifference: " + difference + 
                        "\nProduct: " + product + 
                        "\nQuotient: " + quotient;

        // Show the result in a dialog box
        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
