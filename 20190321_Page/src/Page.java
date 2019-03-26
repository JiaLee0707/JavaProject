import java.util.*;
public class Page {

	public static void main(String[] args) {
		//String
		//String inputString = scanner.nextLine(); //한줄 다 읽는
		//int
		//int inputInt = scanner.nextInt(); //한줄 다 읽는
		
		/*Scanner sc=new Scanner(System.in);
		
		while(true) { 
			//int post=331;
			System.out.print("게시물 개수를 입력하시오(정수) : ");
			int post=sc.nextInt();
			if(post==exit(0)) {
				System.out.println("끝");
				break;
			}
			int page=post/7;
			if(!(post%7==0)) {
				page++;
			}
			System.out.println((int)post+"개의 게시물은 "+(int)page+"의 페이지링크가 표시된다.");
		}*/
		
		/*Scanner sc=new Scanner(System.in);
		
		while(true) { 
			//int post=331;
			System.out.print("게시물 개수를 입력하시오(정수) : ");
			int post=sc.nextInt();
			
			int page=post/7;
			if(!(post%7==0)) {
				page++;
			}
			System.out.println((int)post+"개의 게시물은 "+(int)page+"의 페이지링크가 표시된다.");
		}*/

		//if(result == 0)
		//System.out.println("끝");
		//break;
		
		while(true) {
			//input
			Scanner scanner=new Scanner(System.in);
			int nPerPage = 7;
			System.out.println("몇 개의 게시물을 표시할까요?(정수로 쓰세요) : ");
			String inputString = scanner.nextLine();
			//if exit? -> exit
			if(inputString.equals("exit")) {
				System.out.println("끝");
				break;
			}
			//String -> int
			int result = Integer.parseInt(inputString);//숫자로 변환
			//calculate page
			int 결과 =result / nPerPage;
			if(result%nPerPage != 0) {
				결과 = result / nPerPage +1;
			}
			System.out.println(결과 +"페이지가 필요합니다.");
		}
	}
}
