package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
	
	public MainFrame() {
		
		setTitle("�١�..���ԢѢ�...�ڡ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		container.setLayout(null);
		
		container.setBackground(Color.BLACK);
		
		// ����� �� ������ StarRain Ŭ���� ȣ��
		new StarRain(container);
		
		/*
		 *	���� ��ư
		 */
		JButton rand = new JButton("������ư");
		// ��ư ����
		rand.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// ��ư�� Ŭ���ߴٰ� ������ �Ʒ� �ڵ尡 ����
				
				/*
				 * �������� ���� �޾� ���� ����
				 */				
				
				if( (int)(Math.random()*2) == 0 ) {
					// ���� ���� 0�̸� bombGame package�� MainŬ������ main�� ����
					bombGame.Main.main(null);
				} else {
					// �� ��, nyangIGame package�� NyangiGameŬ������ main�� ����
					nyangIGame.NyangiGame.main(null);
				}
						
				
			}
					
		});
		// ��ư ��ġ �� ũ�� ����
		rand.setBounds(50, 100, 330, 80);
		// ��ư ���� ����
		rand.setBackground(Color.BLUE);
		// ��ư ���� ���� ����
		rand.setForeground(Color.WHITE);
		
		
		/*
		 * ����ã�� ��ư
		 */
		JButton bomb = new JButton("����ã��");
		// ��ư ����
		bomb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// ��ư�� Ŭ���ߴٰ� ������ �Ʒ� �ڵ尡 ����
				
				// bombGame package�� MainŬ������ main�� ����
				bombGame.Main.main(null);
			}
			
		});
		// ��ư ��ġ �� ũ�� ����
		bomb.setBounds(rand.getX(), 200, 150, 80);
		// ��ư ���� ����
		bomb.setBackground(Color.RED);
		// ��ư ���� ���� ����
		bomb.setForeground(Color.WHITE);
		
		
		/*
		 * �ɴ��� ��� ��ư
		 */
		JButton nyang = new JButton("�ɴ���ã��");
		// ��ư ����
		nyang.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// nyangIGame package�� NyangiGameŬ������ main�� ����
				nyangIGame.NyangiGame.main(null);
			}
			
		});
		// ��ư ��ġ �� ũ�� ����		
		nyang.setBounds(bomb.getX()+180, bomb.getY(), bomb.getWidth(), bomb.getHeight());
		// ��ư ���� ����
		nyang.setBackground(Color.ORANGE);
		
		
		
		/*
		 * �ϴ� ������
		 */
		new BottomDesign(this);
		
		/*
		 * �����̳ʿ� ��ư ���̱�
		 */
		container.add(rand);
		container.add(bomb);
		container.add(nyang);
		
		setSize(450,500);
		setVisible(true);
		
	}

}