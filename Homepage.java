package farmandi;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Homepage extends JFrame implements ActionListener
{
	JFrame f2;
	private String cphoneno;
	JTextField searchf;
	JButton searchb;
	JPanel fpanel, mpanel,dpanel,spanel,wpanel,apanel;
	Homepage(String cphoneno)
	{
		this.cphoneno = cphoneno;

		f2 = new JFrame("Farmandi Home Page");

		fpanel = new JPanel();
		fpanel.setBounds(0, 0, 800, 50);
		fpanel.setLayout(null);
		fpanel.setBackground(new Color(76, 153, 0));
		f2.add(fpanel, BorderLayout.NORTH);

		mpanel = new JPanel();
		mpanel.setBounds(0, 50, 800, 800);
		mpanel.setLayout(null);
		mpanel.setBackground(new Color(204, 255,153));
		f2.add(mpanel, BorderLayout.CENTER);

		JLabel wel = new JLabel("Welcome Rohan");
		wel.setFont(new Font ("Osword",Font.BOLD,28));
		wel.setForeground(new Color(255,128,0));
		wel.setBounds(15,15,300,80);
		mpanel.add(wel,BorderLayout.NORTH);

		dpanel = new JPanel();
		dpanel.setBounds(65, 95, 655, 270);
		dpanel.setLayout(null);
		dpanel.setBackground(new Color(255,255,255));
		mpanel.add(dpanel, BorderLayout.CENTER);

		ImageIcon image1 = new ImageIcon("C:\\farmandi\\src\\IMAGES\\Wheat.jpg");
		ImageIcon image2 = new ImageIcon("C:\\farmandi\\src\\IMAGES\\potato.jpg");
		ImageIcon image3 = new ImageIcon("C:\\farmandi\\src\\IMAGES\\garlic.jpg");
		ImageIcon image4 = new ImageIcon("C:\\farmandi\\src\\IMAGES\\images.jpg");
		ImageIcon image5 = new ImageIcon("C:\\farmandi\\src\\IMAGES\\onion.jpg");
		ImageIcon image6 = new ImageIcon("C:\\farmandi\\src\\IMAGES\\orange.jpg");

		JLabel label1 = new JLabel(image1);
		JLabel label2 = new JLabel(image2);
		JLabel label3 = new JLabel(image3);
		JLabel label4 = new JLabel(image4);
		JLabel label5 = new JLabel(image5);
		JLabel label6 = new JLabel(image6);

		label1.setBounds(10, 10, 150, 100);
		label2.setBounds(225, 10, 150, 100);
		label3.setBounds(440, 10, 150, 100);
		label4.setBounds(10, 140, 150, 100);
		label5.setBounds(225, 140, 150, 100);
		label6.setBounds(440, 140, 150, 100);
		dpanel.add(label1);
		dpanel.add(label2);
		dpanel.add(label3);
		dpanel.add(label4);
		dpanel.add(label5);
		dpanel.add(label6);

		JButton cart = new JButton("Cart");
		cart.setBounds(575,8,70,30);
		cart.setBackground (new Color(255,165,47));
		cart.setForeground(Color.BLACK);
		fpanel.add(cart);
		cart.addActionListener(this);
		cart.setToolTipText("cart");

		JButton logout = new JButton("LogOut");
		logout.setBounds(710,2,75,30);
		logout.setBackground (Color.RED);
		logout.setForeground(Color.WHITE);
		logout.setBorderPainted(false);
		logout.setFocusPainted(false);
		fpanel.add(logout);
		logout.addActionListener(this);

		searchb = new JButton("Search");
		searchb.setBounds(500,8,75,30);
		searchb.setBackground (Color.WHITE);
		searchb.setForeground(Color.BLACK);
		//fpanel.add(searchb);
		//searchb.addActionListener(this);

		searchf = new JTextField();
		searchf.setBounds(250,8,250,30);
		searchf.setBorder(BorderFactory.createEmptyBorder());
		//fpanel.add(searchf);

		JLabel l21 = new JLabel("Welcome, Homepage !");
		l21.setBounds(700,500,100,100);

		JButton wheat= new JButton("Wheat");
		wheat.setBackground (Color.RED);
		wheat.setForeground(Color.WHITE);
		dpanel.add(wheat,BorderLayout.NORTH);

		JButton potato = new JButton("Potato");
		potato.setBackground (Color.RED);
		potato.setForeground(Color.WHITE);
		dpanel.add(potato,BorderLayout.NORTH);

		JButton garlic= new JButton("Garlic");
		garlic.setBackground (Color.RED);
		garlic.setForeground(Color.WHITE);
		dpanel.add(garlic,BorderLayout.NORTH);

		JButton mango = new JButton("Mango");
		mango.setBackground (Color.RED);
		mango.setForeground(Color.WHITE);
		dpanel.add(mango,BorderLayout.NORTH);

		JButton onion = new JButton("Onion");
		onion.setBackground (Color.RED);
		onion.setForeground(Color.WHITE);
		dpanel.add(onion,BorderLayout.NORTH);

		JButton orange = new JButton("Orange");
		orange.setBackground (Color.RED);
		orange.setForeground(Color.WHITE);
		dpanel.add(orange,BorderLayout.NORTH);

		wheat.setBounds(40,110,100,30);
		potato.setBounds(255,110,100,30);
		garlic.setBounds(470,110,100,30);
		mango.setBounds(40,240,100,30);
		onion.setBounds(255,240,100,30);
		orange.setBounds(470,240,100,30);

		wheat.addActionListener(this);
		potato.addActionListener(this);
		garlic.addActionListener(this);
		mango.addActionListener(this);
		onion.addActionListener(this);
		orange.addActionListener(this);


		ImageIcon farm = new ImageIcon("C:\\farmandi\\src\\IMAGES\\LOF.jpg");
		JLabel falo = new JLabel(farm);
		falo.setBounds(6,6,38,38 );
		fpanel.add(falo,BorderLayout.CENTER);

		JLabel head = new JLabel("FARMANDI");
		head.setBounds(50,5,300,40);
		head.setFont(new Font ("Osword",Font.BOLD,28));
		head.setForeground(new Color(255,165,47));
		fpanel.add(head,BorderLayout.CENTER);

		mpanel.add(l21);

		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.getContentPane().setBackground(Color.WHITE);
		f2.setLocation(300,125);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setSize(800,500);
		f2.setLayout(null);
		f2.setVisible(true);
	}
	public void actionPerformed (ActionEvent e)
	{
		if(e.getActionCommand().equals("LogOut"))
		{
			f2.setVisible(false);
			new farmandi.loginPage();
		}
		else if(e.getActionCommand().equals("Wheat") ||
				e.getActionCommand().equals("Onion") ||
				e.getActionCommand().equals("Garlic") ||
				e.getActionCommand().equals("Mango") ||
				e.getActionCommand().equals("Orange") ||
				e.getActionCommand().equals("Potato")) {
			f2.setVisible(false);
			new farmandi.searchpage(cphoneno, e.getActionCommand());
		}
		else if(e.getActionCommand().equals("Cart"))
		{
			f2.setVisible(false);
			new farmandi.cart(cphoneno);
		}
	}

	public void main(String[] args)
	{
		String cphoneno = this.cphoneno;
		new Homepage(cphoneno);
	}
}
