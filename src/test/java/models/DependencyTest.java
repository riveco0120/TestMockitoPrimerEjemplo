package models;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class DependencyTest {

    @Mock
    private Dependency dependency;

    @Before
    public void setupMock() {
        dependency = mock(Dependency.class);
    }

    @Test
    public void testDependency() {
        when(dependency.getClassName()).thenReturn("hi there");

        assertEquals("hi there", dependency.getClassName());
    }



}