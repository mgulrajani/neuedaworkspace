package com.training;

import com.training.entities.Address;
import com.training.entities.Employee;
import com.training.entities.Project;
import com.training.repo.EmployeeRepo;
import com.training.repo.ProjectRepo;
import com.training.services.EmployeeService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SpringJpaDemoApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringJpaDemoApplication.class, args);


		EmployeeService service = context.getBean(EmployeeService.class);

		System.out.println(service.listAllEmployees());


/*


		//I have delete the @Configuration and Bean
		//I have annotated the Employee as Component
		//
		Employee gotEmpBean = context.getBean(Employee.class);


		gotEmpBean.setName("Raj");
		gotEmpBean.getAddress().setStreet("mgm");

		System.out.println(gotEmpBean);
		System.out.println(gotEmpBean.getAddress());


		EntityManager em = context.getBean(EntityManager.class);

		Query query = em.createQuery("select e from Employee e");

		List<Employee> elist = query.getResultList();

		for(Employee e:elist){

			System.out.println(e);
		}

      EmployeeRepo repo = context.getBean(EmployeeRepo.class);

		Employee e = new Employee("Kajal","Marketing",45000D);
		Employee e1= new Employee("kk","ss",45000D);
		Employee e2= new Employee("d","ggg",45000D);
		Employee e3= new Employee("nn","dd",45000D);

		Employee savedEmployee = repo.save(e);
		Employee savedEmployee1 = repo.save(e1);
		Employee savedEmployee2 = repo.save(e2);
		Employee savedEmployee3 = repo.save(e3);



		System.out.println(savedEmployee);


		List<Employee> ee = repo.findByName("Jim");
		System.out.println(ee);


		List<Employee> lst = repo.findByDept("Sales");
		System.out.println(lst);


		Set<Employee>  set1  = new HashSet<>();
		set1.add(e);
        set1.add(e1);

		set1.add(e2);
		set1.add(e3);

		Project p1 = new Project("Portfolio Management", LocalDate.now());
		p1.setEmployees(set1);


		ProjectRepo repo2 = context.getBean(ProjectRepo.class);
		Project savedProject = repo2.save(p1);


		System.out.println(savedProject);
		System.out.println(savedProject.getEmployees());




*/
	}

}
