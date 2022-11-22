package assignment.domain;

import assignment.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class OrderCancled extends AbstractEvent {

    private Long id;
    private Long menuId;
    private Long customerId;
    private Integer price;
}
