package pl.example;

import pl.example.subject.Animal;
import pl.example.subject.Person;
import pl.example.subject.Shipment;
import pl.example.visitor.NameTransportVisitor;
import pl.example.visitor.PriceTransportVisitor;

import java.util.List;

public class TransportApp {

    public static void main(String[] args) {
        var subjectsToTransport = List.of(Animal.dog(),
                Animal.bigCow(),
                Animal.smallCow(),
                Person.men(),
                Person.women(),
                Shipment.bigPack(),
                Shipment.smallPack());

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        subjectsToTransport.forEach(transportable -> {
            transportable.accept(nameTransportVisitor);
            transportable.accept(priceTransportVisitor);
        });
    }

}