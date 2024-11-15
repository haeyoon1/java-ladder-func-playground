package view;

import java.util.Scanner;

public class InputView {

    public static final Scanner scanner = new Scanner(System.in);

    public static int getLadderWidth(){
        System.out.println("사다리의 넓이는 몇 개인가요?");
        return scanner.nextInt();
    }

    public static int getLadderHeight(){
        System.out.println("사다리의 높이는 몇 개인가요?");
        return scanner.nextInt();
    }
}
