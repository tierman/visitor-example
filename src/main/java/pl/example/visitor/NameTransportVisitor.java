package pl.example.visitor;

import pl.example.subject.Animal;
import pl.example.subject.Person;
import pl.example.subject.Shipment;

public class NameTransportVisitor implements Visitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Animal kind: " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Person name: " + person.getFirstName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Shipment prefix with serial number: " + shipment.getPrefix() +" / "+ shipment.getSerialNumber());
    }
}
