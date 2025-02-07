package pl.example.subject;

import lombok.Builder;
import lombok.Getter;
import pl.example.visitor.Visitor;

@Getter
@Builder
public class Shipment implements Transportable {
    private String prefix;
    private String serialNumber;
    private boolean overweight;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public static Shipment smallPack() {
        return Shipment.builder()
                .prefix("010101")
                .serialNumber("SN123456789")
                .overweight(false)
                .build();
    }

    public static Shipment bigPack() {
        return Shipment.builder()
                .prefix("020202")
                .serialNumber("SN97654321")
                .overweight(true)
                .build();
    }
}
