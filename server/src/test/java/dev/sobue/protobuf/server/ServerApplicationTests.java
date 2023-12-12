package dev.sobue.protobuf.server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.actuate.observability.AutoConfigureObservability;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureObservability
class ServerApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
		assertNotNull(context);
	}
}
