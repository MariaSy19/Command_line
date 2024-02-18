import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Terminal terminal = new Terminal();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equals("exit") )
            {
                break;
            }

            terminal.histComm.add(input);

            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            String[] arguments = new String[inputParts.length - 1];
            System.arraycopy(inputParts, 1, arguments, 0, arguments.length);

            terminal.chooseCommandAction(command, input);
        }
        scanner.close();
    }
}
