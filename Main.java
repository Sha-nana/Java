public class Main {

    public static double calculate(short k, float x) { //вычисление формул
    return switch (k) {
        case 6 -> Math.pow(
            Math.pow(
                Math.pow(x, 3 * x),
                Math.pow(x, (x + 1) / x) * (4 + Math.pow(0.5 / (Math.PI - x), 3))
            ) / 3, 3
        );
        
        case 4, 8, 10, 12, 18, 20 -> Math.pow((1.0 / 3.0) * (1 - (Math.atan(Math.cos(x)))), 2);
    
        default -> Math.tan(Math.cos(Math.pow(x / ((1 - x) / 2), 3)));
    }; 
}

    public static void printMatrix(double [][] t){ // результат массив в формате с пятью знаками после запятой
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%12.6g", t[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        short[] k = new short[12]; //одномерный массив k типа short
        for ( int i = 1; i < k.length; i++){
            k[i] = (short) (24 - 2 * i);
        }

        float[] x = new float[13]; 

        for (int i=0; i< x.length; i++){
            x[i] = (float)(Math.random()*24 -13); //одномерный массив x типа float
        }

        double[][] t = new double[12][13];    //двумерный массив t размером 12x13

        for (int i=0; i < k.length; i++){
             for (int j=0; j < x.length; j++){
                t[i][j] = calculate(k[i], x[j]); 

                
             }
        }
                
       
            printMatrix(t);
    }
}
        

  



