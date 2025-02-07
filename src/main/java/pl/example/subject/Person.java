package pl.example.subject;

import lombok.Builder;
import lombok.Getter;
import pl.example.visitor.Visitor;

@Getter
@Builder
public class Person implements Transportable {
    private String firstName;
    private String lastName;
    private boolean isRegularCustomer;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public static Person women() {
        return Person.builder()
                .firstName("Kate")
                .lastName("Stanley")
                .isRegularCustomer(false)
                .build();
    }

    public static Person men() {
        return Person.builder()
                .firstName("Mark")
                .lastName("Doom")
                .isRegularCustomer(true)
                .build();
    }

}
