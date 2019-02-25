import java.awt.*;

class Bridge {
	
	public boolean bridgeOccupied = false ; 
	private int nred  = 0;
    private int nblue = 0;
    
    synchronized void redEnter() throws InterruptedException {
    	
    	System.out.println("Red Car " + nred + " Passing at " + System.currentTimeMillis());
		System.out.flush();
		if (bridgeOccupied) {
			System.out.println("Crash");
		}
    	bridgeOccupied = true ; 
    	++nred ; 
    }

    synchronized void redExit(){
    	 for(int i=0;i<55;i++)
       		System.out.print(" ");
    	System.out.println("Red Car " + nred + " Passed at " + System.currentTimeMillis());
		System.out.flush();
		bridgeOccupied = false ; 
    }

    synchronized void blueEnter() throws InterruptedException {
    	 for(int i=0;i<55;i++)
      		System.out.print(" ");
     	 System.out.println("Blue Car " + nblue + " Passing at " + System.currentTimeMillis());
     	 System.out.flush();
     	 
     	 
     	 if (bridgeOccupied) {
  			System.out.println("Crash");
  		}
     	bridgeOccupied = true ; 
     	 ++nblue ; 
    }

    synchronized void blueExit(){
    	
    	System.out.println("Blue Car " + nblue + " Passed at " + System.currentTimeMillis());
     	System.out.flush();
     	bridgeOccupied = false ; 
    }
    
    synchronized void transit()   {
    	
    	try {
			Thread.sleep(SingleLaneBridge.transitTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
    	
    }
    
    
    public void display() {
    	System.out.print("Left Side");
    	for(int i=0;i<20;i++)
    		System.out.print(" ");
    	
    	System.out.print("Bridge");
    	
    	for(int i=0;i<20;i++)
    		System.out.print(" ");
    	
    	System.out.println("Right Side");
    }
}
