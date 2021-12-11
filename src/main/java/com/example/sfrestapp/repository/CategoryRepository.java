package com.example.sfrestapp.repository;

import com.example.sfrestapp.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author el_le
 * @since 11/12/2021 21:02
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
