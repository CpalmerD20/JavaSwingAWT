import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;

public class Label extends JLabel{
  
  String words = "Enter Username";

  Label() {
    this.setOpaque(true);
    this.setSize(new Dimension(250,40));
    this.setFont(new Font("Segoe UI",Font.PLAIN,15));
    this.setText(words);
  }
}
