package racingcar.view;

public class OutputView {
    public static void displayCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void displayAttemptCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void displayGameResultMessage() {
        System.out.println("실행 결과");
    }

    public static void displayGameResult(String gameResult) {
        System.out.println(gameResult);
    }
}
