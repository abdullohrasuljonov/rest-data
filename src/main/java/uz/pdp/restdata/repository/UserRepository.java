package uz.pdp.restdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.restdata.custom.UserCustom;
import uz.pdp.restdata.entity.User;

@RepositoryRestResource(path = "user",collectionResourceRel = "list",excerptProjection = UserCustom.class)
public interface UserRepository extends JpaRepository<User,Integer> {
}
