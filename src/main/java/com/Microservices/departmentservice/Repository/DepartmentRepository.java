/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Microservices.departmentservice.Repository;

import com.Microservices.departmentservice.entity.Department;
import javax.persistence.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ULTCPU20
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
