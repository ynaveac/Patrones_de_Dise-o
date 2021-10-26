package inter;

import model.Usuario;

public interface IUsuario {
	Usuario validarAcceso(String email, String clave);

}
 