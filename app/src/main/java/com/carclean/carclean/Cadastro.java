package com.carclean.carclean;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.carclean.beans.Usuario;
import com.carclean.dao.UsuarioDAO;

/**
 * Created by Fernando Benitez on 15/10/2015.
 */
public class Cadastro extends Activity {

    private EditText etNome, etEmail, etSenha;
    private Button btSalvar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrarclientes);

        etNome = (EditText)findViewById(R.id.etNome);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etSenha = (EditText) findViewById(R.id.etSenha);
        btSalvar = (Button) findViewById(R.id.btSalvar);
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = etNome.getText().toString();
                String email = etEmail.getText().toString();
                String senha = etSenha.getText().toString();

                if (nome.trim().equals("") || email.trim().equals("") || senha.trim().equals("")) {
                    Toast.makeText(Cadastro.this, "Preencha todos os campos!", Toast.LENGTH_LONG).show();
                    return;
                }
                Usuario usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setEmail(email);
                usuario.setSenha(senha);

               UsuarioDAO.adicionar(usuario);

                Toast.makeText(Cadastro.this, "Cadastro feito com sucesso!", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
    }
