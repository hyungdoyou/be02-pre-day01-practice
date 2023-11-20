package Day01;

public class EX03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */
        for (Integer i = 0; i < 5; i++) {
            System.out.println("*****");
        }
        System.out.println("------------");
        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */
        for (Integer i = 1; i < 6; i++) {
            for (Integer j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------");
        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
         */
        for (Integer i = 1; i < 6; i++) {
            for (Integer j = 0; j < i; j++) {
                for(Integer y=0; y<j; y++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------");
    }
}