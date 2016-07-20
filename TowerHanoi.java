package mms;
import java.util.Scanner;
public class TowerHanoi {

	 public void solve(int f, String begin, String runs, String complete) 
	 {
	       if (f== 1) 
	       {
	           System.out.println(begin + "<==>" + complete);
	       } 
	       else 
	       {
	           solve(f-1, begin,complete,runs);
	           System.out.println(begin+ " <==>" +complete);
	           solve(f-1,runs,begin,complete);
	       }
	   }
	 public static void main(String[] args) {
	       TowerHanoi towers= new TowerHanoi();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towers.solve(discs, "strt", "concl", "end");
	   }
	}
