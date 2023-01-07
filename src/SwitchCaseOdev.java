public class SwitchCaseOdev {

    public static void main(String[] args) {

        String day = "Perşembe";

        switch (day) {
            case "Pazartesi":
                System.out.println("Bugün günlerden pazartesi");
                break;
            case "Salı":
                System.out.println("Bugün günlerden salı");
                break;
            case "Çarşamba":
                System.out.println("Bugün günlerden çarşamba");
                break;
            case "Perşembe":
                System.out.println("Bugün günlerden perşembe");
                break;
            case "Cuma":
                System.out.println("Bugün günlerden cuma");
                break;
            case "Cumartesi":
                System.out.println("Bugün günlerden cumartesi");
                break;
            case "Pazar":
                System.out.println("Bugün günlerden pazar");
                break;
            default:
                System.out.println("Böyle bir gün tanımı bulunmamaktadır.");


        }

    }

}
