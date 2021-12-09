import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame implements ActionListener{

  TextField tField = new TextField();
  TextPane tPane = new TextPane();
  CheckBox cBox = new CheckBox();  
  Label label = new Label();
  JButton button = new JButton("Submit");
  
  Window() {
  
    button.addActionListener(this);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300,300);
    this.setResizable(false);
    this.setLayout(new FlowLayout());
    this.add(label);
    this.add(cBox);
    this.add(tField);
    this.add(tPane);
    this.add(button);
    this.setVisible(true);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button) {
      if(cBox.isSelected()) {
        tPane.setText("Welcome " + tField.getText());
        button.setEnabled(false);
        tField.setText("");
        tField.setEditable(false);        
      } 
      else {
        tPane.setText("Are you a robot?");
      }
    }
  }
}
