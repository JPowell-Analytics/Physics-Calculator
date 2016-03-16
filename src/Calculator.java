import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 * SECOND SIDE PROJECT
 * @author Pjacob
 * @version 3/14/16
 */
@SuppressWarnings("serial")
public class Calculator extends JFrame {
	public Calculator()
	{
		initUI();
	}
	public final void initUI()
	{
		JMenuBar menu = new JMenuBar();
		JWindow window = new JWindow();
		JMenuItem force = new JMenuItem("Force");
		JMenuItem mass = new JMenuItem("Mass from Density");
		JMenuItem mass2 = new JMenuItem("Mass from Force");
		JMenu basics = new JMenu("Basic Calculations");
		JMenu motion = new JMenu("Motion Calculations");
		JMenuItem velocity = new JMenuItem("Velocity");
		JMenuItem velocity2 = new JMenuItem("Change in Velocity");
		JMenuItem accel = new JMenuItem("Acceleration");
		JButton solveForce = new JButton("Solve");
		JButton solveMass = new JButton("Solve");
		JButton solveMass2 = new JButton("Solve");
		JButton solveVelocity = new JButton("Solve");
		JButton solveVelocity2 = new JButton("Solve");
		JButton solveAcc = new JButton("Solve");
		JTextField densityInput = new JTextField(15);
		JTextField volumeInput = new JTextField(15);
		JTextField accInput = new JTextField(15);
		JTextField acc2Input = new JTextField(15);
		JTextField massInput = new JTextField(15);
		JTextField forceInput = new JTextField(15);
		JTextField dist1Input = new JTextField(15);
		JTextField dist2Input = new JTextField(15);
		JTextField time1Input = new JTextField(15);
		JTextField time2Input = new JTextField(15);
		JTextField time3Input = new JTextField(15);
		JTextField time4Input = new JTextField(15);
		JTextField time5Input = new JTextField(15);
		JTextField veloc1Input = new JTextField(15);
		JTextField veloc2Input = new JTextField(15);
		JTextField veloc3Input = new JTextField(15);
		JTextField veloc4Input = new JTextField(15);
		JTextField veloc5Input = new JTextField(15);
		
		JLabel setMass = new JLabel("Set Mass");
		JLabel setForce = new JLabel("Set Force");
		JLabel setDensity = new JLabel("Set Density");
		JLabel setVolume = new JLabel("Set Volume");
		JLabel setAcc = new JLabel("Set Acceleration");
		JLabel setAcc2 = new JLabel("Set Acceleration");
		JLabel setDist1 = new JLabel("Set Distance of Origin");
		JLabel setDist2 = new JLabel("Set Final Distance");
		JLabel setTime1 = new JLabel("Set Starting Time");
		JLabel setTime2 = new JLabel("Set Ending Time");
		JLabel setTime3 = new JLabel("Set Given Time");
		JLabel setTime4 = new JLabel("Set Starting Time");
		JLabel setTime5 = new JLabel("Set Ending Time");
		JLabel setVelo1 = new JLabel("Set Starting Velocity");
		JLabel setVelo2 = new JLabel("Set Ending Velocity");
		JLabel setVelo3 = new JLabel("Set Origin Velocity");
		JLabel setVelo4 = new JLabel("Set Starting Velocity");
		JLabel setVelo5 = new JLabel("Set Ending Velocity");
		

		menu.add(basics);
		basics.add(force);
		basics.add(mass);
		basics.add(mass2);
//		mass.add(densityInput);
//		mass.add(setDensity);
//		mass.add(volumeInput);
//		mass.add(setVolume);
//		mass.add(solveMass);
//		mass2.add(forceInput);
//		mass2.add(setForce);
//		mass2.add(acc2Input);
//		mass2.add(setAcc2);
//		mass2.add(solveMass2);
//		force.add(massInput);
//		force.add(setMass);
//		force.add(accInput);
//		force.add(setAcc);
//		force.add(solveForce);
		
		menu.add(motion);
		motion.add(velocity);
//		velocity.add(dist1Input);
//		velocity.add(setDist1);
//		velocity.add(dist2Input);
//		velocity.add(setDist2);
//		velocity.add(time1Input);
//		velocity.add(setTime1);
//		velocity.add(time2Input);
//		velocity.add(setTime2);
//		velocity.add(solveVelocity);
//		 
		motion.add(velocity2);
//		velocity2.add(veloc3Input);
//		velocity2.add(setVelo3);
//		velocity2.add(accInput);
//		velocity2.add(setAcc);
//		velocity2.add(time3Input);
//		velocity2.add(setTime3);
//		velocity2.add(solveVelocity2);
//		
//		
		motion.add(accel);
//		accel.add(veloc1Input);
//		accel.add(setVelo1);
//		accel.add(veloc2Input);
//		accel.add(setVelo2);
//		accel.add(time4Input);
//		accel.add(setTime4);
//		accel.add(time5Input);
//		accel.add(setTime5);
//		accel.add(solveAcc);
		
		
//		/**
//		 * this method shows the current Density from the text bar
//		 */
//		setDensity.addActionListener(new ActionListener()
//		{
//			@Override
//			public void actionPerformed(ActionEvent event)
//			{
//				double D = Double.parseDouble(densityInput.getText());
//				System.out.println("The Current Weight: " + D);
//			}
//		}
//				);
//		/**
//		 * this method shows the current volume from the text bar
//		 */
//		setVolume.addActionListener(new ActionListener()
//		{
//			@Override
//			public void actionPerformed(ActionEvent event)
//			{
//				double V = Double.parseDouble(volumeInput.getText());
//				System.out.println("The Current Volume: " + V);
//			}
//		}
//				);
//		/**
//		 * this method shows the current mass from the text bar
//		 */
//		setMass.addActionListener(new ActionListener ()
//		{
//			public void actionPerformed(ActionEvent event)
//			{
//				double m = Double.parseDouble(massInput.getText());
//				System.out.println("The Current Mass: " + m);
//			}
//		});
//		/**
//		 * this method shows the current acceleration from the text
//		 * bar
//		 */
//		setAcc.addActionListener(new ActionListener ()
//		{
//			public void actionPerformed(ActionEvent event)
//			{
//				double a = Double.parseDouble(accInput.getText());
//				System.out.println("The Current Acceleration: " + a);
//			}
//		});
		/** 
		 * this method calculates the mass from the given weight
		 */
		solveMass.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent event)
			{
				double massSol = 0;
				double D = Double.parseDouble(densityInput.getText());
				double V = Double.parseDouble(volumeInput.getText());

				massSol = D * V;
				System.out.println("The total mass is " + massSol);
			}
		});
		/** 
		 * this method calculates the mass from the given weight
		 */
		solveMass2.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent event)
			{
				double massSol = 0;
				double F = Double.parseDouble(forceInput.getText());
				double A = Double.parseDouble(acc2Input.getText());

				massSol = F / A;
				System.out.println("The total mass is " + massSol);
			}
		});
		/**
		 * this method calculates the force from the given mass and 
		 * acceleration
		 */
		solveForce.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent event)
			{

				double forceSol = 0;
				double M = Double.parseDouble(massInput.getText());
				double A = Double.parseDouble(accInput.getText());

				forceSol = M * A;
				System.out.println("The total force is " + forceSol);
			}
		});
		/**
		 * this method calculates the velocity from the given distances and 
		 * times
		 */
		solveVelocity.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent event)
			{

				double velocitySol = 0;
				double X1 = Double.parseDouble(dist1Input.getText());
				double X2 = Double.parseDouble(dist2Input.getText());
				double T1 = Double.parseDouble(time1Input.getText());
				double T2 = Double.parseDouble(time2Input.getText());
				
				velocitySol = (X2 - X1)/(T2 - T1);
				System.out.println("The total velocity is " + velocitySol);
			}
		});
		
		/**
		 * this method calculates the change in velocity 
		 * 
		 */
		solveVelocity2.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent event)
			{

				double velocitySol = 0;
				double V1 = Double.parseDouble(veloc3Input.getText());
				double A = Double.parseDouble(accInput.getText());
				double T1 = Double.parseDouble(time3Input.getText());
				
				
				velocitySol = (V1)+(A * T1);
				System.out.println("The total change in velocity is " + velocitySol);
			}
		});
		/**
		 * this method calculates the acceleration from the given velocity's and 
		 * given distances
		 */
		solveAcc.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent event)
			{

				double accSol = 0;
				double V1 = Double.parseDouble(veloc1Input.getText());
				double V2 = Double.parseDouble(veloc2Input.getText());
				double T1 = Double.parseDouble(time4Input.getText());
				double T2 = Double.parseDouble(time5Input.getText());
				
				accSol = (V2 - V1)/(T2 - T1);
				System.out.println("The total Acceleration is " + accSol);
			}
		});
		setJMenuBar(menu);

		JToolBar tools = new JToolBar();
		tools.setFloatable(false);

		ImageIcon quitNow = new ImageIcon("exit.png");
		JButton quit = new JButton(quitNow);
		quit.setBorder(new EmptyBorder(0 ,0, 0, 0));
		tools.add(quit);

		add(tools, BorderLayout.NORTH);

		JToolBar vertical = new JToolBar(JToolBar.VERTICAL);
		vertical.setFloatable(false);
		vertical.setMargin(new Insets(10, 5, 5, 5));

		ImageIcon select = new ImageIcon("drive.png");
		ImageIcon Selection = new ImageIcon("computer.png");

		JButton selectb = new JButton(select);
		selectb.setBorder(new EmptyBorder(3, 0, 3, 0));

		JButton Selectionb = new JButton(Selection);
		Selectionb.setBorder(new EmptyBorder(3, 0, 3, 0));

		vertical.add(selectb);
		vertical.add(Selectionb);

		add(vertical, BorderLayout.WEST);
		add(new JTextArea(), BorderLayout.CENTER);

		JLabel statusbar = new JLabel("Statusbar");
		statusbar.setPreferredSize(new Dimension(-1, 22));
		statusbar.setBorder(LineBorder.createBlackLineBorder());
		add(statusbar, BorderLayout.SOUTH);

		setSize(500, 500);
		setTitle("Physics Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				Calculator ex = new Calculator();
				ex.setVisible(true);
			}
		});
	}


}
