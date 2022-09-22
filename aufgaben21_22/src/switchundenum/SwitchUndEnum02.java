package switchundenum;

public class SwitchUndEnum02 {
    public static void main(String[] args) {
        MONAT m = MONAT.FEB;
        monatSwitch(m);

        monatSwitch(MONAT.MAR);
    }

    enum MONAT {JAN, FEB, MAR, APR, MAI, JUN, JUL, AUG, SEP, OKT, NOV, DEZ}


    static void monatSwitch(MONAT m) {
        String monatStr;
        switch (m) {
            case JAN:
                monatStr = "Januar";
                break;
            case FEB:
                monatStr = "Februar";
                break;
            case MAR:
                monatStr = "März";
                break;
            case APR:
                monatStr = "April";
                break;
            case MAI:
                monatStr = "Mai";
                break;
            case JUN:
                monatStr = "Juni";
                break;
            case JUL:
                monatStr = "Juli";
                break;
            case AUG:
                monatStr = "August";
                break;
            case SEP:
                monatStr = "September";
                break;
            case OKT:
                monatStr = "Oktober";
                break;
            case NOV:
                monatStr = "November";
                break;
            case DEZ:
                monatStr = "Dezember";
                break;
            default:
                monatStr = "Kein gültiger Monat";
        }
        System.out.println(monatStr);
    }

    static void monat(String MONAT) {
        String monatStr;
        switch (MONAT) {
            case "JAN":
                monatStr = "Januar";
                break;
            case "FEB":
                monatStr = "Februar";
                break;
            case "MAR":
                monatStr = "März";
                break;
            case "APR":
                monatStr = "April";
                break;
            case "MAI":
                monatStr = "Mai";
                break;
            case "JUN":
                monatStr = "Juni";
                break;
            case "JUL":
                monatStr = "Juli";
                break;
            case "AUG":
                monatStr = "August";
                break;
            case "SEP":
                monatStr = "September";
                break;
            case "OKT":
                monatStr = "Oktober";
                break;
            case "NOV":
                monatStr = "November";
                break;
            case "DEZ":
                monatStr = "Dezember";
                break;
            default:
                monatStr = "kein gültiger Monat";
        }
        System.out.println(monatStr);
    }


}


