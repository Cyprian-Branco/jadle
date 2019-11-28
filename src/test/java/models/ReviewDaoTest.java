package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewDaoTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testReviewInstantiatesCorrectly_true(){
        Review testReview = new Review("content", "writtenBy",5, 1 );
        assertTrue(testReview instanceof Review);
    }
    @Test
    public void contentReviewInstantiatesCorrectly_String(){
        Review testReview = new Review("content", "writtenBy",5, 1 );
        assertEquals("content", testReview.getContent());
    }
    @Test
    public void writtenByReviewInstantiatesCorrectly_String(){
        Review testReview = new Review("content", "writtenBy",5, 1 );
        assertEquals("writtenBy", testReview.getWrittenBy());
    }
    @Test
    public void reviewRatingInstantiatesCorrectly_Integer(){
        Review testReview = new Review("content", "writtenBy",5, 1 );
        assertEquals(5, testReview.getRating());
    }
    @Test
    public void reviewRestaurantIdInstantiatesCorrectly_Integer(){
        Review testReview = new Review("content", "writtenBy",5, 1 );
        assertEquals(1, testReview.getRestaurantId());
    }


}