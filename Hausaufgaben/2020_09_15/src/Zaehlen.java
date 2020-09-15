public class Zaehlen {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            int j = i+1;
            System.out.print(j);
            if (i!=9){
                System.out.print(", ");
            }
        }
    }
}
