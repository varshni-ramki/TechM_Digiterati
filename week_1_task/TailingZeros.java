package week_1_task;

public class TailingZeros {
    public static void main(String[] args) {
        int factorial=50;
        int power;
        int trail=0;
        for(int i=1;i<10;i++){
            power=(int) Math.pow(5,i);
            int div=factorial/power;
            trail=trail+div;
            if(div==0){
                break;
            }

        }
        System.out.println(trail);


    }

}
