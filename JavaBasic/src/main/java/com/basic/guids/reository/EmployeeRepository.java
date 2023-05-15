package com.basic.guids.reository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.basic.guids.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
