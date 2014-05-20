import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.swing.SwingConstants;


public class TubingJFrame extends JFrame implements ActionListener, MouseListener {

	/**
	 * Launch the application.
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<?> comboBox = new JComboBox<Object>();
	private JComboBox<?> comboBox_1 = new JComboBox<Object>();
	private final JTextField txtStockLength = new JTextField();
	private final JTextField txtTl = new JTextField();
	private final JLabel lblCtl = new JLabel("CTL");
	private final JTextField txtPart = new JTextField();
	private final JLabel lblPart = new JLabel("Part #");
	private final JTextField txtGauge = new JTextField();
	private final JLabel lblGa = new JLabel("GA");
	private final JTextField txtInches = new JTextField();
	private final JLabel lblDimension = new JLabel("Dimension 1");
	private final JTextField txtInches_1 = new JTextField();
	private final JLabel lblDimension_1 = new JLabel("Dimension 2");
	private final JLabel lblSaw = new JLabel("Saw");
	private final JLabel lblHavens = new JLabel("Havens");
	private final JTextField txtStandard = new JTextField();
	private final JTextField txtStandard_1 = new JTextField();
	private final JLabel lblFeetNeeded = new JLabel("Saw Yield");
	private final JTextField txtYield = new JTextField();
	private final JLabel lblDrop = new JLabel("Saw Drop");
	private final JTextField txtDropFt = new JTextField();
	private final JLabel lblSurfaceArea = new JLabel("Surface Area");
	private final JTextField txtSqft = new JTextField();
	private final JButton btnCutCalcuation = new JButton("Cut Calcuation");
	
	// Input Fields
	private final JLabel lblInputs = new JLabel("Cut List:");
	private final JTextField txtTlTube = new JTextField();
	private final JLabel lblQty = new JLabel("Qty.");
	private final JTextField txtTlTube_1 = new JTextField();
	private final JTextField txtTlTube_2 = new JTextField();
	private final JTextField txtTlTube_3 = new JTextField();
	private JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JTextField textField_4 = new JTextField();
	
	KeyAdapter adapter = new KeyAdapter(){	
		public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
			getToolkit().beep();
			e.consume();
		}
	}
};

/*	KeyAdapter adapter1 = new KeyAdapter(){
		public void keyTyped(KeyEvent e){
			char c = e.getKeyChar();
			if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_PERIOD || c == KeyEvent.VK_DECIMAL || c == KeyEvent.VK_COMMA){
				getToolkit().beep();
				e.consume();
			}
		}
	};*/

