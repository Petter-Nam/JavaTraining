package step3_01_arrayAdvanced;

import java.util.Scanner;

/*
 * # 숫자이동[2단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 *      숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */

public class ArrayEx27_연습2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };

        while (true) {
            System.out.println("[1] 왼쪽");
            System.out.println("[2] 오른쪽");
            System.out.print("키를 입력하여주세요: ");
            int leftRight = scan.nextInt();

            for (int i = 0; i < game.length; i++) {
                if (game[i] == 2)
                    System.out.print("옷 ");
                else if (game[i] == 0)
                    System.out.print("_");
                else if (game[i] == 1)
                    System.out.print("|");

                // 좌우로 캐릭터 이동하는 조건문
                if (leftRight == 1 && game[i] == 2 && i > 0) {
                    if (game[i - 1] == 1) { // 벽을 만났을 때
                        System.out.println("\n벽을 돌파하시겠습니까?");
                        System.out.println("[3] 네");
                        System.out.print("[0] 아니오");
                        int breakDown = scan.nextInt();
                        if (breakDown == 3) {
                            game[i - 1] = game[i]; // 벽을 돌파하고 이동
                            game[i] = 0;
                        } else {
                            System.out.println("벽을 돌파하지 않습니다."); // 벽을 돌파하지 않고 이동하지 않음
                        }
                    } else { // 벽이 아닌 경우
                        game[i - 1] = game[i]; // 이동
                        game[i] = 0;
                    }
                    break; // 이동 완료 후 반복문 종료
                } else if (leftRight == 2 && game[i] == 2 && i < game.length - 1) {
                    if (game[i + 1] == 1) { // 벽을 만났을 때
                        System.out.println("\n벽을 돌파하시겠습니까?");
                        System.out.println("[3] 네");
                        System.out.print("[0] 아니오");
                        int breakDown = scan.nextInt();
                        if (breakDown == 3) {
                            game[i + 1] = game[i]; // 벽을 돌파하고 이동
                            game[i] = 0;
                        } else {
                            System.out.println("벽을 돌파하지 않습니다."); // 벽을 돌파하지 않고 이동하지 않음
                        }
                    } else { // 벽이 아닌 경우
                        game[i + 1] = game[i]; // 이동
                        game[i] = 0;
                    }
                    break; // 이동 완료 후 반복문 종료
                }
            }
        }
    }
}