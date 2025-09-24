
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeekCounts = new int[] { 0, 2, 5, 3, 7, 8, 4 };
        return lastWeekCounts;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
        return;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds: this.birdsPerDay) {
            if(birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for(int i = 0; i < numberOfDays && i < this.birdsPerDay.length; i++) {
            sum += this.birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int birds: this.birdsPerDay) {
            if(birds >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