	private final JLabel lblHavensDrop = new JLabel("Havens Drop");
	private final JLabel lblHavensYield = new JLabel("Havens Yield");
	private final JTextField txtYieldFt = new JTextField();
	private final JTextField txtDropFt_1 = new JTextField();
	private final JButton btnReset = new JButton("New");
	private final JTextField txtDropFt_2 = new JTextField();
	private final JTextField txtDropFt_3 = new JTextField();
	private final JTextField txtDropFt_4 = new JTextField();
	private final JTextField txtDropFt_5 = new JTextField();
	private final JTextField txtDropFt_6 = new JTextField();
	private final JTextField txtDropFt_7 = new JTextField();
	private final JTextField txtDropFt_8 = new JTextField();
	private final JTextField txtDropFt_9 = new JTextField();
	private final JLabel lblOutputs = new JLabel("Outputs:");
	private final JLabel lblAggregates = new JLabel("Aggregates:");
	private final JTextField txtAggRatehr = new JTextField();
	private final JTextField txtAggYieldFt = new JTextField();
	private final JTextField txtAggRatehr_1 = new JTextField();
	private final JTextField txtAggYieldFt_1 = new JTextField();
	private final JLabel lblTotalSurfaceArea = new JLabel("Total Surface Area");
	private final JTextField txtTotalSqft = new JTextField();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TubingJFrame frame = new TubingJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TubingJFrame() {
		txtTotalSqft.setText("Total Sqft.");
		txtTotalSqft.setColumns(10);
		txtAggYieldFt_1.setText("Agg. Yield ft.");
		txtAggYieldFt_1.setColumns(10);
		txtAggRatehr_1.setText("Agg. Rate /HR");
		txtAggRatehr_1.setColumns(10);
		txtAggYieldFt.setText("Agg. Yield ft.");
		txtAggYieldFt.setColumns(10);
		txtAggRatehr.setText("Agg. Rate /HR");
		txtAggRatehr.setColumns(10);
		txtDropFt_9.setText("Havens Drop ft.");
		txtDropFt_9.setColumns(10);
		txtDropFt_8.setText("Havens Drop ft.");
		txtDropFt_8.setColumns(10);
		txtDropFt_7.setText("Havens Drop ft.");
		txtDropFt_7.setColumns(10);
		txtDropFt_6.setText("Havens Drop ft.");
		txtDropFt_6.setColumns(10);
		txtDropFt_5.setText("Saw Drop ft.");
		txtDropFt_5.setColumns(10);
		txtDropFt_4.setText("Saw Drop ft.");
		txtDropFt_4.setColumns(10);
		txtDropFt_3.setText("Saw Drop ft.");
		txtDropFt_3.setColumns(10);
		txtDropFt_2.setText("Saw Drop ft.");
		txtDropFt_2.setColumns(10);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_4.addKeyListener(adapter);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("0");
		textField_3.setColumns(10);
		textField_3.addKeyListener(adapter);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("0");
		textField_2.setColumns(10);
		textField_2.addKeyListener(adapter);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.addKeyListener(adapter);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.addKeyListener(adapter);
		textField.setText("1");
		textField.setColumns(10);
		txtTlTube_3.setText("TL Tube 4");
		txtTlTube_3.setColumns(10);
		//txtTlTube_3.addKeyListener(adapter1);
		txtTlTube_2.setText("TL Tube 3");
		txtTlTube_2.setColumns(10);
		//txtTlTube_2.addKeyListener(adapter1);
		txtTlTube_1.setText("TL Tube 2");
		txtTlTube_1.setColumns(10);
		//txtTlTube_1.addKeyListener(adapter1);
		//txtTlTube.addKeyListener(adapter1);
		//txtTl.addKeyListener(adapter1);
		setTitle("Nick 1.0 Tubing");
		txtInches_1.setText("Inches");
		txtInches_1.setColumns(10);
		txtInches.setText("Inches");
		txtInches.setColumns(10);
		txtGauge.setText("Gauge");
		txtGauge.setColumns(10);
		txtPart.setText("Part #");
		txtPart.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 480);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{168, 94, 142, 53, 111, 118, 0};
		gbl_contentPane.rowHeights = new int[]{28, 27, 0, 34, 28, 0, 0, 49, 0, 0, 0, 0, 30, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Tube Type", "RD.Tube", "RECT.Tube", "SQ.Tube"}));
		
		comboBox.addActionListener(this);
		comboBox.setName("Select Tube");
		comboBox.setToolTipText("");
		
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.anchor = GridBagConstraints.NORTHWEST;
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.gridx = 0;
				gbc_comboBox.gridy = 0;
				contentPane.add(comboBox, gbc_comboBox);
		
				comboBox_1.addActionListener(this);
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"No Tube Type Selected."}));
				GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
				gbc_comboBox_1.anchor = GridBagConstraints.SOUTHWEST;
				gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox_1.gridx = 0;
				gbc_comboBox_1.gridy = 1;
				contentPane.add(comboBox_1, gbc_comboBox_1);
		
		GridBagConstraints gbc_lblInputs = new GridBagConstraints();
		gbc_lblInputs.insets = new Insets(0, 0, 5, 5);
		gbc_lblInputs.gridx = 2;
		gbc_lblInputs.gridy = 1;
		contentPane.add(lblInputs, gbc_lblInputs);
		
		GridBagConstraints gbc_lblQty = new GridBagConstraints();
		gbc_lblQty.insets = new Insets(0, 0, 5, 5);
		gbc_lblQty.gridx = 3;
		gbc_lblQty.gridy = 1;
		contentPane.add(lblQty, gbc_lblQty);
		
		GridBagConstraints gbc_lblDrop = new GridBagConstraints();
		gbc_lblDrop.insets = new Insets(0, 0, 5, 5);
		gbc_lblDrop.gridx = 4;
		gbc_lblDrop.gridy = 1;
		contentPane.add(lblDrop, gbc_lblDrop);
		
		GridBagConstraints gbc_lblHavensDrop = new GridBagConstraints();
		gbc_lblHavensDrop.insets = new Insets(0, 0, 5, 0);
		gbc_lblHavensDrop.gridx = 5;
		gbc_lblHavensDrop.gridy = 1;
		contentPane.add(lblHavensDrop, gbc_lblHavensDrop);
		
		GridBagConstraints gbc_txtPart = new GridBagConstraints();
		gbc_txtPart.insets = new Insets(0, 0, 5, 5);
		gbc_txtPart.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPart.gridx = 0;
		gbc_txtPart.gridy = 2;
		contentPane.add(txtPart, gbc_txtPart);
		
		GridBagConstraints gbc_lblPart = new GridBagConstraints();
		gbc_lblPart.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPart.insets = new Insets(0, 0, 5, 5);
		gbc_lblPart.gridx = 1;
		gbc_lblPart.gridy = 2;
		contentPane.add(lblPart, gbc_lblPart);
		txtTl.setText("TL");
		txtTl.setColumns(10);
		
		GridBagConstraints gbc_txtTl = new GridBagConstraints();
		gbc_txtTl.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTl.anchor = GridBagConstraints.NORTH;
		gbc_txtTl.insets = new Insets(0, 0, 5, 5);
		gbc_txtTl.gridx = 2;
		gbc_txtTl.gridy = 2;
		contentPane.add(txtTl, gbc_txtTl);
		
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 2;
		contentPane.add(textField, gbc_textField);
		txtDropFt.setText("Saw Drop ft.");
		txtDropFt.setColumns(10);
		
		GridBagConstraints gbc_txtDropFt = new GridBagConstraints();
		gbc_txtDropFt.insets = new Insets(0, 0, 5, 5);
		gbc_txtDropFt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDropFt.gridx = 4;
		gbc_txtDropFt.gridy = 2;
		contentPane.add(txtDropFt, gbc_txtDropFt);
		txtDropFt_1.setText("Havens Drop ft.");
		txtDropFt_1.setColumns(10);
		
		GridBagConstraints gbc_txtDropFt_1 = new GridBagConstraints();
		gbc_txtDropFt_1.insets = new Insets(0, 0, 5, 0);
		gbc_txtDropFt_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDropFt_1.gridx = 5;
		gbc_txtDropFt_1.gridy = 2;
		contentPane.add(txtDropFt_1, gbc_txtDropFt_1);
		txtStockLength.setText("Stock Length");
		txtStockLength.setColumns(10);
		
		GridBagConstraints gbc_txtStockLength = new GridBagConstraints();
		gbc_txtStockLength.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtStockLength.insets = new Insets(0, 0, 5, 5);
		gbc_txtStockLength.gridx = 0;
		gbc_txtStockLength.gridy = 3;
		contentPane.add(txtStockLength, gbc_txtStockLength);
		
		GridBagConstraints gbc_lblCtl = new GridBagConstraints();
		gbc_lblCtl.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCtl.insets = new Insets(0, 0, 5, 5);
		gbc_lblCtl.gridx = 1;
		gbc_lblCtl.gridy = 3;
		contentPane.add(lblCtl, gbc_lblCtl);
		txtTlTube.setText("TL Tube 1");
		txtTlTube.setColumns(10);
		
		GridBagConstraints gbc_txtTlTube = new GridBagConstraints();
		gbc_txtTlTube.insets = new Insets(0, 0, 5, 5);
		gbc_txtTlTube.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTlTube.gridx = 2;
		gbc_txtTlTube.gridy = 3;
		contentPane.add(txtTlTube, gbc_txtTlTube);
		
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 3;
		contentPane.add(textField_1, gbc_textField_1);
		
		GridBagConstraints gbc_txtDropFt_2 = new GridBagConstraints();
		gbc_txtDropFt_2.insets = new Insets(0, 0, 5, 5);
		gbc_txtDropFt_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDropFt_2.gridx = 4;
		gbc_txtDropFt_2.gridy = 3;
		contentPane.add(txtDropFt_2, gbc_txtDropFt_2);
		
		GridBagConstraints gbc_txtDropFt_6 = new GridBagConstraints();
		gbc_txtDropFt_6.insets = new Insets(0, 0, 5, 0);
		gbc_txtDropFt_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDropFt_6.gridx = 5;
		gbc_txtDropFt_6.gridy = 3;
		contentPane.add(txtDropFt_6, gbc_txtDropFt_6);
		
		GridBagConstraints gbc_txtGauge = new GridBagConstraints();
		gbc_txtGauge.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGauge.insets = new Insets(0, 0, 5, 5);
		gbc_txtGauge.gridx = 0;
		gbc_txtGauge.gridy = 4;
		contentPane.add(txtGauge, gbc_txtGauge);
		
		GridBagConstraints gbc_lblGa = new GridBagConstraints();
		gbc_lblGa.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblGa.insets = new Insets(0, 0, 5, 5);
		gbc_lblGa.gridx = 1;
		gbc_lblGa.gridy = 4;
		contentPane.add(lblGa, gbc_lblGa);
		
		GridBagConstraints gbc_txtTlTube_1 = new GridBagConstraints();
		gbc_txtTlTube_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtTlTube_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTlTube_1.gridx = 2;
		gbc_txtTlTube_1.gridy = 4;
		contentPane.add(txtTlTube_1, gbc_txtTlTube_1);
		
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 4;
		contentPane.add(textField_2, gbc_textField_2);
		
		GridBagConstraints gbc_txtDropFt_3 = new GridBagConstraints();
		gbc_txtDropFt_3.insets = new Insets(0, 0, 5, 5);
		gbc_txtDropFt_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDropFt_3.gridx = 4;
		gbc_txtDropFt_3.gridy = 4;
		contentPane.add(txtDropFt_3, gbc_txtDropFt_3);
		
		GridBagConstraints gbc_txtDropFt_7 = new GridBagConstraints();
		gbc_txtDropFt_7.insets = new Insets(0, 0, 5, 0);
		gbc_txtDropFt_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDropFt_7.gridx = 5;
		gbc_txtDropFt_7.gridy = 4;
		contentPane.add(txtDropFt_7, gbc_txtDropFt_7);
		
		GridBagConstraints gbc_txtInches = new GridBagConstraints();
		gbc_txtInches.insets = new Insets(0, 0, 5, 5);
		gbc_txtInches.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInches.gridx = 0;
		gbc_txtInches.gridy = 5;
		contentPane.add(txtInches, gbc_txtInches);
		
		GridBagConstraints gbc_lblDimension = new GridBagConstraints();
		gbc_lblDimension.anchor = GridBagConstraints.WEST;
		gbc_lblDimension.insets = new Insets(0, 0, 5, 5);
		gbc_lblDimension.gridx = 1;
		gbc_lblDimension.gridy = 5;
		contentPane.add(lblDimension, gbc_lblDimension);
		
		GridBagConstraints gbc_txtTlTube_2 = new GridBagConstraints();
		gbc_txtTlTube_2.insets = new Insets(0, 0, 5, 5);
		gbc_txtTlTube_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTlTube_2.gridx = 2;
		gbc_txtTlTube_2.gridy = 5;
		contentPane.add(txtTlTube_2, gbc_txtTlTube_2);
		
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 5;
		contentPane.add(textField_3, gbc_textField_3);
		
		GridBagConstraints gbc_txtDropFt_4 = new GridBagConstraints();
		gbc_txtDropFt_4.insets = new Insets(0, 0, 5, 5);
		gbc_txtDropFt_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDropFt_4.gridx = 4;
		gbc_txtDropFt_4.gridy = 5;
		contentPane.add(txtDropFt_4, gbc_txtDropFt_4);
		
		GridBagConstraints gbc_txtDropFt_8 = new GridBagConstraints();
		gbc_txtDropFt_8.insets = new Insets(0, 0, 5, 0);
		gbc_txtDropFt_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDropFt_8.gridx = 5;
		gbc_txtDropFt_8.gridy = 5;
		contentPane.add(txtDropFt_8, gbc_txtDropFt_8);
		
		GridBagConstraints gbc_txtInches_1 = new GridBagConstraints();
		gbc_txtInches_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtInches_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInches_1.gridx = 0;
		gbc_txtInches_1.gridy = 6;
		contentPane.add(txtInches_1, gbc_txtInches_1);
		
		GridBagConstraints gbc_lblDimension_1 = new GridBagConstraints();
		gbc_lblDimension_1.anchor = GridBagConstraints.WEST;
		gbc_lblDimension_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDimension_1.gridx = 1;
		gbc_lblDimension_1.gridy = 6;
		contentPane.add(lblDimension_1, gbc_lblDimension_1);
		
		GridBagConstraints gbc_txtTlTube_3 = new GridBagConstraints();
		gbc_txtTlTube_3.insets = new Insets(0, 0, 5, 5);
		gbc_txtTlTube_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTlTube_3.gridx = 2;
		gbc_txtTlTube_3.gridy = 6;
		contentPane.add(txtTlTube_3, gbc_txtTlTube_3);
		
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 6;
		contentPane.add(textField_4, gbc_textField_4);
		
		GridBagConstraints gbc_txtDropFt_5 = new GridBagConstraints();
		gbc_txtDropFt_5.insets = new Insets(0, 0, 5, 5);
		gbc_txtDropFt_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDropFt_5.gridx = 4;
		gbc_txtDropFt_5.gridy = 6;
		contentPane.add(txtDropFt_5, gbc_txtDropFt_5);
		
		GridBagConstraints gbc_txtDropFt_9 = new GridBagConstraints();
		gbc_txtDropFt_9.insets = new Insets(0, 0, 5, 0);
		gbc_txtDropFt_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDropFt_9.gridx = 5;
		gbc_txtDropFt_9.gridy = 6;
		contentPane.add(txtDropFt_9, gbc_txtDropFt_9);
		
		GridBagConstraints gbc_lblOutputs = new GridBagConstraints();
		gbc_lblOutputs.anchor = GridBagConstraints.SOUTH;
		gbc_lblOutputs.insets = new Insets(0, 0, 5, 5);
		gbc_lblOutputs.gridx = 1;
		gbc_lblOutputs.gridy = 7;
		contentPane.add(lblOutputs, gbc_lblOutputs);
		
		GridBagConstraints gbc_lblAggregates = new GridBagConstraints();
		gbc_lblAggregates.anchor = GridBagConstraints.SOUTH;
		gbc_lblAggregates.insets = new Insets(0, 0, 5, 5);
		gbc_lblAggregates.gridx = 2;
		gbc_lblAggregates.gridy = 7;
		contentPane.add(lblAggregates, gbc_lblAggregates);
		
		GridBagConstraints gbc_lblHavens = new GridBagConstraints();
		gbc_lblHavens.anchor = GridBagConstraints.EAST;
		gbc_lblHavens.insets = new Insets(0, 0, 5, 5);
		gbc_lblHavens.gridx = 0;
		gbc_lblHavens.gridy = 8;
		contentPane.add(lblHavens, gbc_lblHavens);
		txtStandard_1.setText("Rate /HR");
		txtStandard_1.setColumns(10);
		
		GridBagConstraints gbc_txtStandard_1 = new GridBagConstraints();
		gbc_txtStandard_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtStandard_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtStandard_1.gridx = 1;
		gbc_txtStandard_1.gridy = 8;
		contentPane.add(txtStandard_1, gbc_txtStandard_1);
		
		GridBagConstraints gbc_txtAggRatehr = new GridBagConstraints();
		gbc_txtAggRatehr.insets = new Insets(0, 0, 5, 5);
		gbc_txtAggRatehr.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAggRatehr.gridx = 2;
		gbc_txtAggRatehr.gridy = 8;
		contentPane.add(txtAggRatehr, gbc_txtAggRatehr);
		
		GridBagConstraints gbc_lblSurfaceArea = new GridBagConstraints();
		gbc_lblSurfaceArea.anchor = GridBagConstraints.EAST;
		gbc_lblSurfaceArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblSurfaceArea.gridx = 4;
		gbc_lblSurfaceArea.gridy = 8;
		contentPane.add(lblSurfaceArea, gbc_lblSurfaceArea);
		txtSqft.setText("Sqft.");
		txtSqft.setColumns(10);
		
		GridBagConstraints gbc_txtSqft = new GridBagConstraints();
		gbc_txtSqft.insets = new Insets(0, 0, 5, 0);
		gbc_txtSqft.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSqft.gridx = 5;
		gbc_txtSqft.gridy = 8;
		contentPane.add(txtSqft, gbc_txtSqft);
		
		GridBagConstraints gbc_lblHavensYield = new GridBagConstraints();
		gbc_lblHavensYield.anchor = GridBagConstraints.EAST;
		gbc_lblHavensYield.insets = new Insets(0, 0, 5, 5);
		gbc_lblHavensYield.gridx = 0;
		gbc_lblHavensYield.gridy = 9;
		contentPane.add(lblHavensYield, gbc_lblHavensYield);
		txtYieldFt.setText("Yield ft.");
		txtYieldFt.setColumns(10);
		
		GridBagConstraints gbc_txtYieldFt = new GridBagConstraints();
		gbc_txtYieldFt.insets = new Insets(0, 0, 5, 5);
		gbc_txtYieldFt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtYieldFt.gridx = 1;
		gbc_txtYieldFt.gridy = 9;
		contentPane.add(txtYieldFt, gbc_txtYieldFt);
		
		GridBagConstraints gbc_txtAggYieldFt = new GridBagConstraints();
		gbc_txtAggYieldFt.insets = new Insets(0, 0, 5, 5);
		gbc_txtAggYieldFt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAggYieldFt.gridx = 2;
		gbc_txtAggYieldFt.gridy = 9;
		contentPane.add(txtAggYieldFt, gbc_txtAggYieldFt);
		
		GridBagConstraints gbc_lblTotalSurfaceArea = new GridBagConstraints();
		gbc_lblTotalSurfaceArea.anchor = GridBagConstraints.EAST;
		gbc_lblTotalSurfaceArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalSurfaceArea.gridx = 4;
		gbc_lblTotalSurfaceArea.gridy = 9;
		contentPane.add(lblTotalSurfaceArea, gbc_lblTotalSurfaceArea);
		
		GridBagConstraints gbc_txtTotalSqft = new GridBagConstraints();
		gbc_txtTotalSqft.insets = new Insets(0, 0, 5, 0);
		gbc_txtTotalSqft.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTotalSqft.gridx = 5;
		gbc_txtTotalSqft.gridy = 9;
		contentPane.add(txtTotalSqft, gbc_txtTotalSqft);
		
		GridBagConstraints gbc_lblSaw = new GridBagConstraints();
		gbc_lblSaw.anchor = GridBagConstraints.EAST;
		gbc_lblSaw.insets = new Insets(0, 0, 5, 5);
		gbc_lblSaw.gridx = 0;
		gbc_lblSaw.gridy = 10;
		contentPane.add(lblSaw, gbc_lblSaw);
		txtStandard.setText("Rate /HR");
		txtStandard.setColumns(10);
		
		GridBagConstraints gbc_txtStandard = new GridBagConstraints();
		gbc_txtStandard.insets = new Insets(0, 0, 5, 5);
		gbc_txtStandard.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtStandard.gridx = 1;
		gbc_txtStandard.gridy = 10;
		contentPane.add(txtStandard, gbc_txtStandard);
		
		GridBagConstraints gbc_txtAggRatehr_1 = new GridBagConstraints();
		gbc_txtAggRatehr_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtAggRatehr_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAggRatehr_1.gridx = 2;
		gbc_txtAggRatehr_1.gridy = 10;
		contentPane.add(txtAggRatehr_1, gbc_txtAggRatehr_1);
		
		GridBagConstraints gbc_lblFeetNeeded = new GridBagConstraints();
		gbc_lblFeetNeeded.anchor = GridBagConstraints.EAST;
		gbc_lblFeetNeeded.insets = new Insets(0, 0, 5, 5);
		gbc_lblFeetNeeded.gridx = 0;
		gbc_lblFeetNeeded.gridy = 11;
		contentPane.add(lblFeetNeeded, gbc_lblFeetNeeded);
		txtYield.setText("Yield ft.");
		txtYield.setColumns(10);
		
		GridBagConstraints gbc_txtYield = new GridBagConstraints();
		gbc_txtYield.insets = new Insets(0, 0, 5, 5);
		gbc_txtYield.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtYield.gridx = 1;
		gbc_txtYield.gridy = 11;
		contentPane.add(txtYield, gbc_txtYield);
		
		GridBagConstraints gbc_txtAggYieldFt_1 = new GridBagConstraints();
		gbc_txtAggYieldFt_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtAggYieldFt_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAggYieldFt_1.gridx = 2;
		gbc_txtAggYieldFt_1.gridy = 11;
		contentPane.add(txtAggYieldFt_1, gbc_txtAggYieldFt_1);
		
		GridBagConstraints gbc_btnReset = new GridBagConstraints();
		gbc_btnReset.insets = new Insets(0, 0, 5, 5);
		gbc_btnReset.gridx = 4;
		gbc_btnReset.gridy = 11;
		contentPane.add(btnReset, gbc_btnReset);
		btnReset.addMouseListener(this);
		
		GridBagConstraints gbc_btnCutCalcuation = new GridBagConstraints();
		gbc_btnCutCalcuation.insets = new Insets(0, 0, 5, 0);
		gbc_btnCutCalcuation.gridx = 5;
		gbc_btnCutCalcuation.gridy = 11;
		contentPane.add(btnCutCalcuation, gbc_btnCutCalcuation);
		btnCutCalcuation.addMouseListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int eval = comboBox.getSelectedIndex();
		if (e.getSource().equals(comboBox)) {
		    switch (eval) {
			case 0:
				comboBox_1.setModel(new DefaultComboBoxModel(
						new String[] { "No Tube Type Selected." }));
				break;
			case 1:
				comboBox_1.setModel(new DefaultComboBoxModel(Round_Tube
						.values()));
				break;
			case 2:
				comboBox_1
						.setModel(new DefaultComboBoxModel(Rec_Tube.values()));
				break;
			case 3:
				comboBox_1.setModel(new DefaultComboBoxModel(Square_Tube
						.values()));
				break;
			}
		}else if (e.getSource().equals(comboBox_1)){
			switch (eval) {
			case 1:
				Round_Tube tube = (Round_Tube) comboBox_1.getSelectedItem();
				txtStockLength.setText("CTL " + tube.getCtl());
				txtPart.setText("Part #: " + tube.getPartNum());
				txtGauge.setText("Gauge: " + tube.getGauge());
				txtInches.setText("Radius: " + tube.getDim());
				txtInches_1.setText("");
				break;
			case 2:
				Rec_Tube tube1 = (Rec_Tube) comboBox_1.getSelectedItem();
				txtStockLength.setText("CTL " + tube1.getCtl());
				txtPart.setText("Part #: " + tube1.getPartNum());
				txtGauge.setText("Gauge: " + tube1.getGauge());
				txtInches.setText("Length: " + tube1.getDimHeight());
				txtInches_1.setText("Width: " + tube1.getDimWidth());
				break;
			case 3:
				Square_Tube tube2 = (Square_Tube) comboBox_1.getSelectedItem();
				txtStockLength.setText("CTL " + tube2.getCtl());
				txtPart.setText("Part # " + tube2.getPartNum());
				txtGauge.setText("Gauge: " + tube2.getGauge());
				txtInches.setText("Dimension: " + tube2.getDim());
				txtInches_1.setText("");
				break;
			} 

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(btnReset)){
			try {
				TubingJFrame frame = new TubingJFrame();
				frame.setVisible(true);
			} catch (Exception e1) {
				e1.printStackTrace();
			}		
			System.out.println("Reset.");	
		}
			//String strTextValue = txtTl.getText();

		    
		
		String[] cutList = new String[5];
		cutList[0] = txtTl.getText();
		cutList[1] = txtTlTube.getText();
		cutList[2] = txtTlTube_1.getText();
		cutList[3] = txtTlTube_2.getText();
		cutList[4] = txtTlTube_3.getText();
		
	    double[] dValue = new double[5];
	    List<Double> ctlValues = new ArrayList();
	    
		for (int i = 0; i < cutList.length; i++) {
			try {
				if (cutList[i].equals("")) {
					// Handle empty string
				} else {
					dValue[i] = Double.parseDouble(cutList[i]);
					ctlValues.add(Double.parseDouble(cutList[i]));
					//System.out.println(dValue[i]);
					// Handle valid value
				}
			} catch (Exception e1) {
				// Handle invalid value
			}
		}
	
		
		
		int[] quantity = new int[5];
		quantity[0] = Integer.parseInt(textField.getText());
		quantity[1] = Integer.parseInt(textField_1.getText());		
		quantity[2] = Integer.parseInt(textField_2.getText());	
		quantity[3] = Integer.parseInt(textField_3.getText());
		quantity[4] = Integer.parseInt(textField_4.getText());
		
		List<Object> havensDrop = new ArrayList();
		havensDrop.add(txtDropFt_1);
		havensDrop.add(txtDropFt_6);		
		havensDrop.add(txtDropFt_7);		
		havensDrop.add(txtDropFt_8);		
		havensDrop.add(txtDropFt_9);
		
		List<Object> sawDrop = new ArrayList();
		sawDrop.add(txtDropFt);
		sawDrop.add(txtDropFt_2);
		sawDrop.add(txtDropFt_3);
		sawDrop.add(txtDropFt_4);
		sawDrop.add(txtDropFt_5);
		
		
		
		int eval = comboBox.getSelectedIndex();
		double t = 0;
		double aggYield = 0;
		double aggRate = 0;
		double aggYield_1 = 0;
		double aggRate_1 = 0;
		
		for (int i = 0; i < 5; i++){
		if (dValue[i] > 0 && quantity[i] > 0){
			switch (eval){
			case 1:
				Round_Tube Etube = (Round_Tube) comboBox_1.getSelectedItem();
				RoundTube tube = new RoundTube(dValue[i], Etube);
				txtYield.setText("(FT): " + tube.sawTubeYield(tube.getStockTube().getCtl(), quantity[i]));
				//txtDropFt.setText("(IN): " + tube.getDrop(tube.getStockTube().getCtl()));
				((JTextComponent) sawDrop.get(i)).setText("(IN): " + tube.getDrop(tube.getStockTube().getCtl()));
				txtStandard.setText(tube.sawRate(quantity[i]) + " /HR");
				txtStandard_1.setText(tube.getHavensRate(quantity[i]));
				if (!tube.getHavensRate(quantity[i]).endsWith("!")){
					txtYieldFt.setText("(FT):" + tube.havensTubeYield(tube.getStockTube().getCtl(), quantity[i]));
					//txtDropFt_1.setText("(IN):" + tube.getHavensDrop(tube.getStockTube().getCtl()));
					((JTextComponent) havensDrop.get(i)).setText("(IN):" + tube.getHavensDrop(tube.getStockTube().getCtl()));
					aggYield_1 = aggYield_1 + tube.havensTubeYield(tube.getStockTube().getCtl(), quantity[i]);
					txtAggYieldFt_1.setText("(FT):" + aggYield_1);
					if (i == 0){
						aggRate_1 = 1/(Double.parseDouble(tube.getHavensRate(quantity[i]).replace("/HR", "")));
					} else {
					aggRate_1 = aggRate_1 + 1/(Double.parseDouble(tube.getHavensRate(quantity[i]).replace("/HR", "")));
					}
					txtAggRatehr.setText(1/aggRate_1 + "/HR");					
				}				
				txtSqft.setText(tube.surfaceArea(quantity[i]) + " Sqft.");
				t = t + tube.surfaceArea(quantity[i]);
				t = Math.floor(t*1000)/1000;
				txtTotalSqft.setText(t + " Sqft.");
				
					if (i == 0) {
						aggRate = 1 / tube.sawRate(quantity[i]);
					} else {
						aggRate = aggRate + 1 / tube.sawRate(quantity[i]);
				
					}
				txtAggRatehr_1.setText(1/aggRate + "/HR");
				aggYield = aggYield + tube.sawTubeYield(tube.getStockTube().getCtl(), quantity[i]);
				aggYield = Math.floor(aggYield*1000)/1000;
				txtAggYieldFt.setText("(FT):" + aggYield);

				//System.out.println(tube.getTubeLength());
				break;
			case 2:
				Rec_Tube Etube1 = (Rec_Tube) comboBox_1.getSelectedItem();
				RecTube tube1 = new RecTube(dValue[i], Etube1);
				txtYield.setText("(FT): " + tube1.sawTubeYield(tube1.getStockTube().getCtl(), quantity[i]));
				//txtDropFt.setText("(IN): " + tube1.getDrop(tube1.getStockTube().getCtl()));
				((JTextComponent) sawDrop.get(i)).setText("(IN): " + tube1.getDrop(tube1.getStockTube().getCtl()));
				txtStandard.setText(tube1.sawRate(quantity[i]) + " /HR");
				txtStandard_1.setText("Can't cut Rect!");
				txtSqft.setText(tube1.surfaceArea(quantity[i]) + " Sqft.");
				t = t + tube1.surfaceArea(quantity[i]);
				txtTotalSqft.setText(t + " Sqft.");	
				
				if (i == 0) {
					aggRate = 1 / tube1.sawRate(quantity[i]);
				} else {
					aggRate = aggRate + 1 / tube1.sawRate(quantity[i]);
				}
				txtAggRatehr_1.setText(1/aggRate + "/HR");
				
				aggYield = aggYield + tube1.sawTubeYield(tube1.getStockTube().getCtl(), quantity[i]);
				aggYield = Math.floor(aggYield*1000)/1000;
				txtAggYieldFt.setText("(FT):" + aggYield);		
				
				break;
			case 3:
				Square_Tube Etube2 = (Square_Tube) comboBox_1.getSelectedItem();
				SQTube tube2 = new SQTube(dValue[i], Etube2);
				txtYield.setText("(FT): " + tube2.sawTubeYield(tube2.getStockTube().getCtl(), quantity[i]));
				//txtDropFt.setText("(IN): " + tube2.getDrop(tube2.getStockTube().getCtl()));
				((JTextComponent) sawDrop.get(i)).setText("(IN): " + tube2.getDrop(tube2.getStockTube().getCtl()));
				txtStandard.setText(tube2.sawRate(quantity[i]) + " /HR");
				txtStandard_1.setText(tube2.getHavensRate(quantity[i]));
				if (!tube2.getHavensRate(quantity[i]).endsWith("!")){
					txtYieldFt.setText("(FT):" + tube2.havensTubeYield(tube2.getStockTube().getCtl(), quantity[i]));
					//txtDropFt_1.setText("(IN):" + tube2.getHavensDrop(tube2.getStockTube().getCtl()));
					((JTextComponent) havensDrop.get(i)).setText("(IN):" + tube2.getHavensDrop(tube2.getStockTube().getCtl()));
					aggYield_1 = aggYield_1 + tube2.havensTubeYield(tube2.getStockTube().getCtl(), quantity[i]);
					aggYield_1 = Math.floor(aggYield_1*1000)/1000;
					txtAggYieldFt_1.setText("(FT):" + aggYield_1);
					if (i == 0){
						aggRate_1 = 1/(Double.parseDouble(tube2.getHavensRate(quantity[i]).replace("/HR", "")));
					} else {
					aggRate_1 = aggRate_1 + 1/(Double.parseDouble(tube2.getHavensRate(quantity[i]).replace("/HR", "")));
					}
					txtAggRatehr.setText(1/aggRate_1 + "/HR");		
				}
				txtSqft.setText(tube2.surfaceArea(quantity[i]) + " Sqft.");
				t = t + tube2.surfaceArea(quantity[i]);
				t = Math.floor(t*1000)/1000;
				txtTotalSqft.setText(t + " Sqft.");	
				
				aggYield = aggYield + tube2.sawTubeYield(tube2.getStockTube().getCtl(), quantity[i]);
				aggYield = Math.floor(aggYield*1000)/1000;
				txtAggYieldFt.setText("(FT):" + aggYield);
				
				break;
			}

		}
		}
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}


