package uz.pdp.restdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.restdata.custom.SectionCustom;
import uz.pdp.restdata.entity.Section;

@RepositoryRestResource(path = "section",collectionResourceRel = "list",excerptProjection = SectionCustom.class)
public interface SectionRepository extends JpaRepository<Section,Integer> {
}
