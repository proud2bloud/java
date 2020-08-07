import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class BullsEye extends JPanel {

		 public void paintComponent(Graphics g){
		        super.paintComponent(g);
		        Color color1 = new Color(100, 199, 100);
		        Color color2 = new Color(208, 180, 45);

		        for(int i = 5; i > 0; i--)
		        {
		            int x = 250 + i*25;
		            int y = x;
		            int width = 250 - 50*i;
		            int height = width;
		            System.out.println(x + " : " + width);

		            if(i == 1 || i == 3 || i == 5) 
		            {
		                g.setColor(color1);
		            }

		            else if(i == 2 || i == 4)
		            {
		                g.setColor(color2);
		            }

		            g.fillOval(x, y, width, height);
		        }

}
}
