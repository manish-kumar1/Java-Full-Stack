
class BookTheaterSeats{
	
	static int total_seats = 30;
	synchronized static void bookSeat(int seats){
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
	
	int seats;
	@Override
	public void run(){
		BookTheaterSeats.bookSeat(seats);
	}
}

class UseMovieBookApp{
	public static void main(String args[]){
		
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
	}
}