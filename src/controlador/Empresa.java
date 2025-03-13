package controlador;

import java.util.ArrayList;
import modelo.Categoria;
import modelo.Usuario;
import utilidades.Encriptar;

public class Empresa {
    ArrayList <Usuario> usuarios;
    ArrayList <Categoria> categorias;

    public Empresa() {
        usuarios = new ArrayList<>();
        categorias = new ArrayList<>();
    }
    
    public void addUsuario(){
        /*
        * Para sacar la contraseña encriptada hariamos esta parte del codigo y 
        hariamos debug a la linea String encriptado
        String contra = "root";
        String encriptado = Encriptar.getMD5(contra);
        */
                
        usuarios.add(new Usuario("daniel", "926e27eecdbc7a18858b3798ba99bddd")); // pepe
        usuarios.add(new Usuario("ana", "63a9f0ea7bb98050796b649e85481845")); // root
        
        categorias.add(new Categoria("1", "Deporte"));
        categorias.add(new Categoria("2", "Politica"));
        categorias.add(new Categoria("3", "Economia"));
    }
    
}
