public class AAAA {
    public static void main(String[] args) {
        java.util.regex.Pattern.compile("(a+)+").matcher(
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+
            "aaaaaaaaaaaaaaa!").matches(); // Sensitive

            java.util.regex.Pattern.compile("(h|h|ih(((i|a|c|c|a|i|i|j|b|a|i|b|a|a|j))+h)ahbfhba|c|i)*").matcher(
            "hchcchicihcchciiicichhcichcihcchiihichiciiiihhcchi"+
            "cchhcihchcihiihciichhccciccichcichiihcchcihhicchcciicchcccihiiihhihihihi"+
            "chicihhcciccchihhhcchichchciihiicihciihcccciciccicciiiiiiiiicihhhiiiihchccch"+
            "chhhhiiihchihcccchhhiiiiiiiicicichicihcciciihichhhhchihciiihhiccccccciciihh"+
            "ichiccchhicchicihihccichicciihcichccihhiciccccccccichhhhihihhcchchihih"+
            "iihhihihihicichihiiiihhhhihhhchhichiicihhiiiiihchccccchichci").matches();
             // Sensitive
    }

}
