package Project2;

import java.util.ArrayList;

public class Medals {

    /*
    Create a program that will print a table of medal winner counts with row totals
    I have provided the initial values needed, all you need to do is put the logic for printing the table
    The table should look like this:

         Country   Gold    Silver    Bronze  Total
         Canada       1       0       1       2
          China       1       1       0       2
        Germany       0       0       1       1
          Korea       1       0       0       1
          Japan       0       1       1       2
         Russia       0       1       1       2
  United States       1       1       0       2

  

    After that create an ARRAYLIST that is the total of each medal awarded (IE 4 gold, 4 silver, 5 bronze)
    print the total of each medal 
    Hints:
        int rows = counts.length; (get the rows)
        int cols = counts[0].length; (gets the columns)   
        counts[j][i] in a nested for loop would get you the totals of the column  
        Gold    Silver    Bronze
        4       4         5



    FINAL TABLE SHOULD LOOK LIKE THIS:

        Country    Gold    Silver    Bronze  Total
         Canada       1       0       1       2
          China       1       1       0       2
        Germany       0       0       1       1
          Korea       1       0       0       1
          Japan       0       1       1       2
         Russia       0       1       1       2
  United States       1       1       0       2
          Total    Gold    Silver    Bronze   X
                      4       4       5
    */

  
    public static void main (String[] args) {
        // Initialize the medal counts
        int[][] counts = {
                {1, 0, 1},
                {1, 1, 0},
                {0, 0, 1},
                {1, 0, 0},
                {0, 1, 1},
                {0, 1, 1},
                {1, 1, 0}
        };
        
        // Initialize the country names
        String[] countries = {
                "Canada",
                "China",
                "Germany",
                "Korea",
                "Japan",
                "Russia",
                "United States"
        };
        
        // Print the medal table header
        System.out.printf("%-15s%-8s%-8s%-8s%-8s%n", "Country", "Gold", "Silver", "Bronze", "Total");
        
        // Print the medal table rows
        int totalGold = 0;
        int totalSilver = 0;
        int totalBronze = 0;
        for (int i = 0; i < counts.length; i++) {
            int gold = counts[i][0];
            int silver = counts[i][1];
            int bronze = counts[i][2];
            int total = gold + silver + bronze;
            totalGold += gold;
            totalSilver += silver;
            totalBronze += bronze;
            System.out.printf("%-15s%-8d%-8d%-8d%-8d%n", countries[i], gold, silver, bronze, total);
        }
        // Print the medal counts
System.out.printf("%-15s%-8d%-8d%-8d%-8s%n", "Total", totalGold, totalSilver, totalBronze, "X");

// Print the medal counts header
System.out.printf("%-15s%-8s%-8s%-8s%n", "", "Gold", "Silver", "Bronze");
// Calculate the medal counts array
int[] medalTotals = new int[3];
for (int i = 0; i < counts[0].length; i++) {
    int colTotal = 0;
    for (int j = 0; j < counts.length; j++) {
        colTotal += counts[j][i];
    }
    medalTotals[i] = colTotal;
}
// Print the medal counts rows
System.out.printf("%-15s%-8d%-8d%-8d%n", " ", medalTotals[0], medalTotals[1], medalTotals[2]);
}
}

        // TODO
        // Print countries, counts, and row totals (IE total medals by country)
        // for formatting use these printf statements
        // System.out.printf("%15s", countries[i]);
        // System.out.printf("%8d", counts[i][j]);
        // System.out.printf("%8d\n", total);
        // These print statements are just for reference for the table above
        // if you want to change them you can
        // HINTS:
        // You will need a nested for loop 
        // (IE for i less than COUNTRIES, and for j < MEDALS)
        // Process the ith row
        // Print each row element and update the row total
        // Display the row total and print a new line



        // Display the total medals of each medal class
        // First create an Integer ArrayList called medalCounts 
        // your rows are counts.length
        // your columns are counts[0].length

        // Make a for loop that will calculate the sum for each column 
        // hint: make a temp variable for the sum and then at the end of the for loop add each sum of
        // each column to the ArrayList medalCounts
        // print the Array list and chart to look like this
        // Gold    Silver    Bronze
        // 4       4         5
     
    




