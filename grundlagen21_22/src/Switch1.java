public class Switch1 {

    static void wochenTagSwitch(int tag) {
        String tagStr;
        switch (tag) {
            case 1:
                tagStr = "Montag";
                break;
            case 2:
                tagStr = "Dienstag";
                break;
            case 3:
                tagStr = "Mittwoch";
                break;
            case 4:
                tagStr = "Donnerstag";
                break;
            case 5:
                tagStr = "Freitag";
                break;
            case 6:
                tagStr = "Samstag";
                break;
            case 7:
                tagStr = "Sonntag";
                break;
            default:
                tagStr = "Falsche Nummer";

        }
        System.out.print(tagStr);

    }

    public static void main(String[] args) {
        wochenTagSwitch(2);
    }
}
