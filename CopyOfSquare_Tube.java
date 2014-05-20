
public enum CopyOfSquare_Tube {
    
	SQTube574("04-30574", 16, .5, 288), SQTube563("04-30563", 18, .75, 292), SQTube562("04-30562", 16, .75, 295), SQTube564("04-30564", 18, .875, 294), SQTube554("04-30554", 16, 1, 295), SQTube555("04-30555", 18, 1, 298), SQTube565("04-30565", 14, 1.25, 289), SQTube556("04-30556", 16, 1.25, 289), SQTube557("04-30557", 18, 1.25, 294), SQTube566("04-30566", 16, 1.25, 238), SQTube567("04-30567", 14, 2, 295), SQTube568("04-30568", 12, 2, 280), SQTube553("04-30553", 15, 1, 243), SQTube652("04-30652", 16, 2, 240); 
	
	private String partNum;
	private int gauge;
	private double dim;
	private double ctl;
	
	private CopyOfSquare_Tube(String partNum, int gauge, double dim, double ctl) {
		this.setPartNum(partNum);
		this.setGauge(gauge);
		this.setDim(dim);
		this.setCtl(ctl);
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public int getGauge() {
		return gauge;
	}

	public void setGauge(int gauge) {
		this.gauge = gauge;
	}

	public double getDim() {
		return dim;
	}

	public void setDim(double dim) {
		this.dim = dim;
	}

	public double getCtl() {
		return ctl;
	}

	public void setCtl(double ctl) {
		this.ctl = ctl;
	}
	
	
}
