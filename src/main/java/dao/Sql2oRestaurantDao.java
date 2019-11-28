package dao;

import models.Foodtype;
import models.Restaurant;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.ArrayList;
import java.util.List;

public class Sql2oRestaurantDao {

    @Override
    public void andRestaurantToFoodType(Restaurant restaurant, Foodtype foodtype){

    }
    @Override
    public List<Foodtype>getAllFoodtypesByRestaurant(int restaurantId){
        List<Foodtype> foodtypes = new ArrayList();
        return foodtypes;
    }
    @Override
    public void addRestaurantToFoodtype(Restaurant restaurant, Foodtype foodtype){
        String sql = "INSERT INTO restaurants_foodtypes (restaurantid, foodtypeid) VALUES (:restaurantId, :foodtypeId)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("restaurantId", restaurant.getId())
                    .addParameter("foodtypeId", foodtype.getId())
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public List<Foodtype> getAllFoodtypesByRestaurant(int restaurantId) {
        ArrayList<Foodtype> foodtypes = new ArrayList<>();

        String joinQuery = "SELECT foodtypeid FROM restaurants_foodtypes WHERE restaurantid = :restaurantId";

        try (Connection con = sql2o.open()) {
            List<Integer> allFoodtypesIds = con.createQuery(joinQuery)
                    .addParameter("restaurantId", restaurantId)
                    .executeAndFetch(Integer.class);
            for (Integer foodId : allFoodtypesIds){
                String foodtypeQuery = "SELECT * FROM foodtypes WHERE id = :foodtypeId";
                foodtypes.add(
                        con.createQuery(foodtypeQuery)
                                .addParameter("foodtypeId", foodId)
                                .executeAndFetchFirst(Foodtype.class));
            }
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
        return foodtypes;
    }
    @Override
    public void addRestaurantToFoodtype(Restaurant restaurant, Foodtype foodtype){
        String sql = "INSERT INTO restaurants_foodtypes (restaurantid, foodtypeid) VALUES (:restaurantId, :foodtypeId)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("restaurantId", restaurant.getId())
                    .addParameter("foodtypeId", foodtype.getId())
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public List<Foodtype> getAllFoodtypesByRestaurant(int restaurantId) {
        ArrayList<Foodtype> foodtypes = new ArrayList<>();

        String joinQuery = "SELECT foodtypeid FROM restaurants_foodtypes WHERE restaurantid = :restaurantId";

        try (Connection con = sql2o.open()) {
            List<Integer> allFoodtypesIds = con.createQuery(joinQuery)
                    .addParameter("restaurantId", restaurantId)
                    .executeAndFetch(Integer.class);
            for (Integer foodId : allFoodtypesIds){
                String foodtypeQuery = "SELECT * FROM foodtypes WHERE id = :foodtypeId";
                foodtypes.add(
                        con.createQuery(foodtypeQuery)
                                .addParameter("foodtypeId", foodId)
                                .executeAndFetchFirst(Foodtype.class));
            }
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
        return foodtypes;
    }
    @Override
    public void deleteById(int id) {
        String sql = "DELETE from restaurants WHERE id = :id";
        String deleteJoin = "DELETE from restaurants_foodtypes WHERE restaurantid = :restaurantId";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
            con.createQuery(deleteJoin)
                    .addParameter("restaurantId", id)
                    .executeUpdate();

        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }
}
