package br.com.fiap.pizzaria;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import br.com.fiap.pizzaria.model.Pedido;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private String username;

    @BindView(R.id.tvCliente)
    TextView tvCliente;

    @BindView(R.id.cbBacon)
    CheckBox cbBacon;

    @BindView(R.id.cb4Queijos)
    CheckBox cb4Queijos;

    @BindView(R.id.cbAtum)
    CheckBox cbAtum;

    @BindView(R.id.cbPortuguesa)
    CheckBox cbPortuguesa;

    @BindView(R.id.rgTamanho)
    RadioGroup rgTamanho;

    @BindView(R.id.spPagamentos)
    Spinner spPagamentos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        if (getIntent() != null) {
            username = getIntent().getStringExtra("username");

        }
        tvCliente.setText("Olá " + username);
    }

    @OnClick(R.id.btFecharPedido)
    public void fecharPedido() {
        Pedido pedido = new Pedido();

        pedido.setCliente(username);
    }


}
