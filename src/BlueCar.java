

class BlueCar implements Runnable {


    Bridge control;
    int id;
   
    
    BlueCar(Bridge b,  int id) {
      
        this.id = id;
        control = b;
        for(int i=0;i<55;i++)
     		System.out.print(" ");
     	 System.out.println("Blue Car " + id +  " Arrived at " + System.currentTimeMillis());
     	System.out.flush();
    }

    public void run() {
    	
         
         try {
        	 
        	
        	 
        	 control.blueEnter();
        	 
        	        	 
        	 control.transit();     
        	 
        	 
        	 control.blueExit();
        	 
              	 
        	 
  				
         } catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		
  		
         }
    }

}
