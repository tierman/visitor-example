package pl.example.visitor;

import pl.example.subject.Animal;
import pl.example.subject.Person;
import pl.example.subject.Shipment;

public class PriceTransportVisitor implements Visitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Price per km for an animal: " + animal.getWeight() * 0.2 + " PLN");
    }

    @Override
    public void visit(Person person) {
        int basePrice = 9;
        if (person.isRegularCustomer()) {
            basePrice = basePrice / 2;
        }
        System.out.println("Price per km for a person: " + basePrice + " PLN");
    }

    @Override
    public void visit(Shipment shipment) {
        int basePrice = 3;
        if (shipment.isOverweight()) {
            basePrice = basePrice * 3;
        }
        System.out.println("Price per km for a shipment: " + basePrice + " PLN");
    }
}
