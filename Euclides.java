import java.util.Random;
public class Euclides{
    static int euclides(int x, int y){
        if(y>x){
            int aux = x;
            x = y;
            y = aux;
        }
        int divisor=y, dividendo=x, auxdivisor=divisor;
        while(divisor>0){
            auxdivisor=divisor;
            divisor=dividendo%divisor;
            dividendo=auxdivisor;
        }
        return auxdivisor;
    }

    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(1000) + 1, y = random.nextInt(1000) + 1;
        System.out.println("O maior múltiplo comum entre "+x+" e "+y+" é "+euclides(x, y));
    }
}