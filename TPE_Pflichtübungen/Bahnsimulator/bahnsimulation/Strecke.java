package bahnsimulation;

/*
 * Created by Patrick Hentschel on 27.05.2016.
 */
public class Strecke
{
    private int laenge;
    private int blocklaenge;
    private int blockArray[];
    private String streckenAusgabe = "";

    public Strecke(int laenge)
    {
        this.laenge = laenge;
        blockArray = new int[laenge];
        for (int i = 0; i < blockArray.length; i++) {
            blockArray[i] = 0;
        }
    }

    public int[] getBlockArray()
    {
        return blockArray;
    }



    public void addBlock(Block block)
    {
        /**
         * Block Startpunkt wird gesetzt und Block Endpunkt wird gesetzt --> Funktion soll
         * aus der Laenge des Blockes 1er Strecken machen die vom Startpunkt bis zum Endpunkt zugewiesen werden sollen
         */
        if (blockArray[block.getStart()] != 0) {
            try {
                throw new InvalidStartException("Ein anderer Block belegt diesen Teil der Strecke bereits");
            } catch (InvalidStartException e) {
                e.printStackTrace();
            }
            for (int i = block.getStart(); i < block.getLaenge(); i++) {
                blockArray[i] = 1;
            }
        }


    }

    public class InvalidStartException extends Throwable
    {
        public InvalidStartException(String s)
        {
        }
    }
}