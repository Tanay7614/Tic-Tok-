package sample;

import java.util.Scanner;

public class TikToe {
	 static int n=0;
	public static void main(String[] args) {
		System.out.println("Start Playing");
		char[] board=createBoard();
		//ShowBoard(board);
		allow(board);
		
		}
	private static void ShowBoard(char[] board) {
		
		System.out.println("|  "+board[0]+"|  "+board[1]+"|  "+board[2]+"|");
		System.out.println("|  "+board[3]+"|  "+board[4]+"|  "+board[5]+"|");
		System.out.println("|  "+board[6]+"|  "+board[7]+"|  "+board[8]+"|");
	}
	private static void allow(char[] board) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose 1 for X & 2 for O");
		char player;
		char computerPlayer;
		int choice=sc.nextInt();
		switch(choice) {
		case 1: 
				 player='X';
				 computerPlayer='O';
				 
				 System.out.println("-------------||-------------");
				 turn(board,computerPlayer, player);
				
				break;
		case 2:
				player='O';
				computerPlayer='X'; 
				 turn(board,computerPlayer,player);
				break;
	    default:
	    	System.out.println("Invalid choice");
	    	allow(board);
	    	
		}
		
		
	}
	public static char[] createBoard(){
		char [] board=new char[10];
		for (int i=1;i<10;i++) {
			board[i]=' ';
		}
		return board;
		
	}
	public static void turn(char[] board, char computerPlayer, char player ) {
		 Check ch=new Check();
		 compu s=new compu();
		 Scanner sc=new Scanner(System.in);
		if(n<5) {
			 
	      System.out.println("Enter a postion you want to mark");
		 int pos=sc.nextInt();
		 switch(pos) {
		 case 1:if(board[0]!=computerPlayer && board[0]!=player) {
			 board[0]=player;
		 System.out.print(board[0]+"|  ");
		
		 break;
		 }
		 else {
			 System.out.println("This postion is already feel choose another");
			 turn(board,computerPlayer, player);
		 }
		
		 case 2:if(board[1]!=computerPlayer && board[1]!=player) {
			 board[1]=player;
		 System.out.print(board[1]+"|  ");
		break;
		 }
		 else {
			 System.out.println("This postion is already feel choose another");
			 turn(board,computerPlayer, player);
		 }
		 break;
		 case 3:if(board[2]!=computerPlayer && board[2]!=player) {
			 board[2]=player;
		 System.out.print(board[2]+"|  ");
		 }
		 else {
			 System.out.println("This postion is already feel choose another");
			 turn(board,computerPlayer, player);
		 }
		 break;
		 case 4:if(board[3]!=computerPlayer && board[3]!=player) {
			 board[3]=player;
		 System.out.print(board[3]+"|  ");
		 break;
		 }
		 else {
			 System.out.println("This postion is already feel choose another");
			 turn(board,computerPlayer, player);
		 }
		
		 case 5:if(board[4]!=computerPlayer && board[4]!=player) {
			 board[4]=player;
		 System.out.print(board[4]+"|  ");
		 break;
		 }
		 else {
			 System.out.println("This postion is already feel choose another");
			 turn(board,computerPlayer, player);
		 }
		 
		 case 6:if(board[5]!=computerPlayer && board[5]!=player) {
			 board[5]=player;
		 System.out.print(board[5]+"|  ");
		 break;
		 }
		 else {
			 System.out.println("This postion is already feel choose another");
			 turn(board,computerPlayer, player);
		 }
		
		 case 7:if(board[6]!=computerPlayer && board[6]!=player) {
			 board[6]=player;
		 System.out.print(board[6]+"|  ");
		 break;
		 }
		 else {
			 System.out.println("This postion is already feel choose another");
			 turn(board,computerPlayer, player);
		 }
		
		 case 8:
			 if(board[7]!=computerPlayer && board[7]!=player) {
				 board[7]=player;
		 System.out.print(board[7]+"|  ");
		 break;
			 }
			 else {
				 System.out.println("This postion is already feel choose another");
				 turn(board,computerPlayer, player);
			 }
		
		 case 9:
			 if(board[8]!=computerPlayer && board[8]!=player) {
				 board[8]=player;
		 System.out.print(board[8]+"|  ");
		 break;
			 }
			 else {
				 System.out.println("This postion is already feel choose another");
				 turn(board,computerPlayer, player);
			 }
		 
		 default :System.out.println("inavalid choice");
		 turn(board, computerPlayer, player);
		 }
		 n++;
		 int p=ch.checkwin(board,player);
		 if(p==0) {
		 s.computerTurn( board,computerPlayer,player);
		 }
		 }
	}
	
}
