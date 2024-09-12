public class Twinkies extends ForSale implements SoldInBulk
{
    private static final double TWINKIE_PRICE = 6.99;

    Twinkies()
    {
        super(TWINKIE_PRICE);
    }

    @Override
    public boolean isFood() {
        return true;
    }

    @Override
    public int itemsPerUnit() {
        return 6;
    }

}
