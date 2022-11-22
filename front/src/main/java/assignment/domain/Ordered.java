package assignment.domain;

import assignment.domain.*;
import assignment.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private Long menuId;
    private Long customerId;
    private Integer price;
    private Long shopId;

    public Ordered(Order aggregate){
        super(aggregate);
    }
    public Ordered(){
        super();
    }
}
