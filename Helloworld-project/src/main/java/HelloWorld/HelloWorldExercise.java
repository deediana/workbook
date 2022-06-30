package HelloWorld;

/**
 * Hello world!
 *
 */
public class HelloWorldExercise {
    public static void main( String[] args ) {

        int[] arr ={2,15,21,90,35,7};

        HelloWorldExercise app = new HelloWorldExercise();
        app.printHelloWorld(arr);

    }

    public void printHelloWorld (int[] arr){

        for(int number : arr){
            if((number%5==0) && (number%7==0)){
                System.out.println("Hello World");
            }else if(number%7==0){
                System.out.println("World");
            }else if(number%5==0){
                System.out.println("Hello");
            }


        }
    }
}
