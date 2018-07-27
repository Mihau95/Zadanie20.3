public class Number {

    public String squareOfSums (){
        int sum1 = 0;

        for (int x = 1; x <= 100; x++){
            sum1 += x;
        }
        return Integer.toString(sum1*sum1);
    }

    public String sumOfSquares(){
        int sum2 = 0;

        for (int x = 1; x <= 100; x++){
            sum2 += x*x;
        }return Integer.toString(sum2);
    }

    public String multiply(){

        int sum1 = 0;
        int sum2 = 0;

        for (int x = 1; x <= 100; x++){
            sum1 += x;
            sum2 += x*x;
        }
        return Integer.toString(sum1*sum1 - sum2);
    }

    public static void main(String[] args) {
       Number number = new Number();
       System.out.println("Kwadrat sumy 100 pierwszych liczb naturalnych wynosi: " + number.squareOfSums());
       System.out.println("Suma kwadratów 100 pierwszych liczb naturalnych wynosi: " + number.sumOfSquares());
       System.out.println("Różnica sumy kwadratów i kwadrat różnicy 100 pierwszych liczb naturalnych wynosi: " +
               number.multiply());
    }
}
