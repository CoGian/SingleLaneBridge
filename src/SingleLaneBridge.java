

// java SingleLaneBridge [max Cars] [Bridge] [arrival frequency milliseconds] [transit time in milliseconds] [#same cars in Bridge]
public class SingleLaneBridge {
	
	public static int maxcars ; 
	public static int arrivalFreq  ; 
	public static int transitTime ; 
	public static int sameCarsInBridge ; 
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		try {
			maxcars =  Integer.parseInt(args[0])  ; 
			arrivalFreq = Integer.parseInt(args[2]) ; 
			transitTime = Integer.parseInt(args[3]); 
			sameCarsInBridge = Integer.parseInt(args[4]) ; 
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Enter valid command arguments !");
			System.out.println("java SingleLaneBridge [max cars] [Bridge] [arrival frequency milliseconds] [transit time in milliseconds] [#same cars in Bridge]");
			System.exit(0);
		}
		String method = args[1] ; 
		Bridge b = null  ; 
		
		if (method.equals("Bridge")) 
			b = new Bridge() ; 
		else if (method.equals("SafeBridge"))
			b = new SafeBridge();
		else if (method.equals("FairBridge")) 			
			b = new FairBridge();
		else  
			b = new AdjustedFairBridge();
		
		
		
		System.out.print(sameCarsInBridge) ; 
		b.display();
		
		Thread red []   = new Thread[maxcars]; 
		Thread blue []  = new Thread[maxcars];
		
		for (int i = 0; i<maxcars; i++) {
            red[i] = new Thread(new RedCar(b,i));
            blue[i] = new Thread(new BlueCar(b,i));
            
            red[i].start();
            blue[i].start();
         
            //Main thread sleeps for arrival frequency 
           try {
			Thread.sleep(arrivalFreq);
           } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
           }
           
                       
		}
            
		
	}

}
