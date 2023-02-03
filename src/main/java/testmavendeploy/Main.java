package testmavendeploy;

import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;

public class Main {

    public static void main(final String... args) {
        AnsiConsole.systemInstall();
        AnsiConsole.systemUninstall();
        AnsiConsole.systemInstall();
//        System.out.println(ansi().a("\u2514\u2500"));
        System.out.println("\u2514\u2500");
    }

}
