package PackageTp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MaFenetre extends JFrame  {
	JLabel jL1 = new JLabel("Nom : ");
	JTextField jT1 = new JTextField();
	JButton jB1 = new JButton("add : ");
	JButton jB2 = new JButton("supp : ");
	List liste1 = new List();
	List liste2 = new List();

	public MaFenetre() {
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp1.add(jL1);
		jp1.add(jT1);
		jp1.add(jB1);
		jp1.add(jB2);
		jT1.setPreferredSize(new Dimension(100, 26));
		this.add(jp1, BorderLayout.NORTH);
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout());
		jp2.add(liste1);
		jp2.add(liste2);
		this.add(jp2, BorderLayout.CENTER);
		this.setBounds(10, 10, 500, 500);
		// si on veut notre fenetre avoir même dimension que notre ecran
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
//		jB1.addActionListener(this);
//		jB2.addActionListener(this);
		jB1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String S = jT1.getText();
				liste1.add(S);
				jT1.setText("");
			}
			
		});
		jB2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num=liste1.getSelectedIndex();
				liste1.remove(num);
			}
			
		});
		//
		this.setVisible(true);
	}
	

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if (e.getSource() == jB1) {
//			String S = jT1.getText();
//			liste1.add(S);
//			jT1.setText("");
//		}
//		else if(e.getSource() == jB2) {
//			int num=liste1.getSelectedIndex();
//			liste1.remove(num);
//		}
//	}

	// main
	public static void main(String[] args) {
		MaFenetre fntr = new MaFenetre();
	}

}
