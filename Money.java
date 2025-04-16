public class Money
{
  private double value;

  public Money(double v)
  {
    value = v;
  }

  public double getAmount()
  {
    return value;
  }
}

class Coin extends Money
{
    private String name;

    public Coin(String n, double v)
    {
        super(v);
        name = n;
    }

    public String toString()
    {
        return this.name;
    }

    public String getName()
    {
        return this.name;
    }

    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if (!(other instanceof Coin))
        {
            return false;
        } 
        
        Coin otherCoin = (Coin) other; 
        return (this.getAmount() == otherCoin.getAmount()) && (this.getName()).equals(otherCoin.getName());
        
    }
}

class Quarter extends Coin
{
    public Quarter()
    {
        super("quarter", 0.25);
    }
}

class Nickel extends Coin
{
    public Nickel()
    {
        super("nickel", 0.05);
    }
}

class Dime extends Coin
{
    public Dime()
    {
        super("dime", 0.10);
    }
}

class Bill extends Money
{
    public Bill(double v)
    {
        super(v);
    }

    public String toString()
    {
        return "$" + (int) this.getAmount();
    }
}