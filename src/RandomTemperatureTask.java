import java.util.Scanner;

public class RandomTemperatureTask {
        public static void main(String[] args) {
            String good = "Здоровых пациентов";
            int counter1; //количество пациентов
            Scanner s = new Scanner(System.in);
            System.out.println("Введите количество пациентов");
            counter1 = s.nextInt();
            float[] temperatureList = new float[counter1];
            for (int i = 0; i < counter1; i++) {
                temperatureList[i] = 32 + (float) (Math.random() *8);
            }
            int counterZ =0;
            for(float b:temperatureList){
                if(b>=36.2&b<=36.9){
                    counterZ++;
                }

            }
            System.out.println(counterZ+" "+good);
        }
    }

