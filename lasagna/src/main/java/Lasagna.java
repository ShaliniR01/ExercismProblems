public class Lasagna {
    
    public int expectedMinutesInOven(){
        int expectedOvenTime=40;
        return expectedOvenTime;
    }

    public int remainingMinutesInOven(int actualMinutes){
        int remainingMinutes = expectedMinutesInOven() - actualMinutes;
        return remainingMinutes;
    }

    public int preparationTimeInMinutes(int numberOfLayers){
        int layerTime=2;
        int preparationTime = numberOfLayers * layerTime;
        return preparationTime;
    }

    public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutes){
        int totalTime = preparationTimeInMinutes(numberOfLayers) + numberOfMinutes;
        return totalTime;
    }
}
