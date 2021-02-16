import java.util.Arrays;
import java.util.Random;

/**
ريان حسن
 */
public class ScoreBoard {
    private int numEntry;
    GameEntry[]board;

    public ScoreBoard(int capacity) {
        board=new GameEntry[capacity];
    }
    public void AddGameEntry(GameEntry e){
        int newScore=e.getScore();
        if(numEntry<board.length||newScore>board[numEntry-1].getScore())
        {
            if(numEntry<board.length)
            {
                numEntry++;
                int j=numEntry-1;
                while (j>0 &&board[j-1].getScore()<newScore)
                {
                    board[j]=board[j-1];
                    j--;
                }
                board[j]=e;
            }
        }
    }

    public GameEntry Remove(int x)
            throws IndexOutOfBoundsException {
        if(x<0 ||x>=numEntry)
            throw new IndexOutOfBoundsException("inveled " + x);
           GameEntry t=board[x];
        for (int j = x; j <numEntry-1 ; j++)
            board[j]=board[j+1];
            board[numEntry-1]=null;
            numEntry--;
            return t;
        }

    public void Add(GameEntry e)
    {
        int s=numEntry;
        if(numEntry<board.length)
        {
            board[s]=e;
            numEntry++;
        }
        else
        {
            Random k=new Random();
            int randomNum=k.nextInt(5);
            board[randomNum]=e;


        }
    }
    public GameEntry remove()
    {
        GameEntry t=board[numEntry-1];
        board[numEntry-1]=null;
        numEntry--;
        return t;
    }


    public static void main(String[] args) {
        ScoreBoard s=new ScoreBoard(5);
       GameEntry g=new GameEntry(190,"Ali");
      /*  s.AddGameEntry(g);
       // System.out.println(s.toString());
        System.out.println(Arrays.toString(s.board));
        GameEntry a=new GameEntry(300,"Ali");
        s.AddGameEntry(a);
        System.out.println(Arrays.toString(s.board));
        GameEntry b=new GameEntry(101,"Ali");
        s.AddGameEntry(b);
        System.out.println(Arrays.toString(s.board));
        s.Remove(2);
        System.out.println(Arrays.toString(s.board));*/
      s.Add(g);
        System.out.println(Arrays.toString(s.board));
        s.remove();
        System.out.println(Arrays.toString(s.board));
}}
