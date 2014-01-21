import java.lang.*;
import java.io.Console;

public class clear {

    public void ClearConsole() {
        Console console = System.console();       
        if (console == null)
                System.out.println("Couldn't get Console object !");
        console.clear();
}

public static void main(String[] args) {
        new clear().ClearConsole();
}
}
