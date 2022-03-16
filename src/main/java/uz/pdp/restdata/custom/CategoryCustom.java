package uz.pdp.restdata.custom;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.restdata.entity.Category;

@Projection(types = Category.class)
public interface CategoryCustom {

    Integer getId();
    String getName();
}
