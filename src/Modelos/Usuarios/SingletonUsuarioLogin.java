/*
 * Classe Singleton utilizada para a modelagem do Login de admin
 */
package Modelos.Usuarios;

/**
 *
 * @author Pedro Lucas
 */
public class SingletonUsuarioLogin extends Pessoa {

    private static SingletonUsuarioLogin instance;

    private SingletonUsuarioLogin() {
        setFunção("Admin");
    }

    public static SingletonUsuarioLogin getInstance() {
        if (instance == null) {
            instance = new SingletonUsuarioLogin();
        }
        return instance;

    }
}
