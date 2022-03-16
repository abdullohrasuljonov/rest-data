package uz.pdp.restdata.custom;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.restdata.entity.Section;

@Projection(types = Section.class)
public interface SectionCustom {

    Integer getId();
    String getName();
}
