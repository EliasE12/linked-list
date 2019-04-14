package model;

public class ComputerRoom {

	private Computer first;
	private int numberComputers;

	public ComputerRoom() {
		first = null;
		numberComputers = 0;
	}

	public void printList() {
		Computer current = first;
		while (current.getNext() != null) {
			System.out.println(current.getHd() + " " + current.getRam() + " " + current.getIp());
			current = current.getNext();
		}
		System.out.println();
	}

	public void invertList1(){
		Computer prev = null;
		Computer current = first;
		Computer next;
		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		first = prev;
	}

	public void invertList2() {
		Computer prev = null;
		Computer current = first;
		Computer next;
		while (current != null){
			prev = current.getPrev();
			current.setPrev(current.getNext());
			current.setNext(prev);
			current = current.getPrev();
		}
		if (prev != null) {
			first = prev.getPrev();
		}
	}

	public void addComputer(int hd, int ram, String ip){
		Computer newComputer = new Computer(hd,ram,ip);
		if (first == null) {
			first = newComputer;
		}else {
			Computer aux = first;
			while (aux.getNext()!= null){
				aux = aux.getNext();
			}
			aux.setNext(newComputer);
			newComputer.setPrev(aux);
		}
		numberComputers++;
	}

	public void addInOrden(){}

	public Computer getFirst() {
		return first;
	}
	public void setFirst(Computer first) {
		this.first = first;
	}

	public int getNumberComputers() {
		return numberComputers;
	}
	public void setNumberComputers(int numberComputers) {
		this.numberComputers = numberComputers;
	}
}
