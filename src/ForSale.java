public abstract class ForSale
{
    private double basePrice;

    ForSale(double price)
    {
        basePrice = price;
    }

    public double getPrice(int units)
    {
        return basePrice * units;
    }

    public abstract boolean isFood();
}
