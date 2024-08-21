
class Medical extends Thread{
	
	@Override
	public void run(){
		try{
			Thread.sleep(500);
			System.out.println("Medical starts");
			Thread.sleep(5000);
			System.out.println("Medical Completed");
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
class TestDrive extends Thread{
	@Override
	public void run(){
		try{
			Thread.sleep(1000);
			System.out.println("Test Drive start");
			Thread.sleep(5000);
			System.out.println("Test drive completed");
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
class OfficerSign extends Thread{
	@Override
	public void run(){
		try{
			Thread.sleep(1000);
			System.out.println("Officer take documents");
			Thread.sleep(1000);
			System.out.println("Singnature done");
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
class LicenceDemo{
	public static void main(String args[]){
		
		Medical medical = new Medical();
		medical.start();
		
		try{
			medical.join();
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
		TestDrive testdrive = new TestDrive();
		testdrive.start();
		
		try{
			testdrive.join();
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
		OfficerSign officersign = new OfficerSign();
		officersign.start();
	}
}