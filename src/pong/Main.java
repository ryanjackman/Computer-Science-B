package pong;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private GamePanel game;
	
	public Main(){
		game = new GamePanel(584, 363);
		setSize(600, 400);
		FlowLayout layout = new FlowLayout();
		layout.setHgap(0);
		layout.setVgap(0);
		setLayout(layout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);
        add(game);
        //add(new Button("button"), BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
