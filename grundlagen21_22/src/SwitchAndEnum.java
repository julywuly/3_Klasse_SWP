public class SwitchAndEnum {

    static void wochenTagSwitch(int tag) {
        String tagStr = "";
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
                tagStr = "kein gültiger Tag!";
        }
        System.out.println(tagStr);
    }

    enum WOCHENTAG {MO, DI, MI, DO, FR, SA, SO}


    static void wochenTagSwitch(WOCHENTAG w) {
        String tagStr = "";
        switch (w) {
            case MO:
                tagStr = "Montag";
                break;
            case DI:
                tagStr = "Dienstag";
                break;
            case MI:
                tagStr = "Mittwoch";
                break;
            case DO:
                tagStr = "Donnerstag";
                break;
            case FR:
                tagStr = "Freitag";
                break;
            case SA:
                tagStr = "Samstag";
                break;
            case SO:
                tagStr = "Sonntag";
                break;
            default:
                tagStr = "kein gültiger Tag!";
        }
        System.out.println(tagStr);
    }

    static void wochenTagSwitch(String tag) {
        String tagStr = "";
        switch (tag) {
            case "MO":
                tagStr = "Montag";
                break;
            case "DI":
                tagStr = "Dienstag";
                break;
            case "MI":
                tagStr = "Mittwoch";
                break;
            case "DO":
                tagStr = "Donnerstag";
                break;
            case "FR":
                tagStr = "Freitag";
                break;
            case "SA":
                tagStr = "Samstag";
                break;
            case "SO":
                tagStr = "Sonntag";
                break;
            default:
                tagStr = "kein gültiger Tag!";
        }
        System.out.println(tagStr);
    }


    public static void main(String[] args) {
        wochenTagSwitch(2);

        WOCHENTAG w = WOCHENTAG.MI;
        wochenTagSwitch(w);

        wochenTagSwitch("DI");
    }

}

