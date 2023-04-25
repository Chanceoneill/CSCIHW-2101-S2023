package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
      // q1
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        System.out.println("The tenth element of the array nums is: " + nums.get(9));
        nums.set(4, 99);
        nums.set(12,15);
        nums.set(1,6);
        nums.set(8, nums.get(12) + nums.get(1));
   // q2
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println("Days of the week:");
        for (String day : days) {
            System.out.println(day);
        }
        System.out.println("Days of the week that we have class:");
        System.out.println(days.get(1));
        System.out.println(days.get(3));
        Collections.rotate(days, -1);
// q3
        ArrayList<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int num;
            do {
                System.out.print("Enter a number (0  to exit): ");
                num = scanner.nextInt();
                if (num != 0) {
                    numbers.add(num);
                }
            } while (num != 0);
            if (numbers.size() > 0) {
                int max = Collections.max(numbers);
                int min = Collections.min(numbers);
                System.out.println("Max: " + max);
                System.out.println("Min: " + min);
            }
            Collections.sort(numbers);
            System.out.println("Sorted numbers: " + numbers);
            int size = numbers.size();
            if (size % 3  != 0) {
                int needed = 3 - (size % 3);
                for (int i = 0; i < needed; i++) {
                    System.out.print("Enter a number: ");
                    num = scanner.nextInt();
                    numbers.add(num);
                }
            }
            size = numbers.size();
            if (size % 3 ==0) {
                System.out.println("Matrix:");
                for (int i = 0; i < size; i++) {
                    System.out.print(numbers.get(i));
                    if ((i + 1) % 3 == 0) {
                        System.out.println();
                    } else {
                        System.out.print("\t");
                    }
                }
            }
        }
        }
    }

   

    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    // b) Output the value of the tenth element of the array nums.
    // c) Set the value of the 5th element of the array nums to 99.
    // d) set the value of the 13th element to 15
    // d) set the value of the 2nd element to 6
    // d) Set the value of the 9th element of the array nums to the sum of the 13th and 2nd elements of the array nums.
    


         
    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    // b) output each of the days of the week
    // c) output the days of the week that we have class 
    // d) change the arrayList to start on Sunday


    // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    // b) return the largest and smallest number
    // c) return the ArrayList sorted smallest to largest
    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 
    // Hint 1: use collections sort to sort the numbers 
    // Hint 2: you can see if the size of the array list is divisible by 3 by running:
    //  numbers.size()%3==0
    // Hint 3: You can use this logic to print the array list in a 3x3 pattern once its created:
    // for(int i=0;i<numbers.size();i++)
    //     {
    //         System.out.print(numbers.get(i)+" ");
    //         if((i+1)%3==0)
    //         {
    //             System.out.println();
    //         }
    //     }
        
   







   

