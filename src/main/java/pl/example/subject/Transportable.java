package pl.example.subject;

import pl.example.visitor.Visitor;

public interface Transportable {
    void accept (Visitor visitor);
}
