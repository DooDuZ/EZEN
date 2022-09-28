package Homework;
	
public class test {
    public static void main(String[] args){
    	test tes = new test();
    	tes.clearConsole();
    }
    
    
    void clearConsole() {
    	ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
       // Process startProcess = pb.inheritIO();
       // startProcess.waitFor();
    }    
}