import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Lecandy{
	public static void main(String[] ar){
		Scanner scan = new Scanner(System.in);
		try {	
			int tc=scan.nextInt();
			Queue<Testcase> testCaseList = new LinkedList<>();
			int elephant;
			int candy;
			for(int i=0; i < tc; i++){
				elephant=scan.nextInt();
				candy=scan.nextInt();
				Testcase newTestcase = new Testcase(elephant,candy);
	
				for(int j=0; j < elephant; j++){
					newTestcase.setArrayList(scan.nextInt());
				}
				testCaseList.add(newTestcase);
			}
	
			for(Testcase t : testCaseList){
				elephant=t.nElephant;
				candy=t.nCandy;
				for(int i=0; i < elephant; i++){
					candy -= t.minCandy.get(i);
				}
				if(candy >= 0){
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
		finally {
			scan.close();
		}

	}
}
class Testcase{
	int nElephant;
	int nCandy;
	ArrayList<Integer> minCandy;
	public Testcase(){
		nElephant=0;
		nCandy=0;
		minCandy = new ArrayList<>();
	}
	public Testcase(int n, int c){
		nElephant=n;
		nCandy=c;
		minCandy = new ArrayList<>(n);
	}
	public void setArrayList(int val){
		minCandy.add(val);
	}
	public ArrayList<Integer> getArrayList(){
		return minCandy;
	}

}