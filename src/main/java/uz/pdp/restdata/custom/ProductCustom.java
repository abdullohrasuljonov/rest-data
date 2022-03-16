package uz.pdp.restdata.custom;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.restdata.entity.Brand;
import uz.pdp.restdata.entity.Category;
import uz.pdp.restdata.entity.Product;

@Projection(types = Product.class)
public interface ProductCustom {

    Integer getId();
    String getName();
    String getDescription();
    String getPrice();
    String getModel();
    Brand getBrand();
    Category getCategory();
}
