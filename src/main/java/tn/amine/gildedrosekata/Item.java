package tn.amine.gildedrosekata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    public String name;
    private int SellIn;
    private long Quality;
}
