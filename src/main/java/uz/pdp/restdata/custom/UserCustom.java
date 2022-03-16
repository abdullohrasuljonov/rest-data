package uz.pdp.restdata.custom;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.restdata.entity.User;

@Projection(types = User.class)
public interface UserCustom {

    Integer getId();
    String getName();
    String getEmail();
}
