import java.util.Scanner;

public class TemperatureTask2 {
    public static void main(String[] args) {
        int sum1 =0;
        int counterZ =0;
        int averageTemp;
        ReturnArray retArr = new ReturnArray();
        float[] tempList = retArr.generatePatientsTemperatures();
        for(float b:tempList){
            sum1+=b;
            if(b>=36.2&b<=36.9){
                counterZ++;
            }}
            averageTemp = (sum1/tempList.length);
            System.out.println("Средняя температура: "+averageTemp);
            System.out.println("Здоровых пациентов: "+counterZ);}
}
    class ReturnArray{
        float[] generatePatientsTemperatures(){
            Scanner s = new Scanner(System.in);
            System.out.println("Введите количество пациентов");
            int counter1 = s.nextInt();
            float[] temperatureList = new float[counter1];
            for (int i = 0; i < counter1; i++) {
                temperatureList[i] = 32 + (float) (Math.random() *8);
        }
            return temperatureList;

    }}


