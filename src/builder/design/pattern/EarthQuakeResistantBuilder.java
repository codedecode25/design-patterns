package builder.design.pattern;

class EarthQuakeResistantBuilder implements Builder {
	
	private Home earthquakeResistantHome = new Home();
	

	@Override
	public void buildFloor() {
		this.earthquakeResistantHome.floor = "Wooden floor";
		
	}

	@Override
	public void buildWalls() {
		this.earthquakeResistantHome.walls = "Wooden walls";
		
	}

	@Override
	public void bulidTerrace() {
		this.earthquakeResistantHome.terrace = "Wooden terrace";
		
	}

	@Override
	public Home getComplexHomeObject() {
		return this.earthquakeResistantHome;
	}
	
	
}
