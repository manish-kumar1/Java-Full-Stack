class BookTheaterSeats{
	
	int total_seats = 30;
	synchronized void bookSeat(int seats){  // synchronized block
		if(total_seats >= seats){
			if(seats > 1){
				System.out.println(seats+" seats booked successfully");
				total_seats = total_seats - seats;
				System.out.println("Available "+total_seats);
			}
			else{
				System.out.println(seats+" seat booked successfully");
				total_seats = total_seats - seats;
				System.out.println("Available "+total_seats);
			}
		}
		else{
			System.out.println("Sorry! seats not booked");
			System.out.println("Available "+total_seats);
		}
	}
}
class MovieBookApp extends Thread{
	
	static BookTheaterSeats obj;
	
	int seats;
	@Override
	public void run(){
		obj.bookSeat(seats);
	}
	public static void main(String args[]){
		
		obj = new BookTheaterSeats();
		
		MovieBookApp person = new MovieBookApp();
		person.seats = 5;
		person.start();
		
		
		MovieBookApp person1 = new MovieBookApp();
		person1.seats = 2;
		person1.start();
		
		MovieBookApp person2 = new MovieBookApp();
		person2.seats = 10;
		person2.start();
		
		MovieBookApp person3 = new MovieBookApp();
		person3.seats = 1;
		person3.start();
		
		MovieBookApp person4 = new MovieBookApp();
		person4.seats = 13;
		person4.start();
	}
	
}
