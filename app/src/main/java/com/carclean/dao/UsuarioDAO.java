package com.carclean.dao;

import com.carclean.beans.Usuario;
import com.carclean.util.Info;
import com.carclean.util.Teste;

/**
 * Created by Fernando Benitez on 10/10/2015.
 */
public class UsuarioDAO {

    public static boolean logar(Usuario usuario) {
        /**
         * AQUI DEVE SER IMPLEMENTADA A CONEXÃO COM O WS
         */


        //Código de teste
        if (usuario.getEmail().equals("admin@carclean.com") && usuario.getSenha().equals("1234")) {
            Info.getInstancia().setUsuario(Teste.geraLoginTESTE(usuario));
            return true;
        } else if (usuario.getEmail().equals("fernandohbenitez@hotmail.com") && usuario.getSenha().equals("1234")) {
            Info.getInstancia().setUsuario(Teste.geraLoginTESTE(usuario));
            return true;
        } else {
            return false;
        }
        //--------
    }

}
