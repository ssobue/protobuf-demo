package dev.sobue.protobuf.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.actuate.observability.AutoConfigureObservability;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureObservability
class ClientApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
		assertNotNull(context);
	}
}
