package teste_ex2;

import Ex2.PerecheNumere;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class testFibonacci
{
    @Test
    void test1 ()
    {
        PerecheNumere p = new PerecheNumere(2, 3);
        assertTrue(p.verify_Fibonacci());
    }

    @Test
    void test2 ()
    {
        PerecheNumere p = new PerecheNumere(1, 3);
        assertEquals(false, p.verify_Fibonacci());
    }

    @Test
    void test3 ()
    {
        PerecheNumere p = new PerecheNumere(21, 35);
        assertFalse(p.verify_Fibonacci());
    }
}