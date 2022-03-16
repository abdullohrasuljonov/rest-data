package uz.pdp.restdata.custom;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.restdata.entity.Brand;

@Projection(types = Brand.class)
public interface BrandCustom {

    Integer getId();
    String getName();
}
