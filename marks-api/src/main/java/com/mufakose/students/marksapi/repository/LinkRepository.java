package com.mufakose.students.marksapi.repository;

import com.mufakose.students.marksapi.entity.Address;
import com.mufakose.students.marksapi.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mumu on 2/12/2018.
 */
public interface LinkRepository extends JpaRepository<Link, Long>{
    public List<Link> findByAddress(Address address);
}
