package com.neo;

import com.neo.dao.ActorRepository;
import com.neo.entity.Actor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootShiroApplicationTests {

	@Autowired
	ActorRepository actorRepository;

	@Test
	public void testActorRepository() {
		List<Actor> actors = actorRepository.findByAge(21);
		Iterator iterator = actors.iterator();
		while (iterator.hasNext())
		{
			System.err.println(iterator.next());
		}


	}
	@Test
	public void findByNameLikeOrderByAge() {
		List<Actor> actors = actorRepository.findByNameContainingOrderByAge("cc");
		Iterator iterator = actors.iterator();
		while (iterator.hasNext())
		{
			System.err.println(iterator.next());
		}
	}

	@Test
	public void findByRealnameContainingAndAgeLessThan() {
		List<Actor> actors = actorRepository.findByRealnameContainingAndAgeLessThan("chen",22);
		Iterator iterator = actors.iterator();
		while (iterator.hasNext())
		{
			System.err.println(iterator.next());
		}
	}


	@Test
	public void pageFindAll() {
		Page<Actor> actors = actorRepository.findAll(new PageRequest(0, 7));
		Iterator iterator = actors.iterator();
		while (iterator.hasNext())
		{
			System.err.println(iterator.next());
		}
	}

	@Test
	public void findFirst2ByNameContaining() {
		List<Actor> actors = actorRepository.findFirst2ByNameContaining("cc");
		Iterator iterator = actors.iterator();
		while (iterator.hasNext())
		{
			System.err.println(iterator.next());
		}
	}

}
