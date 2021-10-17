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
    
    //Gets file within project
    	File files = new File(".");
    	for(String fileNames : files.list()) System.out.println(fileNames);
        File file = new File("E:\\projectOne321\\projectOne321\\src\\wiringlist.txt");
        if(file.isFile()) {
        	System.out.print("yes");
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
    		
        		if (!output.equals("empty")) {
    	            System.out.println(output + "8");
    	            switch(output) {
    	            case "1":
    	            	
    	            }

    			}
    			
    			if (!xORy.equals("empty")){
    				System.out.println(xORy + "9");
    			}	
    			
        		if (!input.equals("empty")) {
        	            System.out.println(input + "7");
        		}
        			
        		
        			
        
        
        //    System.out.print(codea0b0(j,k,m,n);
        			
        
        
        
        }
        System.out.print("codea0b0(,k,m,n");
    }

	private static void buildGate() {
		// TODO Auto-generated method stub
		
	}}
       