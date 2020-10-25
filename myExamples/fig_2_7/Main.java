import javax.swing.JOptionPane;

public class Main{

	public static void main(String[] args)
	{
		

		int first = Integer.parseInt(JOptionPane.showInputDialog("Input first number")); 
		int second = Integer.parseInt(JOptionPane.showInputDialog("Input second number"));

		String text = String.format("Sum is %d", first + second);	
		JOptionPane.showMessageDialog(null,text);
	}

}
