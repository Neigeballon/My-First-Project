package quest;

import static quest.Quest.*;
import java.awt.*;
import javax.swing.*;

public class MapPanel extends JFrame {
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    Image characterImage = new ImageIcon("character.png").getImage();

    g2d.drawImage(characterImage, 0, 0, 0.25*getWidth(), 0.25*getHeight(), this);
  }
}

public class Quest {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("Quest For Glory Map");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800, 600);
      frame.add(new MapPanel());
      frame.setLocationRelativeTo(null); // Center on screen
      frame.setVisible(true);
    });
  }
}
