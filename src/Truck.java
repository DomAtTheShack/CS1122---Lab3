public class Truck extends ForSale
{

    public Truck(double price)
    {
        super(price);
    }

    @Override
    public boolean isFood()
    {
        return false;
    }
}
