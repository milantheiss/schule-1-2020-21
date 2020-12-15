import java.io.IOException;
public class StartEchoClient {
  public static void main(String[] args) throws IOException {
    EchoClient client = new EchoClient("10.190.4.35",1234);
  }
}
