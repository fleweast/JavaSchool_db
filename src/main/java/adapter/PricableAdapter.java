package adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PricableAdapter implements Pricable{

    private final Costable costable;
    @Override
    public int getPrice() {
        return costable.cost();
    }
}
