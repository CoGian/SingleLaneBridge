
import java.time.Instant;

class Bridge {
	
	
	private int nred  = 0; //red cars passing the bridge 
    private int nblue = 0; // blue cars passing the bridge
   
   
    // a red car enters in bridge .Critical Section (print info)
    synchronized void redEnter(RedCar car) throws InterruptedException {
    	
    	System.out.println("Red Car " + car.id + " Passing at " + Instant.now());
		System.out.flush();
		if (nred>=SingleLaneBridge.sameCarsInBridge || nblue>0) {
			System.out.println("Crash");
		}
		
    	++nred ; 
    }

    // a red car  exits in bridge .Critical Section (print info)
    synchronized void redExit(RedCar car){
    	 for(int i=0;i<85;i++)
       		System.out.print(" ");
    	System.out.println("Red Car " + car.id + " Passed at " + Instant.now());
		System.out.flush();
		--nred ; 
    }

    // a blue car enters in bridge .Critical Section (print info)
    synchronized void blueEnter(BlueCar car) throws InterruptedException {
    	 for(int i=0;i<85;i++)
      		System.out.print(" ");
     	 System.out.println("Blue Car " + car.id + " Passing at " + Instant.now());
     	 System.out.flush();
     	 
     	 
     	 if (nblue>= SingleLaneBridge.sameCarsInBridge || nred>0 ) {
  			System.out.println("Crash");
  		}
     	 
     	 ++nblue ; 
    }
    
    // a blue car  exits in bridge .Critical Section (print info)
    synchronized void blueExit(BlueCar car){
    	
    	System.out.println("Blue Car " + car.id + " Passed at " +Instant.now());
     	System.out.flush();
     	--nblue ; 
    }
    
    
    //Transit time for a car 
      public  void transit()   {
    	
    	try {
			Thread.sleep(SingleLaneBridge.transitTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
    	
    }
    
    
    public void display() {
    	System.out.print("Left Side");
    	for(int i=0;i<50;i++)
    		System.out.print(" ");
    	
    	System.out.print("Bridge");
    	
    	for(int i=0;i<20;i++)
    		System.out.print(" ");
    	
    	System.out.println("Right Side");
    }
    
    synchronized void printArrrivalTimeRed(RedCar car) {
    	    			
  	  	System.out.println("Red Car " + car.id+ " Arrived at " + Instant.now());   
        System.out.flush();
  }
    
    
    synchronized void  printArrrivalTimeBlue(BlueCar car) {
   	 for(int i=0;i<85;i++)
     		System.out.print(" ");
   	System.out.println("Blue Car " + car.id +  " Arrived at " + Instant.now());
     	System.out.flush();
   }
}
