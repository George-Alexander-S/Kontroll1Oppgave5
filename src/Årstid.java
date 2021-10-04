import static javax.swing.JOptionPane.*;

public class Årstid {
    public static void main(String[] args) {
        String måned = showInputDialog("Tast inn måned (kun SMÅ bokstaver: ");
        /*if (måned.equals("juni")) {
            System.out.println("Det er sommer");
        }
        if (måned.equals("juli")) {
            System.out.println("Det er sommer");
        }
        if (måned.equals("august")) {
            System.out.println("Det er sommer");
        }
        if (måned.equals("september")) {
            System.out.println("Det er høst");
        }
        if (måned.equals("oktober")) {
            System.out.println("Det er høst");
        }
        if (måned.equals("november")) {
            System.out.println("Det er høst");
        }
        if (måned.equals("desember")) {
            System.out.println("Det er vinter");
        }
        if (måned.equals("januar")) {
            System.out.println("Det er vinter");
        }
        if (måned.equals("februar")) {
            System.out.println("Det er vinter");
        }
        if (måned.equals("mars")) {
            System.out.println("Det er vår");
        }
        if (måned.equals("april")) {
            System.out.println("Det er vår");
        }
        if (måned.equals("mai")) {
            System.out.println("Det er vår");
        } */
        switch (måned) {
            case "juni" -> System.out.println("Det er sommer");
            case "juli" -> System.out.println("Det er sommer");
            case "august" -> System.out.println("Det er sommer");
            case "september" -> System.out.println("Det er høst");
            case "oktober" -> System.out.println("Det er høst");
            case "november" -> System.out.println("Det er høst");
            case "desember" -> System.out.println("Det er vinter");
            case "januar" -> System.out.println("Det er vinter");
            case "februar" -> System.out.println("Det er vinter");
            case "mars" -> System.out.println("Det er vår");
            case "april" -> System.out.println("Det er vår");
            case "mai" -> System.out.println("Det er vår");


        }

    }
}
