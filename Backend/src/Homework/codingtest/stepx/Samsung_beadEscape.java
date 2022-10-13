package Homework.codingtest.stepx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Samsung_beadEscape{
	
	/*
		[문제]
		스타트링크에서 판매하는 어린이용 장난감 중에서 가장 인기가 많은 제품은 구슬 탈출이다. 
		구슬 탈출은 직사각형 보드에 빨간 구슬과 파란 구슬을 하나씩 넣은 다음, 빨간 구슬을 구멍을 통해 빼내는 게임이다.
		보드의 세로 크기는 N, 가로 크기는 M이고, 편의상 1×1크기의 칸으로 나누어져 있다.
		가장 바깥 행과 열은 모두 막혀져 있고, 보드에는 구멍이 하나 있다. 
		빨간 구슬과 파란 구슬의 크기는 보드에서 1×1크기의 칸을 가득 채우는 사이즈이고, 각각 하나씩 들어가 있다. 
		게임의 목표는 빨간 구슬을 구멍을 통해서 빼내는 것이다. 이때, 파란 구슬이 구멍에 들어가면 안 된다.
		이때, 구슬을 손으로 건드릴 수는 없고, 중력을 이용해서 이리 저리 굴려야 한다.
		왼쪽으로 기울이기, 오른쪽으로 기울이기, 위쪽으로 기울이기, 아래쪽으로 기울이기와 같은 네 가지 동작이 가능하다.
		각각의 동작에서 공은 동시에 움직인다. 
		빨간 구슬이 구멍에 빠지면 성공이지만, 파란 구슬이 구멍에 빠지면 실패이다. 빨간 구슬과 파란 구슬이 동시에 구멍에 빠져도 실패이다. 
		빨간 구슬과 파란 구슬은 동시에 같은 칸에 있을 수 없다.
		또, 빨간 구슬과 파란 구슬의 크기는 한 칸을 모두 차지한다. 기울이는 동작을 그만하는 것은 더 이상 구슬이 움직이지 않을 때 까지이다.
		보드의 상태가 주어졌을 때, 최소 몇 번 만에 빨간 구슬을 구멍을 통해 빼낼 수 있는지 구하는 프로그램을 작성하시오.
		
		[입력]
		첫 번째 줄에는 보드의 세로, 가로 크기를 의미하는 두 정수 N, M (3 ≤ N, M ≤ 10)이 주어진다. 
		다음 N개의 줄에 보드의 모양을 나타내는 길이 M의 문자열이 주어진다.
		이 문자열은 '.', '#', 'O', 'R', 'B' 로 이루어져 있다. 
		'.'은 빈 칸을 의미하고, '#'은 공이 이동할 수 없는 장애물 또는 벽을 의미하며, 'O'는 구멍의 위치를 의미한다.
		'R'은 빨간 구슬의 위치, 'B'는 파란 구슬의 위치이다.
		입력되는 모든 보드의 가장자리에는 모두 '#'이 있다. 구멍의 개수는 한 개 이며, 빨간 구슬과 파란 구슬은 항상 1개가 주어진다.
	*/
	
	
	/*	 	
	 	보드의 가로세로 길이를 입력 받은 뒤에 판의 모양을 직접 입력받는 과정에서 줄바꿈 등의 구분 처리가 어떻게 되는지에 대해 고민 필요
	 	Stringtokenizer를 쓰기엔 구분을 엔터로 놓은 후 입력받은 문자열을 하나씩 잘라 배열에 넣어야할 것같아서 일단은 배제
	 	
	 	int int
	 	String
	 	String
	 	String
	 	String
	 	String
	 	
	 	형태 입력 가능한지 test필요
	 	
	 	5
		5
		#####
		#B..#
		#.O.#
		#R..#
		#####
		
		#####
		#..B#
		#.O.#
		#..R#
		#####
	*/
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int count = 0;	// 판을 기울인 횟수 저장
		
		Samsung_beadEscape sb = new Samsung_beadEscape();

		String[][] board = new String[x][y];
		int Rx=-1; int Ry=-1; // 빨간공 좌표 저장 변수
		int Bx=-1; int By=-1; // 파란공 좌표 저장 변수
		int Ox=-1; int Oy=-1; // Hole 좌표 저장 변수
		// 배열로 묶어서 한번에 처리해도 되지 않을까?
		
		// 보드 입력 받기
		for(int i = 0 ; i<x ; i++) {
			String cols = br.readLine();
			for(int j = 0 ; j<y ; j++) {
				board[i][j] = String.valueOf(cols.charAt(j));
				if(String.valueOf(cols.charAt(j)).equals("R")) {
					 Rx = i;
					 Ry = j;
				}else if(String.valueOf(cols.charAt(j)).equals("B")) {
					 Bx = i;
					 By = j;
				}else if(String.valueOf(cols.charAt(j)).equals("O")) {
					 Ox = i;
					 Oy = j;
				}
			}
		}
		
		// 보드 출력
		sb.printBoard(board);	
		
		// test
			// 하나씩 하면 잘되는데 두개 돌리면 이상하게 꼬인다...
		sb.moveRight(board, Rx, Ry, Bx, By, count);
		// sb.moveLeft(board, Rx, Ry, Bx, By, count);
		
	}
	
	// 판 출력 메소드
		// 알고리즘 관련 x. test 용도
	
	void printBoard(String[][] board) {
		for(int i = 0 ; i<board.length ; i++) {
			System.out.println();
			for(int j = 0 ; j<board[i].length;j++) {
				System.out.print(board[i][j]);
			}
		}
		System.out.println();
	}
	
	// 판 기울임 메소드
	
	// 1. 오른쪽으로 기울이기	[x,y] = X ---> [y,x]로 되벌임...
	void moveRight(String[][] board, int Rx, int Ry, int Bx, int By, int count) {
		count++;				// 판 컨트롤 횟수 증가
		board[Rx][Ry] = ".";
		board[Bx][By] = ".";
		//움직이면 빈 자리가 될 것이고, 안움직이면 제자리에 대입해주면 끝이니 먼저 공백으로 초기화
		
		// 파란구슬
			//파란구슬이 O 위치에 가게되면 실행되선 안되므로
			//이렇게되면 파란구슬-빨간구슬 순서로 붙어있는 경우 파란공이 오른쪽으로 움직이지 않는다.
			//어짜피 벽이면 움직이지 않을테니 파란 구슬 움직임 코드를 한 번 더 추가해야할까?
			//코드 반복도 너무 많다
			//구슬별 메서드를 나눠 작성한 후, 판 기울임 메서드에서 호출해야할까? 
		while(!(Bx==Rx && By+1==Ry) && !board[Bx][By+1].equals("#")) {
			By++;
			if(board[Bx][By].equals("O")) {
				break;
			}
		}
		if(!board[Bx][By].equals("O")) {
			board[Bx][By] = "B";
		}else {
			board[Bx][By] = "OB";
			System.out.println("[실패] 파란공 탈출");
			printBoard(board);
			return;
		}
		
		//빨간구슬
		while(!(Bx==Rx && By==Ry+1) && !board[Rx][Ry+1].equals("#")) {
			Ry++;
			if(board[Rx][Ry].equals("O")) {
				System.out.println("[성공] 빨간공 탈출");
				board[Rx][Ry] = "OR";
				printBoard(board);
				return;
			}else {
				board[Rx][Ry-1] = ".";
				board[Rx][Ry] = "R";
			}
		}
		
		//파란구슬 한 번 더(붙어있어서 못 움직인 경우에만 해당)
			// 우측에 홀이 있다면 빨간공이 탈출하면서 return됐을 것이므로 이동 후 저장으로 간략화
		board[Bx][By] = ".";
		// 다시 움직이기 전 초기화
		while(!(Bx==Rx && By+1==Ry) && !board[Bx][By+1].equals("#")) {
			By++;
		}
		board[Bx][By] = "B";
		
		printBoard(board);
	}
	
	// 2 왼쪽으로 기울이기			y방향만 반대로
	void moveLeft(String[][] board, int Rx, int Ry, int Bx, int By, int count) {
		printBoard(board);
		count++;
		board[Rx][Ry] = ".";
		board[Bx][By] = ".";
		
		// 파란구슬
		while(!(Bx==Rx && By-1==Ry) && !board[Bx][By-1].equals("#")) {
			By--;
			if(board[Bx][By].equals("O")) {
				break;
			}
		}
		if(!board[Bx][By].equals("O")) {
			board[Bx][By] = "B";
		}else {
			board[Bx][By] = "OB";
			System.out.println("[실패] 파란공 탈출");
			printBoard(board);
			return;
		}
		
		//빨간구슬
		while(!(Bx==Rx && By==Ry-1) && !board[Rx][Ry-1].equals("#")) {
			Ry--;
			if(board[Rx][Ry].equals("O")) {
				System.out.println("[성공] 빨간공 탈출");
				board[Rx][Ry] = "OR";
				printBoard(board);
				return;
			}else {
				board[Rx][Ry+1] = ".";
				board[Rx][Ry] = "R";
			}
		}
		
		board[Bx][By] = ".";
		while(!(Bx==Rx && By-1==Ry) && !board[Bx][By-1].equals("#")) {
			By--;
		}
		board[Bx][By] = "B";		
		
		printBoard(board);
	}
}
