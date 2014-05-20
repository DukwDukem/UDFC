
public abstract class Tube {
	
	private double tubeLength;


	public Tube(double tubeLength2) {
		super();
		this.tubeLength = tubeLength2;
	}


	public double getTubeLength() {
		return tubeLength;
	}

	public void setTubeLength(double tubeLength) {
		this.tubeLength = tubeLength;
	}

	
	public double sawTubeYield(double ctl, int qty){
		double yield = (ctl/(this.getTubeLength()+.125));
		double ftNeeded = (ctl/(Math.floor(yield)))/12;
		int precision = 10000; //keep 4 digits
		ftNeeded = Math.floor(ftNeeded* qty * precision +.5)/precision;
		return ftNeeded;		 
	}
	
	public double sawRate(int qty){
		double rate = 0;
		rate = 150 - 10*(Math.floor(this.getTubeLength()/15));
		int precision = 1000;
		rate = Math.floor((rate/qty) * precision +.5)/precision;
		return rate;
	}

	public double getDrop(double ctl){
		double drop;
		double yield = (ctl/(this.getTubeLength()+.125));	
		drop = ctl-((this.getTubeLength()+.125)*Math.floor(yield));
		int precision = 10000;
		drop = Math.floor(drop * precision +.5)/precision;
		return drop;
		
	}
	
	
}
