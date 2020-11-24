package Ali_testing;


public class TestingTask {
  public   static String result;
    public static void main(String[] args) {
        findTwoLargestNumbers(args);
    }
    public static String result_of_print;
    private static void findTwoLargestNumbers(String[] args) {

        int ma1 = 0, ma2 = 0;
        if (args.length == 0) {                            /* 1 */
            System.out.println("No numbers");
            result="No numbers";
            result_of_print="No numbers";
        }
        else {
            ma1 = Integer.parseInt(args[0]);
            if (args.length == 1) {                        /* 2 */
                System.out.println("largest = " + ma1);
                result=""+ma1;
                result_of_print="largest = " + ma1;
            }
            else {
                int obs = Integer.parseInt(args[1]);
                ma2=obs;
                if (obs > ma1)                               /* 3 */
                {
                    ma2 = ma1;
                    ma1 = obs;
                }
                for (int i = 2; i < args.length; i++)          /* 4 */
                {
                    obs = Integer.parseInt(args[i]);
                    if (obs > ma1) /* 5 */
                    {
                        ma2 = ma1;
                        ma1 = obs;
                    } else if (obs > ma2) /* 6 */
                        ma2 = obs;
                }
                result_of_print ="The two largest are " + ma1 + " and " + ma2;
                System.out.println("The two largest are " + ma1 + " and " + ma2);
                result=ma1+","+ma2;
            }
        }
    }

}

