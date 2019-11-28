package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodtypeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testFoodTypeInstantiatesCorrectly_true(){
        Foodtype testFoodtype = new Foodtype("lunch");
        assertTrue(testFoodtype instanceof Foodtype);
    }

    @Test
    public void getName() {
        Foodtype testFoodtype = new Foodtype("lunch");
        assertEquals("lunch", testFoodtype.getName());
    }
    @Test
    public void getId() {
    }

    @Test
    public void setId() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void testHashCode() {
    }
}