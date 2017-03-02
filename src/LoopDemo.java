
public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // declaring i for iterations
		// initializing flag to 0,n to 1,max to 10
		int i,flag=0,n=1,max=10;
// loop of max-1 times i.,e 9 times
		for(n=1;n<=max-1;n++)  
    { 	
			//passing n value to flag
    flag=n;
    // loop prints flag times of variables
    for(i=1;i<=flag;i++){
    	//prints i value	  
    	System.out.print(i);      
        // when flag value is more than 5 i.,e 6 or more
    	if(flag>5){
    		// flag value subtracted by max value 10 
        	flag=max-flag;
        }
	  }
    // to jump cursor to next line after each loop  
          System.out.println(" ");
    }
}
	}

	
    

   
 
    
    
    
	
	


