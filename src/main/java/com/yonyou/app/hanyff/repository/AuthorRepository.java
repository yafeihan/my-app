package com.yonyou.app.hanyff.repository;

import com.yonyou.app.hanyff.domain.Author;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Author entity.
 */
@SuppressWarnings("unused")
public interface AuthorRepository extends JpaRepository<Author,Long> {

}
