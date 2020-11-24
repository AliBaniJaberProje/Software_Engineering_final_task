import Ali_testing.*;
import junit.*;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestFindTowLargestNumbers {
    @Test
    public void test_NoNumbers_of_findTwoLargestNumbers(){//A
        TestingTask.main(new String[] {});
        String res=TestingTask.result;
        assertEquals(res,"No numbers");
        assertTrue(TestingTask.result_of_print.equals("No numbers"));

    }

    @Test
    public void test_Exactly_one_number (){//B
        TestingTask.main(new String[] {"1"});
        String res=TestingTask.result;
        assertEquals(res,"1");
        assertTrue(TestingTask.result_of_print.equals("largest = " + 1));
    }
    @Test
    public void test_Second_lage_than_firstNumber_and_exactly_tow_number(){//D
        TestingTask.main(new String[] {"1","2"});
        String res=TestingTask.result;
        assertEquals(res,"2,1");
        assertTrue(TestingTask.result_of_print.equals("The two largest are " + 2 + " and " + 1));
    }
    @Test
    public void test_SecongNumberless_than_firtNumberand_exactlyTow_number (){//E
        TestingTask.main(new String[] {"2","1"});
        String res=TestingTask.result;
        assertEquals(res,"2,1");
        assertTrue(TestingTask.result_of_print.equals("The two largest are " + 2 + " and " + 1));
    }

    @Test
    public void test_third_number_is_smaller_than_largestValue_ExactlyThree_Number_thirdNumber_greater_than_the_second_largest (){//F
        TestingTask.main(new String[] {"3","2","1"});
        String res=TestingTask.result;
        assertEquals(res,"3,2");
        assertTrue(TestingTask.result_of_print.equals("The two largest are " + 3 + " and " + 2));
    }

    @Test
    public void test_thirdNumber_greater_than_largest_value_ma1(){//h
        TestingTask.main(new String[] {"2","3","4"});
        String res=TestingTask.result;
        assertEquals(res,"4,3");
        assertTrue(TestingTask.result_of_print.equals("The two largest are " + 4 + " and " + 3));
    }
    @Test
    public void test_hird_number_smaller_than_Second_largestValue_ma2(){//Z
        TestingTask.main(new String[] {"5","4","1"});
        String res=TestingTask.result;
        assertEquals(res,"5,4");
        assertTrue(TestingTask.result_of_print.equals("The two largest are " + 5 + " and " + 4));

    }

    @Test
    public void test_At_least_four_number(){//Z
        TestingTask.main(new String[] {"5","2","3","12"});
        String res=TestingTask.result;
        assertEquals(res,"12,5");
        assertTrue(TestingTask.result_of_print.equals("The two largest are " + 12 + " and " + 5));
    }

}
