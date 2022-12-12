import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Random;


public class array {
    
    public void ausgabe(int array[]){

        for(int i=0; i<array.length; i++) {   
            
            System.out.println(array[i]);
            
        }

        System.out.println(Arrays.toString(array));

    }

    public void füllen(int array[]){

    // Werte 1 bis 100 festlegen (random)

    

     for(int i=0; i<array.length; i++){

        Random random = ThreadLocalRandom.current();
        int number = 1 + random.nextInt(100);

        array[i] = number;

        

        }

    }
}
