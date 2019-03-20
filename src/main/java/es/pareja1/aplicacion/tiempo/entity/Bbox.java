package es.pareja1.aplicacion.tiempo.entity;

public class Bbox {
	private long north;
	private long south;
	private long east;
	private long west;

	public Bbox(long north, long south, long east, long west) {
		super();
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
	}

	public long getNorth() {
		return north;
	}

	public void setNorth(long north) {
		this.north = north;
	}

	public long getSouth() {
		return south;
	}

	public void setSouth(long south) {
		this.south = south;
	}

	public long getEast() {
		return east;
	}

	public void setEast(long east) {
		this.east = east;
	}

	public long getWest() {
		return west;
	}

	public void setWest(long west) {
		this.west = west;
	}

}
