
public enum Rec_Tube {

	RecTube570("04-30570", 14, 1, 2, 291), RecTube571("04-30571", 16, 1, 2, 295), RecTube572("04-30573", 18, 1, 2, 265), RecTube573("04-30573", 16, 1, 3, 292), RecTube646("04-30646", 16, .5, 1.5, 240);
	
	private String partNum;
	private int gauge;
	private double dimHeight;
	private double dimWidth;
	private double ctl;
	
	private Rec_Tube(String partNum, int gauge, double dimHeight,
			double dimWidth, double ctl) {
		this.setPartNum(partNum);
		this.setGauge(gauge);
		this.setDimHeight(dimHeight);
		this.setDimWidth(dimWidth);
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

	public double getDimHeight() {
		return dimHeight;
	}

	public void setDimHeight(double dimHeight) {
		this.dimHeight = dimHeight;
	}

	public double getDimWidth() {
		return dimWidth;
	}

	public void setDimWidth(double dimWidth) {
		this.dimWidth = dimWidth;
	}

	public double getCtl() {
		return ctl;
	}

	public void setCtl(double ctl) {
		this.ctl = ctl;
	}
	
	
	
}
