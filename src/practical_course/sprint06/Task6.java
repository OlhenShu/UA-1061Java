package practical_course.sprint06;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6 {
    public Map<String, Stream<String>> phoneNumbers(List<Stream<String>> list) {

        return list.stream()
                .filter(Objects::nonNull)
                .flatMap(Function.identity())
                .filter(Objects::nonNull)
                .map(s -> s.replaceAll("\\W", ""))
                .map(str -> str.length() == 10 ? str : str.length() < 6 ? "err".concat(str) : "loc".concat(str))
                .distinct()
                .sorted()
                .collect(Collectors.toMap(el -> el.substring(0, 3),
                        el -> Stream.of(el.substring(3)),
                        Stream::concat));

    }
}
