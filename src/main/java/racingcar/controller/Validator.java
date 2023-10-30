package racingcar.controller;

import java.util.HashSet;
import java.util.List;

public class Validator {
    public static void validateNames(List<String> carNames) {
        validateBlank(carNames);
        validateLength(carNames);
        validateUnique(carNames);
    }

    private static void validateBlank(List<String> carNames) {
        if (carNames.stream().anyMatch(String::isBlank)) {
            throw new IllegalArgumentException("공백만 입력할 수 있습니다.");
        }
    }

    private static void validateLength(List<String> carNames) {
        if (carNames.stream().anyMatch(name -> name.length() > 5)) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }
    }

    private static void validateUnique(List<String> carName) {
        if (carName.size() != new HashSet<>(carName).size()) {
            throw new IllegalArgumentException("중복이 존재합니다.");
        }
    }

    public static void validateNumeric(String attemptCount) {
        if (!attemptCount.matches("^[0-9]+$")) {
            throw new IllegalArgumentException("문자는 입력할 수 없습니다.");
        }
    }
}
