public class Main {
    public static void main(String[] args) {

        //Пункт 1.
        int k = 0; // k - переменная, которая будет равна кол-ву элементов массива c
        int[] c;

        for (int i = 3; i <= 25; i++){
            if (i % 2 != 0)
                k+=1;

        }


        c = new int[k];

        for (int i = 3, j = 0; i < 25; i++){
            if (i % 2 !=0){
                c[j] = i;
                j++;
            }
        }

        //Пункт 2.
        int ind_x = 0; // ind_x - переменная инекс массива x
        double[] x = new double[16];

        while (ind_x != 16){
            double rand = Math.random();
            if (rand >= -3.0 && rand <= 11){
                x[ind_x] = rand;
                ind_x ++;
            }

        }

        //Пункт 3.
        double[][] arr = new double[12][16];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 16; j++) {
                if (c[i] == 3)
                    arr[i][j] = Math.asin(Math.pow(((Math.pow(Math.exp(1), (-(Math.abs(x[j])))))), 2));

                else if ((c[i] == 7) || (c[i] == 9) || (c[i] == 13) || (c[i] == 21) || (c[i] == 23) || (c[i] == 25))
                    arr[i][j] = Math.pow(Math.log(Math.acos((x[j] + 14) / 14)), (Math.pow(Math.log(Math.abs(x[j])), (3 + (Math.pow((2 / 3) / (1 - x[j]), 3)))) - 1 / 4));

                else
                    arr[i][j] = Math.pow(((Math.cbrt(Math.pow(2 * (Math.cos(x[j] - 0.5)),2)  + 1) / 2) / 3 ),Math.log(Math.sqrt(Math.acos((x[j] + 4) / 14)))) ;
            }
        }

        //Пункт 4.
        for (int i = 0; i < 12; i++){
             for (int j = 0; j < 16; j++){
                  System.out.print(String.format("%7.3f",arr[i][j]));


             }
             System.out.println();
        }












    }
}
