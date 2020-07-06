package br.unaerp.dao;

import br.unaerp.entity.Categories;

import java.sql.SQLException;
import java.util.List;

public class CategoriesDaoImpleSqlite implements CategoriesDAO {

    public List<Categories> getCategories() throws SQLException {
        return null;
    }

    public void insert(Categories categories) throws SQLException {

        String query = "insert into products (product_id , product_name , supplier_id , category_id , quantity_per_unit , unit_price , units_in_stock , units_on_order , reorder_level , discontinued) value (? , ? , ? , ? , ? , ? , ? , ? , ? , ?)";

    }

    public void update(Categories categories) throws SQLException {



    }

    public void delete(int id) throws SQLException {
        System.out.println("sqlite " + id );
    }

    public Categories show(int id) throws SQLException {
        return null;
    }
}
