package com.src.Functional_Interface.Supplier;

import java.util.function.Supplier;
import com.src.entity.Employee;

public class SupplierDemo1 {

	public static void main(String[] args) {
		Supplier<Employee> supplier = () -> new Employee("Aaro", 30000, 5,"Chennai");
        System.out.println("Employee name:"+supplier.get().getEmpName());

	}

}
