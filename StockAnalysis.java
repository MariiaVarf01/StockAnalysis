import java.util.ArrayList;
import java.util.Scanner;

public class StockAnalysis {
    private static Scanner scanner = new Scanner(System.in);

    // Method to calculate the average stock price array
    public static float calculateAveragePrice(float[] stockPrices) {
        float sum = 0;
        for (float price : stockPrices) {
            sum += price;
        }
        return sum / stockPrices.length;
    }
    // Method to calculate the average stock price ArrayList
    public static float calculateAveragePriceList(ArrayList<Float> stockPrices) {
        float sum = 0;
        for (float price : stockPrices) {
            sum += price;
        }
        return sum / stockPrices.size();
    }

    // Method to find the maximum stock price in array
    public static float findMaximumPrice(float[] stockPrices) {
        float maxPrice = stockPrices[0];
        for (float price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }
    // Method to find the maximum stock price in ArrayList
    public static float findMaximumPriceList(ArrayList<Float> stockPrices) {
        float maxPrice = stockPrices.get(0);
        for (float price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to count occurrences of a specific price in Array
    public static int countOccurrences(float[] stockPrices, float targetPrice) {
        int count = 0;
        for (float price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute the cumulative sum of stock prices
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> stockPrices) {
        ArrayList<Float> cumulativeSum = new ArrayList<>();
        float sum = 0;
        for (float price : stockPrices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        return cumulativeSum;
    }
    
    // Input validation for floats
    private static float getFloatInput() {
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter specific price: ");
            }
        }
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        // Sample stock prices as array
        float[] stockPricesArray = {10.5f, 110.0f, 15.5f, 40.0f, 13.5f, 50.0f, 45.5f, 10.5f, 72.0f, 15.0f};
        // Sample stock prices as ArrayList
        ArrayList<Float> stockPricesList = new ArrayList<>();
        for (float price : stockPricesArray) {
            stockPricesList.add(price);
        }

        // Calculate average price
        float averagePriceOfArray = calculateAveragePrice(stockPricesArray);
        float averagePriceOfList = calculateAveragePriceList(stockPricesList);
        System.out.println("Average Stock Price (Array): " + averagePriceOfArray);
        System.out.println("Average Stock Price (ArrayList): " + averagePriceOfList);

        // Find maximum price
        float maxPriceOfArray = findMaximumPrice(stockPricesArray);
        float maxPriceOfArrayList = findMaximumPriceList(stockPricesList);
        System.out.println("Maximum Stock Price (Array): " + maxPriceOfArray);
        System.out.println("Maximum Stock Price (ArrayList): " + maxPriceOfArrayList);

        // Count occurrences of a specific price
        System.out.print("Enter specific price: ");
        float targetPrice = getFloatInput();

        int occurrenceCountInArray = countOccurrences(stockPricesArray, targetPrice);
        System.out.println("Occurrences of " + targetPrice + ": " + occurrenceCountInArray);

        // Compute cumulative sum
        ArrayList<Float> cumulativeSum = computeCumulativeSum(stockPricesList);
        System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSum);

        scanner.close();
    }
}
