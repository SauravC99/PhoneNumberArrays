import java.util.*;

public class Arrays
{
    public static void main(String args[])
    {
        ArrayList<Long> numbers = new ArrayList<Long>(10);
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Please enter a phone number: ");
            Scanner scan = new Scanner(System.in);
            long phoneNum = scan.nextLong();
            numbers.add(phoneNum);
        }
        //System.out.println(numbers);
        track(numbers);
    }

    public static void track(ArrayList<Long> num)
    {
        int zero = 0; int one = 0; int two = 0; int three = 0;
        int four = 0; int five = 0; int six = 0; int seven = 0;
        int eight = 0; int nine = 0;

        ArrayList<Integer> sep = new ArrayList<Integer>();

        for(int i = 0; i < num.size(); i++)
        {
            String x = Long.toString(num.get(i));
            for(int j = 0; j < x.length(); j++)
            {
                String a = x.substring(j, j+1);
                sep.add(Integer.parseInt(a));
            }
        }
        //System.out.println(sep);

        for(int i = 0; i < sep.size(); i++)
        {
            int x = sep.get(i);
            if(x == 0)
                zero++;
            if(x == 1)
                one++;
            if(x == 2)
                two++;
            if(x == 3)
                three++;
            if(x == 4)
                four++;
            if(x == 5)
                five++;
            if(x == 6)
                six++;
            if(x == 7)
                seven++;
            if(x == 8)
                eight++;
            if(x == 9)
                nine++;
        }
        int total = zero+one+two+three+four+five+six+seven+eight+nine;
        zero += 100 - total;

        System.out.println("0 is used: " + zero);
        System.out.println("1 is used: " + one);
        System.out.println("2 is used: " + two);
        System.out.println("3 is used: " + three);
        System.out.println("4 is used: " + four);
        System.out.println("5 is used: " + five);
        System.out.println("6 is used: " + six);
        System.out.println("7 is used: " + seven);
        System.out.println("8 is used: " + eight);
        System.out.println("9 is used: " + nine);

        ArrayList<Integer> tot = new ArrayList<Integer>();
        tot.add(zero);
        tot.add(one);
        tot.add(two);
        tot.add(three);
        tot.add(four);
        tot.add(five);
        tot.add(six);
        tot.add(seven);
        tot.add(eight);
        tot.add(nine);

        ArrayList<Integer> sorted = new ArrayList<Integer>(tot);
        Collections.sort(sorted);
        //System.out.println(tot);

        int countSmall = 0;
        for(int i = 0; i < sorted.size() - 1; i ++)
        {
            if(sorted.get(i) == sorted.get(i + 1))
                countSmall++;
            else
                break;;
        }

        int countBig = 0;
        for(int i = (sorted.size() - 1); i > 0; i--)
        {
            if(sorted.get(i) == sorted.get(i - 1))
                countBig++;
            else
                break;
        }

        if(countBig == 0)
        {
            for(int i = 0; i < tot.size(); i++)
            {
                if(sorted.get(9) == tot.get(i))
                    System.out.println("The most used number is " + i);
            }
        }
        else
            System.out.println("There are 2 or more numbers used the most.");

        if(countSmall == 0)
        {
            for(int i = 0; i < tot.size(); i++)
            {
                if(sorted.get(0) == tot.get(i))
                    System.out.println("The least used number is " + i);
            }
        }
        else
            System.out.println("There are 2 or more numbers used the least.");

    }

}
