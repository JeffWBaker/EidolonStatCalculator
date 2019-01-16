import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class displayEligos extends JFrame {
	private int count = 1;
	private int countStar = 0;
	double[] eligosStar = {1.1670, 1.47893583161, 1.1670 , 1.1670};

	public static void main(String[] args) throws  IOException {
		new displayEligos();

	}

	public displayEligos() throws FileNotFoundException, IOException {
		int[] level = {1,5,6,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60};
		// --------------------frame------------------
		this.setSize(700, 350);

		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Merrilee");
		stats eligos = new stats();
		int[][] eligosStats = eligos.setStatEligos();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.gray);
		mainPanel.setLayout(null);

		JLabel label = new JLabel("Eligos");
		mainPanel.add(label);
		label.setFont(new Font("Serif", Font.PLAIN, 60));
		label.setBounds(300, 0, 300, 70);// (Width, Height , SizeWidth ,

		ImageIcon star = new ImageIcon("Images/star.png");
		JButton starIcon = new JButton(star);
		starIcon.setBounds(460, 0, 30, 30);
		starIcon.setBorderPainted(false);
        starIcon.setContentAreaFilled(false);
        starIcon.setFocusPainted(false);
        starIcon.setOpaque(false);
		mainPanel.add(starIcon);
		ImageIcon star1 = new ImageIcon("Images/star.png");
		JButton starIcon1 = new JButton(star1);
		starIcon1.setBounds(460, 0, 30, 30);
		starIcon1.setBorderPainted(false);
        starIcon1.setContentAreaFilled(false);
        starIcon1.setFocusPainted(false);
        starIcon1.setOpaque(false);
		mainPanel.add(starIcon1);
        ImageIcon star2 = new ImageIcon("Images/star.png");
        JButton starIcon2 = new JButton(star1);
        starIcon2.setBounds(460, 0, 30, 30);
        starIcon2.setBorderPainted(false);
        starIcon2.setContentAreaFilled(false);
        starIcon2.setFocusPainted(false);
        starIcon2.setOpaque(false);
        mainPanel.add(starIcon2);
        ImageIcon star3 = new ImageIcon("Images/star.png");
        JButton starIcon3 = new JButton(star1);
        starIcon3.setBounds(460, 0, 30, 30);
        starIcon3.setBorderPainted(false);
        starIcon3.setContentAreaFilled(false);
        starIcon3.setFocusPainted(false);
        starIcon3.setOpaque(false);
        mainPanel.add(starIcon3);
        JButton starIcon4 = new JButton(star1);
        starIcon4.setBounds(460, 0, 30, 30);
        starIcon4.setBorderPainted(false);
        starIcon4.setContentAreaFilled(false);
        starIcon4.setFocusPainted(false);
        starIcon4.setOpaque(false);
        mainPanel.add(starIcon4);

		ImageIcon iconStar = new ImageIcon("Images/downArrow.png");
		JButton downStar = new JButton(iconStar);
		downStar.setBounds(608, 0, 42, 42);
		downStar.setOpaque(false);
		downStar.setContentAreaFilled(false);
		mainPanel.add(downStar);

		ImageIcon iconStar2 = new ImageIcon("Images/upArrow.png");
		JButton upStar = new JButton(iconStar2);
		upStar.setBounds(650, 0, 42, 42);
		upStar.setOpaque(false);
		upStar.setContentAreaFilled(false);
		mainPanel.add(upStar);
		// SizeHeight)
		ImageIcon icon = new ImageIcon("Images/downArrow.png");
		JButton downButton = new JButton(icon);
		downButton.setBounds(608, 65, 42, 42);
		downButton.setOpaque(false);
		downButton.setContentAreaFilled(false);
		//downButton.setBorderPainted(false);
		mainPanel.add(downButton);

		ImageIcon icon2 = new ImageIcon("Images/upArrow.png");
		JButton upButton = new JButton(icon2);
		upButton.setBounds(650, 65, 42, 42);
		upButton.setOpaque(false);
		upButton.setContentAreaFilled(false);
		mainPanel.add(upButton);

		URL url = new URL(
				"https://vignette.wikia.nocookie.net/aura-kingdom/images/f/ff/Eligos.gif/revision/latest?cb=20131128060520");
		Icon iconEligos = new ImageIcon(url);
		JLabel Eligos = new JLabel(iconEligos);
		Eligos.setBounds(10, 10, 300, 300);
		mainPanel.add(Eligos);

		JLabel lv = new JLabel("LV.: ");
		lv.setBounds(320, 70, 70, 40);
		lv.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(lv);
		JLabel lvValue = new JLabel("1");
		lvValue.setBounds(400, 70, 100, 40);
		lvValue.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(lvValue);

		JLabel hp = new JLabel("Hp: ");
		hp.setBounds(320, 100, 70, 40);
		hp.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(hp);
		JLabel hpValue = new JLabel(String.valueOf(eligosStats[0][0]));
		hpValue.setBounds(400, 100, 150, 40);
		hpValue.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(hpValue);

		JLabel atk = new JLabel("ATK: ");
		atk.setBounds(320, 130, 80, 40);
		atk.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(atk);
		JLabel atkValue = new JLabel(String.valueOf(eligosStats[1][0]));
		atkValue.setBounds(400, 130, 150, 40);
		atkValue.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(atkValue);

		JLabel def = new JLabel("DEF: ");
		def.setBounds(320, 160, 80, 40);
		def.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(def);
		JLabel defValue = new JLabel(String.valueOf(eligosStats[2][0]));
		defValue.setBounds(400, 160, 150, 40);
		defValue.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(defValue);

		JLabel crit = new JLabel("CRIT: ");
		crit.setBounds(320, 190, 90, 40);
		crit.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(crit);
		JLabel critValue = new JLabel(String.valueOf(eligosStats[3][0]));
		critValue.setBounds(400, 190, 150, 40);
		critValue.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(critValue);

		JLabel eva = new JLabel("EVA: ");
		eva.setBounds(320, 220, 90, 40);
		eva.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(eva);
		JLabel evaValue = new JLabel(String.valueOf(eligosStats[3][0]));
		evaValue.setBounds(400, 220, 150, 40);
		evaValue.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(evaValue);

		JLabel spd = new JLabel("SPD: ");
		spd.setBounds(320, 250, 80, 40);
		spd.setFont(new Font("Serif", Font.PLAIN, 30));
		mainPanel.add(spd);

			upButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

					if (count <= 59 && count >= 1) {
						if(count == 0)count++;
					lvValue.setText(String.valueOf(level[count]));
					hpValue.setText(String.valueOf(eligosStats[0][count]));
					atkValue.setText(String.valueOf(eligosStats[1][count]));
					defValue.setText(String.valueOf(eligosStats[2][count]));
					critValue.setText(String.valueOf(eligosStats[3][count]));
					evaValue.setText(String.valueOf(eligosStats[3][count]));
					count++;

					}
				}
			});


			downButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

					if (count <= 60 && count >= 1) {
						count--;
					lvValue.setText(String.valueOf(level[count]));
					hpValue.setText(String.valueOf(eligosStats[0][count]));
					atkValue.setText(String.valueOf(eligosStats[1][count]));
					defValue.setText(String.valueOf(eligosStats[2][count]));
					critValue.setText(String.valueOf(eligosStats[3][count]));
					evaValue.setText(String.valueOf(eligosStats[3][count]));

					}
				}
			});

			upStar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

					//if (countStar <= 5 && count >= 1) {
                    if(countStar == 0)
                        starIcon1.setBounds(480, 0, 30, 30);
                    if(countStar == 1)
                        starIcon2.setBounds(500, 0, 30, 30);
                    if(countStar == 2)
                        starIcon3.setBounds(520, 0, 30, 30);
                    if(countStar == 3)
                        starIcon4.setBounds(540, 0, 30, 30);
					double twoStar = eligosStats[0][count+1] * eligosStar[countStar];
					int returnStar = (int) twoStar;

					hpValue.setText(String.valueOf(returnStar));
					twoStar = eligosStats[1][count+1] *eligosStar[countStar];
					returnStar = (int) twoStar;
					atkValue.setText(String.valueOf(returnStar));
					twoStar = eligosStats[2][count+1] * eligosStar[countStar];
					returnStar = (int) twoStar;
					defValue.setText(String.valueOf(returnStar));
					twoStar = eligosStats[3][count+1] * eligosStar[countStar];
					returnStar = (int) twoStar;
					critValue.setText(String.valueOf(returnStar));
					twoStar = eligosStats[3][count+1] * eligosStar[countStar];
					returnStar = (int) twoStar;
					evaValue.setText(String.valueOf(returnStar));
					//atkValue.setText(String.valueOf(eligosStats[1][count]));
					//defValue.setText(String.valueOf(eligosStats[2][count]));
					//critValue.setText(String.valueOf(eligosStats[3][count]));
					//evaValue.setText(String.valueOf(eligosStats[4][count]));
					countStar++;


				}
			});
			downStar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

					//if (countStar <= 5 && count >= 1) {
                    if(countStar == 1)
                        starIcon1.setBounds(460, 0, 30, 30);
                    if(countStar == 2)
                        starIcon2.setBounds(460, 0, 30, 30);
                    if(countStar == 3)
                        starIcon3.setBounds(460, 0, 30, 30);
                    if(countStar == 4)
                        starIcon4.setBounds(460, 0, 30, 30);
					double twoStar = eligosStats[0][count] * eligosStar[countStar];
					int returnStar = (int) twoStar;
					starIcon1.setBounds(460, 0, 30, 30);
					count--;
					lvValue.setText(String.valueOf(level[count]));
					hpValue.setText(String.valueOf(eligosStats[0][count+2]));
					atkValue.setText(String.valueOf(eligosStats[1][count]));
					defValue.setText(String.valueOf(eligosStats[2][count]));
					critValue.setText(String.valueOf(eligosStats[3][count]));
					evaValue.setText(String.valueOf(eligosStats[3][count]));
					//atkValue.setText(String.valueOf(eligosStats[1][count]));
					//defValue.setText(String.valueOf(eligosStats[2][count]));
					//critValue.setText(String.valueOf(eligosStats[3][count]));
					//evaValue.setText(String.valueOf(eligosStats[4][count]));
					countStar--;


				}
			});
		/*
		 * JButton leftButton = new JButton(); leftButton.setBounds(20 , 500 ,
		 * 100 , 35); mainPanel.add(leftButton); JButton rightButton = new
		 * JButton(); rightButton.setBounds(450 , 500 , 100 , 35);
		 * mainPanel.add(rightButton);
		 */
		this.add(mainPanel);
		this.setVisible(true);

		// ------------------create--------------------

	}

}
