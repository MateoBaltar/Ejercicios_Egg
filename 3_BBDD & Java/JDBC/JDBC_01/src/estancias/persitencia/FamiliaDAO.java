package estancias.persitencia;

import java.util.ArrayList;
import java.util.Collection;

import estancias.entidades.Familia;
import estancias.servicios.FamiliaServicios;

public final class FamiliaDAO extends DAO {

    public void guardarFamilia(Familia familia) throws Exception {
        try {
            if (familia == null) {
                throw new Exception("Debe indicar la familia");
            }
            String sql = "INSERT INTO Familias (edad_maxima, edad_minima, email, id_familia, nombre, num_hijos) "
                    + "VALUES ( '" + familia.getEdad_maxima() + "' , '" + familia.getEdad_minima() + "' ,'" + familia.getEmail() + "' , '" + familia.getId() + "','" + familia.getNombre() + "','" + familia.getNum_hijos() + "',' );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarFamilia(Familia familia) throws Exception {
        try {
            if (familia == null) {
                throw new Exception("Debe indicar la familia que desea modificar");
            }
            String sql = "UPDATE Familias SET "
                    + " edad_maxima = '" + familia.getEdad_maxima() + "' , edad_minima = '" + familia.getEdad_minima() + "' , email = " + familia.getEmail() + "' , '" + familia.getId() + "','" + familia.getNombre() + "','" + familia.getNum_hijos()
                    + " WHERE id_familia = '" + familia.getId() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarFamilia(int id) throws Exception {
        try {
            String sql = "DELETE FROM Mascota WHERE id_familia = " + id + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }


    public Collection<Familia> listarFamilias() throws Exception {
        try {
            String sql = "SELECT * FROM Familias WHERE num_hijos >= 3 AND edad_maxima < 10 ";
            consultarBase(sql);
            Familia familia = null;
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                familia = new Familia();
                familia.setEdad_maxima(resultado.getInt(3));
                familia.setEdad_minima(resultado.getInt(4));
                familia.setEmail(resultado.getString(6));
                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setNum_hijos(resultado.getInt(5));

                familias.add(familia);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Familia> listarHotmail() throws Exception {
        try {
            String sql = "SELECT * FROM Familias WHERE email like '%hotmail%'";
            consultarBase(sql);
            Familia familia = null;
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                familia = new Familia();
                familia.setEdad_maxima(resultado.getInt(3));
                familia.setEdad_minima(resultado.getInt(4));
                familia.setEmail(resultado.getString(6));
                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setNum_hijos(resultado.getInt(5));

                familias.add(familia);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

}
