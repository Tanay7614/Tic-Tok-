package sample;

import java.util.Random;
import java.util.Scanner;

public class compu {
	static int z=0;
	static TikToe tik=new TikToe();
	Scanner sc=new Scanner(System.in);
	 static Check ch=new Check();
    public static void computerTurn(char[] board,char computerplayer, char  player) {
    	
    	if(z<4) {
    		// System.out.println("Enter a postion you want to mark");
    		
			 int pos= (int) (Math.floor(Math.random()*10)%9+1);
			 switch(pos) {
			 case 1: if(board[0]!=player && board[0]!=computerplayer) {
				 board[0]=computerplayer;
			     System.out.print(board[0]+"|   At pos 1");
			   break;
			 }else {
				 System.out.println("Enter another postion this position already feel");
				 computerTurn(board, computerplayer,player);
			 }
			 break;
			 case 2:if(board[1]!=player && board[1]!=computerplayer) {
				 board[1]=computerplayer;
			 System.out.print(board[1]+"|  ");
			 }else {
				 System.out.println("Enter another postion this position already feel");
				 computerTurn(board, computerplayer,player);
			 }
			 break;
			 case 3:if(board[2]!=player  && board[2]!=computerplayer) {
				 board[2]=computerplayer;
			 System.out.print(board[2]+"|  ");
			 }else {
				 System.out.println("Enter another postion this position already feel");
				 computerTurn(board, computerplayer,player);
			 }
			 break;
			 case 4:if(board[3]!=player  && board[3]!=computerplayer) {
				 board[3]=computerplayer;
			 System.out.print(board[3]+"|  ");
			 }else {
				 System.out.println("Enter another postion this position already feel");
				 computerTurn(board, computerplayer, player);
			 }
			 break;
			 case 5:if(board[4]!=player  && board[4]!=computerplayer) {
				 board[4]=computerplayer;
			 System.out.print(board[4]+"|  ");
			 }else {
				 System.out.println("Enter another postion this position already feel");
				 computerTurn(board, computerplayer,player);
			 }
			 break;
			 case 6:if(board[5]!=player  && board[5]!=computerplayer) {
				 board[5]=computerplayer;
			 System.out.print(board[5]+"|  ");
			 }else {
				 System.out.println("Enter another postion this position already feel");
				 computerTurn(board, computerplayer, player);
			 }
			 break;
			 case 7:if(board[6]!=player  && board[6]!=computerplayer) {
				 board[6]=computerplayer;
			 System.out.print(board[6]+"|  ");
			 }else {
				 System.out.println("Enter another postion this position already feel");
				 computerTurn(board, computerplayer, player);
			 }
			 break;
			 case 8:if(board[7]!=player  && board[7]!=computerplayer) {
				 board[7]=computerplayer;
			 System.out.print(board[7]+"|  ");
			 }else {
				 System.out.println("Enter another postion this position already feel");
				 computerTurn(board, computerplayer, player);
			 }
			 break;
			 case 9:if(board[8]!=player  && board[8]!=computerplayer) {
				 board[8]=computerplayer;
			 System.out.print(board[8]+"|  ");
			 }else {
				 System.out.println("Enter another postion this position already feel");
				 computerTurn(board, computerplayer, player);
			 }
			 break;
			 default :System.out.println("inavalid choice");
			 }
			 z++;
			int p= ch.checkwin(board,computerplayer);
			if(p==0) {
			 tik.turn(board, computerplayer, player);
    	}
    	}
    }

	
}
