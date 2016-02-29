import java.util.*;
public class ttt{			// TIC TAC TOE
	private final int EMPTY = 0;
	private final int CROSS = 1;
	private final int NOUGHT = 2;
	int[][] board;	
	private final int PLAYING = 0;
	private final int CROSS_WON = 1;
	private final int NOUGHT_WON = 2;
	private final int DRAW = 3;
	private final int INVALID = 4;
	private int currentState;
	private int cellsFilled;
	private Boolean flag = false;
	public synchronized  void Player1Move(Coordinate curr){
		if(flag){
			try{
				wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}	
		}
		this.move(curr.x, curr.y, 0);
		flag = true;
		notify();		
	} 
	public synchronized  void Player2Move(Coordinate curr){
		if(!flag){
			try{
				wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}	
		}
		this.move(curr.x, curr.y, 1);
		flag = false;
		notify();		
	} 
	public ttt(int size){
	
		this.board = new int[size][size];
		for(int i = 0;i < size;i++){
			for(int j = 0;j < size;j++){
				this.board[i][j]  = EMPTY;	
			}
		}
		this.currentState = PLAYING;
		this.cellsFilled = 0;
		
	}
	private int update(int x, int y){
		int ret = PLAYING;
		int size = board.length;
		// Check row	
		int i = 0, j = 0, count = 0;
		int sym = board[x][y];
		for(i = 0;i < size;i++){
			if(board[x][i] == sym){
				count++;
			}
			else{
				break;
			}
		}	
		if(count == size){
			if(sym == CROSS)
				return CROSS_WON;
			else
				return NOUGHT_WON; 
		}
		// Check column	
		count = 0;
		for(i = 0;i < size;i++){
                        if(board[i][y] == sym){
                                count++;
                        }
                        else{
                                break;
                        }
                }
                if(count == size){
                        if(sym == CROSS)
                                return CROSS_WON;
                        else
                                return NOUGHT_WON;
                }

		// Check diagonal 1 
		if(x == y){
			count = 0;
			for(i = 0;i < size;i++){
        	                if(board[i][i] == sym){
                	                count++;
                        	}
                        	else{
                                	break;
                        	}
	                }
	                if(count == size){
        	                if(sym == CROSS)
                	                return CROSS_WON;
                        	else
                                	return NOUGHT_WON;
                	}	
		}		
		// Check diagonal 2	
		if(x + y == size-1){
			count = 0;
			for(i = size-1;i >= 0;i--){
        	                if(board[size-1-i][i] == sym){
                	                count++;
                        	}
                        	else{
                                	break;
                        	}
	                }
	                if(count == size){
        	                if(sym == CROSS)
                	                return CROSS_WON;
                        	else
                                	return NOUGHT_WON;
                	}	
		}	
		return ret;
	}
	private void printBoard(int retVal){
		int size = board.length;
		for(int i = 0;i < size;i++){
			for(int j = 0;j < size;j++)
			{
				System.out.print(board[i][j] + " ");

			}
			System.out.println();
		}	
		System.out.println();
		System.out.println("Result : " + retVal);
	} 
	protected int move(int x, int y, int player){
		int size = board.length;
		int retVal = INVALID;		
		if(x < 0 || x >= size || y < 0 || y >= size || currentState != 0 || player < 0 || player > 1){
			retVal = INVALID;
		}
		else if(board[x][y] == EMPTY){
			if(player == 0){
				board[x][y] = CROSS;
			}
			else
				board[x][y] = NOUGHT;
			cellsFilled++;
			if(cellsFilled == size*size){
				currentState = DRAW;
			}
			else{
				currentState = this.update(x,y);	
			}
			retVal = currentState;	
				
		}
		else
			retVal = INVALID;
		this.printBoard(retVal);		
		return retVal;	
	}  		
}
