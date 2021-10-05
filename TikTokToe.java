package com.BL;

public class TikTokToe {
	Public static void main(String args[]) {
		System.out.println("Start play");
		createBoard();
	}
	public static createBoard() {
		char board[]= new char[10];
		for (int i=1;i<10;i++) {
			board[i]=' ';
		}
	}
}