package lecture04.atm;

public class ATM {

    private static final int MAX_AMOUNT = 800;

    private static final int NOTE_20 = 20;
    private static final int NOTE_50 = 50;
    private static final int NOTE_100 = 100;

    private int note20Count = 0;
    private int note50Count = 0;
    private int note100Count = 0;

    public ATM(int note20Count, int note50Count, int note100Count) {
        this.note20Count = note20Count;
        this.note50Count = note50Count;
        this.note100Count = note100Count;
    }

    public boolean getCache(int amount) {
        int sum = 0;
        if (isValidAmount(amount)) {
            for (int count100 = getAvailableNote(amount, NOTE_100); count100 >= 0; count100--) {
                for (int count50 = getAvailableNote(amount, NOTE_50); count50 >= 0; count50--) {
                    for (int count20 = getAvailableNote(amount, NOTE_20); count20 >= 0; count20--) {
                        sum = count100 * NOTE_100 + count50 * NOTE_50 + count20 * NOTE_20;
                        if (sum == amount) {
                            System.out.println(
                                    "Note 100:" + count100 +
                                    " Note 50:" + count50 +
                                    " Note 20:" + count20
                            );

                            note100Count -= count100;
                            note50Count -= count50;
                            note20Count -= count20;

                            return true;
                        }
                    }
                }
            }
        } else if (isEmptyAtmSafe()) {
            System.out.println("There is no available notes");
        } else {
            System.out.println("Impossible process invalid amount! Amount:" + amount);
        }
        return false;
    }

    public int getAvailableNote(int amount, int note) {

        int noteCount = 0;

        switch (note) {
            case NOTE_20: noteCount = amount / NOTE_20;break;
            case NOTE_50: noteCount = amount / NOTE_50;break;
            case NOTE_100: noteCount = amount / NOTE_100;break;
        }

        return noteCount > getNoteCount(note) ? getNoteCount(note) : noteCount;
    }

    private int getNoteCount(int note) {
        switch (note) {
            case NOTE_20: return note20Count;
            case NOTE_50: return note50Count;
            case NOTE_100: return note100Count;
        }

        return 0;
    }

    private boolean isEmptyAtmSafe() {
        return note20Count == 0 && note50Count == 0 && note100Count == 0;
    }

    public boolean isValidAmount(int amount) {
        return amount <= MAX_AMOUNT && amount >= NOTE_20 && amount % 10 == 0;
    }
}