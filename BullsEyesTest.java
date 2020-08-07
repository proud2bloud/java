import javax.swing.JFrame;
public class BullsEyesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BullsEye panel = new BullsEye();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);

	}

}
