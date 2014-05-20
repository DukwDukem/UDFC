
public enum Round_Tube {

	RDTube546("04-30546", 16, .75, 275), RDTube547("04-30547", 18, .75, 220), RDTube548("04-30548", 18, .875, 294), RDTube549("04-30549", 16, 1, 289), RDTube550("04-30550", 18, 1, 294), RDTube576("04-30576", 18, 1.125, 294), RDTube551("04-30551", 18, 1.25, 294), RDTube552("04-30552", 16, 1.5, 281), RDTube693("04-30693", 16, 1.25, 240), RDTube613("04-30613", 16, 2, 240);
	
	private String partNum;
	private int gauge;
	private double dim;
	private double ctl;
	
	private Round_Tube(String partNum, int gauge, double dim, double ctl) {
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
	
	public double getMultiplier() {
		double thickness = 0;
		switch (this.gauge){
			case 14: 
			    thickness = .085;
			    break;
			case 16:
				thickness = .065;
				break;
			case 18:
				thickness = .049;
				break;
			default:
				break;
		}
		double multiplier = Math.PI*this.getDim()*thickness;
		return multiplier;
	}
	
}
