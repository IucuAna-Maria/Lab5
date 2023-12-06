package Ex2;

public class PerecheNumere {
    private int x, y;

    public PerecheNumere() {}
    public PerecheNumere(int x, int y)
    {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    @Override
    public String toString()
    {
        return x + ", " + y;
    }

    public boolean verify_Fibonacci()
    {
        int a = 0, b = 1, c;
        c = a + b;
        if((x == a && y == b) || (x == b && y == c))
            return true;
        while(c <= y)
        {
            a = b;
            b = c;
            c = a + b;
            if (x == b && y == c)
                return true;
        }
        return false;
    }

    public int cmmmc()
    {
        int a = Math.max(x, y), i;
        for (i = a; i <= x * y; i = i + a)
            if(i % x == 0 && i % y == 0)
                break;
        return i;
    }

    public int digit_sum(int n)
    {
        int s = 0;
        while (n > 0)
        {
            s = s + n % 10;
            n = n / 10;
        }
        return s;
    }
    public boolean verify_digit_sum()
    {
        if (digit_sum(x) == digit_sum(y))
            return true;
        return false;
    }

    public int digit_even(int n)
    {
        int count = 0;
        while (n > 0)
        {
            if(n % 2 == 0)
                count++;
            n = n / 10;
        }
        return count;
    }
    public boolean verify_digit_even()
    {
        if (digit_even(x) == digit_even(y))
            return true;
        return false;
    }
}
