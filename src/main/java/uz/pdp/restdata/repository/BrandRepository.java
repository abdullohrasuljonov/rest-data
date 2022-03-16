package uz.pdp.restdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.restdata.custom.BrandCustom;
import uz.pdp.restdata.entity.Brand;

@RepositoryRestResource(path = "brand",collectionResourceRel = "list",excerptProjection = BrandCustom.class)
public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
