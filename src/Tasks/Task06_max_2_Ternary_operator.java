package Tasks;

public class Task06_max_2_Ternary_operator {

    public static void main(String[] args) {

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int result = (number1 > number2) ? number1 : number2;
        System.out.println("First number is: "+ number1 + '\n' + "Second number is: "+number2+ '\n'+ "max number is: "+ result);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int number1 = scanner.nextInt();
//        System.out.println("First number is: "+ number1);
//        System.out.println("Enter the second number: ");
//        int number2 = scanner.nextInt();
//        System.out.println("Second number is: " + number2);
//        int result = (number1 > number2) ? number1 : number2;
//        System.out.println("Max number is: "+ result);
//


    }
}
