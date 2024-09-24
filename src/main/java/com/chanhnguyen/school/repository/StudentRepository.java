package com.chanhnguyen.school.repository;

import com.chanhnguyen.school.entity.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>, ElasticsearchRepository<Student, Long> {
    List<Student> findByNameContaining(String name);
}
