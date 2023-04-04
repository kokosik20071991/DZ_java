/**
 * ZD_3
 * Вывести все простые числа от 1 до 1000 простое число - то число которое делится без остатка только на 1 и на само себя (1 - это не простое число);
 */

 public class ZD_3 {
    public static void main(String[] args) {
        System.out.print("2 3 ");
        boolean flag;
        for (int i = 5; i <=1000 ; i++) {
            flag=false;
            for (int j = 2; j <i/2 ; j++) {
                if ((i%j)==0)
                {
                    flag=true;
                }
            }
            if (flag==false)
            {
                System.out.print(i+" ");
            }
        }
    }
}