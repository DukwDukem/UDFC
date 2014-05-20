
public class RecTube extends Tube implements CalcTube {

	public static final String[] RECTANGLE = {};
	
	private Rec_Tube stockTube;


	public RecTube(double tubeLength2, Rec_Tube tube) {
		super(tubeLength2);
		stockTube = tube;
		// TODO Auto-generated constructor stub
	}


	@Override
	public double surfaceArea(int qty) {
		double area = (stockTube.getDimHeight()*2 + stockTube.getDimWidth()*2)*this.getTubeLength()/144;
		int precision = 10000;
		area = Math.floor(area * qty * precision + .5)/precision;		
		return area; //returns SqFt.
	}


	public Rec_Tube getStockTube() {
		return stockTube;
	}


	public void setStockTube(Rec_Tube stockTube) {
		this.stockTube = stockTube;
	}
	

	
	
}
