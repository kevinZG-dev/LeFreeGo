package project.controller;

import java.awt.*;
import javax.swing.*;


public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Le FreeGo");

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(450,300));
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);

	}

}
