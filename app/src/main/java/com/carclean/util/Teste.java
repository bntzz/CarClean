package com.carclean.util;

import com.carclean.beans.Usuario;
import com.carclean.beans.Veiculo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Fernando Benitez on 10/10/2015.
 */

public class Teste {

    /**
     * Essa classe só serve pra gerar dados de teste, simulando a conexão com WS
     */

    public static ArrayList<Veiculo> geraListaVeiculosTESTE() {
        Veiculo v1 = new Veiculo();
        v1.setCodStatus(2);
        v1.setCor("Preto");
        v1.setId(1);
        v1.setMarca("Chevrolet");
        v1.setModelo("Astra");
        v1.setPlaca("GND-4670");

        Veiculo v2 = new Veiculo();
        v2.setCodStatus(3);
        v2.setCor("Vermelho");
        v2.setId(2);
        v2.setMarca("Ford");
        v2.setModelo("Ka");
        v2.setPlaca("CGA-1891");

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(v1);
        veiculos.add(v2);

        return veiculos;
    }

    public static ArrayList<Veiculo> geraListaVeiculosAdminTESTE() {
        Veiculo v1 = new Veiculo();
        v1.setDataAgendamento(Calendar.getInstance().getTime());
        v1.setCor("Preto");
        v1.setId(1);
        v1.setMarca("Chevrolet");
        v1.setModelo("Astra");
        v1.setPlaca("GND-4670");
        Usuario u1 = new Usuario();
        u1.setNome("Cleber da Silva");
        v1.setProprietario(u1);
        v1.setCodStatus(1);

        Veiculo v2 = new Veiculo();
        v2.setCodStatus(2);
        v2.setCor("Vermelho");
        v2.setId(2);
        v2.setMarca("Ford");
        v2.setModelo("Ka");
        v2.setPlaca("CGA-1891");
        Usuario u2 = new Usuario();
        u2.setNome("Marcela Reis de Souza");
        v2.setProprietario(u2);


        Veiculo v3 = new Veiculo();
        v3.setCodStatus(3);
        v3.setCor("Prata");
        v3.setId(3);
        v3.setMarca("Volkswagen");
        v3.setModelo("Golf");
        v3.setPlaca("YKK-5846");
        Usuario u3 = new Usuario();
        u3.setNome("Alfredo Dias Gomes");
        v3.setProprietario(u2);

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(v1);
        veiculos.add(v2);
        veiculos.add(v3);

        return veiculos;
    }

    public static Usuario geraLoginTESTE(Usuario usuario) {
        if (usuario.getEmail().equals("admin@carclean.com")) {
            usuario.setId(1);
            usuario.setAdmin(true);
            usuario.setNome("Administrador do Sistema");
        } else if (usuario.getEmail().equals("fernandohbenitez@hotmail.com")) {
            usuario.setId(2);
            usuario.setAdmin(false);
            usuario.setNome("Fernando Benitez");
        }
        return usuario;
    }

}
