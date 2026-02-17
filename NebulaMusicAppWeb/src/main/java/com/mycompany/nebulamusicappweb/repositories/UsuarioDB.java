
package com.mycompany.nebulamusicappweb.repositories;

import com.mycompany.nebulamusicappweb.models.Usuario;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pride Factor Black
 */
public class UsuarioDB {
   private static Map<String, Usuario> usuarios = new HashMap<>();
   
   public static void registrar (Usuario usuario){
       usuarios.put(usuario.getCorreo(),  usuario);
   }
   
   public static boolean autenticar(String correo, String contrasenia){
       if (!usuarios.containsKey(correo)) {
           return false;
       }
       return usuarios.get(correo).getContrasenia().equals(contrasenia);
   }
   
   public static boolean existeCorreo(String correo){
       return usuarios.containsKey(correo);
   }
}
