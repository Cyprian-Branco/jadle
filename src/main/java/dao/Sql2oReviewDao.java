package dao;

import com.sun.tools.javac.util.List;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

public class Sql2oReviewDao {
    @Override
    public void add(ReviewDao review){
        String sql = "INSERT INTO reviews (writtenby, rating, content, restaurantid, createdat) VALUES (:writtenBy, :rating, :content, :restaurantId, :createdat)";

        try(Connection con = sql2o()){
            int id = (int) con.createQuery(sql, true)
                    .bind(review)
                    .executeUpdate()
                    .getKey();
            review.setId(id);
        } catch (Sql2oException ex){
            System.out.println();
        }
    }
    @Override
    public List<ReviewDao> getAllReviewsByRestaurantSortedNewestToOldest(int restaurantId) {
        List<ReviewDao> unsortedReviews = getAllReviewsByRestaurant(restaurantId); //calling other method!
        List<ReviewDao> sortedReviews = unsortedReviews;

        return sortedReviews;
    }

}
