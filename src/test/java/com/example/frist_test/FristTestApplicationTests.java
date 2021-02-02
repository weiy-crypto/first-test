package com.example.frist_test;

import com.example.frist_test.pojo.Cat;
import com.example.frist_test.pojo.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FristTestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testFn() {
		Dog dog = new Dog();
		dog.setName("aaa");
		dog.setAge(12);
		dog.setColor("red");
		System.out.println(dog);
	}

	@Test
	void testFn1() {
		Cat cat = new Cat();
		cat.setName("bbb");
		cat.setAge(15);
		cat.setColor("pink");
		cat.setType("w");
	}

}
