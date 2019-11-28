package dao;

import java.util.List;

public interface ReviewDao {
    //create

    List<ReviewDao> getAll();
    List<ReviewDao> getAllReviewsByRestaurant(int restaurantId);

    //update
    //omit for now

    //delete
    void deleteById(int id);
    void clearAll();

}
