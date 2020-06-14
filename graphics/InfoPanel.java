package graphics;
import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * Class that describes the info panel
 * @author Mendel Amar id:337790786
 */
public class InfoPanel {
	static JFrame f;
	/**
	 * Info panel Ctor
	 * @author Mendel Amar id:337790786
	 */
	public InfoPanel() {
	}
	/**
     * Choose info action
     *
     * @param e the event of the button
     */
	static class InfoPan implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			f = new JFrame();
			String data[][] = { { "A", "B", "C", "D", "E", "F", "G", "H", "I" } };
			String column[] = { "Animal", "Category", "Type", "Speed", "Energy Amount", "Distance",
					"Energy consumption"};
			JTable jt = new JTable(data, column);
			jt.setBounds(30, 40, 200, 300);
			JScrollPane sp = new JScrollPane(jt);
			f.add(sp);
			f.setSize(800, 900);
			f.setVisible(true);
		}
	}
}
