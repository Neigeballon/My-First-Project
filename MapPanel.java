package quest;

import static quest.Quest.*;
import java.awt.*;
import javax.swing.*;

public class MapPanel extends JPanel {

  private Image worldImage = new ImageIcon("world.png").getImage();
  private Image characterImage = new ImageIcon(cClass+".png").getImage();
  private Image terrainImage;

  public void loadImage() {
    terrainImage = new ImageIcon(t.path).getImage();
    repaint();
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    g2d.drawImage(characterImage, (int)(tileColumn*0.25*getWidth()), (int)(tileRow*0.25*getHeight()), (int)(0.25*getWidth()), (int)(0.25*getHeight()), this);

    for (Enemy e : enemies) {
      g2d.drawImage(e.eImage, (int)(e.eColumn*0.25*getWidth()), (int)(e.eRow*0.25*getHeight()), (int)(0.25*getWidth()), (int)(0.25*getHeight()), this);
    }
  }
}
