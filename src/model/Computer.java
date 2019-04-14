package model;

public class Computer {

	private int hd;
	private int ram;
	private String ip;
	
	private Computer prev;
	private Computer next;
	
	
	public Computer(int hd, int ram, String ip) {
		this.hd = hd;
		this.ram = ram;
		this.ip = ip;
	}


	public int getHd() {
		return hd;
	}

	public void setHd(int hd) {
		this.hd = hd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}



	public Computer getPrev() {
		return prev;
	}

	public void setPrev(Computer prev) {
		this.prev = prev;
	}

	public Computer getNext() {
		return next;
	}

	public void setNext(Computer next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Computer{" +
					   "hd=" + hd +
					   ", ram=" + ram +
					   ", ip='" + ip + '\'' +
					   ", prev=" + prev +
					   ", next=" + next +
					   '}';
	}
}
