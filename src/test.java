import java.util.ArrayList;
import java.util.List;

public class test {
    List<Integer> list = new ArrayList();
    void findNDigitNumsUtil(int n, int sum, char[] ou, int index)
    {
        if (index > n || sum < 0)
            return;
        if (index == n)
        {
            if (sum == 0)
            {
                ou[index] = '\0';
                String s = new String(ou);
                 list.add(Integer.parseInt(s));
            }

            return;
        }

        for (int i = 0; i <= 9; i++)
        {
            ou[index] = (char)(i + '0');
            findNDigitNumsUtil(n, sum - i, ou,
                    index + 1);

        }
    }

}
