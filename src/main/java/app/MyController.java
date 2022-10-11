package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/list")
	public ResponseEntity<?> addStudent(@RequestBody Student std)
	{
	Student save=	this.studentRepository.save(std);
		
//		return "Added";
		return ResponseEntity.ok(save);
	}

	@GetMapping("/getstd")
	public List<Student> getSutdentData(){
		return  studentRepository.findAll();
	}
}
