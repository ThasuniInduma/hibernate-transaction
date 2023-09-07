package entity.embeded;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import entity.ItemEntity;
import entity.OrderEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class OrderDetailPK {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrderID")
    private OrderEntity orderEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ItemCode")
    private ItemEntity itemEntity;

}
