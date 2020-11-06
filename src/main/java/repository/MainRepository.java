package repository;

import model.Pack;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface MainRepository extends CrudRepository<Pack,Long>
{
Set<Pack> findAllByAmount(Long id);

}
