/**
 * Print out all the steps for playing a Hanoi game with n disks
 */
public class Hanoi
{
    private int n;
    private String peg1;//original
    private String peg2;//helper
    private String peg3;//target

    public Hanoi(int n, String peg1, String peg2,String peg3)
    {
        this.n=n;
        this.peg1=peg1;
        this.peg2=peg2;
        this.peg3=peg3;
    }
    public void play()
    {
        //Base case
        if (n==1)
            System.out.println("Move disk "+n+" from "+peg1+" to "+peg3+" .");//base case
        else
            {
                //use the target as helper to move the top n-1 disks from the original to the helper
                new Hanoi(n-1, peg1,peg3 ,peg2 ).play();
                //Move the nth of the largest disk from peg1 to the peg3
                System.out.println("Move disk "+n+" from "+peg1+" to "+peg3+" .");
                //Move the n-1 disks from peg2 to peg3 by using peg1 as helper
                new Hanoi(n-1,peg2 ,peg1 , peg3).play();
            } //recursive case
    }

}
