import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import  javax.swing.JRadioButton;


public class Cable extends JFrame implements ActionListener {

private final JTextField voltageDropJTextField= new JTextField(20); // voltage 
private final JTextField kiloWattsJTextField= new JTextField(20);	// Kw
private final JTextField ampsJTextField= new JTextField(20);	//Amps
private final JTextField lengthJTextField= new JTextField(20);	// Length
private final JTextField supplyTextField= new JTextField(20);

private final JTextField resultJTextField=new JTextField(20);  //result  	
	
public Cable() {
	Color myPurple= new Color (102,90,175);
	setTitle("Cable Calculator");
	
	Container contents=getContentPane();
	JButton button=new JButton ("calculate");
	JCheckBox checkBox= new JCheckBox("rest");
	JRadioButton radioButton=new JRadioButton("buttoni");
	contents.setBackground(myPurple);
	
	
	contents.setLayout(new GridLayout (8,1));

	
	contents.add(new JLabel("Voltage"));  //1
	contents.add(voltageDropJTextField);
	
	contents.add(new JLabel("KiloWatts"));//2
	contents.add(kiloWattsJTextField);
	
	contents.add(new JLabel("OR Amps"));  //3
	contents.add(ampsJTextField);
	
	contents.add(new JLabel("Cable Run")); //4
	contents.add(lengthJTextField);
	
	contents.add(new JLabel("Supply")); //5
	//contents.add(supplyTextField);
	String[] phases= {"1phase"," 3phase", "DC"};
	final JComboBox<String> dropDown= new JComboBox <String>(phases);
	contents.add(dropDown);
	
	contents.add(new JLabel("Cable Size:")); //6
	contents.add(resultJTextField);
	
	contents.add(button);	//7
	button.addActionListener(this);
	
	contents.add(checkBox);
	//contents.add(radioButton);
	
	
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	pack();
	
}
	public static void main(String[] args) {
		Cable cable=new Cable();
		cable.setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		//int volts=Integer.parseInt(voltageDropJTextField.getText());
		//int Kwatts=Integer.parseInt(kiloWattsJTextField.getText());
		//int Amps=Integer.parseInt(ampsJTextField.getText());
		//int cableRun=Integer.parseInt(lengthJTextField.getText());
		
		if (kiloWattsJTextField.getText().equals("") ) {
			int volts=Integer.parseInt(voltageDropJTextField.getText());
			int Amps=Integer.parseInt(ampsJTextField.getText());
			int cableRun=Integer.parseInt(lengthJTextField.getText());	
			
			int result=volts*Amps*cableRun;
			resultJTextField.setText(""+result);
			}
		else  {
			int volts=Integer.parseInt(voltageDropJTextField.getText());
			int Amps=Integer.parseInt(ampsJTextField.getText());
			int cableRun=Integer.parseInt(lengthJTextField.getText());	
			
			int result=volts+Amps+cableRun;
			resultJTextField.setText(""+result);
		}
		
		}
		
	

}
