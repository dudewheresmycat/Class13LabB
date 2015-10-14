package cis232.classlab;

public class Barn implements Structure{
	int stalls;
	double sqFt;
	
	public Barn(int stalls, int sqFt){
		this.stalls=stalls;
		this.sqFt=sqFt;
	}
	public String toString(){
		return String.format("%d stalled Barn", stalls);
	}
	@Override
	public double getSquareFeet() {
		
		return sqFt;
	}
	

}
