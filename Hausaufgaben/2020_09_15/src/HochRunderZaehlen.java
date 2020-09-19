public class HochRunderZaehlen {
    public static void main(String[] args) {
        int zahl = 0;
        for (int i = 0; i < 19; i++){
            if(i < 10){
                zahl++;
            }
            else if (i >= 10){
                zahl--;
            }
            System.out.print(zahl + " ");
        }
    }
}
