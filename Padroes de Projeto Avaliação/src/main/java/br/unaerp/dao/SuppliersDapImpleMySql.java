package br.unaerp.dao;

import br.unaerp.entity.Suppliers;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SuppliersDapImpleMySql implements SuppliersDAO {
    public List<Suppliers> getSuppliers() throws SQLException {
        return null;
    }

    public void insert(Suppliers suppliers) throws SQLException {
        String query = "insert into suppliers (supplier_id , company_name , contact_name , contact_title , address , city , region , postal_code , country , phone , fax , homepage) value (? , ?  ,? , ? , ? , ?, ? , ? , ? , ? , ? , ? )";

        PreparedStatement preparedStatement = MYSQLDAOFactory.getConnection().prepareStatement(query);
        preparedStatement.setInt( parameterIndex 1, products.getProductId());
        preparedStatement.setString( parameterIndex 2, products.getProductName());
        preparedStatement.setInt( parameterIndex 3, products.getSupplierId());
        preparedStatement.setInt( parameterIndex 4, products.getCategoryId());
        preparedStatement.setInt( parameterIndex 5, products.getQuantityPerUnit());
        preparedStatement.setDouble( parameterIndex 6, products.getUnitPrice());
        preparedStatement.setDouble( parameterIndex 6, products.getUnitPrice());

        )
    }

    public void update(Suppliers suppliers) throws SQLException {

    }

    public void delete(int id) throws SQLException {

    }

    public Suppliers getSuppllier(int id) throws SQLException {
        return null;




    }


}
