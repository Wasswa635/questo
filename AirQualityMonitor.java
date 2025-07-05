java
import java.util.*;

public class AirQualityMonitor {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random rand = new Random();
        int hazardousDays = 0;

        // Generate 30 random AQI readings
        for (int i = 0; i < 30; i++) {
            aqiReadings[i] = rand.nextInt(300) + 1;

            if (aqiReadings[i] > 200) {
                hazardousDays++;
            }
        }

        // Display the readings
        System.out.println("AQI Readings: " + Arrays.toString(aqiReadings));

        // Sort to find the median
        Arrays.sort(aqiReadings);
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[14] + aqiReadings[15]) / 2.0;
        } else {
            median = aqiReadings[aqiReadings.length / 2];
        }

        // Output results
        System.out.println("Median AQI: " + median);
        System.out.println("Hazardous days (AQI > 200): " + hazardousDays);
    }
}
