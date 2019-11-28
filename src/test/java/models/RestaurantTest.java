package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.security.krb5.internal.crypto.RsaMd5CksumType;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testOldRestaurantInstantiatesCorrectly_true(){
        Restaurant oldRestaurant = new Restaurant("name", "address", "zipcode", "phone");
        assertTrue(oldRestaurant instanceof Restaurant);
    }
    @Test
    public void testNewRestaurantInstantiatesCorrectly_true(){
        Restaurant newRestaurant = new Restaurant("name", "address", "zipcode", "phone", "website","email");
        assertTrue(newRestaurant instanceof Restaurant);
    }
    @Test
    public void nameForOldRestaurantInstantiatesCorrectly_true(){
        Restaurant oldRestaurant = new Restaurant("name", "address", "zipcode", "phone");
        assertEquals("name", oldRestaurant.getName());
    }
    @Test
    public void nameForNewRestaurantInstantiatesCorrectly_true(){
        Restaurant newRestaurant = new Restaurant("name", "address", "zipcode", "phone");
        assertEquals("name", newRestaurant.getName());
    }
    @Test
    public void addressForOldRestaurantInstantiatesCorrectly_true(){
        Restaurant oldRestaurant = new Restaurant("name", "address", "zipcode", "phone");
        assertEquals("address", oldRestaurant.getAddress());
    }
    @Test
    public void zipcodeForOldRestaurantInstantiatesCorrectly_true(){
        Restaurant oldRestaurant = new Restaurant("name", "address", "zipcode", "phone");
        assertEquals("zipcode", oldRestaurant.getZipcode());
    }
    @Test
    public void phoneForOldRestaurantInstantiatesCorrectly_true() {
        Restaurant oldRestaurant = new Restaurant("name", "address", "zipcode", "phone");
        assertEquals("phone", oldRestaurant.getPhone());
    }
    @Test
    public void websiteForNewRestaurantInstantiatesCorrectly_true() {
        Restaurant newRestaurant = new Restaurant("name", "address", "zipcode", "phone", "website", "email");
        assertEquals("website", newRestaurant.getWebsite());
    }
    @Test
    public void emailForNewRestaurantInstantiatesCorrectly_true() {
        Restaurant newRestaurant = new Restaurant("name", "address", "zipcode", "phone", "website", "email");
        assertEquals("email", newRestaurant.getEmail());
    }
    @Test
    public void testEqualsForRestaurantInputs(){
        Restaurant oldRestaurant = new Restaurant("name", "address", "zipcode", "phone");
        Restaurant otherRestaurant = new Restaurant("name", "address", "zipcode", "phone");
        assertTrue(oldRestaurant.equals(oldRestaurant));

    }
}