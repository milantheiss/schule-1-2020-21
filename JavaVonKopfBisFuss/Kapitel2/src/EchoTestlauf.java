public class EchoTestlauf {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x<4){
            e1.hello();
            e1.zähler = e1.zähler + 1;
            if (x==3){
                e2.zähler = e2.zähler + 1;
            }
            if (x>0){
                e2.zähler = e2.zähler + e1.zähler;
            }
            x = x + 1;
        }
        System.out.println(e2.zähler);
    }
}

class Echo{
    int zähler = 0;
    void hello(){
        System.out.println("Halloooo... ");
    }
}
