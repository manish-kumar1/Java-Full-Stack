class BookTheaterSeats{
	
	static int total_seats = 30;
	synchronized static void bookSeat(int seats){  // synchronized static block
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
			System.out.println(seats+ " Sorry! seats not booked");
			System.out.println("Available "+total_seats);
		}
	}
}
class MyThread1 extends Thread{
	BookTheaterSeats b;
	int seats;
	MyThread1(BookTheaterSeats b, int seats){
		this.b = b;
		this.seats = seats;
	}
	@Override
	public void run(){
		b.bookSeat(seats);
	}
}
class MyThread2 extends Thread{
	BookTheaterSeats b;
	int seats;
	MyThread2(BookTheaterSeats b, int seats){
		this.b = b;
		this.seats = seats;
	}
	@Override
	public void run(){
		b.bookSeat(seats);
	}
}
class MovieBookApp{
	public static void main(String args[]){
		
		BookTheaterSeats b1 = new BookTheaterSeats();
		
		MyThread1 t1 = new MyThread1(b1, 8);
		t1.start();
		
		MyThread2 t2 = new MyThread2(b1, 5);
		t2.start();
		
		// ------- object 2 ---------
		
		BookTheaterSeats b2 = new BookTheaterSeats();
		
		MyThread1 t3 = new MyThread1(b2, 6);
		t3.start();
		
		MyThread2 t4 = new MyThread2(b2, 3);
		t4.start();
		
	    // ------ object 3
		
		BookTheaterSeats b3 = new BookTheaterSeats();
		
		MyThread1 t5 = new MyThread1(b3, 2);
		t5.start();
		
		MyThread2 t6 = new MyThread2(b3, 7);
		t6.start();
	}
}