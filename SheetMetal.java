class SheetMetal {
	
	private enum Sheet_Metal sm;
	private float length;
	private float width;
	private float area;
	
	public SheetMetal(Sheet_Metal sm){
		this.sm = sm;
	}
	
	public static float rate(float area) {
		if (area < 72) {
			return 480;
		}
		else if (72 <= area < 144 ) {
			return 420;
		}
		else if (144 <= area < 288) {
			return 380;
		}
		else if (288 <= area < 566){
			return 320;
		}
		else if (566 <= area < 1132){
			return 240;
		}
		else if (1132 <= area < 1920 ){
			return 180;
		}
		else {
			return 30;
		}
	}
}
