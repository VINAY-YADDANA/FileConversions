package app;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.cdi.MongoRepositoryBean;

public interface StudentRepository extends MongoRepository<Student,Integer>{

}
