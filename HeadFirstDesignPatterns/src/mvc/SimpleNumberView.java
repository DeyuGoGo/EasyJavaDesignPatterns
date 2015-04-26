package mvc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class SimpleNumberView extends JFrame implements NumberListener , ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private NumberModelInterface model;
	private NumberControllerInterface controller;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem exitMenuItem;
	JButton increaseButton;
	JButton decreaseButton;
	JLabel NumberLabel;
	
	public SimpleNumberView(NumberModelInterface model , NumberControllerInterface controller) {
		this.model = model;
		this.controller = controller;
		model.registerListener(this);
		initViews();
	}
	private void initViews(){
		NumberLabel = new JLabel("" + model.getNumber());
		increaseButton = new JButton("+");
		decreaseButton = new JButton("-");
		
		menuBar = new JMenuBar();
		menu = new JMenu("Controller");
		exitMenuItem = new JMenuItem("Exit");
		
		exitMenuItem.addActionListener(this);
		increaseButton.addActionListener(this);
		decreaseButton.addActionListener(this);
		
		menu.add(exitMenuItem);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		setLayout(new FlowLayout());
		add(NumberLabel);
		add(increaseButton);
		add(decreaseButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	@Override
	public void onNumberChnage() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				NumberLabel.setText(""+model.getNumber());
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == increaseButton)controller.increase();
		if(e.getSource() == decreaseButton)controller.decrease();
		if(e.getSource() == exitMenuItem)System.exit(0);
	}
}
