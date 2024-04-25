package liendo_alphatech;

import java.util.Scanner;

public class PatternIO implements PatternIOInterface {
    private Scanner sc;
    private PatternController pc;

    public PatternIO(PatternController arc) {
        this.sc = new Scanner(System.in);
        this.pc = arc;
    }

    public void askPatternLength() {
        System.out.println("Hello, welcome to the Pattern Generator App." +
                "\nHow wide do you want the pattern to be?" +
                "\nChoose from 2 to 26");
        Integer pl = askNumber();
        pc.setPatternLength(pl);
    }


    private Integer askNumber() {
        int num;
        while (true) {
            try {
                num = sc.nextInt();
                if (num < 2 || num > 26) throw new IndexOutOfBoundsException();
                return num;
            } catch (IndexOutOfBoundsException e){
                System.out.println("Choose from 2 to 26 characters.");
            } catch (Exception e) {
                System.out.println("Wrongly formatted number. Try again.");
            } finally {
                sc.nextLine();
            }
        }
    }

    public void showPattern(String str) {
        System.out.println(str);
    }
}
