package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public static final Scanner scanner = new Scanner(System.in);

    public static List<String> playerName(){
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");

        String nameList = scanner.nextLine();
        List<String> players = Arrays.asList(nameList.split(","));

        return players;
    }
    public static int getLadderWidth(){
        System.out.println("사다리의 넓이는 몇 개인가요?");
        return scanner.nextInt();
    }

    public static int getLadderHeight(){
        System.out.println("사다리의 높이는 몇 개인가요?");
        return scanner.nextInt();
    }
}
