package projectOne321;
import java.io.File;
import java.util.*;

public class driver {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    
	//Build 6 gates
    	Gate[] gate = new Gate[6];
    	int count = 0;
    	for(int n = 1; n <= 2; n++) {
    		for(int m = 1; m <= 3; m++) {
    			gate[count] = new Gate();
    			gate[count].setN(n);
    			gate[count].setM(m);
    			count++;
    			//	Gate gate = new Gate(n, m);
    			//gate.setN(n);
    		}
    	}
    	
    	
    	
    	System.out.print("Reading file...\n");
    	System.out.println("A | B | C-in | Sum | C-out");
    	System.out.println("__________________________");
    
    //Gets file within project   	
        File file = new File("E:\\projectOne321\\projectOne321\\src\\wiringlist.txt");
        if(file.isFile()) {
        //	System.out.print("yes");
        }
        Scanner fileRead = new Scanner(file);

        //Initializes gates with wiring structure
        String input = null;
        String output = null;
        String xORy = null;
        String value = null;
    	
        //Each line is read word at a time, each word is placed in corresponding position in it's gate
        while (fileRead.hasNextLine()){
        //	Scanner fileReader = new Scanner(fileRead.nextLine());
            input = "empty";
            output = "empty";
            xORy = "empty";
        		if(fileRead.hasNext())
        			input = fileRead.next();
        		if(fileRead.hasNext())
        			output = fileRead.next();
        		if(fileRead.hasNext())
        			xORy = fileRead.next();
        			fileRead.nextLine();
        		if (!output.equals("empty")) {
        			switch(output) {
    	            case "1":
    	            	for (int i = 0; i < gate.length; i++) {
    	            		  
    	                    // accessing each element of array
    	                    if (gate[i].getM() == 1 && gate[i].getN() ==1) {
    	                    	if(xORy.equals("x")) {
    	                    		gate[i].setJx(input.charAt(0));
    	                    	}
    	                    	if(xORy.equals("y")) {
    	                    		gate[i].setJy(input.charAt(0));
    	                    	}
    	                    }
    	              
    	            	
    	            		}
    	            	break;
            	
    	            case "2":
    	            	for (int i = 0; i < gate.length; i++) {
    	            		  
    	                    // accessing each element of array
    	                    if (gate[i].getM() == 2 && gate[i].getN() ==1) {
    	                    	if(xORy.equals("x")) {
    	                    		gate[i].setJx(input.charAt(0));
    	                    	}
    	                    	if(xORy.equals("y")) {
    	                    		gate[i].setJy(input.charAt(0));
    	                    	}
    	                    }
    	              
    	            	
    	            }
    	            	break;
    	            case "3":
    	            	for (int i = 0; i < gate.length; i++) {
    	            		  
    	                    // accessing each element of array
    	                    if (gate[i].getM() == 3 && gate[i].getN() ==1) {
    	                    	if(xORy.equals("x")) {
    	                    		gate[i].setJx(input.charAt(0));
    	                    	}
    	                    	if(xORy.equals("y")) {
    	                    		gate[i].setJy(input.charAt(0));
    	                    	}
    	                    }
    	                  
    	            	
    	            }
    	            	break;
    	            case "4":
    	            	for (int i = 0; i < gate.length; i++) {
    	            		  
    	                    // accessing each element of array
    	                    if (gate[i].getM() == 1 && gate[i].getN() ==2) {
    	                    	if(xORy.equals("x")) {
    	                    		gate[i].setJx(input.charAt(0));
    	                    	}
    	                    	if(xORy.equals("y")) {
    	                    		gate[i].setJy(input.charAt(0));
    	                    	}
    	                    }
    	               
    	            	
    	            }
    	            	break;
    	            case "5":
    	            	for (int i = 0; i < gate.length; i++) {
    	            		  
    	                    // accessing each element of array
    	                    if (gate[i].getM() == 2 && gate[i].getN() ==2) {
    	                    	if(xORy.equals("x")) {
    	                    		gate[i].setJx(input.charAt(0));
    	                    	}
    	                    	if(xORy.equals("y")) {
    	                    		gate[i].setJy(input.charAt(0));
    	                    	}
    	                    }
    	            
    	            	
    	            }
    	            	break;
    	            case "6":
    	            	for (int i = 0; i < gate.length; i++) {
    	            		  
    	                    // accessing each element of array
    	                    if (gate[i].getM() == 3 && gate[i].getN() ==2) {
    	                    	if(xORy.equals("x")) {
    	                    		gate[i].setJx(input.charAt(0));
    	                    	}
    	                    	if(xORy.equals("y")) {
    	                    		gate[i].setJy(input.charAt(0));
    	                    	}
    	                    }
    	              
    	            	
    	            }
    	            	break;
    	            case "z":
    	            	for (int i = 0; i < gate.length; i++) {
    	            		  
    	                    // accessing each element of array
    	                    if (gate[i].getM() == 1 && gate[i].getN() ==1) {
    	                    	if(xORy.equals("x")) {
    	                    		gate[i].setJx(input.charAt(0));
    	                    	}
    	                    	if(xORy.equals("y")) {
    	                    		gate[i].setJy(input.charAt(0));
    	                    	}
    	                    }

    	            	
    	            }
    	            	break;
    	          


    			}
    	           
    	        
        
        }
        
    }
        
        
       
        

