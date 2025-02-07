package pl.example.visitor;

import pl.example.subject.Animal;
import pl.example.subject.Person;
import pl.example.subject.Shipment;

public interface Visitor {
    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}
