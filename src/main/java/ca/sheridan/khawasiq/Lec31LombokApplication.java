package ca.sheridan.khawasiq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ca.sheridan.khawasiq.beans.Student;

@SpringBootApplication
public class Lec31LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lec31LombokApplication.class, args);
		
		Student stu = Student.builder()
						._country("Pakistan")
						._email("wasiqkhan786@hotmail.com")
						._fN("wasiq")
						._lN("Khan")
						._sId(333L)
						.build();
		
		System.out.println(stu);
	}

}
