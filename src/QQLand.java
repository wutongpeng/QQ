
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class QQLand extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel TopPanel = null;
	private JPanel CentralPanel = null;
	private JPanel BottomPanel = null;
	private JTextField UserNameText = null;
	private JPasswordField UserPasswordText = null;
	private JPanel HeadImagePanel = null;
	private JCheckBox RememberPassCheckBox = null;
	private JCheckBox AutomaticLoginCheckBox = null;
	private JLabel RegistrationLb = null;
	private JLabel GetbackLb = null;
	private JButton LandBtn = null;
	private JButton MultipleAccountBtn = null;
	private JButton SetupBtn = null;
	private JButton ExitBtn = null;
	private JButton MinFramBtn = null;	
	static QQLand thisClass = new QQLand();
	/*下面用于拖动窗体*/
	Point loc = null;    
	Point tmp = null;    
	boolean isDragged = false;
	
	JMenuBar jBar=new JMenuBar();
	JMenu jMenu;
	JMenuItem[] jMenuItems=new JMenuItem[3];
	private JPanel StatePanel = null;
	
	private JPanel getTopPanel() {
		if (TopPanel == null) {
			TopPanel = new JImagePane(new ImageIcon("images/loginHead.jpg").getImage(),JImagePane.SCALED);
			TopPanel.setLayout(null);
			TopPanel.setSize(new Dimension(377, 129));
			TopPanel.setLocation(new Point(0, 0));
			TopPanel.add(getExitBtn(), null);
			TopPanel.add(getMinFramBtn(), null);
		}
		return TopPanel;
	}

	private JPanel getCentralPanel() {
		if (CentralPanel == null) {
			GetbackLb = new JLabel();
			GetbackLb.setBounds(new Rectangle(316, 53, 50, 16));
			GetbackLb.setFont(new Font("Dialog", Font.PLAIN, 12));
			GetbackLb.setForeground(new Color(51, 94, 255));
			GetbackLb.setSize(new Dimension(49, 19));
			GetbackLb.setLocation(new Point(318, 53));
			GetbackLb.setText("找回密码");
			RegistrationLb = new JLabel();
			RegistrationLb.setBounds(new Rectangle(318, 17, 49, 19));
			RegistrationLb.setFont(new Font("Dialog", Font.PLAIN, 12));
			RegistrationLb.setForeground(new Color(0, 94, 255));
			RegistrationLb.setText("注册账号");
			CentralPanel =new JImagePane(new ImageIcon("images/QQcenter.jpg").getImage(), JImagePane.SCALED);
			CentralPanel.setLayout(null);
			CentralPanel.setSize(new Dimension(376, 118));
			CentralPanel.setPreferredSize(new Dimension(0, 0));
			CentralPanel.setLocation(new Point(0, 128));
			CentralPanel.add(getUserNameText(), null);
			CentralPanel.add(getUserPasswordText(), null);
			CentralPanel.add(getHeadImagePanel(), null);
			CentralPanel.add(getRememberPassCheckBox(), null);
			CentralPanel.add(getAutomaticLoginCheckBox(), null);
			CentralPanel.add(RegistrationLb, null);
			CentralPanel.add(GetbackLb, null);
			CentralPanel.add(getStatePanel(), null);
		}
		return CentralPanel;
	}

	private JPanel getBottomPanel() {
		if (BottomPanel == null) {
			BottomPanel = new JImagePane(new ImageIcon("images/QQBottom.jpg").getImage(), JImagePane.SCALED);
			BottomPanel.setLayout(null);
			BottomPanel.setSize(new Dimension(376, 39));
			BottomPanel.setLocation(new Point(0, 246));
			BottomPanel.add(getLandBtn(), null);
			BottomPanel.add(getMultipleAccountBtn(), null);
			BottomPanel.add(getSetupBtn(), null);
		}
		return BottomPanel;
	}

	private JTextField getUserNameText() {
		if (UserNameText == null) {
			UserNameText = new JTextField();
			UserNameText.setSize(new Dimension(200, 26));
			UserNameText.setLocation(new Point(111, 14));
		}
		return UserNameText;
	}

	private JPasswordField getUserPasswordText() {
		if (UserPasswordText == null) {
			UserPasswordText = new JPasswordField();
			UserPasswordText.setSize(new Dimension(200, 26));
			UserPasswordText.setColumns(0);
			UserPasswordText.setPreferredSize(new Dimension(4, 22));
			UserPasswordText.setMinimumSize(new Dimension(4, 22));
			UserPasswordText.setLocation(new Point(111, 48));
		}
		return UserPasswordText;
	}



	private JPanel getHeadImagePanel() {
		if (HeadImagePanel == null) {
			HeadImagePanel = new JImagePane(new ImageIcon("images/headImage.jpg").getImage(), JImagePane.SCALED);
			HeadImagePanel.setLayout(new GridBagLayout());
			HeadImagePanel.setLocation(new Point(15, 15));
			HeadImagePanel.setSize(new Dimension(85, 85));
		}	
		setDragable();
		return HeadImagePanel;
	}  
	
	private void setDragable() {//下面拖动窗体的方法
		this.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent e) {
				isDragged = false;
				thisClass.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			public void mousePressed(java.awt.event.MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());
				isDragged = true;
				thisClass.setCursor(new Cursor(Cursor.MOVE_CURSOR));
			}
		});
		this.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				if (isDragged) {
					loc = new Point(thisClass.getLocation().x + e.getX()
							- tmp.x, thisClass.getLocation().y + e.getY()
							- tmp.y);
					thisClass.setLocation(loc);
				}
			}
		});
	} 
	//上面是拖动窗体的方法
	private JCheckBox getRememberPassCheckBox() {
		if (RememberPassCheckBox == null) {
			RememberPassCheckBox = new JCheckBox();
			RememberPassCheckBox.setOpaque(false);
			RememberPassCheckBox.setText("记住密码");
			RememberPassCheckBox.setLocation(new Point(159, 78));
			RememberPassCheckBox.setFont(new Font("Dialog", Font.PLAIN, 12));
			RememberPassCheckBox.setSize(new Dimension(73, 17));
		}
		return RememberPassCheckBox;
	}

	private JCheckBox getAutomaticLoginCheckBox() {
		if (AutomaticLoginCheckBox == null) {
			AutomaticLoginCheckBox = new JCheckBox();
			AutomaticLoginCheckBox.setOpaque(false);
			AutomaticLoginCheckBox.setFont(new Font("Dialog", Font.PLAIN, 12));
			AutomaticLoginCheckBox.setSize(new Dimension(77, 16));
			AutomaticLoginCheckBox.setLocation(new Point(235, 78));
			AutomaticLoginCheckBox.setText("自动登录");
		}
		return AutomaticLoginCheckBox;
	}

	private JButton getLandBtn() {
		if (LandBtn == null) {
			LandBtn = new JButton();
			LandBtn.setOpaque(false);
			LandBtn.setLocation(new Point(310, 10));
			LandBtn.setSize(new Dimension(60, 20));
			LandBtn.setText("登陆");
			LandBtn.setHorizontalTextPosition(SwingConstants.CENTER);
			LandBtn.setFont(new Font("Dialog", Font.PLAIN, 12));
			LandBtn.setIcon(new ImageIcon(getClass().getResource("images/landing.gif")));
			LandBtn.setBackground(new Color(2,2,2));

			LandBtn.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					//System.out.println("mouseClicked()"); // TODO Auto-generated Event stub mouseClicked()
					QQMainFace QQMain=new QQMainFace();
					thisClass.setVisible(false);
					QQMain.thisClass.show();
					
				}
			});
		}
		return LandBtn;
	}

	private JButton getMultipleAccountBtn() {
		if (MultipleAccountBtn == null) {
			MultipleAccountBtn = new JButton();
			MultipleAccountBtn.setOpaque(false);
			MultipleAccountBtn.setLocation(new Point(5, 10));
			MultipleAccountBtn.setIcon(new ImageIcon(getClass().getResource("images/dzh.jpg")));
			MultipleAccountBtn.setSize(new Dimension(60, 20));
			MultipleAccountBtn.setBackground(new Color(2,2,2));
		}
		return MultipleAccountBtn;
	}

	private JButton getSetupBtn() {
		if (SetupBtn == null) {
			SetupBtn = new JButton();
			SetupBtn.setLocation(new Point(90, 10));
			SetupBtn.setIcon(new ImageIcon(getClass().getResource("images/sz.jpg")));
			SetupBtn.setSize(new Dimension(60, 20));
		}
		return SetupBtn;
	}

	private JButton getExitBtn() {
		if (ExitBtn == null) {
			ExitBtn = new JButton();
			ExitBtn.setOpaque(false);
			ExitBtn.setLocation(new Point(340, 0));
			ExitBtn.setSize(new Dimension(34, 20));
			ExitBtn.setBackground(new Color(2,2,2));
			ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					System.exit(0);
				}
			});
		}
		return ExitBtn;
	}

	private JButton getMinFramBtn() {
		if (MinFramBtn == null) {
			MinFramBtn = new JButton();
			MinFramBtn.setOpaque(false);
			MinFramBtn.setLocation(new Point(310, 0));
			MinFramBtn.setSize(new Dimension(30, 20));
			MinFramBtn.setBackground(new Color(2, 2, 2));
			MinFramBtn.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					thisClass.setExtendedState(JFrame.ICONIFIED); 
				}
			});
		}
		return MinFramBtn;
	}

	/**
	 * This method initializes StatePanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getStatePanel() {
		if (StatePanel == null) {
			//StatePanel = new JPanel();
			StatePanel =new JImagePane(new ImageIcon("images/zt.jpg").getImage(), JImagePane.SCALED);
			
			StatePanel.setLayout(null);
			StatePanel.setLocation(new Point(112, 78));
			StatePanel.setSize(new Dimension(40, 20));
			StatePanel.setOpaque(false);
			StateMenu();
			StatePanel.add(jBar, null);
		}
		return StatePanel;
	}
private void StateMenu(){
	setLayout(null);	
	ImageIcon  icmr = new ImageIcon("images/zx.jpg");
	jMenu=new JMenu("  ");
	jMenu.setIcon(icmr);	
	jMenu.setOpaque(false);
	String imageStr[]={"zx.jpg","ys.jpg","qw.jpg"};
	String NameStr[]={"在线","隐身","Q我"};
	//String NameStrs[][]={{"在线","隐身","Q我"},{"zx.jpg","ys.jpg","qw.jpg"}};	
	for(int i=0;i<3;i++)
	{
		ImageIcon  ic = new ImageIcon("images/"+imageStr[i]);
		jMenuItems[i]=new JMenuItem(NameStr[i],ic);
		jMenuItems[i].addActionListener(this);
		jMenu.add(jMenuItems[i]);
	}		
	jBar.add(jMenu);
	jBar.setBounds(0, 0, 40, 20);
	jBar.setOpaque(false);
	jBar.setBackground(new Color(2,2,2));
	jBar.setVisible(true);
	//add(jBar);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
				
				
			}
		});
	}

	public QQLand() {
		super();
		initialize();
		this.setUndecorated(true);
		toCenter();
	
	}
	public void actionPerformed(ActionEvent e){

	    JMenuItem target = (JMenuItem)e.getSource();

	    String actionCommand = target.getText();
	    ImageIcon  ic = (ImageIcon)target.getIcon();
	    jMenu.setIcon(ic);
	    if(actionCommand.equals("隐身")){//do something}
	    		//dd();    	
	    	   System.out.print("具体实现的方法");
	    //……
	    }
	}
	
	private void initialize() {
		jBar.setBounds(new Rectangle(0, 0, 0, 0));
		this.setSize(376, 286);
		this.setContentPane(getJContentPane());
		this.setTitle("QQ");
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setSize(new Dimension(376, 286));
			jContentPane.setLayout(null);
			jContentPane.add(getTopPanel(), null);
			jContentPane.add(getCentralPanel(), null);
			jContentPane.add(getBottomPanel(), null);
			
			
		}
		return jContentPane;
	}
	
	public void toCenter() {//居中显示
        Toolkit kit = Toolkit.getDefaultToolkit();    
        Dimension screenSize = kit.getScreenSize();   
        int screenWidth = screenSize.width / 2;         
        int screenHeight = screenSize.height / 2;      
        int height = this.getHeight();
        int width = this.getWidth();
        this.setLocation(screenWidth - width / 2, screenHeight - height / 2);
    }

}  //  @jve:decl-index=0:visual-constraint="10,10"
