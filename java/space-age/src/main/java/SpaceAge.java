public class SpaceAge {
	private long ageSec;
	public SpaceAge(long age){
		ageSec = age;
	}
	public long getSeconds(){
		return ageSec;
	}
	public double onEarth(){
		return (double)ageSec/31557600;
	}
	public double onMercury(){
		return this.onEarth()/0.2408467;
	}
	public double onVenus(){
		return this.onEarth()/0.61519726;
	}
	public double onMars(){
		return this.onEarth()/1.8808158;
	}
	public double onJupiter(){
		return this.onEarth()/11.862615;
	}
	public double onSaturn(){
		return this.onEarth()/29.447498 ;
	}
	public double onUranus(){
		return this.onEarth()/84.016846;
	}
	public double onNeptune(){
		return this.onEarth()/164.79132;
	}
}