import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        String vez = "Везунчик";
        String m = "Молодец";
        String un ="Unlucky";
        String rank;
        int i = 0;
        int a = 0;
        int b = 100;
        int myNumber;
        int random_number = a + (int) (Math.random() *b);
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Введите число от 1 до 100");
            myNumber = s.nextInt();
            if(myNumber==random_number){
                i++;
                if(i==1){
                    rank = vez;
                }
                else if(i<=5){
                    rank =m;
                }
                else { rank =un;
                }
                System.out.println("Вы угадали,количество попыток: "+ i +" "+"Ваш ранг - "+ rank);}
            else if(myNumber<random_number){
                System.out.println("Ваше число меньше");
                i++;
            }
            else{
                System.out.println("Ваше число болльше");
                i++;
            }
        }while(myNumber!=random_number);
    }
}
