



class RedCar implements Runnable {

    
    Bridge control;
    int id;
     
    
    RedCar(Bridge b,  int id) {
        
        this.id = id;
        control = b;
        System.out.println("Red Car " + id + " Arrived at " + System.currentTimeMillis());   
        System.out.flush();
    }

    public void run() {
      
       
       try {
    	   	
		control.redEnter();
		
		control.transit();
		
		control.redExit();
		
		
				
       } catch (InterruptedException e) {
		// TODO Auto-generated catch block
    	 
		
		}
    }

    

}