package dao;
import org.sql2o.Connection;

import models.Foodtype;
import models.Restaurant;
import org.sql2o.Sql2oException;

import java.util.ArrayList;
import java.util.List;
import org.sql2o.Sql2o.*;

public class Sql2oFoodtypeDao implements FoodtypeDAO{
    @Override
    public void add(Foodtype foodtype) {

    }

    @Override
    public void addFoodtypeToRestaurant(Foodtype foodtype, Restaurant restaurant) {

    }

    @Override
    public List<Foodtype> getAll() {
        return null;
    }

    @Override
    public List<Restaurant> getAllRestaurantsForAFoodtype(int id) {
        List<Restaurant> restaurants = new ArrayList();
        return restaurants;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAll() {

    }
    @Override
    public void addFoodtypeToRestaurant(Foodtype foodtype, Restaurant restaurant){
        String sql = "INSERT INTO restaurants_foodtypes(restaurantid, foodtypeid) VALUES (:restaurantId, :foodtypeId)";
        try (Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter(("restaurantId", restaurant.getId())
                    .addParameter("foodtypeId", foodtype.getId())
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }
    @Override
    public List<Restaurant> restaurants = new ArrayList<>();
    String joinQuery = "SELECT restaurantid FROM restaurants_foodtypes WHERE foodtypeid = :foodtypeId";

    try (Connection con = sql2o.open())

    {
        List<Integer> allRestaurantIds = con.createQuery(joinQuery)
                .addParameter("foodtypeId", foodtypeId)
                .executeAndFetch(Integer.class);
        for (Integer restaurantId : allRestaurantIds) {
            String restaurantQuery = "SELECT * FROM restaurants WHERE id = :restaurantId";
            restaurants.add(
                    con.createQuery(restaurantQuery)
                            .addParameter("restaurantId", restaurantId)
                            .executeAndFetch(Restaurant.class));
        }
    } catch (Sql2oException ex){
        System.out.println(ex);
    }
    return restaurants;
}
