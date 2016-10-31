import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Rectangle;

public class QQMainFace extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel Main_TopPanel = null;
	private JPanel Main_BottomPanel = null;
	private JPanel Tab_FriendPanel = new JPanel();
	private JPanel Tab_FriendPanel2 = new JPanel();
	private JPanel Tab_GroupPanel = new JPanel();
	private JPanel Tab_RecordPanel = new JPanel(); // @jve:decl-index=0:visual-constraint="367,10"
	//
	// private JScrollPane Tab_FriendJSPanel = new JScrollPane();
	// private JScrollPane Tab_FriendJSPanel2 = new JScrollPane();
	// private JScrollPane Tab_GroupJSPanel = new JScrollPane();
	// private JScrollPane Tab_RecordJSPanel = new JScrollPane();
	//

	private JTabbedPane Main_FriendTabbedPane = null;
	private JPanel jPanel = null;
	private JPanel HeadImagePanel1 = null;
	private JButton MinBtn = null;
	private JButton MaxBtn = null;
	private JButton ExitBtn = null;
	static QQMainFace thisClass = new QQMainFace();
	Point loc = null;
	Point tmp = null;
	boolean isDragged = false;
	private JPanel Main_StatePanel = null;
	private JLabel UserNameLabel = null;
	private JTextField SignatureText = null;
	private JLabel SpaceLabel = null;
	private JLabel MicroLabel = null;
	private JLabel InformationLabel = null;
	JMenuBar jBar = new JMenuBar();
	JMenu jMenu;
	JMenuItem[] jMenuItems = new JMenuItem[3];

	private JLabel jLabel = null;
	private JScrollPane hyScrollPane = null;
	private JLabel txLabel = null;
	private JLabel hmdLabel = null;
	private JPanel jPanel11 = null;

	// private JPanel StatePanel = null;
	/**
	 * This is the default constructor
	 */
	public QQMainFace() {
		super();
		initialize();
		this.setUndecorated(true);
		toCenter();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	ImageIcon rightIcon = new ImageIcon("images/MainImages/you_Triangle.gif");
	ImageIcon DownIcon = new ImageIcon("images/MainImages/xia_Triangle.gif");

	private void initialize() {
		hmdLabel = new JLabel();
		hmdLabel.setText("黑名单");
		hmdLabel.setIcon(rightIcon);
		hmdLabel.setSize(new Dimension(275, 25));
		hmdLabel.setLocation(new Point(0, 290));
		hmdLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				// System.out.println("mouseClicked()"); // TODO Auto-generated
				// Event stub mouseClicked()
				hmdLabel.setIcon(DownIcon);
				txLabel.setIcon(rightIcon);
				jLabel.setIcon(rightIcon);
				jPanel11.removeAll();
				getTab_GroupPanelhmd();
				hyScrollPane.setLocation(new Point(0, 85));
				txLabel.setLocation(new Point(0, 30));
				hmdLabel.setLocation(new Point(0, 55));

			}
		});
		txLabel = new JLabel();
		txLabel.setText("同事");
		txLabel.setIcon(rightIcon);
		txLabel.setSize(new Dimension(275, 25));
		txLabel.setLocation(new Point(0, 262));
		txLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				// System.out.println("mouseClicked()"); // TODO Auto-generated
				// Event stub mouseClicked()
				txLabel.setIcon(DownIcon);
				jLabel.setIcon(rightIcon);
				hmdLabel.setIcon(rightIcon);
				jPanel11.removeAll();
				// jPanel11.setLayout(new GridLayout(11, 1, 4, 4));

				getTab_GroupPanelts();
				hyScrollPane.setLocation(new Point(0, 55));
				txLabel.setLocation(new Point(0, 30));
				hmdLabel.setLocation(new Point(0, 285));
			}
		});

		jLabel = new JLabel();
		jLabel.setText("我的好友");
		jLabel.setIcon(DownIcon);
		jLabel.setSize(new Dimension(278, 25));
		jLabel.setLocation(new Point(0, 5));
		jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				// System.out.println("mouseClicked()"); // TODO Auto-generated
				// Event stub mouseClicked()
				jLabel.setIcon(DownIcon);
				hmdLabel.setIcon(rightIcon);
				txLabel.setIcon(rightIcon);

				jPanel11.removeAll();

				getTab_GroupPanel();
				hyScrollPane.setLocation(new Point(0, 30));
				txLabel.setLocation(new Point(0, 260));
				hmdLabel.setLocation(new Point(0, 285));

			}
		});
		Tab_GroupPanel.setSize(new Dimension());
		Tab_FriendPanel2.setSize(new Dimension());
		Tab_FriendPanel.setLayout(null);
		Tab_FriendPanel.setSize(new Dimension());
		Tab_FriendPanel.add(jLabel, null);
		Tab_FriendPanel.add(getHyScrollPane(), null);
		Tab_FriendPanel.add(txLabel, null);
		Tab_FriendPanel.add(hmdLabel, null);
		Tab_RecordPanel.setLayout(null);
		Tab_RecordPanel.setSize(new Dimension());
		this.setSize(287, 638);
		this.setContentPane(getJContentPane());
		this.setTitle("QQ2012");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getMain_TopPanel(), null);
			jContentPane.add(getMain_BottomPanel(), null);
			jContentPane.add(getJPanel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes Main_TopPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getMain_TopPanel() {
		if (Main_TopPanel == null) {
			InformationLabel = new JLabel(new ImageIcon("images/MainImages/xiaoxi.gif"), JLabel.LEFT);
			InformationLabel.setText("3");
			InformationLabel.setLocation(new Point(160, 80));
			InformationLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
			InformationLabel.setSize(new Dimension(40, 20));
			MicroLabel = new JLabel(new ImageIcon("images/MainImages/youxiang.gif"), JLabel.LEFT);
			MicroLabel.setText("5");
			MicroLabel.setLocation(new Point(120, 80));
			MicroLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
			MicroLabel.setSize(new Dimension(40, 20));
			SpaceLabel = new JLabel(new ImageIcon("images/MainImages/kongjian.gif"), JLabel.LEFT);
			SpaceLabel.setText("3");
			SpaceLabel.setLocation(new Point(80, 80));
			SpaceLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
			SpaceLabel.setSize(new Dimension(40, 20));
			UserNameLabel = new JLabel();
			UserNameLabel.setText("引车卖浆者流");
			UserNameLabel.setLocation(new Point(130, 30));
			UserNameLabel.setForeground(Color.white);
			UserNameLabel.setFont(new Font("Dialog", Font.BOLD, 12));
			UserNameLabel.setSize(new Dimension(87, 20));
			Main_TopPanel = new JImagePane(new ImageIcon("images/MainImages/main_headbg.jpg").getImage(),
					JImagePane.SCALED);
			Main_TopPanel.setLayout(null);
			Main_TopPanel.setSize(new Dimension(287, 137));
			Main_TopPanel.setLocation(new Point(0, 0));
			Main_TopPanel.add(getHeadImagePanel1(), null);
			Main_TopPanel.add(getMinBtn(), null);
			Main_TopPanel.add(getMaxBtn(), null);
			Main_TopPanel.add(getExitBtn(), null);
			Main_TopPanel.add(getMain_StatePanel(), null);
			Main_TopPanel.add(UserNameLabel, null);
			Main_TopPanel.add(getSignatureText(), null);
			Main_TopPanel.add(SpaceLabel, null);
			Main_TopPanel.add(MicroLabel, null);
			Main_TopPanel.add(InformationLabel, null);
			setDragable();
		}
		return Main_TopPanel;
	}

	/**
	 * This method initializes Main_BottomPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getMain_BottomPanel() {
		if (Main_BottomPanel == null) {
			Main_BottomPanel = new JImagePane(new ImageIcon("images/MainImages/main_bottombg.jpg").getImage(),
					JImagePane.SCALED);
			Main_BottomPanel.setLayout(null);
			Main_BottomPanel.setSize(new Dimension(287, 63));
			Main_BottomPanel.setLocation(new Point(0, 577));
		}
		return Main_BottomPanel;
	}

	/**
	 * This method initializes Main_FriendTabbedPane
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	private JTabbedPane getMain_FriendTabbedPane() {
		if (Main_FriendTabbedPane == null) {
			Main_FriendTabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
			// JPanel Tab_FriendPanel2 = new JPanel();
			// JPanel Tab_GroupPanel = new JPanel();
			// JPanel Tab_RecordPanel = new JPanel();
			ImageIcon icon;
			icon = new ImageIcon("images/MainImages/Tab_1.png");
			Main_FriendTabbedPane.addTab(null, icon, Tab_FriendPanel);

			icon = new ImageIcon("images/MainImages/Tab_2.png");
			Main_FriendTabbedPane.addTab(null, icon, Tab_FriendPanel2);
			icon = new ImageIcon("images/MainImages/Tab_3.png");
			Main_FriendTabbedPane.addTab(null, icon, Tab_GroupPanel);
			icon = new ImageIcon("images/MainImages/Tab_4.png");
			Main_FriendTabbedPane.addTab(null, icon, Tab_RecordPanel);

		}
		return Main_FriendTabbedPane;
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.weighty = 1.0;
			gridBagConstraints.weightx = 1.0;
			jPanel = new JPanel();
			jPanel.setLayout(new GridBagLayout());
			jPanel.setLocation(new Point(0, 138));
			jPanel.setSize(new Dimension(287, 445));
			jPanel.add(getMain_FriendTabbedPane(), gridBagConstraints);
		}
		return jPanel;
	}

	public void toCenter() {// 居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width / 2;
		int screenHeight = screenSize.height / 2;
		int height = this.getHeight();
		int width = this.getWidth();
		this.setLocation(screenWidth - width / 2, screenHeight - height / 2);
	}

	private void setDragable() {// 下面拖动窗体的方法
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
					loc = new Point(thisClass.getLocation().x + e.getX() - tmp.x,
							thisClass.getLocation().y + e.getY() - tmp.y);
					thisClass.setLocation(loc);
				}
			}
		});
	}

	/**
	 * This method initializes HeadImagePanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getHeadImagePanel1() {
		if (HeadImagePanel1 == null) {
			HeadImagePanel1 = new JImagePane(new ImageIcon("images/headImage.jpg").getImage(), JImagePane.SCALED);
			HeadImagePanel1.setLayout(new GridBagLayout());
			HeadImagePanel1.setLocation(new Point(5, 30));
			HeadImagePanel1.setSize(new Dimension(65, 65));
		}
		return HeadImagePanel1;
	}

	/**
	 * This method initializes MinBtn
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getMinBtn() {
		if (MinBtn == null) {
			MinBtn = new JButton();
			MinBtn.setOpaque(false);
			MinBtn.setBackground(new Color(2, 2, 2));
			MinBtn.setSize(new Dimension(30, 20));
			MinBtn.setLocation(new Point(196, 0));
			MinBtn.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					thisClass.setExtendedState(JFrame.ICONIFIED);
				}
			});
		}
		return MinBtn;
	}

	/**
	 * This method initializes MaxBtn
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getMaxBtn() {
		if (MaxBtn == null) {
			MaxBtn = new JButton();
			MaxBtn.setOpaque(false);
			MaxBtn.setBackground(new Color(2, 2, 2));
			MaxBtn.setSize(new Dimension(30, 20));
			MaxBtn.setLocation(new Point(223, 0));
		}
		return MaxBtn;
	}

	/**
	 * This method initializes ExitBtn
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getExitBtn() {
		if (ExitBtn == null) {
			ExitBtn = new JButton();
			ExitBtn.setOpaque(false);
			ExitBtn.setBackground(new Color(2, 2, 2));
			ExitBtn.setSize(new Dimension(33, 20));
			ExitBtn.setLocation(new Point(252, 0));
			ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// System.out.println("mouseClicked()"); // TODO
					// Auto-generated Event stub mouseClicked()
					System.exit(0);
				}
			});
		}
		return ExitBtn;
	}

	/**
	 * This method initializes Main_StatePanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getMain_StatePanel() {
		if (Main_StatePanel == null) {
			Main_StatePanel = new JImagePane(new ImageIcon("images/MainImages/zt.jpg").getImage(), JImagePane.SCALED);
			Main_StatePanel.setLayout(null);
			Main_StatePanel.setSize(new Dimension(36, 21));
			Main_StatePanel.setLocation(new Point(80, 30));
			Main_StatePanel.setOpaque(false);
			StateMenu();
			Main_StatePanel.add(jBar, null);
		}
		return Main_StatePanel;
	}

	private void StateMenu() {
		setLayout(null);
		ImageIcon icmr = new ImageIcon("images/zx.jpg");
		jMenu = new JMenu("  ");
		jMenu.setIcon(icmr);
		jMenu.setOpaque(false);
		String imageStr[] = { "zx.jpg", "ys.jpg", "qw.jpg" };
		String NameStr[] = { "在线", "隐身", "Q我" };
		// String NameStrs[][]={{"在线","隐身","Q我"},{"zx.jpg","ys.jpg","qw.jpg"}};
		for (int i = 0; i < 3; i++) {
			ImageIcon ic = new ImageIcon("images/" + imageStr[i]);
			jMenuItems[i] = new JMenuItem(NameStr[i], ic);
			jMenuItems[i].addActionListener(this);
			jMenu.add(jMenuItems[i]);
		}
		jBar.add(jMenu);
		jBar.setBounds(0, 0, 40, 20);
		jBar.setOpaque(false);
		jBar.setBackground(new Color(2, 2, 2));
		jBar.setVisible(true);
		// add(jBar);
	}

	public void actionPerformed(ActionEvent e) {

		JMenuItem target = (JMenuItem) e.getSource();

		String actionCommand = target.getText();
		ImageIcon ic = (ImageIcon) target.getIcon();
		jMenu.setIcon(ic);
		if (actionCommand.equals("隐身")) {// do something}
			// dd();
			System.out.print("具体实现的方法");
			// ……
		}
	}

	/**
	 * This method initializes SignatureText
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getSignatureText() {
		if (SignatureText == null) {
			SignatureText = new JTextField();
			SignatureText.setText("紧抱怀中玉，浅画镜中眉");
			SignatureText.setSize(new Dimension(162, 20));
			SignatureText.setLocation(new Point(80, 55));
			SignatureText.setOpaque(false);
		}
		return SignatureText;
	}

	/**
	 * This method initializes hyScrollPane
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getHyScrollPane() {
		if (hyScrollPane == null) {
			hyScrollPane = new JScrollPane();

			// getTab_GroupPanel();

			// JPanel jPanel = new JPanel(new GridLayout(10, 1, 4, 4));

			// hyScrollPane.add(jPanel);

			hyScrollPane.setLocation(new Point(0, 31));
			hyScrollPane.setViewportView(getJPanel11());
			hyScrollPane.setSize(new Dimension(278, 231));
		}
		return hyScrollPane;
	}

	private void getTab_GroupPanel() { // 初始化好友列表
		hyScrollPane.setViewportView(getJPanel11());
		JLabel[] Labels = new JLabel[10];
		String[] headimage = { "1.gif", "2.jpg", "2.jpg", "2.jpg", "1.gif", "1.gif", "2.jpg", "2.jpg", "2.jpg",
				"1.gif" };
		String[] Name = { "AAAA", "BBBB", "CCCC", "小猫", "Tom", "Java", "sdfs", "夜猫", "李**", "AAAA" };
		for (int i = 0; i < Labels.length; i++) {
			Labels[i] = new JLabel(Name[i], new ImageIcon("images/HeadImages/" + headimage[i]), JLabel.LEFT);
			Labels[i].setVisible(true);
			jPanel11.add(Labels[i]);
			jPanel11.setVisible(true);
		}

	}

	private void getTab_GroupPanelts() { // 初始化好友列表
		hyScrollPane.setViewportView(getJPanel11());
		JLabel[] Labels = new JLabel[10];
		String[] headimage = { "1.gif", "3.jpg", "3.jpg", "3.jpg", "1.gif", "1.gif", "3.jpg", "3.jpg", "3.jpg",
				"1.gif" };
		String[] Name = { "同事AAAA", "同事BBBB", "同事CCCC", "同事小猫", "T同事om", "同事Java", "同事sdfs", "同事夜猫", "同事李**",
				"同事AAAA" };
		for (int i = 0; i < Labels.length; i++) {
			Labels[i] = new JLabel(Name[i], new ImageIcon("images/HeadImages/" + headimage[i]), JLabel.LEFT);
			Labels[i].setVisible(true);
			jPanel11.add(Labels[i]);
			jPanel11.setVisible(true);
		}

	}

	private void getTab_GroupPanelhmd() { // 初始化好友列表
		hyScrollPane.setViewportView(getJPanel11());
		JLabel[] Labels = new JLabel[10];
		String[] headimage = { "1.gif", "2.jpg", "3.jpg", "4.jpg", "1.gif", "1.gif", "2.jpg", "3.jpg", "4.jpg",
				"1.gif" };
		String[] Name = { "黑名单1", "黑名单BBBB", "黑名单CCCC", "黑名单小猫", "黑名单om", "黑名单Java", "黑名单sdfs", "黑名单夜猫", "黑名单李**",
				"黑名单AAAA" };
		for (int i = 0; i < Labels.length; i++) {
			Labels[i] = new JLabel(Name[i], new ImageIcon("images/HeadImages/" + headimage[i]), JLabel.LEFT);
			Labels[i].setVisible(true);
			jPanel11.add(Labels[i]);
			jPanel11.setVisible(true);
		}

	}

	/**
	 * This method initializes jPanel11
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel11() {
		if (jPanel11 == null) {
			jPanel11 = new JPanel(new GridLayout(11, 1, 4, 4));
			/// jPanel11.setLayout(new BoxLayout(getJPanel11(),
			/// BoxLayout.Y_AXIS));
			getTab_GroupPanel();
		}
		return jPanel11;
	}

	/**
	 * This method initializes xiaoxiBtn
	 * 
	 * @return javax.swing.JButton
	 */

} // @jve:decl-index=0:visual-constraint="10,10"