        //This method sets up circuit with corresponding a, b, and c values. Also executes the circuit for the values given and finally, 
        	// prints all info out in a table creates while doing all athe above.
    gateInitate(gate,0,0,0);
    gateInitate(gate,0,0,1);   
    gateInitate(gate,0,1,0);   
    gateInitate(gate,0,1,1);   
    gateInitate(gate,1,0,0);   
    gateInitate(gate,1,0,1);   
    gateInitate(gate,1,1,0);   
    gateInitate(gate,1,1,1);   
    }

	private static void gateInitate(Gate[] gate, int aValue, int bValue, int cValue) {
	  // This method inits all a's, b's, and c's inputs to there int values 
            
        	for (int i = 0; i < gate.length; i++) {
        		  if(gate[i].getJx() == 'a') {
        			  gate[i].setX(aValue);
        		  }
        		  if(gate[i].getJy() == 'a') {
        			  gate[i].setY(aValue);
        		  }
        		  if(gate[i].getJx() == 'b') {
        			  gate[i].setX(bValue);
        		  }
        		  if(gate[i].getJy() == 'b') {
        			  gate[i].setY(bValue);
        		  }
        		  if(gate[i].getJx() == 'c') {
        			  gate[i].setX(cValue);
        		  }
        		  if(gate[i].getJy() == 'c') {
        			  gate[i].setY(cValue);
        		  }
        		  
        	}
        
        		for (int i = 0; i <= 2; i++) {
        	if(!(gate[i].getX() == 1 && gate[i].getY()==1)) {
        		gate[i].setK(1);
        		
        	}
        	else
        		gate[i].setK(0);
        		
        	

        		}
        		//code to satisfy gate 4, 5, 6 outputs
        			//gate 4
        			if(!(gate[3-3].getK() == 1 && gate[3-2].getK() == 1)) {
        				gate[3].setK(1);
        			}
        			else
                		gate[3].setK(0);
        			//gate 5
        			if(!(gate[3].getK() == 1)){
        				gate[4].setK(1);
        			}
        			else
                		gate[4].setK(0);
        			//gate 6
        			if(!(gate[4].getK() == 1 && gate[2].getK() == 1)) {
        				gate[5].setK(1);
        			}
        			else
                		gate[5].setK(0);
        		
        		//Code to print out table of values (Results)
        			
        			System.out.println(aValue + " | " + bValue + " |   "+ cValue + "  |   0 |   " +  gate[5].getK());
        			System.out.println("__________________________");
	}


}    

	
       