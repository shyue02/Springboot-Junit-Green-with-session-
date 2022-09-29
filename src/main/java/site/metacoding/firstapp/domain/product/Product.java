package site.metacoding.firstapp.domain.product;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private Integer productId;
    private String productName;
    private Integer ProductPrice;
    private Integer product_Qty;
    private Timestamp createdAt;
}
