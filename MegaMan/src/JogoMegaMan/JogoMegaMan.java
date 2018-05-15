package JogoMegaMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JogoMegaMan extends JFrame{

	ImageIcon paradoDireito = new ImageIcon(getClass().getResource("/paradoDireito.png"));
	ImageIcon paradoEsquerdo = new ImageIcon(getClass().getResource("/paradoEsquerdo.png"));
	ImageIcon correndoDireito = new ImageIcon(getClass().getResource("/correndoDireito.gif"));
	ImageIcon correndoEsquerdo = new ImageIcon(getClass().getResource("/correndoEsquerdo.gif"));
	ImageIcon idleDireito = new ImageIcon(getClass().getResource("/idleDireito.gif"));
	ImageIcon idleEsquerdo = new ImageIcon(getClass().getResource("/idleDireito.gif"));
	ImageIcon pulandoDireito = new ImageIcon(getClass().getResource("/pulandoDireito.png"));
	ImageIcon pulandoEsquerdo = new ImageIcon(getClass().getResource("/pulandoDireito.png"));
	ImageIcon atirandoDireito = new ImageIcon(getClass().getResource("/atirandoDireito.png"));
	ImageIcon atirandoEsquerdo = new ImageIcon(getClass().getResource("/atirandoEsquerdo.png"));
	
	JLabel lblMegaMan = new JLabel(idleDireito);
	
	int posMegaManX = 30;
	int posMegaManY = 170;
	
	public JogoMegaMan() {
		editarJanela();
		editarComponentes();
		addMovimento();
	}
	
	public void addMovimento() {
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent arg0) {
				
			}
			
			public void keyReleased(KeyEvent arg0) {
				if (arg0.getKeyCode()==37) {
					lblMegaMan.setIcon(idleEsquerdo);
				}
				if (arg0.getKeyCode()==39) {
					lblMegaMan.setIcon(idleDireito);
				}
			}
			
			public void keyPressed(KeyEvent arg0) {
				/*
				 * if (arg0.getKeyCode()==38) {
					posMegaManY -= 10;
				}
				if (arg0.getKeyCode()==40) {
					posMegaManY += 10;
				}
				*/
				if (arg0.getKeyCode()==37) {
					posMegaManX -= 5;
					lblMegaMan.setIcon(correndoEsquerdo);
				}
				if (arg0.getKeyCode()==39) {
					posMegaManX += 5;
					lblMegaMan.setIcon(correndoDireito);
				}
				lblMegaMan.setBounds(posMegaManX,posMegaManY, 48, 48);
			}
		});
	}
	
	public void editarComponentes() {
		lblMegaMan.setBounds(posMegaManX, posMegaManY, 62, 60);
	}
	
	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		add(lblMegaMan);
	}
	
	public static void main(String[] args) {
		new JogoMegaMan();
	}
	
}
