import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_Leap_Years {

    /* test */

    @Test
    public void Checks_If_4000_Is_A_Leap_Year()
    {
        assertEquals(true, Checker.isLeapYear(4000));
    }
    @Test
    public void Checks_If_3993_Is_Not_A_Leap_Year()
    {
        assertEquals(false, Checker.isLeapYear(3993));
    }
    @Test
    public void Test_Checks_If_3991_Is_Not_A_Leap_Year()
    {
        assertEquals(false, Checker.isLeapYear(3991));
    }
    @Test
    public void Checks_If_3984_Is_A_Leap_Year()
    {
        assertEquals(true, Checker.isLeapYear(3984));
    }


    @Test
    public void Checks_If_3984_Is_Divisible_By_4_But_Not_100()
    {
        assertEquals(false, Checker.isDivisibleBy4ButNot100(3984));
    }
    @Test
    public void Checks_If_3984_Is_Divisible_By_400()
    {
        assertEquals(false, Checker.divisibleBy400(3984));
    }
    @Test
    public void Checks_If_3984_Is_Not_Divisible_By_4()
    {
        assertEquals(false, Checker.notDivisibleBy4(3984));
    }
    @Test
    public void Checks_If_3984_Is_Divisible_By_100_But_Not_400()
    {
        assertEquals(false, Checker.divisibleBy100ButNot400(3984));
    }

    @Test
    public void Checks_If_3991_Is_Divisible_By_4_But_Not_100()
    {
        assertEquals(false, Checker.isDivisibleBy4ButNot100(3991));
    }
    @Test
    public void Checks_If_3991_Is_Divisible_By_400()
    {
        assertEquals(false, Checker.divisibleBy400(3991));
    }
    @Test
    public void Checks_If_3991_Is_Not_Divisible_By_4()
    {
        assertEquals(true, Checker.notDivisibleBy4(3991));
    }
    @Test
    public void Checks_If_3991_Is_Divisible_By_100_But_Not_400()
    {
        assertEquals(false, Checker.divisibleBy100ButNot400(3991));
    }

}
