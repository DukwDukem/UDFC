enum Sheet_Metal {
	
	SM714(11, WIDTH, HEIGTH), SM252(12, WIDTH, HEIGTH), SM251(14, WIDTH, HEIGTH), SM466(16, WIDTH, HEIGTH), SM547(18, WIDTH, HEIGTH), SM468(20, WIDTH, HEIGTH), SM258(22, WIDTH, HEIGTH);

	private int gauge;
	float static WIDTH = 48;
	float static HEIGTH = 120;
	
	public Sheet_Metal(int gauge){
		this.gauge = gauge;
	}
	
}