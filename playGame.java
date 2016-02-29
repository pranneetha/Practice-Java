import java.util.*;
        class T1 implements Runnable {
                ttt board;
                List<Coordinate> moves;
                public T1(ttt board, List<Coordinate> moves){
                        this.board = board;
                        this.moves = moves;


                }
                public void run(){
                        Coordinate curr;
                        for(int i = 0;i < moves.size();i++)
                                board.Player1Move(moves.get(i));
                }
        }
	        class T2 implements Runnable {
                ttt board;
                List<Coordinate> moves;
                public T2(ttt board, List<Coordinate> moves){
                        this.board = board;
                        this.moves = moves;

                }
                public void run(){
                        Coordinate curr;
                        for(int i = 0;i < moves.size();i++)
                                board.Player2Move(moves.get(i));
                }
        }
public class playGame{
				
	public static void main(String[] args){
		ttt  Game = new ttt(3);
		int i = 0;
		List<Coordinate> l1 = new LinkedList<Coordinate>();
		List<Coordinate> l2 = new LinkedList<Coordinate>();
		l1.add(new Coordinate(1,1));
		l2.add(new Coordinate(0,0));
		l1.add(new Coordinate(0,2));
		l2.add(new Coordinate(2,0));
		l1.add(new Coordinate(1,0));
		l2.add(new Coordinate(1,2));
		l1.add(new Coordinate(0,1));
		l2.add(new Coordinate(2,1));
		l1.add(new Coordinate(2,2));
		Thread t1 = new Thread(new T1(Game,l1));
 		Thread t2 = new Thread(new T2(Game,l2));
		t1.start();
		t2.start();
	}	
}
