
public class SQTube extends Tube implements CalcTube {
	
	public static final String[] SQUARE = {"04-30574","04-30563","04-30563","04-30564","04-30554","04-30555","04-30565","04-30556","04-30557","04-30567","04-30568","04-30553","04-30652"};
	
	private Square_Tube stockTube;
	

	public SQTube(double tubeLength2, Square_Tube tube) {
		super(tubeLength2);
		stockTube = tube;
		// TODO Auto-generated constructor stub
	}

	public double surfaceArea(int qty) {
		double area = this.stockTube.getDim()*4*this.getTubeLength()/144;
		int precision = 10000;
		area = Math.floor(area * qty * precision + .5)/precision;	
		return area; // returns SqFt.
	}

	public String getHavensRate(int qty){
		String rate = null;
		double time = 0;
		if (this.getStockTube().getGauge() < 16){
			rate = "Gauge too heavy!";
			return rate;	
		}
		if (this.getStockTube().getDim() > 1.25){
			rate = "Radius too large!";
			return rate;
		}
		if (this.getTubeLength() < 6){
			rate =  "Too Short for Havens";
			return rate;
		} else if(this.getTubeLength() > 100 ){
			rate = "Too Long for Havens";
			return rate;
		}
		if (6 <= this.getTubeLength() && this.getTubeLength() <= 15){
			time = 350;
		} else if ( 15 < this.getTubeLength() && this.getTubeLength() <= 19 ){
			time = 320;
		} else if ( 19 < this.getTubeLength() && this.getTubeLength() <= 30 ){
			time = 300;
		} else if ( 30 < this.getTubeLength() && this.getTubeLength() <= 40 ){
			time = 255;
		} else if ( 40 < this.getTubeLength() && this.getTubeLength() <= 50 ){
			time = 200;
		} else if ( 50 < this.getTubeLength() && this.getTubeLength() <= 60 ){
			time = 185;
		} else if ( 60 < this.getTubeLength() && this.getTubeLength() <= 70 ){
			time = 180;
		} else if ( 70 < this.getTubeLength()){
			time = 170;
		}

		int precision = 1000;
		time = Math.floor((time/qty) * precision + .5)/precision;
		rate = (time + "/HR");		
		return rate;
	}
	
	public double havensTubeYield(double ctl, int qty){
		double yield = ((ctl-4)/(this.getTubeLength()+.125));
		if ( this.getHavensDrop(ctl) < 4){
			yield++;
		}
		double ftNeeded = (ctl/(Math.floor(yield)))/12;
		int precision = 10000; //keep 4 digits
		ftNeeded = Math.floor(ftNeeded * precision +.5)/precision;
		return ftNeeded*qty;		 
	}
		
	public double getHavensDrop(double ctl){
		double drop;
		double yield = ((ctl-4)/(this.getTubeLength()+.125));	
		drop = ctl-((this.getTubeLength()+.125)*Math.floor(yield));
		int precision = 10000;
		drop = Math.floor(drop * precision +.5)/precision;
		if (drop > this.getTubeLength()){
			return drop-this.getTubeLength();
		}
		return drop;
		
	}
	
	public Square_Tube getStockTube() {
		return stockTube;
	}

	public void setStockTube(Square_Tube stockTube) {
		this.stockTube = stockTube;
	}
}
