import javax.swing.JOptionPane;

public class InputDialogExample {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("name:");

       
        String ageStr = JOptionPane.showInputDialog("age:");
        int age = Integer.parseInt(ageStr); // Chuyển đổi chuỗi đầu vào thành số nguyên

        
        JOptionPane.showMessageDialog(null, "hello" + name + ", you  are" + age + " years");
    }
}
