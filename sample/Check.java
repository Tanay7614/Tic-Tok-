package sample;

public class Check {
	

	public int checkwin(char[] board,char po) {
    while(true) {
		if(board[0]==board[1]) {
			   if(board[1]==board[2]) {
				   if(po=='X') {
					   System.out.println("Player is win") ;
					   return 1;
				   }  
				   else {
					   System.out.println("Computer is win");
					   return 1;
				   }
				   
			   }
	  	 }
	    if(board[0]==board[3]) {
			if(board[3]==board[6]) {
				 if(po=='X') {
					   System.out.println("Player is win") ;
					   return 1;
				   }  
				   else {
					   System.out.println("Computer is win");
					   return 1;
				   }
				
			}
		}
	    if(board[6]==board[7]) {
			if(board[7]==board[8]) {
				 if(po=='X') {
					   System.out.println("Player is win") ;
					   return 1;
				   }  
				   else {
					   System.out.println("Computer is win");
					   return 1;
				   }
				}
			}
	    if(board[2]==board[5]) {
			if(board[5]==board[8]) {
				 if(po=='X') {
					   System.out.println("Player is win") ;
					   return 1;
				   }  
				   else {
					   System.out.println("Computer is win");
					   return 1;
				   }
			}
			}
	    if(board[0]==board[4]) {
			if(board[4]==board[8]) {
				 if(po=='X') {
					   System.out.println("Player is win") ;
					   return 1;
				   }  
				   else {
					   System.out.println("Computer is win");
					   return 1;
				   }
				}
			}
	    if(board[2]==board[4]) {
			if(board[4]==board[6]) {
				 if(po=='X') {
					   System.out.println("Player is win") ;
					   return 1;
				   }  
				   else {
					   System.out.println("Computer is win");
					   return 1;
				   }
				}
			}
	    break;
    }
    return 0;
	}
	
}
