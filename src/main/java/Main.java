
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//  Laboratory 2 for ITU || ISD-11 || Voznyuk Kostya   //
        final int dva = 2;
        int numbers;
        int two = 0;
        int three = 0;
        int five = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum5 = 0;
        for (numbers=1;numbers<=1000;numbers++) {             // число от 1 до 1000 //
           if (numbers % dva == 0) {                         //если число делиться на 2 то добавляем +1 к кол-ву 2ек//
               two++;
               sum2 = (sum2+numbers);                          //если число делиться на 2 то к сумме чисел на два добавляем это число//
               if (sum2>100000) {
                   System.out.println("Cумма 2ек: "+sum2);                  //если сумма чисел больше 100.000 то выводим значение на экран//
               } else {                                                      // задаем условие: если число меньше 100.000 то проверяем равняется ли оно---> //
                   switch (sum2) {
                       case 60: {                                               // 60? Выводим true //
                           System.out.println("True");
                       }break;
                       case 70: {                                               // 70? Выводим true //
                           System.out.println("True");
                       }break;
                       case 80: {                                               // 80? Выводим true //
                           System.out.println("True");
                       }break;
                       case 90: {                                               // 90? Выводим true //
                           System.out.println("True");
                       }break;
                       case 100: {                                               // 100? Выводим true //
                           System.out.println("True");
                       }break;
                       default: {                                            // Если ни одно условие не выполняется false //
                           System.out.println("False");
                       }break;
                   }
               }
           }
           if (numbers % 3 ==0 ) {                         //если число делиться на 3 то добавляем +1 к кол-ву 3ек//
               three++;
               sum3 = (sum3+numbers);                          //если число делиться на 3 то к сумме чисел на два добавляем это число//
               if (sum3>100000) {
                   System.out.println("Cумма 3ек: "+sum3);                 //если сумма чисел больше 100.000 то выводим значение на экран//
               } else {                                                      // задаем условие: если число меньше 100.000 то проверяем равняется ли оно---> //
                   switch (sum3) {
                       case 9: {                                               // 9? Выводим true //
                           System.out.println("True");
                       }break;
                       case 84: {                                               // 84? Выводим true //
                           System.out.println("True");
                       }break;
                       case 80: {                                               // 80? Выводим true //
                           System.out.println("True");
                       }break;
                       case 90: {                                               // 90? Выводим true //
                           System.out.println("True");
                       }break;
                       case 100: {                                               // 100? Выводим true //
                           System.out.println("True");
                       }break;
                       default: {                                            // Если ни одно условие не выполняется false //
                           System.out.println("False");
                       }break;
                   }
               }
           }
           if (numbers % 5 ==0 ) {                          //если число делиться на 5 то добавляем +1 к кол-ву 5ек//
               five++;
               sum5 = (sum5+numbers);                        //если число делиться на 5 то к сумме чисел на два добавляем это число//
               if (sum5>100000) {
                   System.out.println("Cумма 5ек: "+sum5);                 //если сумма чисел больше 100.000 то выводим значение на экран//
               } else {                                                      // задаем условие: если число меньше 100.000 то проверяем равняется ли оно---> //
                   switch (sum5) {
                       case 50: {                                               // 50? Выводим true //
                           System.out.println("True");
                       }break;
                       case 70: {                                               // 70? Выводим true //
                           System.out.println("True");
                       }break;
                       case 80: {                                               // 80? Выводим true //
                           System.out.println("True");
                       }break;
                       case 90: {                                               // 90? Выводим true //
                           System.out.println("True");
                       }break;
                       case 105: {                                               // 105? Выводим true //
                           System.out.println("True");
                       }break;
                       default: {                                            // Если ни одно условие не выполняется false //
                           System.out.println("False");
                       }break;
                   }
               }
           }
        }
        for (int cal2 =0;cal2<two;cal2++) {                                           // Выводим столько раз кол-во сколько самого количества //
            System.out.println("Кол-во чисел делящихся на 2: " + two);
        }
        for (int cal3 =0;cal3<three;cal3++) {
            System.out.println("Кол-во чисел делящихся на 3: " + three);             // Выводим столько раз кол-во сколько самого количества //
        }
        for (int cal5 =0;cal5<five;cal5++) {
            System.out.println("Кол-во чисел делящихся на 5: " + five);              // Выводим столько раз кол-во сколько самого количества //
        }
        System.out.println("Cумма чисел которые деляться на 2: " + sum2);
        System.out.println("Cумма чисел которые деляться на 3: " + sum3);
        System.out.println("Cумма чисел которые деляться на 5: " + sum5);
        System.out.println("Добавьте номер вашей программы(введите в консоль три любых числа)");
        Scanner num_one1 = new Scanner(System.in);                                                 // Cоздаем сканеры //
        Scanner num_two2 = new Scanner(System.in);
        Scanner num_three3 = new Scanner(System.in);
        int num_one;                                                                        // Вводим переменный которые будут выводиться //
        int num_two;
        int num_three;
        num_one = num_one1.nextInt();                                                     // Берем значение которое ввели и назначаем нашим переменным //
        num_two = num_two2.nextInt();
        num_three = num_three3.nextInt();
        System.out.println("Java program:"+ num_one+"|"+num_two+"|"+num_three);          // Выводим на экран //
        int rate_my_work;
        Scanner rate = new Scanner(System.in);
        System.out.println("Rate my work:");
        rate_my_work = rate.nextInt();
        boolean thats = rate_my_work==100 ? true:false;                     // Применение торнарного оператора ;))) //
        System.out.println(thats);
    }
}
