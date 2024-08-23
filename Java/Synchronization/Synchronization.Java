
class BookTheaterSeat{
	
	static int total_seat = 10;
	static void bookSeat(int seats){
		if(total_seat >= seats){
			System.out.println(seats +" seats booked successfully");
			total_seat = total_seat - seats;
			System.out.println("Seats left: " +total_seat);
		}
		else{
			System.out.println("Sorry! Seats not available");
			System.out.println(total_seat +" seats left");
		}
	}
}
class MovieBookApp extends Thread{
	
	int seats;
	@Override
	public void run(){
		BookTheaterSeat.bookSeat(seats);
	}
}
class UseMovieBookApp{
	public static void main(String[] args){
		
		MovieBookApp person = new MovieBookApp();
		person.seats = 6;
		person.start();
	
		MovieBookApp person2 = new MovieBookApp();
		person2.seats = 5;
		person2.start();
	}
}	
		