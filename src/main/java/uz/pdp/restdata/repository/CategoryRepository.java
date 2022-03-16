package uz.pdp.restdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.restdata.custom.CategoryCustom;
import uz.pdp.restdata.entity.Category;

@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = CategoryCustom.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
