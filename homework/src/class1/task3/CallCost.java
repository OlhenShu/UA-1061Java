package class1.task3;

public class CallCost {
    public static double findCallCost(final double costPerMinute, final int duration) {//duration is measured in seconds
        if (costPerMinute < 0 || duration < 0) {
            throw new IllegalArgumentException("Either costPerMinute or duration is inappropriate");
        }
        return costPerMinute / 60 * duration; //in that case when each second is counted
    }
}