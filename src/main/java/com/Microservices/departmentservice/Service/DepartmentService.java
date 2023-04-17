/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Microservices.departmentservice.Service;

import com.Microservices.departmentservice.entity.Department;

/**
 *
 * @author ULTCPU20
 */
public interface DepartmentService {

    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
