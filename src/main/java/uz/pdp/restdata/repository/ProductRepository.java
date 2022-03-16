package uz.pdp.restdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.restdata.custom.ProductCustom;
import uz.pdp.restdata.entity.Product;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = ProductCustom.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
