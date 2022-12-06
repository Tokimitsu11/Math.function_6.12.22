import java.util.Random;
import java.util.Scanner;

public class Main {

// План занятия
    //Random
    //Math и математические операторы
    //Практика
// Теория
    //Random - класс для генерации ПСЕВДОслучайных чисел/
    //Math - класс для математических рассчётов
    // Правильный подход = 1 метод - 1 задача.
    static Random random = new Random(); //global object class Random
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int [] arr1 = createArray(50, 30);
        printArray(arr1);
        arr1 = sortArr(arr1); //сортировка по методу sortArr, который ниже
        printArray(arr1);

        while (true){  //Endless cycle classic
            System.out.println("working");
            System.out.println("Enter operation: \n" + "multiply - *\n" + "Divide - /\n" + "power - ^\n" +
                    "Sqrt - S\n" + "Exit - e \n"); //варианты
            char ch = scanner.next().charAt(0); //считываем
        if(ch == '*') {
            System.out.println("Enter first number");
            int i = scanner.nextInt();                  //обработка ввода
            System.out.println("Enter second number");
            int i1 = scanner.nextInt();
            multiply(i, i1);
            } else if(ch == '/') {
            System.out.println("Enter first number");
            int i = scanner.nextInt();                  //обработка ввода
            System.out.println("Enter second number");
            int i1 = scanner.nextInt();
            div(i, i1);
          } else if(ch == 'S') {
            System.out.println("Enter your number");
            int i = scanner.nextInt();                  //обработка ввода
            sqrt(i);
        }else if(ch == '^') {
            System.out.println("Enter first number");
            int i = scanner.nextInt();                  //обработка ввода
            System.out.println("Enter second number");
            int i1 = scanner.nextInt();
            power(i, i1);
        } else if(ch == 'e') {
            System.out.println("Thank you!");
            break;
        }
    }
    }

    private static void sqrt(int i) {
        System.out.println("square root = " + Math.sqrt(i));

    }

    private static void power(int i, int i1) {
        System.out.println("powered = " + Math.pow(i, i1));

    }

    private static void div(int i, int i1) {
        System.out.println("divided = " + i/i1);

    }

    private static void multiply(int i, int i1) {
        System.out.println("multiplied = " + i*i1);
    }







    // сортировка пузырьком
    private static int[] sortArr(int[] arr) {

        int temp; //вспомогальная переменная которая будет зранить в себе значение замененной переменной
        for (int i = 0; i <arr.length ; i++) { //перебираем массив
            for (int j = 0; j < arr.length ; j++) { //сравниваем каждый элемент со всеми элементами
                if(arr[i] < arr[j]){ // Сравниваем элемент с каждым элементом, если удовл. - делаем замену
                    temp = arr[i]; // Запоминаем переносимое значение
                    arr[i] = arr[j]; //Меняем значение
                    arr[j] = temp; // Записываем запомненное значение в новую позицию.
            }
            }
        } return arr; //возвращ. сортиров массив
}


    // Метод который выводит массив на экран.
    public static void printArray(int[] arr) { //Принимаем массив
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " "); // Выводим элемент на консоль с пробелом
        }
        System.out.println(); // в конце вывода переходим на новую (пропускаем) строку
    }

// creating a method for random numbers generation in array. giving it size and arr of rand.nums
    public static int[] createArray(int size, int bound) {
        int[] arr = new int[size];  //создаем масив указанного размера size.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound); //случайные числа в указанном диапазоне.
        } return arr;
}

// While(условие) { тело цикла }



}