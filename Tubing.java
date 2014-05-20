
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Tubing extends JFrame implements ActionListener, MouseListener {

	/**
	 * Luke Westerheim
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<?> comboBox = new JComboBox<Object>();
	private JComboBox<?> comboBox_1 = new JComboBox<Object>();
	private final JTextField txtStockLength = new JTextField();
	private final JLabel lblTubeLength = new JLabel("Tube Length");
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
	private final JLabel lblOutput = new JLabel("Outputs:");
	private final JLabel lblFeetNeeded = new JLabel("Yield");
	private final JTextField txtYield = new JTextField();
	private final JLabel lblDrop = new JLabel("Drop");
	private final JTextField txtDropFt = new JTextField();
	private final JLabel lblSurfaceArea = new JLabel("Surface Area");
	private final JTextField txtSqft = new JTextField();
	private final JButton btnCutCalcuation = new JButton("Cut Calcuation");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tubing frame = new Tubing();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Tubing() {
		setTitle("Nick 1.0 Tubing");
		txtSqft.setText("Sqft.");
		txtSqft.setColumns(10);
		txtDropFt.setText("Drop ft.");
		txtDropFt.setColumns(10);
		txtYield.setText("Yield ft.");
		txtYield.setColumns(10);
		txtStandard_1.setText("Rate /HR");
		txtStandard_1.setColumns(10);
		txtStandard.setText("Rate /HR");
		txtStandard.setColumns(10);
		txtInches_1.setText("Inches");
		txtInches_1.setColumns(10);
		txtInches.setText("Inches");
		txtInches.setColumns(10);
		txtGauge.setText("Gauge");
		txtGauge.setColumns(10);
		txtPart.setText("Part #");
		txtPart.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 400);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{168, 109, 78, 93, 37, 0};
		gbl_contentPane.rowHeights = new int[]{28, 27, 0, 34, 28, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Tube Type", "RD.Tube", "RECT.Tube", "SQ.Tube"}));
		
		comboBox.addActionListener(this);
		comboBox.setName("Select Tube");
		comboBox.setToolTipText("");
		
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.anchor = GridBagConstraints.NORTHWEST;
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.gridwidth = 2;
				gbc_comboBox.gridx = 0;
				gbc_comboBox.gridy = 0;
				contentPane.add(comboBox, gbc_comboBox);
		
		GridBagConstraints gbc_lblTubeLength = new GridBagConstraints();
		gbc_lblTubeLength.anchor = GridBagConstraints.EAST;
		gbc_lblTubeLength.insets = new Insets(0, 0, 5, 5);
		gbc_lblTubeLength.gridx = 2;
		gbc_lblTubeLength.gridy = 0;
		contentPane.add(lblTubeLength, gbc_lblTubeLength);
		txtTl.setText("TL");
		txtTl.setColumns(10);
		
		GridBagConstraints gbc_txtTl = new GridBagConstraints();
		gbc_txtTl.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtTl.insets = new Insets(0, 0, 5, 0);
		gbc_txtTl.gridwidth = 2;
		gbc_txtTl.gridx = 3;
		gbc_txtTl.gridy = 0;
		contentPane.add(txtTl, gbc_txtTl);
		
				comboBox_1.addActionListener(this);
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"No Tube Type Selected."}));
				GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
				gbc_comboBox_1.anchor = GridBagConstraints.SOUTHWEST;
				gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox_1.gridwidth = 2;
				gbc_comboBox_1.gridx = 0;
				gbc_comboBox_1.gridy = 1;
				contentPane.add(comboBox_1, gbc_comboBox_1);
		
		GridBagConstraints gbc_lblOutput = new GridBagConstraints();
		gbc_lblOutput.insets = new Insets(0, 0, 5, 5);
		gbc_lblOutput.gridx = 3;
		gbc_lblOutput.gridy = 1;
		contentPane.add(lblOutput, gbc_lblOutput);
		
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
		
		GridBagConstraints gbc_lblSaw = new GridBagConstraints();
		gbc_lblSaw.anchor = GridBagConstraints.EAST;
		gbc_lblSaw.insets = new Insets(0, 0, 5, 5);
		gbc_lblSaw.gridx = 2;
		gbc_lblSaw.gridy = 2;
		contentPane.add(lblSaw, gbc_lblSaw);
		
		GridBagConstraints gbc_txtStandard = new GridBagConstraints();
		gbc_txtStandard.insets = new Insets(0, 0, 5, 5);
		gbc_txtStandard.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtStandard.gridx = 3;
		gbc_txtStandard.gridy = 2;
		contentPane.add(txtStandard, gbc_txtStandard);
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
		
		GridBagConstraints gbc_lblHavens = new GridBagConstraints();
		gbc_lblHavens.anchor = GridBagConstraints.EAST;
		gbc_lblHavens.insets = new Insets(0, 0, 5, 5);
		gbc_lblHavens.gridx = 2;
		gbc_lblHavens.gridy = 3;
		contentPane.add(lblHavens, gbc_lblHavens);
		
		GridBagConstraints gbc_txtStandard_1 = new GridBagConstraints();
		gbc_txtStandard_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtStandard_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtStandard_1.gridx = 3;
		gbc_txtStandard_1.gridy = 3;
		contentPane.add(txtStandard_1, gbc_txtStandard_1);
		
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
		
		GridBagConstraints gbc_lblFeetNeeded = new GridBagConstraints();
		gbc_lblFeetNeeded.anchor = GridBagConstraints.EAST;
		gbc_lblFeetNeeded.insets = new Insets(0, 0, 5, 5);
		gbc_lblFeetNeeded.gridx = 2;
		gbc_lblFeetNeeded.gridy = 4;
		contentPane.add(lblFeetNeeded, gbc_lblFeetNeeded);
		
		GridBagConstraints gbc_txtYield = new GridBagConstraints();
		gbc_txtYield.insets = new Insets(0, 0, 5, 5);
		gbc_txtYield.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtYield.gridx = 3;
		gbc_txtYield.gridy = 4;
		contentPane.add(txtYield, gbc_txtYield);
		
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
		
		GridBagConstraints gbc_lblDrop = new GridBagConstraints();
		gbc_lblDrop.anchor = GridBagConstraints.EAST;
		gbc_lblDrop.insets = new Insets(0, 0, 5, 5);
		gbc_lblDrop.gridx = 2;
		gbc_lblDrop.gridy = 5;
		contentPane.add(lblDrop, gbc_lblDrop);
		
		GridBagConstraints gbc_txtDropFt = new GridBagConstraints();
		gbc_txtDropFt.insets = new Insets(0, 0, 5, 5);
		gbc_txtDropFt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDropFt.gridx = 3;
		gbc_txtDropFt.gridy = 5;
		contentPane.add(txtDropFt, gbc_txtDropFt);
		
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
		
		GridBagConstraints gbc_lblSurfaceArea = new GridBagConstraints();
		gbc_lblSurfaceArea.anchor = GridBagConstraints.EAST;
		gbc_lblSurfaceArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblSurfaceArea.gridx = 2;
		gbc_lblSurfaceArea.gridy = 6;
		contentPane.add(lblSurfaceArea, gbc_lblSurfaceArea);
		
		GridBagConstraints gbc_txtSqft = new GridBagConstraints();
		gbc_txtSqft.insets = new Insets(0, 0, 5, 5);
		gbc_txtSqft.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSqft.gridx = 3;
		gbc_txtSqft.gridy = 6;
		contentPane.add(txtSqft, gbc_txtSqft);
		
		GridBagConstraints gbc_btnCutCalcuation = new GridBagConstraints();
		gbc_btnCutCalcuation.insets = new Insets(0, 0, 0, 5);
		gbc_btnCutCalcuation.gridx = 3;
		gbc_btnCutCalcuation.gridy = 7;
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
				txtPart.setText("Part # " + tube.getPartNum());
				txtGauge.setText("Gauge: " + tube.getGauge());
				txtInches.setText("Radius " + tube.getDim());
				txtInches_1.setText("");
				break;
			case 2:
				Rec_Tube tube1 = (Rec_Tube) comboBox_1.getSelectedItem();
				txtStockLength.setText("CTL " + tube1.getCtl());
				txtPart.setText("Part # " + tube1.getPartNum());
				txtGauge.setText("Gauge: " + tube1.getGauge());
				txtInches.setText("Length " + tube1.getDimHeight());
				txtInches_1.setText("Width " + tube1.getDimWidth());
				break;
			case 3:
				Square_Tube tube2 = (Square_Tube) comboBox_1.getSelectedItem();
				txtStockLength.setText("CTL " + tube2.getCtl());
				txtPart.setText("Part # " + tube2.getPartNum());
				txtGauge.setText("Gauge: " + tube2.getGauge());
				txtInches.setText("Dimension " + tube2.getDim());
				txtInches_1.setText("");
				break;
			}

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int eval = comboBox.getSelectedIndex();
		if (!txtTl.equals("TL")){
			switch (eval){
			case 1:
				Round_Tube Etube = (Round_Tube) comboBox_1.getSelectedItem();
				RoundTube tube = new RoundTube(24, Etube);
			case 2:
				Rec_Tube Etube1 = (Rec_Tube) comboBox_1.getSelectedItem();
				RecTube tube1 = new RecTube(24, Etube1);
			case 3:
				Square_Tube Etube2 = (Square_Tube) comboBox_1.getSelectedItem();
				SQTube tube2 = new SQTube(24, Etube2);
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
