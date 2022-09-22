package switchundenum;

public class SwitchUndEnum01 {
    public static void main(String[] args) {
        monatSwitch(11);

    }

    static void monatSwitch(int monat) {
        String monatStr;
        switch (monat) {
            case 1:
                monatStr = "Januar";
                break;
            case 2:
                monatStr = "Februar";
                break;
            case 3:
                monatStr = "März";
                break;
            case 4:
                monatStr = "April";
                break;
            case 5:
                monatStr = "Mai";
                break;
            case 6:
                monatStr = "Juni";
                break;
            case 7:
                monatStr = "Juli";
                break;
            case 8:
                monatStr = "August";
                break;
            case 9:
                monatStr = "September";
                break;
            case 10:
                monatStr = "Oktober";
                break;
            case 11:
                monatStr = "November";
                break;
            case 12:
                monatStr = "Dezember";
                break;
            default:
                monatStr = "kein gültiger Monat";
        }
        System.out.println(monatStr);
    }

}

