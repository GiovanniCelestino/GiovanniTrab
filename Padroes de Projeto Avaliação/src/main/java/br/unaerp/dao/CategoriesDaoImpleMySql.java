package br.unaerp.dao;

import br.unaerp.entity.Categories;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CategoriesDaoImpleMySql implements CategoriesDAO {

    public List<Categories> getCategories() throws SQLException {
        return null;
    }

    public void insert(Categories categories) throws SQLException {
        String query = "insert into categories (categories_id , category_name , description , piscture) value (? , ? , ? , ?)";
        String query = "insert into products (product_id , product_name , supplier_id , category_id , quantity_per_unit , unit_price , units_in_stock , units_on_order , reorder_level , discontinued) value (? , ? , ? , ? , ? , ? , ? , ? , ? , ?)";
        String query = "insert into suppliers (supplier_id , company_name , contact_name , contact_title , address , city , region , postal_code , country , phone , fax , homepage) value (? , ?  ,? , ? , ? , ?, ? , ? , ? , ? , ? , ? )";

        PreparedStatement preparedStatement = MYSQLDAOFactory.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, categories.getCategoryId());
        preparedStatement.setString(2, categories.getCategoryName());
        preparedStatement.setString(3, categories.getDescription());
        preparedStatement.setString(4, categories.getPicture());

        preparedStatement.execute();

    }

    public void update(Categories categories) throws SQLException {

    }

    public void delete(int id) throws SQLException {
        System.out.println("mysql " + id);
    }

    public Categories show(int id) throws SQLException {
        return null;
    }
}
