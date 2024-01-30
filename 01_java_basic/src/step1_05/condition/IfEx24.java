package step1_05.condition;
 

/*
 
  # switch ~ case문
  
  
   - if문과 다르게 범위 형태로 직접적으로 분기하지 않고 데이터를 기준으로 직접 분기한다.
   - switch 기준변수에는 정수, 문자, 문자열 자료형을 사용할 수 있다.
   - 케이스들 중 해당되는 곳이 없을때 default로 분기된다.
  
	[ before 형식 ]
   
   switch (변수) {
   
   case 데이터: 
   		명령어
   		break;
   case 데이터: 
   		명령어
   		break;   		
   case 데이터: 
   		명령어
   		break;
   default:
      	명령어;
   }
   
   - 분기 case뿐만 아니라 아래 case까지 모두 수행하여 
     이러한 분기를 원치않을 경우 의도적으로 break 명령어를 작성한다.
   
     
	[ after 형식 ]
   
   switch (변수) {
   
   case 데이터 -> { 
   		명령어
   }
    case 데이터 -> { 
   		명령어
   }  		
    case 데이터 -> { 
   		명령어
   }
   default -> {
      	명령어;
   }
     
     
   - 새로운 case구문에서는 :(콜론) 대신 ->(애로우 구문)을 사용하여 문법을 작성한다. 
   - { }로 몸체를 만들어서 명령어를 실행하며 명령어가 1줄일 경우에는 {}를 생략할 수 있다.
   - 자동으로 break가 적용되어 각 case가 분리된다.
   
*/

public class IfEx24 {

	public static void main(String[] args) {
		
		int selectedMenu = 2; // 1, 2, 3, 4, 5
		
		/* 과거 switch case*/
		switch (selectedMenu) {
		
		case 1:
			System.out.println("1번 메뉴로 분기합니다.");
			break;
		case 2:
			System.out.println("2번 메뉴로 분기합니다.");
			break;
		case 3:
			System.out.println("3번 메뉴로 분기합니다.");
			break;
			
			default :
				System.out.println("default 메뉴로 분기합니다.");
		}
		
		System.out.println();
		
		/* 새로운 switch case */
		
		switch (selectedMenu) {
		
			case 1 -> {
				System.out.println("1번 메뉴로 분기합니다.");
			}
			case 2 -> {
				System.out.println("2번 메뉴로 분기합니다.");
			}
			case 3 -> {
				System.out.println("3번 메뉴로 분기합니다.");
			}
			default -> {
				System.out.println("default 메뉴로 분기합니다.");
			}
		}
	}

}
