import java.io.Console;
import java.util.*;

public class Encrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your word (write \"q\" to stop): ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }

            ArrayList<Integer> controlArray = new ArrayList();
            HashMap<Integer, Character> outputMap = new HashMap();
            TreeMap sortedMap = new TreeMap();

            String output = "";

            for (int i = 0; i < input.length(); i++) {
                controlArray.add(i);
            };

            Collections.shuffle(controlArray, new Random(20));

            for (int j = 0; j < input.length(); j++) {
                outputMap.put(controlArray.get(j), input.charAt(j));
            }

            for (int k = 0; k < input.length(); k++) {
                output += outputMap.get(k);
            }

            System.out.println(output);
        }
    }
}
