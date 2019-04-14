package userInterface;


import model.ComputerRoom;

public class LinkedListMain {

    public static void main(String[] args){

        ComputerRoom computerRoom = new ComputerRoom();

        computerRoom.addComputer(250,2,"43.356.7675");
        computerRoom.addComputer(500,8,"12.768.3646");
        computerRoom.addComputer(1000,6,"57.132.5456");
        computerRoom.addComputer(1500,16,"12.577.4674");
        computerRoom.addComputer(2000,4,"32.467.5456");
        computerRoom.addComputer(2500,32,"68.231.6895");

        System.out.println("Number of computers");
        System.out.println( "       # " + computerRoom.getNumberComputers());

        System.out.println("\n-- List in orden --\n");
        computerRoom.printList();
        computerRoom.invertList1();

        System.out.println("-- Inverted list --\n");
        computerRoom.printList();



    }
}
