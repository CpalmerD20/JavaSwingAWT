import java.awt.Font;
import javax.swing.JCheckBox;

public class CheckBox extends JCheckBox{
  
  String words = "I'm not a robot.";
  
  CheckBox() {
    this.setFocusable(false);
    this.setFont(new Font("Segoe UI",Font.PLAIN,15));
    this.setText(words);
  }
}
