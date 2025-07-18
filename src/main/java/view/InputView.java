package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public static final Scanner scanner = new Scanner(System.in);

    public static List<String> inputPlayerNames() { // 참여자 이름 입력
        System.out.println("참여할 사람 이름을 입력하세요~ (이름은 쉼표(,)로 구분하세요)");

        String nameList = scanner.nextLine();
        return Arrays.asList(nameList.trim().split(","));
    }

    public static List<String> inputGamePrice() { // 실행 결과 입력
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");

        String nameList = scanner.nextLine();
        return Arrays.asList(nameList.trim().split(","));
    }

    public static int inputLadderHeight() { // 사다리 높이
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        String height = scanner.nextLine().trim();

        return Integer.parseInt(height);
    }

    public static String inputWhoseResult() { // 쉼표(,)로 구분된 숫자를 입력
        System.out.println("결과를 보고 싶은 사람은?");
        return scanner.nextLine();
    }
}
