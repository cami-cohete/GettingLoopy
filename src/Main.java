public class Main
{

    public static void main(String[] args)
    {
        // Part A of project. For loops
        int cnt = 0;
        for (cnt = 0; cnt <=30; cnt++)
        {
            System.out.printf("%3d", cnt);
        }
        System.out.println("");


        for (cnt = 30; cnt >=0; cnt--)
        {
            System.out.printf("%3d", cnt);
        }
        System.out.println("");


        for (cnt = 0; cnt <=18; cnt = cnt + 3)
        {
            System.out.printf("%3d", cnt);
        }
        System.out.println("");


        for (cnt = 10; cnt >= 0; cnt = cnt - 2)
        {
            System.out.printf("%3d", cnt);
        }
        System.out.println("");

        // Part B of project. Nested Loops
        final int ROW = 5;
        final int COL = 5;

        for (int row = 0; row <= ROW; row++)
        {
            for (int col = row; col >= 0; col--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
