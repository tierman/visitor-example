package pl.example.subject;

import lombok.Builder;
import lombok.Getter;
import pl.example.visitor.Visitor;

@Getter
@Builder
public class Animal implements Transportable {
    private String kind;
    private int weight;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public static Animal smallCow() {
        return Animal.builder()
                .kind("Small cow")
                .weight(50)
                .build();
    }

    public static Animal bigCow() {
        return Animal.builder()
                .kind("Big cow")
                .weight(150)
                .build();
    }

    public static Animal dog() {
        return Animal.builder()
                .kind("Dog")
                .weight(15)
                .build();
    }
}
