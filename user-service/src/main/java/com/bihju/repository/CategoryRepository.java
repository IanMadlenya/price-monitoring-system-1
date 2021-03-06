package com.bihju.repository;

import com.bihju.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "categories", collectionResourceRel = "categories")
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @RestResource(path = "categoryName", rel = "by-categoryName")
    Category findCategoryByCategoryName(String categoryName);

    @RestResource(path = "id", rel = "by-id")
    Category findCategoryById(Long id);
}
